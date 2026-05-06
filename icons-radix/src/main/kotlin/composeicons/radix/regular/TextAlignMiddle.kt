package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TextAlignMiddle: ImageVector
    get() {
        if (_textAlignMiddle != null) return _textAlignMiddle!!
        _textAlignMiddle = radixIcon(
            name = "TextAlignMiddle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.5 5.9c.106-0 .208-.042 .283-.117L5.783 3.783c.156-.156 .156-.41 0-.566-.156-.156-.41-.156-.566 0L3.9 4.533v-4.033L3.892 .419C3.854 .237 3.693 .099 3.5 .099c-.221 0-.4 .18-.4 .4v4.033L1.783 3.216 1.72 3.166c-.155-.102-.366-.085-.503 .051-.137 .137-.153 .348-.051 .503l.051 .063L3.217 5.783c.075 .075 .177 .117 .283 .117ZM14.5 5c.276 0 .5-.224 .5-.5-0-.276-.224-.5-.5-.5h-6c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5h6ZM14.5 8c.276 0 .5-.224 .5-.5-0-.276-.224-.5-.5-.5h-6c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5h6ZM3.5 14.9c.193-0 .354-.137 .392-.319l.009-.081v-4.033l1.316 1.316c.156 .156 .41 .156 .566 0 .156-.156 .156-.41 0-.566l-2-2C3.708 9.141 3.606 9.099 3.5 9.099c-.106 0-.208 .042-.283 .117l-2 2-.051 .063c-.102 .155-.086 .366 .051 .503 .137 .137 .348 .153 .503 .051l.063-.051L3.1 10.466v4.033c0 .221 .179 .4 .4 .4ZM14.5 11c.276 0 .5-.224 .5-.5-0-.276-.224-.5-.5-.5h-6c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5h6Z"),
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
        return _textAlignMiddle!!
    }

private var _textAlignMiddle: ImageVector? = null
