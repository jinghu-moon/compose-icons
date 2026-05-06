package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorThinIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h38.34L168 82.35 146.83 61.18c-1-1.055-2.494-1.484-3.901-1.121-1.407 .363-2.507 1.461-2.873 2.868-.365 1.407 .061 2.901 1.114 3.903L162.34 88l-21.17 21.18C113.64 84.662 71.605 86.477 46.29 113.276c-25.315 26.799-24.735 68.868 1.31 94.959 26.044 26.09 68.113 26.745 94.956 1.478 26.843-25.267 28.732-67.299 4.264-94.872L168 93.67l21.17 21.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L173.66 88 212 49.66v38.34c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4ZM138.43 202.45c-20.237 20.241-51.954 23.369-75.755 7.471C38.873 194.024 29.615 163.528 40.561 137.081 51.507 110.634 79.61 95.602 107.684 101.176c28.074 5.574 48.303 30.202 48.316 58.824-0 15.919-6.32 31.187-17.57 42.45Z"),
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
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
