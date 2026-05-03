package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorBoldIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 140.000 L 204.000 140.000 L 204.000 84.000 L 216.000 84.000 C 222.627 84.000 228.000 78.627 228.000 72.000 C 228.000 65.373 222.627 60.000 216.000 60.000 L 204.000 60.000 L 204.000 40.000 C 204.000 28.954 195.046 20.000 184.000 20.000 L 72.000 20.000 C 60.954 20.000 52.000 28.954 52.000 40.000 L 52.000 60.000 L 40.000 60.000 C 33.373 60.000 28.000 65.373 28.000 72.000 C 28.000 78.627 33.373 84.000 40.000 84.000 L 52.000 84.000 L 52.000 140.000 L 40.000 140.000 C 33.373 140.000 28.000 145.373 28.000 152.000 C 28.000 158.627 33.373 164.000 40.000 164.000 L 52.000 164.000 L 52.000 216.000 C 52.000 227.046 60.954 236.000 72.000 236.000 L 184.000 236.000 C 195.046 236.000 204.000 227.046 204.000 216.000 L 204.000 164.000 L 216.000 164.000 C 222.627 164.000 228.000 158.627 228.000 152.000 C 228.000 145.373 222.627 140.000 216.000 140.000 ZM 180.000 212.000 L 76.000 212.000 L 76.000 44.000 L 180.000 44.000 ZM 128.000 120.000 C 145.673 120.000 160.000 105.673 160.000 88.000 C 160.000 70.327 145.673 56.000 128.000 56.000 C 110.327 56.000 96.000 70.327 96.000 88.000 C 96.000 105.673 110.327 120.000 128.000 120.000 ZM 128.000 80.000 C 132.418 80.000 136.000 83.582 136.000 88.000 C 136.000 92.418 132.418 96.000 128.000 96.000 C 123.582 96.000 120.000 92.418 120.000 88.000 C 120.000 83.582 123.582 80.000 128.000 80.000 ZM 128.000 200.000 C 145.673 200.000 160.000 185.673 160.000 168.000 C 160.000 150.327 145.673 136.000 128.000 136.000 C 110.327 136.000 96.000 150.327 96.000 168.000 C 96.000 185.673 110.327 200.000 128.000 200.000 ZM 128.000 160.000 C 132.418 160.000 136.000 163.582 136.000 168.000 C 136.000 172.418 132.418 176.000 128.000 176.000 C 123.582 176.000 120.000 172.418 120.000 168.000 C 120.000 163.582 123.582 160.000 128.000 160.000 Z"),
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
        return _trafficSignal!!
    }

private var _trafficSignal: ImageVector? = null
