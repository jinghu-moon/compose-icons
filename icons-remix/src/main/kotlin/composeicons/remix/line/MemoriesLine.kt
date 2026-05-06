package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MemoriesLine: ImageVector
    get() {
        if (_memoriesLine != null) return _memoriesLine!!
        _memoriesLine = remixIcon(
            name = "MemoriesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12C22 6.477 17.523 2 12 2 8.729 2 5.824 3.571 4 5.999L4 3.5h-2v6h6v-2L5.385 7.5C6.824 5.387 9.25 4 12 4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12h-2c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10ZM10.777 8.518l4.599 3.066c.297 .198 .297 .634 0 .832l-4.599 3.066c-.332 .222-.777-.017-.777-.416v-6.131c0-.399 .445-.638 .777-.416Z"),
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
        return _memoriesLine!!
    }

private var _memoriesLine: ImageVector? = null
