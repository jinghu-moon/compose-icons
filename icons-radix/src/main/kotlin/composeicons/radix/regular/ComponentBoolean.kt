package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ComponentBoolean: ImageVector
    get() {
        if (_componentBoolean != null) return _componentBoolean!!
        _componentBoolean = radixIcon(
            name = "ComponentBoolean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.224 1.425c.194-.128 .459-.106 .63 .064l5.656 5.657 .064 .077c.128 .194 .106 .459-.064 .63L7.854 13.51c-.195 .195-.512 .195-.707 0L1.49 7.854c-.195-.195-.195-.512 0-.707L7.147 1.49l.077-.064ZM2.55 7.5l4.95 4.949v-9.899L2.55 7.5Z"),
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
        return _componentBoolean!!
    }

private var _componentBoolean: ImageVector? = null
