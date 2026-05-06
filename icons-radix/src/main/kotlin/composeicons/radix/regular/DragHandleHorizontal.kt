package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DragHandleHorizontal: ImageVector
    get() {
        if (_dragHandleHorizontal != null) return _dragHandleHorizontal!!
        _dragHandleHorizontal = radixIcon(
            name = "DragHandleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.581 10.109c.182 .038 .319 .199 .319 .392-0 .193-.138 .354-.319 .392l-.081 .009h-10c-.221 0-.4-.18-.4-.4 0-.221 .179-.4 .4-.4h10l.081 .009ZM12.581 8.109c.182 .038 .319 .199 .319 .392-0 .193-.138 .354-.319 .392l-.081 .009h-10c-.221 0-.4-.18-.4-.4 0-.221 .179-.4 .4-.4h10l.081 .009ZM12.581 6.109c.182 .038 .319 .199 .319 .392-0 .193-.138 .354-.319 .392l-.081 .009h-10c-.221 0-.4-.18-.4-.4 0-.221 .179-.4 .4-.4h10l.081 .009ZM12.581 4.109c.182 .038 .319 .199 .319 .392-0 .193-.138 .354-.319 .392l-.081 .009h-10c-.221 0-.4-.18-.4-.4 0-.221 .179-.4 .4-.4h10l.081 .009Z"),
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
        return _dragHandleHorizontal!!
    }

private var _dragHandleHorizontal: ImageVector? = null
