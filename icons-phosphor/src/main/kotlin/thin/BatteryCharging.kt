package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorThinIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 60.0f),
                    PathNode.LineTo(32.0f, 60.0f),
                    PathNode.CurveTo(20.954306f, 60.0f, 12.0f, 68.95431f, 12.0f, 80.0f),
                    PathNode.LineTo(12.0f, 176.0f),
                    PathNode.CurveTo(12.0f, 187.0457f, 20.954306f, 196.0f, 32.0f, 196.0f),
                    PathNode.LineTo(200.0f, 196.0f),
                    PathNode.CurveTo(211.0457f, 196.0f, 220.0f, 187.0457f, 220.0f, 176.0f),
                    PathNode.LineTo(220.0f, 80.0f),
                    PathNode.CurveTo(220.0f, 68.95431f, 211.0457f, 60.0f, 200.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 176.0f),
                    PathNode.CurveTo(212.0f, 182.62741f, 206.62741f, 188.0f, 200.0f, 188.0f),
                    PathNode.LineTo(32.0f, 188.0f),
                    PathNode.CurveTo(25.372583f, 188.0f, 20.0f, 182.62741f, 20.0f, 176.0f),
                    PathNode.LineTo(20.0f, 80.0f),
                    PathNode.CurveTo(20.0f, 73.37258f, 25.372583f, 68.0f, 32.0f, 68.0f),
                    PathNode.LineTo(200.0f, 68.0f),
                    PathNode.CurveTo(206.62741f, 68.0f, 212.0f, 73.37258f, 212.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 96.0f),
                    PathNode.LineTo(252.0f, 160.0f),
                    PathNode.CurveTo(252.0f, 162.20914f, 250.20914f, 164.0f, 248.0f, 164.0f),
                    PathNode.CurveTo(245.79086f, 164.0f, 244.0f, 162.20914f, 244.0f, 160.0f),
                    PathNode.LineTo(244.0f, 96.0f),
                    PathNode.CurveTo(244.0f, 93.79086f, 245.79086f, 92.0f, 248.0f, 92.0f),
                    PathNode.CurveTo(250.20914f, 92.0f, 252.0f, 93.79086f, 252.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(135.4f, 125.9f),
                    PathNode.CurveTo(136.12973f, 127.07796f, 136.19783f, 128.54968f, 135.58f, 129.79f),
                    PathNode.LineTo(119.58f, 161.79f),
                    PathNode.CurveTo(118.90174f, 163.14543f, 117.515656f, 164.00108f, 116.0f, 164.0f),
                    PathNode.CurveTo(115.37931f, 163.99663f, 114.76741f, 163.85304f, 114.21f, 163.58f),
                    PathNode.CurveTo(113.26003f, 163.10577f, 112.53758f, 162.27333f, 112.201836f, 161.26605f),
                    PathNode.CurveTo(111.86607f, 160.25879f, 111.94456f, 159.15936f, 112.42f, 158.21f),
                    PathNode.LineTo(125.53f, 132.0f),
                    PathNode.LineTo(100.0f, 132.0f),
                    PathNode.CurveTo(98.61295f, 132.00099f, 97.324394f, 131.28334f, 96.59494f, 130.10359f),
                    PathNode.CurveTo(95.8655f, 128.92384f, 95.79929f, 127.45042f, 96.42f, 126.21f),
                    PathNode.LineTo(112.42f, 94.21f),
                    PathNode.CurveTo(113.40859f, 92.23282f, 115.81282f, 91.43141f, 117.79f, 92.42f),
                    PathNode.CurveTo(119.76718f, 93.40859f, 120.56859f, 95.81282f, 119.58f, 97.79f),
                    PathNode.LineTo(106.47f, 124.0f),
                    PathNode.LineTo(132.0f, 124.0f),
                    PathNode.CurveTo(133.38597f, 124.001526f, 134.67236f, 124.7204f, 135.4f, 125.9f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
