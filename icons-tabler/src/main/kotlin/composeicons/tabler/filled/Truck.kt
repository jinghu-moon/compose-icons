package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = tablerFilledIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 4c.552 0 1 .448 1 1h4c.305 0 .593 .139 .783 .378l.074 .108 3 5 .055 .103 .04 .107 .029 .109 .016 .11L22 11v6c0 .552-.448 1-1 1h-1.171c-.424 1.198-1.558 2-2.829 2-1.271 0-2.405-.801-2.829-2h-4.342C9.405 19.198 8.271 20 7 20 5.729 20 4.595 19.198 4.171 18h-1.171C2.448 18 2 17.552 2 17v-11C2 4.895 2.895 4 4 4ZM7 16c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1C8 16.448 7.552 16 7 16M17 16c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1M17.434 7h-3.434v3h5.234Z"),
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
        return _truck!!
    }

private var _truck: ImageVector? = null
