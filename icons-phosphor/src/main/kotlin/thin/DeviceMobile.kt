package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) return _deviceMobile!!
        _deviceMobile = phosphorThinIcon(
            name = "DeviceMobile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 20.000 L 80.000 20.000 C 68.954 20.000 60.000 28.954 60.000 40.000 L 60.000 216.000 C 60.000 227.046 68.954 236.000 80.000 236.000 L 176.000 236.000 C 187.046 236.000 196.000 227.046 196.000 216.000 L 196.000 40.000 C 196.000 28.954 187.046 20.000 176.000 20.000 ZM 68.000 60.000 L 188.000 60.000 L 188.000 196.000 L 68.000 196.000 ZM 80.000 28.000 L 176.000 28.000 C 182.627 28.000 188.000 33.373 188.000 40.000 L 188.000 52.000 L 68.000 52.000 L 68.000 40.000 C 68.000 33.373 73.373 28.000 80.000 28.000 ZM 176.000 228.000 L 80.000 228.000 C 73.373 228.000 68.000 222.627 68.000 216.000 L 68.000 204.000 L 188.000 204.000 L 188.000 216.000 C 188.000 222.627 182.627 228.000 176.000 228.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
