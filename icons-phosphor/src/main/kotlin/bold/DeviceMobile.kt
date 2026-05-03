package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) return _deviceMobile!!
        _deviceMobile = phosphorBoldIcon(
            name = "DeviceMobile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 12.000 L 80.000 12.000 C 64.536 12.000 52.000 24.536 52.000 40.000 L 52.000 216.000 C 52.000 231.464 64.536 244.000 80.000 244.000 L 176.000 244.000 C 191.464 244.000 204.000 231.464 204.000 216.000 L 204.000 40.000 C 204.000 24.536 191.464 12.000 176.000 12.000 ZM 76.000 76.000 L 180.000 76.000 L 180.000 180.000 L 76.000 180.000 ZM 80.000 36.000 L 176.000 36.000 C 178.209 36.000 180.000 37.791 180.000 40.000 L 180.000 52.000 L 76.000 52.000 L 76.000 40.000 C 76.000 37.791 77.791 36.000 80.000 36.000 ZM 176.000 220.000 L 80.000 220.000 C 77.791 220.000 76.000 218.209 76.000 216.000 L 76.000 204.000 L 180.000 204.000 L 180.000 216.000 C 180.000 218.209 178.209 220.000 176.000 220.000 Z"),
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
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
