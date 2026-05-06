package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DoubleArrowRight: ImageVector
    get() {
        if (_doubleArrowRight != null) return _doubleArrowRight!!
        _doubleArrowRight = radixIcon(
            name = "DoubleArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.147 3.147c.171-.171 .435-.193 .629-.064l.078 .064 4 4c.195 .195 .195 .512 0 .707L2.854 11.854l-.078 .064c-.194 .128-.458 .106-.629-.064-.171-.171-.193-.435-.064-.629l.064-.078L5.793 7.5 2.147 3.854 2.082 3.776c-.128-.194-.106-.458 .064-.629ZM8.147 3.147c.171-.171 .435-.193 .629-.064l.078 .064 4 4c.195 .195 .195 .512 0 .707L8.854 11.854l-.078 .064c-.194 .128-.458 .106-.629-.064-.171-.171-.193-.435-.064-.629l.064-.078L11.793 7.5 8.147 3.854 8.082 3.776c-.128-.194-.106-.458 .064-.629Z"),
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
        return _doubleArrowRight!!
    }

private var _doubleArrowRight: ImageVector? = null
