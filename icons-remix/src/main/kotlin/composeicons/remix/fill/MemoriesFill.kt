package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MemoriesFill: ImageVector
    get() {
        if (_memoriesFill != null) return _memoriesFill!!
        _memoriesFill = remixIcon(
            name = "MemoriesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12C22 6.477 17.523 2 12 2 8.984 2 6.28 3.335 4.447 5.446L2 3v6h6L5.865 6.865C7.332 5.114 9.536 4 12 4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12h-2c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10ZM10.777 8.518l4.599 3.066c.297 .198 .297 .634 0 .832l-4.599 3.066c-.332 .222-.777-.017-.777-.416v-6.131c0-.399 .445-.638 .777-.416Z"),
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
        return _memoriesFill!!
    }

private var _memoriesFill: ImageVector? = null
