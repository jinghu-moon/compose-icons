package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterN: ImageVector
    get() {
        if (_squareRoundedLetterN != null) return _squareRoundedLetterN!!
        _squareRoundedLetterN = tablerFilledIcon(
            name = "SquareRoundedLetterN",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.676 2.001 12 2c7.752 0 10 2.248 10 10l-.005 .642C21.869 19.877 19.534 22 12 22l-.642-.005C4.228 21.87 2.063 19.6 2 12.325v-.325C2 4.357 4.185 2.064 11.676 2.001M10.894 7.553C10.423 6.609 9 6.945 9 8v8c0 .552 .448 1 1 1l.117-.007c.503-.059 .883-.486 .883-.993v-3.764l2.106 4.211C13.577 17.391 15 17.055 15 16v-8C15 7.448 14.552 7 14 7l-.117 .007C13.38 7.066 13 7.493 13 8v3.764Z"),
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
        return _squareRoundedLetterN!!
    }

private var _squareRoundedLetterN: ImageVector? = null
