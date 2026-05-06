package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DragHandleVertical: ImageVector
    get() {
        if (_dragHandleVertical != null) return _dragHandleVertical!!
        _dragHandleVertical = radixIcon(
            name = "DragHandleVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.109 2.419c.038-.182 .199-.319 .392-.319 .193 0 .354 .138 .392 .319l.009 .081v10c0 .221-.18 .4-.4 .4-.221 0-.4-.179-.4-.4v-10l.009-.081ZM8.109 2.419c.038-.182 .199-.319 .392-.319 .193 0 .354 .138 .392 .319l.009 .081v10c0 .221-.18 .4-.4 .4-.221 0-.4-.179-.4-.4v-10l.009-.081ZM6.109 2.419c.038-.182 .199-.319 .392-.319 .193 0 .354 .138 .392 .319l.009 .081v10c0 .221-.18 .4-.4 .4-.221 0-.4-.179-.4-.4v-10l.009-.081ZM4.109 2.419c.038-.182 .199-.319 .392-.319 .193 0 .354 .138 .392 .319l.009 .081v10c0 .221-.18 .4-.4 .4-.221 0-.4-.179-.4-.4v-10l.009-.081Z"),
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
        return _dragHandleVertical!!
    }

private var _dragHandleVertical: ImageVector? = null
