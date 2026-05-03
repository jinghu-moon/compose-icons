package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorBoldIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(54.8f, 119.49f),
                    PathNode.CurveTo(53.311462f, 122.593544f, 51.374016f, 125.46097f, 49.05f, 128.0f),
                    PathNode.CurveTo(51.374016f, 130.53903f, 53.311462f, 133.40646f, 54.8f, 136.51f),
                    PathNode.CurveTo(60.0f, 147.24f, 60.0f, 159.83f, 60.0f, 172.0f),
                    PathNode.CurveTo(60.0f, 197.94f, 61.84f, 204.0f, 80.0f, 204.0f),
                    PathNode.CurveTo(86.62742f, 204.0f, 92.0f, 209.37259f, 92.0f, 216.0f),
                    PathNode.CurveTo(92.0f, 222.62741f, 86.62742f, 228.0f, 80.0f, 228.0f),
                    PathNode.CurveTo(60.86f, 228.0f, 47.8f, 221.1f, 41.2f, 207.49f),
                    PathNode.CurveTo(36.0f, 196.76f, 36.0f, 184.17f, 36.0f, 172.0f),
                    PathNode.CurveTo(36.0f, 146.06f, 34.16f, 140.0f, 16.0f, 140.0f),
                    PathNode.CurveTo(9.372583f, 140.0f, 4.0f, 134.62741f, 4.0f, 128.0f),
                    PathNode.CurveTo(4.0f, 121.37258f, 9.372583f, 116.0f, 16.0f, 116.0f),
                    PathNode.CurveTo(34.16f, 116.0f, 36.0f, 109.94f, 36.0f, 84.0f),
                    PathNode.CurveTo(36.0f, 71.83f, 36.0f, 59.24f, 41.2f, 48.51f),
                    PathNode.CurveTo(47.8f, 34.9f, 60.86f, 28.0f, 80.0f, 28.0f),
                    PathNode.CurveTo(86.62742f, 28.0f, 92.0f, 33.37258f, 92.0f, 40.0f),
                    PathNode.CurveTo(92.0f, 46.62742f, 86.62742f, 52.0f, 80.0f, 52.0f),
                    PathNode.CurveTo(61.84f, 52.0f, 60.0f, 58.06f, 60.0f, 84.0f),
                    PathNode.CurveTo(60.0f, 96.17f, 60.0f, 108.76f, 54.8f, 119.49f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 116.0f),
                    PathNode.CurveTo(221.84f, 116.0f, 220.0f, 109.94f, 220.0f, 84.0f),
                    PathNode.CurveTo(220.0f, 71.83f, 220.0f, 59.24f, 214.8f, 48.51f),
                    PathNode.CurveTo(208.2f, 34.9f, 195.14f, 28.0f, 176.0f, 28.0f),
                    PathNode.CurveTo(169.37259f, 28.0f, 164.0f, 33.37258f, 164.0f, 40.0f),
                    PathNode.CurveTo(164.0f, 46.62742f, 169.37259f, 52.0f, 176.0f, 52.0f),
                    PathNode.CurveTo(194.16f, 52.0f, 196.0f, 58.06f, 196.0f, 84.0f),
                    PathNode.CurveTo(196.0f, 96.17f, 196.0f, 108.76f, 201.2f, 119.49f),
                    PathNode.CurveTo(202.7039f, 122.5967f, 204.65831f, 125.464294f, 207.0f, 128.0f),
                    PathNode.CurveTo(204.67598f, 130.53903f, 202.73854f, 133.40646f, 201.25f, 136.51f),
                    PathNode.CurveTo(196.0f, 147.24f, 196.0f, 159.83f, 196.0f, 172.0f),
                    PathNode.CurveTo(196.0f, 197.94f, 194.16f, 204.0f, 176.0f, 204.0f),
                    PathNode.CurveTo(169.37259f, 204.0f, 164.0f, 209.37259f, 164.0f, 216.0f),
                    PathNode.CurveTo(164.0f, 222.62741f, 169.37259f, 228.0f, 176.0f, 228.0f),
                    PathNode.CurveTo(195.14f, 228.0f, 208.2f, 221.1f, 214.8f, 207.49f),
                    PathNode.CurveTo(220.0f, 196.76f, 220.0f, 184.17f, 220.0f, 172.0f),
                    PathNode.CurveTo(220.0f, 146.06f, 221.84f, 140.0f, 240.0f, 140.0f),
                    PathNode.CurveTo(246.62741f, 140.0f, 252.0f, 134.62741f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 121.37258f, 246.62741f, 116.0f, 240.0f, 116.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
