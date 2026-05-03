package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorThinIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(147.4f, 133.9f),
                    PathNode.CurveTo(148.12973f, 135.07796f, 148.19783f, 136.54968f, 147.58f, 137.79f),
                    PathNode.LineTo(131.58f, 169.79f),
                    PathNode.CurveTo(130.90175f, 171.14543f, 129.51566f, 172.00108f, 128.0f, 172.0f),
                    PathNode.CurveTo(127.37931f, 171.99663f, 126.76741f, 171.85304f, 126.21f, 171.58f),
                    PathNode.CurveTo(125.26003f, 171.10577f, 124.53758f, 170.27333f, 124.201836f, 169.26605f),
                    PathNode.CurveTo(123.86607f, 168.25879f, 123.94456f, 167.15936f, 124.42f, 166.21f),
                    PathNode.LineTo(137.53f, 140.0f),
                    PathNode.LineTo(112.0f, 140.0f),
                    PathNode.CurveTo(110.61295f, 140.00099f, 109.324394f, 139.28334f, 108.59494f, 138.10358f),
                    PathNode.CurveTo(107.8655f, 136.92384f, 107.79929f, 135.45041f, 108.42f, 134.21f),
                    PathNode.LineTo(124.42f, 102.21f),
                    PathNode.CurveTo(125.40859f, 100.23282f, 127.81282f, 99.43141f, 129.79f, 100.42f),
                    PathNode.CurveTo(131.76718f, 101.40859f, 132.56859f, 103.81282f, 131.58f, 105.79f),
                    PathNode.LineTo(118.47f, 132.0f),
                    PathNode.LineTo(144.0f, 132.0f),
                    PathNode.CurveTo(145.38597f, 132.00153f, 146.67236f, 132.7204f, 147.4f, 133.9f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 12.0f),
                    PathNode.LineTo(160.0f, 12.0f),
                    PathNode.CurveTo(162.20914f, 12.0f, 164.0f, 10.209139f, 164.0f, 8.0f),
                    PathNode.CurveTo(164.0f, 5.790861f, 162.20914f, 4.0f, 160.0f, 4.0f),
                    PathNode.LineTo(96.0f, 4.0f),
                    PathNode.CurveTo(93.79086f, 4.0f, 92.0f, 5.790861f, 92.0f, 8.0f),
                    PathNode.CurveTo(92.0f, 10.209139f, 93.79086f, 12.0f, 96.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 56.0f),
                    PathNode.LineTo(196.0f, 224.0f),
                    PathNode.CurveTo(196.0f, 235.0457f, 187.0457f, 244.0f, 176.0f, 244.0f),
                    PathNode.LineTo(80.0f, 244.0f),
                    PathNode.CurveTo(68.95431f, 244.0f, 60.0f, 235.0457f, 60.0f, 224.0f),
                    PathNode.LineTo(60.0f, 56.0f),
                    PathNode.CurveTo(60.0f, 44.954304f, 68.95431f, 36.0f, 80.0f, 36.0f),
                    PathNode.LineTo(176.0f, 36.0f),
                    PathNode.CurveTo(187.0457f, 36.0f, 196.0f, 44.954304f, 196.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 56.0f),
                    PathNode.CurveTo(188.0f, 49.37258f, 182.62741f, 44.0f, 176.0f, 44.0f),
                    PathNode.LineTo(80.0f, 44.0f),
                    PathNode.CurveTo(73.37258f, 44.0f, 68.0f, 49.37258f, 68.0f, 56.0f),
                    PathNode.LineTo(68.0f, 224.0f),
                    PathNode.CurveTo(68.0f, 230.62741f, 73.37258f, 236.0f, 80.0f, 236.0f),
                    PathNode.LineTo(176.0f, 236.0f),
                    PathNode.CurveTo(182.62741f, 236.0f, 188.0f, 230.62741f, 188.0f, 224.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
