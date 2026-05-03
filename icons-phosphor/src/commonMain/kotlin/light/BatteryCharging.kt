package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorLightIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 58.0f),
                    PathNode.LineTo(32.0f, 58.0f),
                    PathNode.CurveTo(19.849735f, 58.0f, 10.0f, 67.84974f, 10.0f, 80.0f),
                    PathNode.LineTo(10.0f, 176.0f),
                    PathNode.CurveTo(10.0f, 188.15027f, 19.849735f, 198.0f, 32.0f, 198.0f),
                    PathNode.LineTo(200.0f, 198.0f),
                    PathNode.CurveTo(212.15027f, 198.0f, 222.0f, 188.15027f, 222.0f, 176.0f),
                    PathNode.LineTo(222.0f, 80.0f),
                    PathNode.CurveTo(222.0f, 67.84974f, 212.15027f, 58.0f, 200.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 176.0f),
                    PathNode.CurveTo(210.0f, 181.52284f, 205.52284f, 186.0f, 200.0f, 186.0f),
                    PathNode.LineTo(32.0f, 186.0f),
                    PathNode.CurveTo(26.477152f, 186.0f, 22.0f, 181.52284f, 22.0f, 176.0f),
                    PathNode.LineTo(22.0f, 80.0f),
                    PathNode.CurveTo(22.0f, 74.47715f, 26.477152f, 70.0f, 32.0f, 70.0f),
                    PathNode.LineTo(200.0f, 70.0f),
                    PathNode.CurveTo(205.52284f, 70.0f, 210.0f, 74.47715f, 210.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(254.0f, 96.0f),
                    PathNode.LineTo(254.0f, 160.0f),
                    PathNode.CurveTo(254.0f, 163.3137f, 251.3137f, 166.0f, 248.0f, 166.0f),
                    PathNode.CurveTo(244.6863f, 166.0f, 242.0f, 163.3137f, 242.0f, 160.0f),
                    PathNode.LineTo(242.0f, 96.0f),
                    PathNode.CurveTo(242.0f, 92.686295f, 244.6863f, 90.0f, 248.0f, 90.0f),
                    PathNode.CurveTo(251.3137f, 90.0f, 254.0f, 92.686295f, 254.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(137.1f, 124.85f),
                    PathNode.CurveTo(138.19276f, 126.615685f, 138.29489f, 128.82088f, 137.37f, 130.68f),
                    PathNode.LineTo(121.37f, 162.68f),
                    PathNode.CurveTo(119.88988f, 165.64577f, 116.28577f, 166.85013f, 113.32f, 165.37f),
                    PathNode.CurveTo(110.35423f, 163.88988f, 109.14988f, 160.28577f, 110.63f, 157.32f),
                    PathNode.LineTo(122.29f, 134.0f),
                    PathNode.LineTo(100.0f, 134.0f),
                    PathNode.CurveTo(97.92086f, 134.00063f, 95.98961f, 132.92484f, 94.89574f, 131.15671f),
                    PathNode.CurveTo(93.801865f, 129.3886f, 93.70132f, 127.1802f, 94.63f, 125.32f),
                    PathNode.LineTo(110.63f, 93.32f),
                    PathNode.CurveTo(112.11012f, 90.35423f, 115.71423f, 89.14988f, 118.68f, 90.63f),
                    PathNode.CurveTo(121.64577f, 92.11012f, 122.85012f, 95.71423f, 121.37f, 98.68f),
                    PathNode.LineTo(109.71f, 122.0f),
                    PathNode.LineTo(132.0f, 122.0f),
                    PathNode.CurveTo(134.07895f, 122.00229f, 136.00856f, 123.080605f, 137.1f, 124.85f),
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
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
