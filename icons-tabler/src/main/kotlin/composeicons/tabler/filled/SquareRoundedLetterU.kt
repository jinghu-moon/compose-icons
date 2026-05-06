package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterU: ImageVector
    get() {
        if (_squareRoundedLetterU != null) return _squareRoundedLetterU!!
        _squareRoundedLetterU = tablerFilledIcon(
            name = "SquareRoundedLetterU",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.676 2.001 12 2c7.752 0 10 2.248 10 10l-.005 .642C21.869 19.877 19.534 22 12 22l-.642-.005C4.228 21.87 2.063 19.6 2 12.325v-.325C2 4.357 4.185 2.064 11.676 2.001M14 7c-.552 0-1 .448-1 1v6c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-6C11 7.448 10.552 7 10 7 9.448 7 9 7.448 9 8v6c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-6C15 7.448 14.552 7 14 7"),
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
        return _squareRoundedLetterU!!
    }

private var _squareRoundedLetterU: ImageVector? = null
