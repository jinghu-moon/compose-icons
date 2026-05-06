package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Enter: ImageVector
    get() {
        if (_enter != null) return _enter!!
        _enter = radixIcon(
            name = "Enter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1c.552 0 1 .448 1 1v11c0 .552-.448 1-1 1h-7.5C4.224 14 4 13.776 4 13.5 4 13.224 4.224 13 4.5 13h7.5v-11h-7.5C4.224 2 4 1.776 4 1.5 4 1.224 4.224 1 4.5 1h7.5ZM5.896 4.896c.171-.171 .435-.193 .629-.064l.078 .064L8.854 7.146l.064 .078c.128 .194 .106 .458-.064 .629L6.604 10.104c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L7.293 8h-6.793C.224 8 0 7.776 0 7.5 0 7.224 .224 7 .5 7h6.793L5.896 5.604 5.832 5.525c-.128-.194-.106-.458 .064-.629Z"),
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
        return _enter!!
    }

private var _enter: ImageVector? = null
