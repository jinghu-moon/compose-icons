package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Cube: ImageVector
    get() {
        if (_cube != null) return _cube!!
        _cube = radixIcon(
            name = "Cube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.393 .762c.106-.023 .219-.012 .319 .035l6 2.8c.176 .082 .288 .259 .288 .453v6.9c-0 .194-.112 .371-.288 .453L7.712 14.203c-.134 .062-.29 .062-.424 0L1.288 11.403C1.112 11.321 1 11.144 1 10.95v-6.9c0-.194 .112-.371 .288-.453L7.288 .797 7.393 .762ZM2 10.631l5 2.333v-6.033L2 4.805v5.826ZM8 6.931v6.033l5-2.333v-5.826L8 6.931ZM2.728 4.028 7.5 6.057 12.271 4.028 7.5 1.802 2.728 4.028Z"),
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
        return _cube!!
    }

private var _cube: ImageVector? = null
