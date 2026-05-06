package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TextAlignTop: ImageVector
    get() {
        if (_textAlignTop != null) return _textAlignTop!!
        _textAlignTop = radixIcon(
            name = "TextAlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.5 1.1c.106 0 .208 .042 .283 .117l2 2c.156 .156 .156 .41 0 .566-.156 .156-.41 .156-.566 0L3.9 2.467v7.033c-0 .221-.18 .4-.4 .4-.221 0-.4-.18-.4-.4v-7.033L1.783 3.784l-.063 .051c-.155 .102-.366 .085-.503-.051C1.08 3.647 1.064 3.436 1.166 3.281l.051-.063 2-2c.075-.075 .177-.117 .283-.117ZM14.5 8c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5h-6C8.224 9 8 8.776 8 8.5c0-.276 .224-.5 .5-.5h6ZM14.5 5c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5h-6C8.224 6 8 5.776 8 5.5c0-.276 .224-.5 .5-.5h6ZM14.5 2c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5h-6C8.224 3 8 2.776 8 2.5c0-.276 .224-.5 .5-.5h6Z"),
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
        return _textAlignTop!!
    }

private var _textAlignTop: ImageVector? = null
