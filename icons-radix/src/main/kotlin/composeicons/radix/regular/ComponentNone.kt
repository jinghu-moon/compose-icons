package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ComponentNone: ImageVector
    get() {
        if (_componentNone != null) return _componentNone!!
        _componentNone = radixIcon(
            name = "ComponentNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.224 1.425c.194-.128 .459-.106 .63 .064l2.475 2.475L12.647 1.647c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707L11.036 4.671l2.475 2.476 .064 .077c.128 .194 .106 .459-.064 .63L7.854 13.51c-.195 .195-.512 .195-.707 0L4.671 11.035 2.354 13.354c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L3.964 10.328 1.49 7.854c-.195-.195-.195-.512 0-.707L7.147 1.49l.077-.064ZM5.378 10.328l2.122 2.121L12.45 7.5 10.328 5.378 5.378 10.328ZM2.55 7.5 4.671 9.621 9.622 4.671 7.5 2.55 2.55 7.5Z"),
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
        return _componentNone!!
    }

private var _componentNone: ImageVector? = null
