package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ListDetails: ImageVector
    get() {
        if (_listDetails != null) return _listDetails!!
        _listDetails = tablerFilledIcon(
            name = "ListDetails",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 5c0 .552-.448 1-1 1h-8C12.448 6 12 5.552 12 5c0-.552 .448-1 1-1h8c.552 0 1 .448 1 1M19 9c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h5c.552 0 1 .448 1 1M22 15c0 .552-.448 1-1 1h-8c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h8c.552 0 1 .448 1 1M19 19c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h5c.552 0 1 .448 1 1M8 3c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4C2.895 11 2 10.105 2 9L2.001 4.949l.004-.051C2.057 3.834 2.935 2.999 4 3ZM8 13c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4C2.895 21 2 20.105 2 19l.001-4.051 .004-.051C2.057 13.834 2.935 12.999 4 13Z"),
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
        return _listDetails!!
    }

private var _listDetails: ImageVector? = null
