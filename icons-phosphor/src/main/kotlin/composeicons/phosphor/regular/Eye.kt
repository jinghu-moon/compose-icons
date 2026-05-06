package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorRegularIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.31 124.76c-.35-.79-8.82-19.58-27.65-38.41C194.57 61.26 162.88 48 128 48 93.12 48 61.43 61.26 36.34 86.35 17.51 105.18 9 124 8.69 124.76c-.92 2.069-.92 4.431 0 6.5 .35 .79 8.82 19.57 27.65 38.4C61.43 194.74 93.12 208 128 208c34.88 0 66.57-13.26 91.66-38.34 18.83-18.83 27.3-37.61 27.65-38.4 .92-2.069 .92-4.431 0-6.5ZM128 192C97.22 192 70.33 180.81 48.07 158.75 38.936 149.667 31.166 139.31 25 128 31.164 116.689 38.935 106.332 48.07 97.25 70.33 75.19 97.22 64 128 64c30.78 0 57.67 11.19 79.93 33.25 9.151 9.08 16.939 19.437 23.12 30.75C223.84 141.46 192.43 192 128 192ZM128 80c-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48C175.972 101.502 154.498 80.028 128 80ZM128 160C110.327 160 96 145.673 96 128c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
