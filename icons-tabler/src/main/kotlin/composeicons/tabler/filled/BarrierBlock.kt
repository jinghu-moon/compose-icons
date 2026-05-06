package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BarrierBlock: ImageVector
    get() {
        if (_barrierBlock != null) return _barrierBlock!!
        _barrierBlock = tablerFilledIcon(
            name = "BarrierBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 21c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h1v-2h-8v2h1c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-4C4.448 21 4 20.552 4 20c0-.552 .448-1 1-1h1v-2h-1C3.895 17 3 16.105 3 15v-7C3 6.895 3.895 6 5 6h1v-1C6 4.448 6.448 4 7 4c.552 0 1 .448 1 1v1h8v-1c0-.552 .448-1 1-1 .552 0 1 .448 1 1v1h1c1.105 0 2 .895 2 2v7c0 1.105-.895 2-2 2h-1v2h1c.552 0 1 .448 1 1 0 .552-.448 1-1 1ZM12.914 8 5.914 15h4.17L17 8ZM19 10.914 14.914 15h4.086ZM8.084 8h-3.084v3.084Z"),
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
        return _barrierBlock!!
    }

private var _barrierBlock: ImageVector? = null
