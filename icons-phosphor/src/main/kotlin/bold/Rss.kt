package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorBoldIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(109.74f, 146.26f),
                    PathNode.CurveTo(124.03684f, 160.48323f, 132.05194f, 179.83327f, 132.0f, 200.0f),
                    PathNode.CurveTo(132.0f, 206.62741f, 126.62742f, 212.0f, 120.0f, 212.0f),
                    PathNode.CurveTo(113.37258f, 212.0f, 108.0f, 206.62741f, 108.0f, 200.0f),
                    PathNode.CurveTo(108.0f, 171.28119f, 84.7188f, 148.0f, 56.0f, 148.0f),
                    PathNode.CurveTo(49.37258f, 148.0f, 44.0f, 142.62741f, 44.0f, 136.0f),
                    PathNode.CurveTo(44.0f, 129.37259f, 49.37258f, 124.0f, 56.0f, 124.0f),
                    PathNode.CurveTo(76.16718f, 123.94582f, 95.51803f, 131.96127f, 109.74f, 146.26f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 76.0f),
                    PathNode.CurveTo(49.37258f, 76.0f, 44.0f, 81.37258f, 44.0f, 88.0f),
                    PathNode.CurveTo(44.0f, 94.62742f, 49.37258f, 100.0f, 56.0f, 100.0f),
                    PathNode.CurveTo(111.22848f, 100.0f, 156.0f, 144.77153f, 156.0f, 200.0f),
                    PathNode.CurveTo(156.0f, 206.62741f, 161.37259f, 212.0f, 168.0f, 212.0f),
                    PathNode.CurveTo(174.62741f, 212.0f, 180.0f, 206.62741f, 180.0f, 200.0f),
                    PathNode.CurveTo(180.0f, 131.5167f, 124.48331f, 76.0f, 56.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.62f, 78.38f),
                    PathNode.CurveTo(145.4369f, 46.01558f, 101.64199f, 27.87393f, 56.0f, 28.0f),
                    PathNode.CurveTo(49.37258f, 28.0f, 44.0f, 33.37258f, 44.0f, 40.0f),
                    PathNode.CurveTo(44.0f, 46.62742f, 49.37258f, 52.0f, 56.0f, 52.0f),
                    PathNode.CurveTo(95.27362f, 51.89023f, 132.95813f, 67.50059f, 160.65f, 95.35f),
                    PathNode.CurveTo(188.49942f, 123.04186f, 204.10977f, 160.72638f, 204.0f, 200.0f),
                    PathNode.CurveTo(204.0f, 206.62741f, 209.37259f, 212.0f, 216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.CurveTo(228.12607f, 154.358f, 209.98442f, 110.563095f, 177.62f, 78.38f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 180.0f),
                    PathNode.CurveTo(51.163445f, 180.0f, 44.0f, 187.16344f, 44.0f, 196.0f),
                    PathNode.CurveTo(44.0f, 204.83656f, 51.163445f, 212.0f, 60.0f, 212.0f),
                    PathNode.CurveTo(68.836555f, 212.0f, 76.0f, 204.83656f, 76.0f, 196.0f),
                    PathNode.CurveTo(76.0f, 187.16344f, 68.836555f, 180.0f, 60.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rss!!
    }

private var _rss: ImageVector? = null
