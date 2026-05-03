package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryVerticalHigh: ImageVector
    get() {
        if (_batteryVerticalHigh != null) return _batteryVerticalHigh!!
        _batteryVerticalHigh = phosphorLightIcon(
            name = "BatteryVerticalHigh",
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
                    PathNode.MoveTo(160.0f, 114.0f),
                    PathNode.LineTo(96.0f, 114.0f),
                    PathNode.CurveTo(92.686295f, 114.0f, 90.0f, 116.686295f, 90.0f, 120.0f),
                    PathNode.CurveTo(90.0f, 123.313705f, 92.686295f, 126.0f, 96.0f, 126.0f),
                    PathNode.LineTo(160.0f, 126.0f),
                    PathNode.CurveTo(163.3137f, 126.0f, 166.0f, 123.313705f, 166.0f, 120.0f),
                    PathNode.CurveTo(166.0f, 116.686295f, 163.3137f, 114.0f, 160.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 154.0f),
                    PathNode.LineTo(96.0f, 154.0f),
                    PathNode.CurveTo(92.686295f, 154.0f, 90.0f, 156.6863f, 90.0f, 160.0f),
                    PathNode.CurveTo(90.0f, 163.3137f, 92.686295f, 166.0f, 96.0f, 166.0f),
                    PathNode.LineTo(160.0f, 166.0f),
                    PathNode.CurveTo(163.3137f, 166.0f, 166.0f, 163.3137f, 166.0f, 160.0f),
                    PathNode.CurveTo(166.0f, 156.6863f, 163.3137f, 154.0f, 160.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 194.0f),
                    PathNode.LineTo(96.0f, 194.0f),
                    PathNode.CurveTo(92.686295f, 194.0f, 90.0f, 196.6863f, 90.0f, 200.0f),
                    PathNode.CurveTo(90.0f, 203.3137f, 92.686295f, 206.0f, 96.0f, 206.0f),
                    PathNode.LineTo(160.0f, 206.0f),
                    PathNode.CurveTo(163.3137f, 206.0f, 166.0f, 203.3137f, 166.0f, 200.0f),
                    PathNode.CurveTo(166.0f, 196.6863f, 163.3137f, 194.0f, 160.0f, 194.0f),
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
        return _batteryVerticalHigh!!
    }

private var _batteryVerticalHigh: ImageVector? = null
