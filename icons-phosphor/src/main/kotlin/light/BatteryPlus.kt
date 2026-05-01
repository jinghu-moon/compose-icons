package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) return _batteryPlus!!
        _batteryPlus = phosphorLightIcon(
            name = "BatteryPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(150.0f, 128.0f),
                    PathNode.CurveTo(150.0f, 131.3137f, 147.3137f, 134.0f, 144.0f, 134.0f),
                    PathNode.LineTo(122.0f, 134.0f),
                    PathNode.LineTo(122.0f, 156.0f),
                    PathNode.CurveTo(122.0f, 159.3137f, 119.313705f, 162.0f, 116.0f, 162.0f),
                    PathNode.CurveTo(112.686295f, 162.0f, 110.0f, 159.3137f, 110.0f, 156.0f),
                    PathNode.LineTo(110.0f, 134.0f),
                    PathNode.LineTo(88.0f, 134.0f),
                    PathNode.CurveTo(84.686295f, 134.0f, 82.0f, 131.3137f, 82.0f, 128.0f),
                    PathNode.CurveTo(82.0f, 124.686295f, 84.686295f, 122.0f, 88.0f, 122.0f),
                    PathNode.LineTo(110.0f, 122.0f),
                    PathNode.LineTo(110.0f, 100.0f),
                    PathNode.CurveTo(110.0f, 96.686295f, 112.686295f, 94.0f, 116.0f, 94.0f),
                    PathNode.CurveTo(119.313705f, 94.0f, 122.0f, 96.686295f, 122.0f, 100.0f),
                    PathNode.LineTo(122.0f, 122.0f),
                    PathNode.LineTo(144.0f, 122.0f),
                    PathNode.CurveTo(147.3137f, 122.0f, 150.0f, 124.686295f, 150.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 80.0f),
                    PathNode.LineTo(222.0f, 176.0f),
                    PathNode.CurveTo(222.0f, 188.15027f, 212.15027f, 198.0f, 200.0f, 198.0f),
                    PathNode.LineTo(32.0f, 198.0f),
                    PathNode.CurveTo(19.849735f, 198.0f, 10.0f, 188.15027f, 10.0f, 176.0f),
                    PathNode.LineTo(10.0f, 80.0f),
                    PathNode.CurveTo(10.0f, 67.84974f, 19.849735f, 58.0f, 32.0f, 58.0f),
                    PathNode.LineTo(200.0f, 58.0f),
                    PathNode.CurveTo(212.15027f, 58.0f, 222.0f, 67.84974f, 222.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 80.0f),
                    PathNode.CurveTo(210.0f, 74.47715f, 205.52284f, 70.0f, 200.0f, 70.0f),
                    PathNode.LineTo(32.0f, 70.0f),
                    PathNode.CurveTo(26.477152f, 70.0f, 22.0f, 74.47715f, 22.0f, 80.0f),
                    PathNode.LineTo(22.0f, 176.0f),
                    PathNode.CurveTo(22.0f, 181.52284f, 26.477152f, 186.0f, 32.0f, 186.0f),
                    PathNode.LineTo(200.0f, 186.0f),
                    PathNode.CurveTo(205.52284f, 186.0f, 210.0f, 181.52284f, 210.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 90.0f),
                    PathNode.CurveTo(244.6863f, 90.0f, 242.0f, 92.686295f, 242.0f, 96.0f),
                    PathNode.LineTo(242.0f, 160.0f),
                    PathNode.CurveTo(242.0f, 163.3137f, 244.6863f, 166.0f, 248.0f, 166.0f),
                    PathNode.CurveTo(251.3137f, 166.0f, 254.0f, 163.3137f, 254.0f, 160.0f),
                    PathNode.LineTo(254.0f, 96.0f),
                    PathNode.CurveTo(254.0f, 92.686295f, 251.3137f, 90.0f, 248.0f, 90.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _batteryPlus!!
    }

private var _batteryPlus: ImageVector? = null
