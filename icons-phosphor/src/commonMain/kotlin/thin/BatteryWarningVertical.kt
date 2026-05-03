package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryWarningVertical: ImageVector
    get() {
        if (_batteryWarningVertical != null) return _batteryWarningVertical!!
        _batteryWarningVertical = phosphorThinIcon(
            name = "BatteryWarningVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 96.0f),
                    PathNode.CurveTo(124.0f, 93.79086f, 125.79086f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(130.20914f, 92.0f, 132.0f, 93.79086f, 132.0f, 96.0f),
                    PathNode.LineTo(132.0f, 136.0f),
                    PathNode.CurveTo(132.0f, 138.20914f, 130.20914f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(125.79086f, 140.0f, 124.0f, 138.20914f, 124.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(123.58172f, 164.0f, 120.0f, 167.58173f, 120.0f, 172.0f),
                    PathNode.CurveTo(120.0f, 176.41827f, 123.58172f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(132.41827f, 180.0f, 136.0f, 176.41827f, 136.0f, 172.0f),
                    PathNode.CurveTo(136.0f, 167.58173f, 132.41827f, 164.0f, 128.0f, 164.0f),
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
        return _batteryWarningVertical!!
    }

private var _batteryWarningVertical: ImageVector? = null
