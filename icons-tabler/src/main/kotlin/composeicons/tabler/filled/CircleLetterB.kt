package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterB: ImageVector
    get() {
        if (_circleLetterB != null) return _circleLetterB!!
        _circleLetterB = tablerFilledIcon(
            name = "CircleLetterB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M12 7h-2C9.448 7 9 7.448 9 8v8c0 .552 .448 1 1 1h2c1.657 0 3-1.343 3-3l-.005-.176c-.037-.621-.265-1.215-.654-1.7L14.235 12l.106-.124c.721-.9 .863-2.134 .363-3.174C14.205 7.662 13.154 7 12 7M12 13c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1v-2ZM12 9c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1v-2Z"),
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
        return _circleLetterB!!
    }

private var _circleLetterB: ImageVector? = null
