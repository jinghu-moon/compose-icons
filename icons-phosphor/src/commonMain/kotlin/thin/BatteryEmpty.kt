package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryEmpty: ImageVector
    get() {
        if (_batteryEmpty != null) return _batteryEmpty!!
        _batteryEmpty = phosphorThinIcon(
            name = "BatteryEmpty",
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
        return _batteryEmpty!!
    }

private var _batteryEmpty: ImageVector? = null
