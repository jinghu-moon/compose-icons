package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorLightIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.44 212 52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L58 59.92v156.08c0 12.15 9.85 22 22 22h96c12.15 0 22-9.85 22-22v-2.08l5.56 6.12c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM186 216c0 5.523-4.477 10-10 10h-96c-5.523 0-10-4.477-10-10v-142.88L186 200.72ZM70.7 24c0-3.314 2.686-6 6-6h99.3c12.15 0 22 9.85 22 22v110.83c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-110.83c0-5.523-4.477-10-10-10h-99.3c-3.314 0-6-2.686-6-6Z"),
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
        return _deviceMobileSlash!!
    }

private var _deviceMobileSlash: ImageVector? = null
