package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = tablerFilledIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 2c.552 0 1 .448 1 1 0 .552-.448 1-1 1v4.826l3.932 10.814 .034 .077c.143 .385 .143 .809-.002 1.193l-.07 .162c-.239 .477-.688 .815-1.213 .911L17.5 22h-11l-.181-.017c-.494-.091-.923-.396-1.171-.833-.248-.437-.29-.962-.114-1.433l.039-.09L9 8.823v-4.823C8.448 4 8 3.552 8 3 8 2.448 8.448 2 9 2h6ZM13 4h-2v4h2v-4Z"),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
