package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorFillIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(196.41827f, 72.0f, 200.0f, 75.58172f, 200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 84.41828f, 196.41827f, 88.0f, 192.0f, 88.0f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.CurveTo(59.581722f, 88.0f, 56.0f, 84.41828f, 56.0f, 80.0f),
                    PathNode.CurveTo(56.0f, 75.58172f, 59.581722f, 72.0f, 64.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.CurveTo(140.41827f, 120.0f, 144.0f, 123.58172f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 132.41827f, 140.41827f, 136.0f, 136.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(59.581722f, 136.0f, 56.0f, 132.41827f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 123.58172f, 59.581722f, 120.0f, 64.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 184.0f),
                    PathNode.LineTo(64.0f, 184.0f),
                    PathNode.CurveTo(59.581722f, 184.0f, 56.0f, 180.41827f, 56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 171.58173f, 59.581722f, 168.0f, 64.0f, 168.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.CurveTo(108.41828f, 168.0f, 112.0f, 171.58173f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 180.41827f, 108.41828f, 184.0f, 104.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(207.59f, 130.53f),
                    PathNode.CurveTo(206.91913f, 132.54309f, 205.47597f, 134.20717f, 203.57806f, 135.15613f),
                    PathNode.CurveTo(201.68016f, 136.10509f, 199.48299f, 136.26115f, 197.47f, 135.59f),
                    PathNode.LineTo(184.0f, 131.1f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.CurveTo(184.00323f, 186.45493f, 177.23805f, 195.70906f, 167.27504f, 198.87822f),
                    PathNode.CurveTo(157.31201f, 202.0474f, 146.4437f, 198.40233f, 140.40622f, 189.86685f),
                    PathNode.CurveTo(134.36876f, 181.33138f, 134.55139f, 169.86955f, 140.85773f, 161.53076f),
                    PathNode.CurveTo(147.16408f, 153.19197f, 158.143f, 149.89502f, 168.0f, 153.38f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.CurveTo(167.99982f, 117.428314f, 169.23593f, 115.01333f, 171.32216f, 113.50959f),
                    PathNode.CurveTo(173.40837f, 112.00585f, 176.0903f, 111.5967f, 178.53f, 112.41f),
                    PathNode.LineTo(202.53f, 120.41f),
                    PathNode.CurveTo(204.54309f, 121.08087f, 206.20717f, 122.524025f, 207.15613f, 124.421936f),
                    PathNode.CurveTo(208.10509f, 126.31985f, 208.26115f, 128.51701f, 207.59f, 130.53f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _playlist!!
    }

private var _playlist: ImageVector? = null
