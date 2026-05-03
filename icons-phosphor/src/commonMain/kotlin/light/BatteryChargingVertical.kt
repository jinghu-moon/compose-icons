package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorLightIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(149.1f, 132.85f),
                    PathNode.CurveTo(150.19276f, 134.61569f, 150.29489f, 136.82088f, 149.37f, 138.68f),
                    PathNode.LineTo(133.37f, 170.68f),
                    PathNode.CurveTo(131.88988f, 173.64577f, 128.28577f, 174.85013f, 125.32f, 173.37f),
                    PathNode.CurveTo(122.35423f, 171.88988f, 121.14988f, 168.28577f, 122.63f, 165.32f),
                    PathNode.LineTo(134.29f, 142.0f),
                    PathNode.LineTo(112.0f, 142.0f),
                    PathNode.CurveTo(109.92086f, 142.00063f, 107.98961f, 140.92484f, 106.89574f, 139.15671f),
                    PathNode.CurveTo(105.801865f, 137.3886f, 105.70132f, 135.1802f, 106.63f, 133.32f),
                    PathNode.LineTo(122.63f, 101.32f),
                    PathNode.CurveTo(124.11012f, 98.35423f, 127.71423f, 97.14988f, 130.68f, 98.63f),
                    PathNode.CurveTo(133.64577f, 100.11012f, 134.85013f, 103.71423f, 133.37f, 106.68f),
                    PathNode.LineTo(121.71f, 130.0f),
                    PathNode.LineTo(144.0f, 130.0f),
                    PathNode.CurveTo(146.07895f, 130.00229f, 148.00856f, 131.0806f, 149.1f, 132.85f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 14.0f),
                    PathNode.LineTo(160.0f, 14.0f),
                    PathNode.CurveTo(163.3137f, 14.0f, 166.0f, 11.313708f, 166.0f, 8.0f),
                    PathNode.CurveTo(166.0f, 4.686292f, 163.3137f, 2.0f, 160.0f, 2.0f),
                    PathNode.LineTo(96.0f, 2.0f),
                    PathNode.CurveTo(92.686295f, 2.0f, 90.0f, 4.686292f, 90.0f, 8.0f),
                    PathNode.CurveTo(90.0f, 11.313708f, 92.686295f, 14.0f, 96.0f, 14.0f),
                    PathNode.Close,
                    PathNode.MoveTo(198.0f, 56.0f),
                    PathNode.LineTo(198.0f, 224.0f),
                    PathNode.CurveTo(198.0f, 236.15027f, 188.15027f, 246.0f, 176.0f, 246.0f),
                    PathNode.LineTo(80.0f, 246.0f),
                    PathNode.CurveTo(67.84974f, 246.0f, 58.0f, 236.15027f, 58.0f, 224.0f),
                    PathNode.LineTo(58.0f, 56.0f),
                    PathNode.CurveTo(58.0f, 43.849735f, 67.84974f, 34.0f, 80.0f, 34.0f),
                    PathNode.LineTo(176.0f, 34.0f),
                    PathNode.CurveTo(188.15027f, 34.0f, 198.0f, 43.849735f, 198.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 56.0f),
                    PathNode.CurveTo(186.0f, 50.477154f, 181.52284f, 46.0f, 176.0f, 46.0f),
                    PathNode.LineTo(80.0f, 46.0f),
                    PathNode.CurveTo(74.47715f, 46.0f, 70.0f, 50.477154f, 70.0f, 56.0f),
                    PathNode.LineTo(70.0f, 224.0f),
                    PathNode.CurveTo(70.0f, 229.52284f, 74.47715f, 234.0f, 80.0f, 234.0f),
                    PathNode.LineTo(176.0f, 234.0f),
                    PathNode.CurveTo(181.52284f, 234.0f, 186.0f, 229.52284f, 186.0f, 224.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
