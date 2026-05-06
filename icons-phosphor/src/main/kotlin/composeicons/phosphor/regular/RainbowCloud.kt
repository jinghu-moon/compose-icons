package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) return _rainbowCloud!!
        _rainbowCloud = phosphorRegularIcon(
            name = "RainbowCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 112c-19.702 .049-37.389 12.088-44.66 30.4-1.109-.12-2.224-.18-3.34-.18-17.65 0-32 14.76-32 32.89 0 18.13 14.35 32.89 32 32.89h48c26.51 0 48-21.49 48-48 0-26.51-21.49-48-48-48ZM200 192h-48c-8.82 0-16-7.58-16-16.89 0-9.31 7.18-16.89 16-16.89 1.983-.006 3.948 .382 5.78 1.14 2.206 .903 4.699 .775 6.801-.348 2.102-1.124 3.594-3.126 4.069-5.462 3.393-16.487 18.979-27.527 35.657-25.258 16.679 2.269 28.748 17.072 27.613 33.867C230.785 178.953 216.833 191.996 200 192ZM24 160v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16C8.001 118.202 33.026 80.466 71.53 64.201c38.503-16.265 83.003-7.899 112.97 21.239 3.055 3.099 3.072 8.072 .039 11.192-3.033 3.12-8.004 3.244-11.189 .278C147.993 72.252 110.338 65.171 77.756 78.935 45.175 92.698 23.999 124.631 24 160ZM56 160v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c.017-27.129 15.282-51.945 39.487-64.196 24.205-12.251 53.242-9.855 75.113 6.196 2.386 1.661 3.683 4.485 3.388 7.377-.295 2.892-2.135 5.396-4.806 6.542-2.672 1.146-5.754 .752-8.052-1.029C128.12 102.408 105.537 100.546 86.712 110.074 67.887 119.601 56.015 138.901 56 160ZM117.57 136.65c-7.145-1.705-14.678-.043-20.444 4.509C91.361 145.712 87.998 152.654 88 160v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c-.003-12.241 5.6-23.809 15.205-31.397 9.606-7.588 22.157-10.36 34.065-7.523 4.3 1.022 6.957 5.335 5.935 9.635-1.022 4.3-5.335 6.957-9.635 5.935Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _rainbowCloud!!
    }

private var _rainbowCloud: ImageVector? = null
