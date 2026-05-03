package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorThinIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 36.0f),
                    PathNode.LineTo(96.0f, 36.0f),
                    PathNode.CurveTo(84.95431f, 36.0f, 76.0f, 44.954304f, 76.0f, 56.0f),
                    PathNode.LineTo(76.0f, 200.0f),
                    PathNode.CurveTo(76.0f, 211.0457f, 84.95431f, 220.0f, 96.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(171.0457f, 220.0f, 180.0f, 211.0457f, 180.0f, 200.0f),
                    PathNode.LineTo(180.0f, 56.0f),
                    PathNode.CurveTo(180.0f, 44.954304f, 171.0457f, 36.0f, 160.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 200.0f),
                    PathNode.CurveTo(172.0f, 206.62741f, 166.62741f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(89.37258f, 212.0f, 84.0f, 206.62741f, 84.0f, 200.0f),
                    PathNode.LineTo(84.0f, 56.0f),
                    PathNode.CurveTo(84.0f, 49.37258f, 89.37258f, 44.0f, 96.0f, 44.0f),
                    PathNode.LineTo(160.0f, 44.0f),
                    PathNode.CurveTo(166.62741f, 44.0f, 172.0f, 49.37258f, 172.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 88.0f),
                    PathNode.LineTo(212.0f, 168.0f),
                    PathNode.CurveTo(212.0f, 170.20914f, 210.20914f, 172.0f, 208.0f, 172.0f),
                    PathNode.CurveTo(205.79086f, 172.0f, 204.0f, 170.20914f, 204.0f, 168.0f),
                    PathNode.LineTo(204.0f, 88.0f),
                    PathNode.CurveTo(204.0f, 85.79086f, 205.79086f, 84.0f, 208.0f, 84.0f),
                    PathNode.CurveTo(210.20914f, 84.0f, 212.0f, 85.79086f, 212.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 104.0f),
                    PathNode.LineTo(244.0f, 152.0f),
                    PathNode.CurveTo(244.0f, 154.20914f, 242.20914f, 156.0f, 240.0f, 156.0f),
                    PathNode.CurveTo(237.79086f, 156.0f, 236.0f, 154.20914f, 236.0f, 152.0f),
                    PathNode.LineTo(236.0f, 104.0f),
                    PathNode.CurveTo(236.0f, 101.79086f, 237.79086f, 100.0f, 240.0f, 100.0f),
                    PathNode.CurveTo(242.20914f, 100.0f, 244.0f, 101.79086f, 244.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 88.0f),
                    PathNode.LineTo(52.0f, 168.0f),
                    PathNode.CurveTo(52.0f, 170.20914f, 50.20914f, 172.0f, 48.0f, 172.0f),
                    PathNode.CurveTo(45.79086f, 172.0f, 44.0f, 170.20914f, 44.0f, 168.0f),
                    PathNode.LineTo(44.0f, 88.0f),
                    PathNode.CurveTo(44.0f, 85.79086f, 45.79086f, 84.0f, 48.0f, 84.0f),
                    PathNode.CurveTo(50.20914f, 84.0f, 52.0f, 85.79086f, 52.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 104.0f),
                    PathNode.LineTo(20.0f, 152.0f),
                    PathNode.CurveTo(20.0f, 154.20914f, 18.209139f, 156.0f, 16.0f, 156.0f),
                    PathNode.CurveTo(13.790861f, 156.0f, 12.0f, 154.20914f, 12.0f, 152.0f),
                    PathNode.LineTo(12.0f, 104.0f),
                    PathNode.CurveTo(12.0f, 101.79086f, 13.790861f, 100.0f, 16.0f, 100.0f),
                    PathNode.CurveTo(18.209139f, 100.0f, 20.0f, 101.79086f, 20.0f, 104.0f),
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
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
