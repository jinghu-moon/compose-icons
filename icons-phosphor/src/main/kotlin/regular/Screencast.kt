package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorRegularIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(144.0f, 216.0f),
                    PathNode.CurveTo(139.58173f, 216.0f, 136.0f, 212.41827f, 136.0f, 208.0f),
                    PathNode.CurveTo(136.0f, 203.58173f, 139.58173f, 200.0f, 144.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.CurveTo(40.0f, 100.41828f, 36.418278f, 104.0f, 32.0f, 104.0f),
                    PathNode.CurveTo(27.581722f, 104.0f, 24.0f, 100.41828f, 24.0f, 96.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 184.0f),
                    PathNode.CurveTo(27.581722f, 184.0f, 24.0f, 187.58173f, 24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 196.41827f, 27.581722f, 200.0f, 32.0f, 200.0f),
                    PathNode.CurveTo(36.418278f, 200.0f, 40.0f, 203.58173f, 40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.CurveTo(52.418278f, 216.0f, 56.0f, 212.41827f, 56.0f, 208.0f),
                    PathNode.CurveTo(56.0f, 194.74516f, 45.254833f, 184.0f, 32.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 152.0f),
                    PathNode.CurveTo(27.581722f, 152.0f, 24.0f, 155.58173f, 24.0f, 160.0f),
                    PathNode.CurveTo(24.0f, 164.41827f, 27.581722f, 168.0f, 32.0f, 168.0f),
                    PathNode.CurveTo(54.09139f, 168.0f, 72.0f, 185.90862f, 72.0f, 208.0f),
                    PathNode.CurveTo(72.0f, 212.41827f, 75.58172f, 216.0f, 80.0f, 216.0f),
                    PathNode.CurveTo(84.41828f, 216.0f, 88.0f, 212.41827f, 88.0f, 208.0f),
                    PathNode.CurveTo(87.966934f, 177.08577f, 62.914234f, 152.03307f, 32.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 120.0f),
                    PathNode.CurveTo(27.581722f, 120.0f, 24.0f, 123.58172f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 132.41827f, 27.581722f, 136.0f, 32.0f, 136.0f),
                    PathNode.CurveTo(71.74622f, 136.04408f, 103.95591f, 168.25377f, 104.0f, 208.0f),
                    PathNode.CurveTo(104.0f, 212.41827f, 107.58172f, 216.0f, 112.0f, 216.0f),
                    PathNode.CurveTo(116.41828f, 216.0f, 120.0f, 212.41827f, 120.0f, 208.0f),
                    PathNode.CurveTo(119.94489f, 159.42178f, 80.57822f, 120.05511f, 32.0f, 120.0f),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
