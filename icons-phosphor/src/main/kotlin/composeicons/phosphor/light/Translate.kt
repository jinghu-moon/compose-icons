package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorLightIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.37 213.32l-56-112C188.355 99.284 186.275 97.996 184 97.996c-2.275 0-4.355 1.287-5.37 3.324l-22.3 44.6C137.692 145.147 119.756 138.602 105 127.19 122.154 109.647 132.389 86.494 133.82 62h26.18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-58v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-58c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h89.79C120.366 83.56 111.208 103.882 96 119.23 86.672 109.829 79.538 98.481 75.11 86c-.676-2.07-2.422-3.612-4.56-4.027-2.138-.415-4.333 .361-5.735 2.028C63.413 85.669 63.024 87.965 63.8 90c4.936 13.94 12.853 26.635 23.2 37.2C71.267 139.407 51.914 146.022 32 146c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 23.298 .021 45.894-7.969 64-22.63 15.606 12.583 34.571 20.293 54.53 22.17l-27.89 55.78c-1.48 2.966-.276 6.57 2.69 8.05 2.966 1.48 6.57 .276 8.05-2.69L147.71 190h72.58l14.34 28.68c1.016 2.035 3.095 3.321 5.37 3.32 .931 .002 1.85-.217 2.68-.64 2.961-1.479 4.164-5.077 2.69-8.04ZM153.71 178 184 117.42 214.29 178Z"),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
