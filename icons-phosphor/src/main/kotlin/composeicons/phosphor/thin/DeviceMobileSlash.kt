package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorThinIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211 213.31 51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L60 59.15v156.85c0 11.046 8.954 20 20 20h96c11.046 0 20-8.954 20-20v-7.25l9 9.94c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM188 216c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12v-148L188 200ZM72.7 24c0-2.209 1.791-4 4-4h99.3c11.046 0 20 8.954 20 20v110.83c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-110.83c0-6.627-5.373-12-12-12h-99.3c-2.209 0-4-1.791-4-4Z"),
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
