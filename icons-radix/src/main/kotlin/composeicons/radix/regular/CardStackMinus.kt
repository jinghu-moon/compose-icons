package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CardStackMinus: ImageVector
    get() {
        if (_cardStackMinus != null) return _cardStackMinus!!
        _cardStackMinus = radixIcon(
            name = "CardStackMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.5 2C13.328 2 14 2.672 14 3.5v6c0 .653-.418 1.206-1 1.412v.588C13 12.328 12.328 13 11.5 13h-8C2.672 13 2 12.328 2 11.5v-.588C1.418 10.706 1 10.153 1 9.5v-6C1 2.672 1.672 2 2.5 2h10ZM3 11.5c0 .276 .224 .5 .5 .5h8c.276 0 .5-.224 .5-.5v-.5h-9v.5ZM2.5 3C2.224 3 2 3.224 2 3.5v6c0 .276 .224 .5 .5 .5h10c.276 0 .5-.224 .5-.5v-6C13 3.224 12.776 3 12.5 3h-10ZM9.5 6c.276 0 .5 .224 .5 .5C10 6.776 9.776 7 9.5 7h-4C5.224 7 5 6.776 5 6.5 5 6.224 5.224 6 5.5 6h4Z"),
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
        return _cardStackMinus!!
    }

private var _cardStackMinus: ImageVector? = null
