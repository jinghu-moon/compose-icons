package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorBoldIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 52.0f),
                    PathNode.LineTo(28.0f, 52.0f),
                    PathNode.CurveTo(12.536027f, 52.0f, 0f, 64.536026f, 0f, 80.0f),
                    PathNode.LineTo(0f, 176.0f),
                    PathNode.CurveTo(0f, 191.46397f, 12.536027f, 204.0f, 28.0f, 204.0f),
                    PathNode.LineTo(196.0f, 204.0f),
                    PathNode.CurveTo(211.46397f, 204.0f, 224.0f, 191.46397f, 224.0f, 176.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 64.536026f, 211.46397f, 52.0f, 196.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 176.0f),
                    PathNode.CurveTo(200.0f, 178.20914f, 198.20914f, 180.0f, 196.0f, 180.0f),
                    PathNode.LineTo(28.0f, 180.0f),
                    PathNode.CurveTo(25.790861f, 180.0f, 24.0f, 178.20914f, 24.0f, 176.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.CurveTo(24.0f, 77.79086f, 25.790861f, 76.0f, 28.0f, 76.0f),
                    PathNode.LineTo(196.0f, 76.0f),
                    PathNode.CurveTo(198.20914f, 76.0f, 200.0f, 77.79086f, 200.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(256.0f, 104.0f),
                    PathNode.LineTo(256.0f, 152.0f),
                    PathNode.CurveTo(256.0f, 158.62741f, 250.62741f, 164.0f, 244.0f, 164.0f),
                    PathNode.CurveTo(237.37259f, 164.0f, 232.0f, 158.62741f, 232.0f, 152.0f),
                    PathNode.LineTo(232.0f, 104.0f),
                    PathNode.CurveTo(232.0f, 97.37258f, 237.37259f, 92.0f, 244.0f, 92.0f),
                    PathNode.CurveTo(250.62741f, 92.0f, 256.0f, 97.37258f, 256.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.38f, 122.0f),
                    PathNode.CurveTo(144.52359f, 125.712814f, 144.52359f, 130.28719f, 142.38f, 134.0f),
                    PathNode.LineTo(126.38f, 162.0f),
                    PathNode.CurveTo(124.28254f, 165.7787f, 120.31518f, 168.13765f, 115.993546f, 168.17567f),
                    PathNode.CurveTo(111.671906f, 168.2137f, 107.66366f, 165.92493f, 105.50004f, 162.1837f),
                    PathNode.CurveTo(103.33641f, 158.44249f, 103.35168f, 153.82683f, 105.54f, 150.1f),
                    PathNode.LineTo(111.32f, 140.0f),
                    PathNode.LineTo(100.0f, 140.0f),
                    PathNode.CurveTo(95.70787f, 140.00992f, 91.73727f, 137.72664f, 89.58691f, 134.01201f),
                    PathNode.CurveTo(87.436554f, 130.29738f, 87.433914f, 125.7171f, 89.58f, 122.0f),
                    PathNode.LineTo(105.58f, 94.0f),
                    PathNode.CurveTo(108.89371f, 88.24519f, 116.24519f, 86.26629f, 122.0f, 89.58f),
                    PathNode.CurveTo(127.75481f, 92.89371f, 129.7337f, 100.24519f, 126.42f, 106.0f),
                    PathNode.LineTo(120.68f, 116.0f),
                    PathNode.LineTo(132.0f, 116.0f),
                    PathNode.CurveTo(136.28279f, 116.004395f, 140.2386f, 118.29099f, 142.38f, 122.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
