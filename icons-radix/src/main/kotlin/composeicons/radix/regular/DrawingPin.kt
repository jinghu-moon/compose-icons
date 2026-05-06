package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DrawingPin: ImageVector
    get() {
        if (_drawingPin != null) return _drawingPin!!
        _drawingPin = radixIcon(
            name = "DrawingPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.621 1.136c.195-.195 .512-.195 .707 0l3.536 3.535c.195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0l-.653-.652L8.867 9.574l1.107 1.107c.195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0L6.793 8.913v.001L3.522 12.185c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L6.086 8.207v-.001L3.611 5.732c-.195-.195-.195-.512 0-.707 .195-.195 .512-.195 .707 0L5.426 6.133 10.274 2.496 9.621 1.843c-.195-.195-.195-.512 0-.707ZM6.14 6.847 8.153 8.861 11.79 4.011l-.802-.801L6.14 6.847Z"),
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
        return _drawingPin!!
    }

private var _drawingPin: ImageVector? = null
