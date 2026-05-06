package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterH: ImageVector
    get() {
        if (_squareRoundedLetterH != null) return _squareRoundedLetterH!!
        _squareRoundedLetterH = tablerFilledIcon(
            name = "SquareRoundedLetterH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.676 2.001 12 2c7.752 0 10 2.248 10 10l-.005 .642C21.869 19.877 19.534 22 12 22l-.642-.005C4.228 21.87 2.063 19.6 2 12.325v-.325C2 4.357 4.185 2.064 11.676 2.001M14 7c-.552 0-1 .448-1 1v3h-2v-3c-0-.507-.38-.934-.883-.993L10 7C9.448 7 9 7.448 9 8v8c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-3h2v3c0 .507 .38 .934 .883 .993L14 17c.552 0 1-.448 1-1v-8C15 7.448 14.552 7 14 7"),
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
        return _squareRoundedLetterH!!
    }

private var _squareRoundedLetterH: ImageVector? = null
