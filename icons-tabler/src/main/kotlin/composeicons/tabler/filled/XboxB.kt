package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.XboxB: ImageVector
    get() {
        if (_xboxB != null) return _xboxB!!
        _xboxB = tablerFilledIcon(
            name = "XboxB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M13 7h-3C9.448 7 9 7.448 9 8v8c0 .552 .448 1 1 1h3c1.183-0 2.255-.696 2.738-1.776 .483-1.08 .286-2.343-.503-3.224 .789-.882 .985-2.144 .503-3.224C15.255 7.696 14.183 7 13 7M13 13c.552 0 1 .448 1 1l-.007 .117c-.059 .503-.486 .883-.993 .883h-2v-2ZM13 9c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-2v-2Z"),
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
        return _xboxB!!
    }

private var _xboxB: ImageVector? = null
