package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Cross1: ImageVector
    get() {
        if (_cross1 != null) return _cross1!!
        _cross1 = radixIcon(
            name = "Cross1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.225 2.082c.194-.128 .458-.106 .629 .064 .171 .171 .193 .435 .064 .629l-.064 .078L8.207 7.5l4.646 4.646 .064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .193-.629 .064l-.078-.064L7.5 8.207 2.854 12.854c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L6.793 7.5 2.147 2.854 2.082 2.776c-.128-.194-.106-.458 .064-.629 .171-.171 .435-.193 .629-.064l.078 .064L7.5 6.793 12.147 2.147l.078-.064Z"),
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
        return _cross1!!
    }

private var _cross1: ImageVector? = null
