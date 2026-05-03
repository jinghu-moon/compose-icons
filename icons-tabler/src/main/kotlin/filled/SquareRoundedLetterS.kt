package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterS: ImageVector
    get() {
        if (_squareRoundedLetterS != null) return _squareRoundedLetterS!!
        _squareRoundedLetterS = tablerFilledIcon(
            name = "SquareRoundedLetterS",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.676 2.001 L 12.000 2.000 C 19.752 2.000 22.000 4.248 22.000 12.000 L 21.995 12.642 C 21.869 19.877 19.534 22.000 12.000 22.000 L 11.358 21.995 C 4.228 21.870 2.063 19.600 2.000 12.325 L 2.000 12.000 C 2.000 4.357 4.185 2.064 11.676 2.001M 13.000 7.000 L 11.000 7.000 C 9.895 7.000 9.000 7.895 9.000 9.000 L 9.000 11.000 C 9.000 12.105 9.895 13.000 11.000 13.000 L 13.000 13.000 L 13.000 15.000 L 11.000 15.000 C 11.000 14.448 10.552 14.000 10.000 14.000 C 9.448 14.000 9.000 14.448 9.000 15.000 C 9.000 16.105 9.895 17.000 11.000 17.000 L 13.000 17.000 C 14.105 17.000 15.000 16.105 15.000 15.000 L 15.000 13.000 C 15.000 11.895 14.105 11.000 13.000 11.000 L 11.000 11.000 L 11.000 9.000 L 13.000 9.000 L 13.007 9.117 C 13.069 9.642 13.530 10.028 14.059 9.997 C 14.587 9.966 14.999 9.529 15.000 9.000 C 15.000 7.895 14.105 7.000 13.000 7.000"),
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
        return _squareRoundedLetterS!!
    }

private var _squareRoundedLetterS: ImageVector? = null
