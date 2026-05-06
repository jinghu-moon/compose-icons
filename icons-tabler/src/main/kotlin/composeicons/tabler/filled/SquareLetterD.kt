package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterD: ImageVector
    get() {
        if (_squareLetterD != null) return _squareLetterD!!
        _squareLetterD = tablerFilledIcon(
            name = "SquareLetterD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM12 7h-2C9.448 7 9 7.448 9 8v8c0 .552 .448 1 1 1h2c1.657 0 3-1.343 3-3v-4C15 8.343 13.657 7 12 7M12 9c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-1v-6Z"),
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
        return _squareLetterD!!
    }

private var _squareLetterD: ImageVector? = null
