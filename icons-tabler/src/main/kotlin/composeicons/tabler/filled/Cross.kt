package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = tablerFilledIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 2l-.117 .007C9.38 2.066 9 2.493 9 3v4h-4C4.448 7 4 7.448 4 8v4l.007 .117c.059 .503 .486 .883 .993 .883h4v8c0 .552 .448 1 1 1h4l.117-.007c.503-.059 .883-.486 .883-.993v-8h4c.552 0 1-.448 1-1v-4l-.007-.117C19.934 7.38 19.507 7 19 7h-4v-4C15 2.448 14.552 2 14 2h-4Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
