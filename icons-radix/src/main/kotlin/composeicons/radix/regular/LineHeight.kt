package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LineHeight: ImageVector
    get() {
        if (_lineHeight != null) return _lineHeight!!
        _lineHeight = radixIcon(
            name = "LineHeight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.5 2.1c.106 0 .208 .042 .283 .117l2 2 .051 .063c.102 .155 .086 .366-.051 .503-.136 .136-.348 .153-.503 .051L5.217 4.784 3.9 3.467v8.066L5.217 10.217c.156-.156 .41-.156 .566 0 .156 .156 .156 .41 0 .566l-2 2c-.075 .075-.177 .117-.283 .117-.106 0-.208-.042-.283-.117l-2-2-.051-.063c-.102-.155-.086-.366 .051-.503 .137-.137 .348-.153 .503-.051l.063 .051 1.316 1.316v-8.066L1.783 4.784c-.156 .156-.41 .156-.566 0-.156-.156-.156-.41 0-.566l2-2 .062-.05c.065-.043 .142-.067 .222-.067ZM14.5 10c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5h-6c-.276-0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h6ZM14.5 7c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5h-6C8.224 8 8 7.776 8 7.5c0-.276 .224-.5 .5-.5h6ZM14.5 4c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5h-6C8.224 5 8 4.776 8 4.5c0-.276 .224-.5 .5-.5h6Z"),
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
        return _lineHeight!!
    }

private var _lineHeight: ImageVector? = null
