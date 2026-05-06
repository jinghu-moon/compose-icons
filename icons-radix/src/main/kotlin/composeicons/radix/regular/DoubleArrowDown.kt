package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DoubleArrowDown: ImageVector
    get() {
        if (_doubleArrowDown != null) return _doubleArrowDown!!
        _doubleArrowDown = radixIcon(
            name = "DoubleArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.225 8.082c.194-.128 .458-.106 .629 .064 .171 .171 .193 .435 .064 .629l-.064 .078L7.854 12.854c-.195 .195-.512 .195-.707 0l-4-4L3.082 8.776c-.128-.194-.106-.458 .064-.629 .171-.171 .435-.193 .629-.064l.078 .064 3.646 3.647L11.147 8.147l.078-.064ZM11.225 2.082c.194-.128 .458-.106 .629 .064 .171 .171 .193 .435 .064 .629l-.064 .078L7.854 6.854c-.195 .195-.512 .195-.707 0l-4-4L3.082 2.776c-.128-.194-.106-.458 .064-.629 .171-.171 .435-.193 .629-.064l.078 .064L7.5 5.793 11.147 2.147l.078-.064Z"),
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
        return _doubleArrowDown!!
    }

private var _doubleArrowDown: ImageVector? = null
