package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterP: ImageVector
    get() {
        if (_squareRoundedLetterP != null) return _squareRoundedLetterP!!
        _squareRoundedLetterP = tablerFilledIcon(
            name = "SquareRoundedLetterP",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.676 2.001 12 2c7.752 0 10 2.248 10 10l-.005 .642C21.869 19.877 19.534 22 12 22l-.642-.005C4.228 21.87 2.063 19.6 2 12.325v-.325C2 4.357 4.185 2.064 11.676 2.001M12 7h-2C9.448 7 9 7.448 9 8v8c0 .552 .448 1 1 1l.117-.007c.503-.059 .883-.486 .883-.993v-3h1c1.657 0 3-1.343 3-3C15 8.343 13.657 7 12 7M12 9c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1v-2Z"),
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
        return _squareRoundedLetterP!!
    }

private var _squareRoundedLetterP: ImageVector? = null
