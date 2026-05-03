package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryPlusVertical: ImageVector
    get() {
        if (_batteryPlusVertical != null) return _batteryPlusVertical!!
        _batteryPlusVertical = phosphorLightIcon(
            name = "BatteryPlusVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(90.0f, 8.0f),
                    PathNode.CurveTo(90.0f, 4.686292f, 92.686295f, 2.0f, 96.0f, 2.0f),
                    PathNode.LineTo(160.0f, 2.0f),
                    PathNode.CurveTo(163.3137f, 2.0f, 166.0f, 4.686292f, 166.0f, 8.0f),
                    PathNode.CurveTo(166.0f, 11.313708f, 163.3137f, 14.0f, 160.0f, 14.0f),
                    PathNode.LineTo(96.0f, 14.0f),
                    PathNode.CurveTo(92.686295f, 14.0f, 90.0f, 11.313708f, 90.0f, 8.0f),
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
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 134.0f),
                    PathNode.LineTo(134.0f, 134.0f),
                    PathNode.LineTo(134.0f, 112.0f),
                    PathNode.CurveTo(134.0f, 108.686295f, 131.3137f, 106.0f, 128.0f, 106.0f),
                    PathNode.CurveTo(124.686295f, 106.0f, 122.0f, 108.686295f, 122.0f, 112.0f),
                    PathNode.LineTo(122.0f, 134.0f),
                    PathNode.LineTo(100.0f, 134.0f),
                    PathNode.CurveTo(96.686295f, 134.0f, 94.0f, 136.6863f, 94.0f, 140.0f),
                    PathNode.CurveTo(94.0f, 143.3137f, 96.686295f, 146.0f, 100.0f, 146.0f),
                    PathNode.LineTo(122.0f, 146.0f),
                    PathNode.LineTo(122.0f, 168.0f),
                    PathNode.CurveTo(122.0f, 171.3137f, 124.686295f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(131.3137f, 174.0f, 134.0f, 171.3137f, 134.0f, 168.0f),
                    PathNode.LineTo(134.0f, 146.0f),
                    PathNode.LineTo(156.0f, 146.0f),
                    PathNode.CurveTo(159.3137f, 146.0f, 162.0f, 143.3137f, 162.0f, 140.0f),
                    PathNode.CurveTo(162.0f, 136.6863f, 159.3137f, 134.0f, 156.0f, 134.0f),
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
        return _batteryPlusVertical!!
    }

private var _batteryPlusVertical: ImageVector? = null
