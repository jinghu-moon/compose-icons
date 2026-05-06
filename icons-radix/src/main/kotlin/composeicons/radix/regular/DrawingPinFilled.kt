package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DrawingPinFilled: ImageVector
    get() {
        if (_drawingPinFilled != null) return _drawingPinFilled!!
        _drawingPinFilled = radixIcon(
            name = "DrawingPinFilled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPathData("M9.621 1.136c.195-.195 .512-.195 .707 0l3.536 3.535c.195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0l-.653-.652L8.867 9.574l1.107 1.107c.195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0L6.793 8.913v.001L3.522 12.185c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L6.086 8.207v-.001L3.611 5.732c-.195-.195-.195-.512 0-.707 .195-.195 .512-.195 .707 0L5.426 6.133 10.274 2.496 9.621 1.843c-.195-.195-.195-.512 0-.707Z")
            addPathData("M9.621 1.136c.195-.195 .512-.195 .707 0l3.536 3.535c.195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0l-.653-.652L8.867 9.574l1.107 1.107c.195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0L6.793 8.913v.001L3.522 12.185c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L6.086 8.207v-.001L3.611 5.732c-.195-.195-.195-.512 0-.707 .195-.195 .512-.195 .707 0L5.426 6.133 10.274 2.496 9.621 1.843c-.195-.195-.195-.512 0-.707Z")
        }
        return _drawingPinFilled!!
    }

private var _drawingPinFilled: ImageVector? = null
