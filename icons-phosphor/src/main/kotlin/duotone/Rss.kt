package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorDuotoneIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(144.36555f, 40.0f, 216.0f, 111.63444f, 216.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(106.91f, 149.09f),
                    PathNode.CurveTo(120.4569f, 162.56241f, 128.05113f, 180.89442f, 128.0f, 200.0f),
                    PathNode.CurveTo(128.0f, 204.41827f, 124.41828f, 208.0f, 120.0f, 208.0f),
                    PathNode.CurveTo(115.58172f, 208.0f, 112.0f, 204.41827f, 112.0f, 200.0f),
                    PathNode.CurveTo(112.0f, 169.07205f, 86.92794f, 144.0f, 56.0f, 144.0f),
                    PathNode.CurveTo(51.581722f, 144.0f, 48.0f, 140.41827f, 48.0f, 136.0f),
                    PathNode.CurveTo(48.0f, 131.58173f, 51.581722f, 128.0f, 56.0f, 128.0f),
                    PathNode.CurveTo(75.10556f, 127.94887f, 93.43757f, 135.54309f, 106.91f, 149.09f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 80.0f),
                    PathNode.CurveTo(51.581722f, 80.0f, 48.0f, 83.58172f, 48.0f, 88.0f),
                    PathNode.CurveTo(48.0f, 92.41828f, 51.581722f, 96.0f, 56.0f, 96.0f),
                    PathNode.CurveTo(113.437614f, 96.0f, 160.0f, 142.5624f, 160.0f, 200.0f),
                    PathNode.CurveTo(160.0f, 204.41827f, 163.58173f, 208.0f, 168.0f, 208.0f),
                    PathNode.CurveTo(172.41827f, 208.0f, 176.0f, 204.41827f, 176.0f, 200.0f),
                    PathNode.CurveTo(176.0f, 133.72583f, 122.27417f, 80.0f, 56.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.79f, 81.21f),
                    PathNode.CurveTo(143.35518f, 49.599297f, 100.57993f, 31.879206f, 56.0f, 32.0f),
                    PathNode.CurveTo(51.581722f, 32.0f, 48.0f, 35.581722f, 48.0f, 40.0f),
                    PathNode.CurveTo(48.0f, 44.418278f, 51.581722f, 48.0f, 56.0f, 48.0f),
                    PathNode.CurveTo(96.3348f, 47.889416f, 135.03734f, 63.920647f, 163.48f, 92.52f),
                    PathNode.CurveTo(192.07936f, 120.96267f, 208.11058f, 159.66518f, 208.0f, 200.0f),
                    PathNode.CurveTo(208.0f, 204.41827f, 211.58173f, 208.0f, 216.0f, 208.0f),
                    PathNode.CurveTo(220.41827f, 208.0f, 224.0f, 204.41827f, 224.0f, 200.0f),
                    PathNode.CurveTo(224.11967f, 155.42029f, 206.39977f, 112.64546f, 174.79f, 81.21f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 184.0f),
                    PathNode.CurveTo(53.37258f, 184.0f, 48.0f, 189.37259f, 48.0f, 196.0f),
                    PathNode.CurveTo(48.0f, 202.62741f, 53.37258f, 208.0f, 60.0f, 208.0f),
                    PathNode.CurveTo(66.62742f, 208.0f, 72.0f, 202.62741f, 72.0f, 196.0f),
                    PathNode.CurveTo(72.0f, 189.37259f, 66.62742f, 184.0f, 60.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rss!!
    }

private var _rss: ImageVector? = null
