package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Sun: ImageVector
    get() {
        if (_sun != null) return _sun!!
        _sun = radixIcon(
            name = "Sun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 12c.276 0 .5 .224 .5 .5v2C8 14.776 7.776 15 7.5 15 7.224 15 7 14.776 7 14.5v-2C7 12.224 7.224 12 7.5 12ZM3.611 10.682c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707L2.903 12.804c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L3.611 10.682ZM10.682 10.682c.195-.195 .512-.195 .707 0l1.415 1.415c.195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0L10.682 11.389c-.195-.195-.195-.512 0-.707ZM7.5 4.5c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3ZM7.5 5.5c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2ZM2.5 7C2.776 7 3 7.224 3 7.5 3 7.776 2.776 8 2.5 8h-2C.224 8 0 7.776 0 7.5 0 7.224 .224 7 .5 7h2ZM14.5 7c.276 0 .5 .224 .5 .5C15 7.776 14.776 8 14.5 8h-2C12.224 8 12 7.776 12 7.5 12 7.224 12.224 7 12.5 7h2ZM2.196 2.196c.195-.195 .512-.195 .707 0L4.318 3.611c.195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0L2.196 2.903c-.195-.195-.195-.512 0-.707ZM12.097 2.196c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707L11.389 4.318c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L12.097 2.196ZM7.5 0C7.776 0 8 .224 8 .5v2C8 2.776 7.776 3 7.5 3 7.224 3 7 2.776 7 2.5v-2C7 .224 7.224 0 7.5 0Z"),
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
        return _sun!!
    }

private var _sun: ImageVector? = null
