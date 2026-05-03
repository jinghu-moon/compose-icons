package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) return _batteryPlus!!
        _batteryPlus = phosphorThinIcon(
            name = "BatteryPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 130.20914f, 146.20914f, 132.0f, 144.0f, 132.0f),
                    PathNode.LineTo(120.0f, 132.0f),
                    PathNode.LineTo(120.0f, 156.0f),
                    PathNode.CurveTo(120.0f, 158.20914f, 118.20914f, 160.0f, 116.0f, 160.0f),
                    PathNode.CurveTo(113.79086f, 160.0f, 112.0f, 158.20914f, 112.0f, 156.0f),
                    PathNode.LineTo(112.0f, 132.0f),
                    PathNode.LineTo(88.0f, 132.0f),
                    PathNode.CurveTo(85.79086f, 132.0f, 84.0f, 130.20914f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 125.79086f, 85.79086f, 124.0f, 88.0f, 124.0f),
                    PathNode.LineTo(112.0f, 124.0f),
                    PathNode.LineTo(112.0f, 100.0f),
                    PathNode.CurveTo(112.0f, 97.79086f, 113.79086f, 96.0f, 116.0f, 96.0f),
                    PathNode.CurveTo(118.20914f, 96.0f, 120.0f, 97.79086f, 120.0f, 100.0f),
                    PathNode.LineTo(120.0f, 124.0f),
                    PathNode.LineTo(144.0f, 124.0f),
                    PathNode.CurveTo(146.20914f, 124.0f, 148.0f, 125.79086f, 148.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 80.0f),
                    PathNode.LineTo(220.0f, 176.0f),
                    PathNode.CurveTo(220.0f, 187.0457f, 211.0457f, 196.0f, 200.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(20.954306f, 196.0f, 12.0f, 187.0457f, 12.0f, 176.0f),
                    PathNode.LineTo(12.0f, 80.0f),
                    PathNode.CurveTo(12.0f, 68.95431f, 20.954306f, 60.0f, 32.0f, 60.0f),
                    PathNode.LineTo(200.0f, 60.0f),
                    PathNode.CurveTo(211.0457f, 60.0f, 220.0f, 68.95431f, 220.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 80.0f),
                    PathNode.CurveTo(212.0f, 73.37258f, 206.62741f, 68.0f, 200.0f, 68.0f),
                    PathNode.LineTo(32.0f, 68.0f),
                    PathNode.CurveTo(25.372583f, 68.0f, 20.0f, 73.37258f, 20.0f, 80.0f),
                    PathNode.LineTo(20.0f, 176.0f),
                    PathNode.CurveTo(20.0f, 182.62741f, 25.372583f, 188.0f, 32.0f, 188.0f),
                    PathNode.LineTo(200.0f, 188.0f),
                    PathNode.CurveTo(206.62741f, 188.0f, 212.0f, 182.62741f, 212.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 92.0f),
                    PathNode.CurveTo(245.79086f, 92.0f, 244.0f, 93.79086f, 244.0f, 96.0f),
                    PathNode.LineTo(244.0f, 160.0f),
                    PathNode.CurveTo(244.0f, 162.20914f, 245.79086f, 164.0f, 248.0f, 164.0f),
                    PathNode.CurveTo(250.20914f, 164.0f, 252.0f, 162.20914f, 252.0f, 160.0f),
                    PathNode.LineTo(252.0f, 96.0f),
                    PathNode.CurveTo(252.0f, 93.79086f, 250.20914f, 92.0f, 248.0f, 92.0f),
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
        return _batteryPlus!!
    }

private var _batteryPlus: ImageVector? = null
