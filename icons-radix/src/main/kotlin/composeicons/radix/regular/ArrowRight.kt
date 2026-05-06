package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = radixIcon(
            name = "ArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.146 3.147c.171-.171 .435-.193 .629-.064l.078 .064 4 4c.195 .195 .195 .512 0 .707L8.854 11.854c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L11.293 8h-8.793C2.224 8 2 7.776 2 7.5c0-.276 .224-.5 .5-.5h8.793L8.146 3.854 8.082 3.776c-.128-.194-.106-.458 .064-.629Z"),
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
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
