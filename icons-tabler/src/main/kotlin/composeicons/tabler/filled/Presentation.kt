package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Presentation: ImageVector
    get() {
        if (_presentation != null) return _presentation!!
        _presentation = tablerFilledIcon(
            name = "Presentation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3c.552 0 1 .448 1 1 0 .552-.448 1-1 1v9c0 1.657-1.343 3-3 3h-5v2h2c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-6C8.448 21 8 20.552 8 20c0-.552 .448-1 1-1h2v-2h-5C4.343 17 3 15.657 3 14v-9C2.448 5 2 4.552 2 4 2 3.448 2.448 3 3 3ZM16.707 7.293c-.391-.39-1.024-.39-1.414 0L13 9.585 11.707 8.293c-.391-.39-1.023-.39-1.414 0l-3 3c-.39 .391-.39 1.023 0 1.414l.094 .083c.398 .309 .964 .273 1.32-.083L11 10.415l1.293 1.292c.391 .39 1.023 .39 1.414 0l3-3c.39-.391 .39-1.023 0-1.414"),
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
        return _presentation!!
    }

private var _presentation: ImageVector? = null
