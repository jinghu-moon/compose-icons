package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterL: ImageVector
    get() {
        if (_squareRoundedLetterL != null) return _squareRoundedLetterL!!
        _squareRoundedLetterL = tablerFilledIcon(
            name = "SquareRoundedLetterL",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.676 2.001 12 2c7.752 0 10 2.248 10 10l-.005 .642C21.869 19.877 19.534 22 12 22l-.642-.005C4.228 21.87 2.063 19.6 2 12.325v-.325C2 4.357 4.185 2.064 11.676 2.001M10 7C9.448 7 9 7.448 9 8v8c0 .552 .448 1 1 1h4c.552 0 1-.448 1-1l-.007-.117C14.934 15.38 14.507 15 14 15h-3v-7C11 7.448 10.552 7 10 7"),
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
        return _squareRoundedLetterL!!
    }

private var _squareRoundedLetterL: ImageVector? = null
