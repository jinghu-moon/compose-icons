package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterW: ImageVector
    get() {
        if (_squareRoundedLetterW != null) return _squareRoundedLetterW!!
        _squareRoundedLetterW = tablerFilledIcon(
            name = "SquareRoundedLetterW",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.676 2.001 L 12.000 2.000 C 19.752 2.000 22.000 4.248 22.000 12.000 L 21.995 12.642 C 21.869 19.877 19.534 22.000 12.000 22.000 L 11.358 21.995 C 4.228 21.870 2.063 19.600 2.000 12.325 L 2.000 12.000 C 2.000 4.357 4.185 2.064 11.676 2.001M 14.008 7.876 L 13.488 12.029 L 12.928 10.629 C 12.609 9.830 11.518 9.792 11.125 10.515 L 11.072 10.629 L 10.511 12.029 L 9.992 7.876 C 9.929 7.373 9.499 6.996 8.992 7.000 L 8.876 7.008 C 8.328 7.077 7.940 7.576 8.008 8.124 L 9.008 16.124 C 9.136 17.149 10.545 17.331 10.928 16.371 L 12.000 13.693 L 13.072 16.371 C 13.455 17.331 14.864 17.149 14.992 16.124 L 15.992 8.124 C 16.047 7.584 15.660 7.099 15.121 7.031 C 14.582 6.964 14.088 7.339 14.008 7.876"),
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
        return _squareRoundedLetterW!!
    }

private var _squareRoundedLetterW: ImageVector? = null
