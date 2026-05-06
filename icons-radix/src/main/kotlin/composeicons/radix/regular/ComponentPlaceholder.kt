package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ComponentPlaceholder: ImageVector
    get() {
        if (_componentPlaceholder != null) return _componentPlaceholder!!
        _componentPlaceholder = radixIcon(
            name = "ComponentPlaceholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.225 12.74c.194-.128 .458-.107 .629 .064 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707 .024-.024 .051-.045 .078-.064ZM5.732 11.389c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM8.561 11.389c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM4.318 9.975c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM9.975 9.975c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM2.904 8.561c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM11.389 8.561c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM1.49 7.147c.221-.221 .601-.18 .771 .078 .128 .194 .106 .458-.064 .629-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM12.803 7.147c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM2.904 5.732c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM11.389 5.732c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM4.318 4.318c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM9.975 4.318c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM5.732 2.904c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM8.561 2.904c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707ZM7.147 1.489c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707Z"),
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
        return _componentPlaceholder!!
    }

private var _componentPlaceholder: ImageVector? = null
