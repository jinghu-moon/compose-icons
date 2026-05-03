package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorThinIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.08f, 151.92f),
                    PathNode.CurveTo(116.877914f, 164.64099f, 124.05144f, 181.9554f, 124.0f, 200.0f),
                    PathNode.CurveTo(124.0f, 202.20914f, 122.20914f, 204.0f, 120.0f, 204.0f),
                    PathNode.CurveTo(117.79086f, 204.0f, 116.0f, 202.20914f, 116.0f, 200.0f),
                    PathNode.CurveTo(116.0f, 166.86292f, 89.137085f, 140.0f, 56.0f, 140.0f),
                    PathNode.CurveTo(53.79086f, 140.0f, 52.0f, 138.20914f, 52.0f, 136.0f),
                    PathNode.CurveTo(52.0f, 133.79086f, 53.79086f, 132.0f, 56.0f, 132.0f),
                    PathNode.CurveTo(74.0446f, 131.94856f, 91.35901f, 139.12209f, 104.08f, 151.92f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 84.0f),
                    PathNode.CurveTo(53.79086f, 84.0f, 52.0f, 85.79086f, 52.0f, 88.0f),
                    PathNode.CurveTo(52.0f, 90.20914f, 53.79086f, 92.0f, 56.0f, 92.0f),
                    PathNode.CurveTo(115.64675f, 92.0f, 164.0f, 140.35324f, 164.0f, 200.0f),
                    PathNode.CurveTo(164.0f, 202.20914f, 165.79086f, 204.0f, 168.0f, 204.0f),
                    PathNode.CurveTo(170.20914f, 204.0f, 172.0f, 202.20914f, 172.0f, 200.0f),
                    PathNode.CurveTo(172.0f, 135.93497f, 120.06503f, 84.0f, 56.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 84.0f),
                    PathNode.CurveTo(141.29771f, 53.14687f, 99.52616f, 35.86209f, 56.0f, 36.0f),
                    PathNode.CurveTo(53.79086f, 36.0f, 52.0f, 37.79086f, 52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 42.20914f, 53.79086f, 44.0f, 56.0f, 44.0f),
                    PathNode.CurveTo(97.39598f, 43.8886f, 137.11653f, 60.340706f, 166.31f, 89.69f),
                    PathNode.CurveTo(195.65929f, 118.88347f, 212.1114f, 158.60402f, 212.0f, 200.0f),
                    PathNode.CurveTo(212.0f, 202.20914f, 213.79086f, 204.0f, 216.0f, 204.0f),
                    PathNode.CurveTo(218.20914f, 204.0f, 220.0f, 202.20914f, 220.0f, 200.0f),
                    PathNode.CurveTo(220.13791f, 156.47383f, 202.85313f, 114.702286f, 172.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 188.0f),
                    PathNode.CurveTo(55.581722f, 188.0f, 52.0f, 191.58173f, 52.0f, 196.0f),
                    PathNode.CurveTo(52.0f, 200.41827f, 55.581722f, 204.0f, 60.0f, 204.0f),
                    PathNode.CurveTo(64.41828f, 204.0f, 68.0f, 200.41827f, 68.0f, 196.0f),
                    PathNode.CurveTo(68.0f, 191.58173f, 64.41828f, 188.0f, 60.0f, 188.0f),
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
        return _rss!!
    }

private var _rss: ImageVector? = null
