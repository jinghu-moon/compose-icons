package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorRegularIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.41f, 102.53f),
                    PathNode.CurveTo(111.738846f, 100.51701f, 111.89491f, 98.31985f, 112.84387f, 96.421936f),
                    PathNode.CurveTo(113.79282f, 94.524025f, 115.45692f, 93.08087f, 117.47f, 92.41f),
                    PathNode.LineTo(129.47f, 88.41f),
                    PathNode.CurveTo(131.9097f, 87.5967f, 134.59163f, 88.00585f, 136.67784f, 89.50959f),
                    PathNode.CurveTo(138.76407f, 91.01333f, 140.00018f, 93.428314f, 140.0f, 96.0f),
                    PathNode.LineTo(140.0f, 136.0f),
                    PathNode.CurveTo(140.0f, 140.41827f, 136.41827f, 144.0f, 132.0f, 144.0f),
                    PathNode.CurveTo(127.58172f, 144.0f, 124.0f, 140.41827f, 124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 107.1f),
                    PathNode.LineTo(122.53f, 107.59f),
                    PathNode.CurveTo(120.51701f, 108.261154f, 118.31985f, 108.10509f, 116.421936f, 107.15613f),
                    PathNode.CurveTo(114.524025f, 106.20718f, 113.08087f, 104.54308f, 112.41f, 102.53f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 208.0f),
                    PathNode.CurveTo(248.0f, 212.41827f, 244.41827f, 216.0f, 240.0f, 216.0f),
                    PathNode.LineTo(16.0f, 216.0f),
                    PathNode.CurveTo(11.581722f, 216.0f, 8.0f, 212.41827f, 8.0f, 208.0f),
                    PathNode.CurveTo(8.0f, 203.58173f, 11.581722f, 200.0f, 16.0f, 200.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 104.0f),
                    PathNode.CurveTo(24.0f, 95.163445f, 31.163445f, 88.0f, 40.0f, 88.0f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.CurveTo(80.0f, 47.163445f, 87.163445f, 40.0f, 96.0f, 40.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.CurveTo(168.83656f, 40.0f, 176.0f, 47.163445f, 176.0f, 56.0f),
                    PathNode.LineTo(176.0f, 128.0f),
                    PathNode.LineTo(216.0f, 128.0f),
                    PathNode.CurveTo(224.83656f, 128.0f, 232.0f, 135.16344f, 232.0f, 144.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(244.41827f, 200.0f, 248.0f, 203.58173f, 248.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 144.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 200.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.LineTo(40.0f, 104.0f),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
