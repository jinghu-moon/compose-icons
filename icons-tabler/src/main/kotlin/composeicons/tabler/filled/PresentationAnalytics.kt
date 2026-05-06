package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PresentationAnalytics: ImageVector
    get() {
        if (_presentationAnalytics != null) return _presentationAnalytics!!
        _presentationAnalytics = tablerFilledIcon(
            name = "PresentationAnalytics",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3c.552 0 1 .448 1 1 0 .552-.448 1-1 1v9c0 1.657-1.343 3-3 3h-5v2h2c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-6C8.448 21 8 20.552 8 20c0-.552 .448-1 1-1h2v-2h-5C4.343 17 3 15.657 3 14v-9C2.448 5 2 4.552 2 4 2 3.448 2.448 3 3 3ZM9 7C8.448 7 8 7.448 8 8v4c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-4C10 7.448 9.552 7 9 7M15 9c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2C16 9.448 15.552 9 15 9M12 10c-.552 0-1 .448-1 1v1c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-1c0-.552-.448-1-1-1"),
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
        return _presentationAnalytics!!
    }

private var _presentationAnalytics: ImageVector? = null
