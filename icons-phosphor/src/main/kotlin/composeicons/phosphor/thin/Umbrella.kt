package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = phosphorThinIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 127C232.41 85.799 205.699 50.228 167.133 35.291 128.568 20.355 84.864 28.655 54.46 56.69 34.545 74.963 22.242 100.065 20 127c-.28 3.352 .859 6.668 3.141 9.139 2.282 2.472 5.496 3.872 8.859 3.861h92v60c0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20v-60h92c3.364 .012 6.578-1.389 8.859-3.861 2.282-2.472 3.421-5.787 3.141-9.139ZM32 132c-1.13 .005-2.21-.468-2.972-1.303-.762-.834-1.136-1.952-1.028-3.077C32.133 79.639 69.816 41.384 117.73 36.53 106 49.76 85.08 80.45 84 132ZM92 132C93.21 76 119.6 45.63 127.94 37.43c8.41 8.21 34.79 38.57 36 94.57ZM226.87 130.7c-.769 .841-1.86 1.314-3 1.3h-51.87C171 80.45 150 49.76 138.3 36.53c47.902 4.868 85.569 43.119 89.7 91.09 .097 1.132-.292 2.252-1.07 3.08Z"),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
