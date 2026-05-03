package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryLow: ImageVector
    get() {
        if (_batteryLow != null) return _batteryLow!!
        _batteryLow = phosphorLightIcon(
            name = "BatteryLow",
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
                    PathNode.MoveTo(62.0f, 96.0f),
                    PathNode.LineTo(62.0f, 160.0f),
                    PathNode.CurveTo(62.0f, 163.3137f, 59.31371f, 166.0f, 56.0f, 166.0f),
                    PathNode.CurveTo(52.68629f, 166.0f, 50.0f, 163.3137f, 50.0f, 160.0f),
                    PathNode.LineTo(50.0f, 96.0f),
                    PathNode.CurveTo(50.0f, 92.686295f, 52.68629f, 90.0f, 56.0f, 90.0f),
                    PathNode.CurveTo(59.31371f, 90.0f, 62.0f, 92.686295f, 62.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(254.0f, 96.0f),
                    PathNode.LineTo(254.0f, 160.0f),
                    PathNode.CurveTo(254.0f, 163.3137f, 251.3137f, 166.0f, 248.0f, 166.0f),
                    PathNode.CurveTo(244.6863f, 166.0f, 242.0f, 163.3137f, 242.0f, 160.0f),
                    PathNode.LineTo(242.0f, 96.0f),
                    PathNode.CurveTo(242.0f, 92.686295f, 244.6863f, 90.0f, 248.0f, 90.0f),
                    PathNode.CurveTo(251.3137f, 90.0f, 254.0f, 92.686295f, 254.0f, 96.0f),
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
        return _batteryLow!!
    }

private var _batteryLow: ImageVector? = null
