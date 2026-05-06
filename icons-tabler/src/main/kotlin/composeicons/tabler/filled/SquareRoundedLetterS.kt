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
                pathData = parseSvgPathData("M11.676 2.001 12 2c7.752 0 10 2.248 10 10l-.005 .642C21.869 19.877 19.534 22 12 22l-.642-.005C4.228 21.87 2.063 19.6 2 12.325v-.325C2 4.357 4.185 2.064 11.676 2.001M13 7h-2C9.895 7 9 7.895 9 9v2c0 1.105 .895 2 2 2h2v2h-2c0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-2c0-1.105-.895-2-2-2h-2v-2h2l.007 .117c.062 .525 .523 .911 1.052 .88C14.587 9.966 14.999 9.529 15 9 15 7.895 14.105 7 13 7"),
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
