package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterB: ImageVector
    get() {
        if (_squareRoundedLetterB != null) return _squareRoundedLetterB!!
        _squareRoundedLetterB = tablerFilledIcon(
            name = "SquareRoundedLetterB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.676 2.001 12 2c7.752 0 10 2.248 10 10l-.005 .642C21.869 19.877 19.534 22 12 22l-.642-.005C4.228 21.87 2.063 19.6 2 12.325v-.325C2 4.357 4.185 2.064 11.676 2.001M12 7h-2C9.448 7 9 7.448 9 8v8c0 .552 .448 1 1 1h2c1.657 0 3-1.343 3-3l-.005-.176c-.037-.621-.265-1.215-.654-1.7L14.235 12l.106-.124c.721-.9 .863-2.134 .363-3.174C14.205 7.662 13.154 7 12 7M12 13c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1v-2ZM12 9c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1v-2Z"),
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
        return _squareRoundedLetterB!!
    }

private var _squareRoundedLetterB: ImageVector? = null
