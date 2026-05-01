package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorFillIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 155.84f),
                    PathNode.CurveTo(88.29f, 170.1f, 88.41f, 176.0f, 104.0f, 176.0f),
                    PathNode.CurveTo(108.41828f, 176.0f, 112.0f, 179.58173f, 112.0f, 184.0f),
                    PathNode.CurveTo(112.0f, 188.41827f, 108.41828f, 192.0f, 104.0f, 192.0f),
                    PathNode.CurveTo(72.73f, 192.0f, 72.28f, 169.57f, 72.0f, 156.16f),
                    PathNode.CurveTo(71.71f, 141.9f, 71.59f, 136.0f, 56.0f, 136.0f),
                    PathNode.CurveTo(51.581722f, 136.0f, 48.0f, 132.41827f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 123.58172f, 51.581722f, 120.0f, 56.0f, 120.0f),
                    PathNode.CurveTo(71.59f, 120.0f, 71.71f, 114.1f, 72.0f, 99.84f),
                    PathNode.CurveTo(72.28f, 86.43f, 72.73f, 64.0f, 104.0f, 64.0f),
                    PathNode.CurveTo(108.41828f, 64.0f, 112.0f, 67.58172f, 112.0f, 72.0f),
                    PathNode.CurveTo(112.0f, 76.41828f, 108.41828f, 80.0f, 104.0f, 80.0f),
                    PathNode.CurveTo(88.41f, 80.0f, 88.29f, 85.9f, 88.0f, 100.16f),
                    PathNode.CurveTo(87.83f, 108.47f, 87.59f, 120.25f, 80.0f, 128.0f),
                    PathNode.CurveTo(87.59f, 135.75f, 87.83f, 147.53f, 88.0f, 155.84f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 136.0f),
                    PathNode.CurveTo(184.41f, 136.0f, 184.29f, 141.9f, 184.0f, 156.16f),
                    PathNode.CurveTo(183.72f, 169.57f, 183.27f, 192.0f, 152.0f, 192.0f),
                    PathNode.CurveTo(147.58173f, 192.0f, 144.0f, 188.41827f, 144.0f, 184.0f),
                    PathNode.CurveTo(144.0f, 179.58173f, 147.58173f, 176.0f, 152.0f, 176.0f),
                    PathNode.CurveTo(167.59f, 176.0f, 167.71f, 170.1f, 168.0f, 155.84f),
                    PathNode.CurveTo(168.17f, 147.53f, 168.41f, 135.75f, 176.0f, 128.0f),
                    PathNode.CurveTo(168.4f, 120.25f, 168.16f, 108.47f, 168.0f, 100.16f),
                    PathNode.CurveTo(167.71f, 85.9f, 167.59f, 80.0f, 152.0f, 80.0f),
                    PathNode.CurveTo(147.58173f, 80.0f, 144.0f, 76.41828f, 144.0f, 72.0f),
                    PathNode.CurveTo(144.0f, 67.58172f, 147.58173f, 64.0f, 152.0f, 64.0f),
                    PathNode.CurveTo(183.27f, 64.0f, 183.72f, 86.43f, 184.0f, 99.84f),
                    PathNode.CurveTo(184.29f, 114.1f, 184.41f, 120.0f, 200.0f, 120.0f),
                    PathNode.CurveTo(204.41827f, 120.0f, 208.0f, 123.58172f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 132.41827f, 204.41827f, 136.0f, 200.0f, 136.0f),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
