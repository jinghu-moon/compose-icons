package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MonitorArrowUp: ImageVector
    get() {
        if (_monitorArrowUp != null) return _monitorArrowUp!!
        _monitorArrowUp = phosphorThinIcon(
            name = "MonitorArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(36.954304f, 44.0f, 28.0f, 52.954304f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 187.0457f, 36.954304f, 196.0f, 48.0f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(219.0457f, 196.0f, 228.0f, 187.0457f, 228.0f, 176.0f),
                    PathNode.LineTo(228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 52.954304f, 219.0457f, 44.0f, 208.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 176.0f),
                    PathNode.CurveTo(220.0f, 182.62741f, 214.62741f, 188.0f, 208.0f, 188.0f),
                    PathNode.LineTo(48.0f, 188.0f),
                    PathNode.CurveTo(41.37258f, 188.0f, 36.0f, 182.62741f, 36.0f, 176.0f),
                    PathNode.LineTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 57.37258f, 41.37258f, 52.0f, 48.0f, 52.0f),
                    PathNode.LineTo(208.0f, 52.0f),
                    PathNode.CurveTo(214.62741f, 52.0f, 220.0f, 57.37258f, 220.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 224.0f),
                    PathNode.CurveTo(164.0f, 226.20914f, 162.20914f, 228.0f, 160.0f, 228.0f),
                    PathNode.LineTo(96.0f, 228.0f),
                    PathNode.CurveTo(93.79086f, 228.0f, 92.0f, 226.20914f, 92.0f, 224.0f),
                    PathNode.CurveTo(92.0f, 221.79086f, 93.79086f, 220.0f, 96.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(162.20914f, 220.0f, 164.0f, 221.79086f, 164.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.83f, 109.17f),
                    PathNode.CurveTo(156.39296f, 110.73296f, 156.39296f, 113.26704f, 154.83f, 114.83f),
                    PathNode.CurveTo(153.26703f, 116.39297f, 150.73297f, 116.39297f, 149.17f, 114.83f),
                    PathNode.LineTo(132.0f, 97.66f),
                    PathNode.LineTo(132.0f, 152.0f),
                    PathNode.CurveTo(132.0f, 154.20914f, 130.20914f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(125.79086f, 156.0f, 124.0f, 154.20914f, 124.0f, 152.0f),
                    PathNode.LineTo(124.0f, 97.66f),
                    PathNode.LineTo(106.83f, 114.83f),
                    PathNode.CurveTo(105.26704f, 116.39297f, 102.73296f, 116.39297f, 101.17f, 114.83f),
                    PathNode.CurveTo(99.60703f, 113.26704f, 99.60703f, 110.73296f, 101.17f, 109.17f),
                    PathNode.LineTo(125.17f, 85.17f),
                    PathNode.CurveTo(125.92027f, 84.418884f, 126.93836f, 83.99686f, 128.0f, 83.99686f),
                    PathNode.CurveTo(129.06163f, 83.99686f, 130.07973f, 84.418884f, 130.83f, 85.17f),
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
        return _monitorArrowUp!!
    }

private var _monitorArrowUp: ImageVector? = null
