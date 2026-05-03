package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryWarning: ImageVector
    get() {
        if (_batteryWarning != null) return _batteryWarning!!
        _batteryWarning = phosphorThinIcon(
            name = "BatteryWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 60.000 L 32.000 60.000 C 20.954 60.000 12.000 68.954 12.000 80.000 L 12.000 176.000 C 12.000 187.046 20.954 196.000 32.000 196.000 L 200.000 196.000 C 211.046 196.000 220.000 187.046 220.000 176.000 L 220.000 80.000 C 220.000 68.954 211.046 60.000 200.000 60.000 ZM 212.000 176.000 C 212.000 182.627 206.627 188.000 200.000 188.000 L 32.000 188.000 C 25.373 188.000 20.000 182.627 20.000 176.000 L 20.000 80.000 C 20.000 73.373 25.373 68.000 32.000 68.000 L 200.000 68.000 C 206.627 68.000 212.000 73.373 212.000 80.000 ZM 252.000 96.000 L 252.000 160.000 C 252.000 162.209 250.209 164.000 248.000 164.000 C 245.791 164.000 244.000 162.209 244.000 160.000 L 244.000 96.000 C 244.000 93.791 245.791 92.000 248.000 92.000 C 250.209 92.000 252.000 93.791 252.000 96.000 ZM 112.000 124.000 L 112.000 96.000 C 112.000 93.791 113.791 92.000 116.000 92.000 C 118.209 92.000 120.000 93.791 120.000 96.000 L 120.000 124.000 C 120.000 126.209 118.209 128.000 116.000 128.000 C 113.791 128.000 112.000 126.209 112.000 124.000 ZM 124.000 156.000 C 124.000 160.418 120.418 164.000 116.000 164.000 C 111.582 164.000 108.000 160.418 108.000 156.000 C 108.000 151.582 111.582 148.000 116.000 148.000 C 120.418 148.000 124.000 151.582 124.000 156.000 Z"),
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
        return _batteryWarning!!
    }

private var _batteryWarning: ImageVector? = null
