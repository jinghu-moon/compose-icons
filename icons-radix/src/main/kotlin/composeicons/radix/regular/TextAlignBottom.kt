package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TextAlignBottom: ImageVector
    get() {
        if (_textAlignBottom != null) return _textAlignBottom!!
        _textAlignBottom = radixIcon(
            name = "TextAlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.5 13.9c.106-0 .208-.042 .283-.117l2-2c.156-.156 .156-.41 0-.566-.156-.156-.41-.156-.566 0L3.9 12.533v-7.033C3.9 5.279 3.721 5.099 3.5 5.099c-.221 0-.4 .18-.4 .4v7.033L1.783 11.216l-.063-.051c-.155-.102-.366-.085-.503 .051-.137 .137-.153 .348-.051 .503l.051 .063 2 2c.075 .075 .177 .117 .283 .117ZM14.5 7c.276 0 .5-.224 .5-.5-0-.276-.224-.5-.5-.5h-6c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5h6ZM14.5 10c.276 0 .5-.224 .5-.5-0-.276-.224-.5-.5-.5h-6c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5h6ZM14.5 13c.276 0 .5-.224 .5-.5-0-.276-.224-.5-.5-.5h-6c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5h6Z"),
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
        return _textAlignBottom!!
    }

private var _textAlignBottom: ImageVector? = null
