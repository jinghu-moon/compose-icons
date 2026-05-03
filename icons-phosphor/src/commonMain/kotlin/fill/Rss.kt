package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorFillIcon(
            name = "Rss",
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
                    PathNode.MoveTo(76.0f, 192.0f),
                    PathNode.CurveTo(69.37258f, 192.0f, 64.0f, 186.62741f, 64.0f, 180.0f),
                    PathNode.CurveTo(64.0f, 173.37259f, 69.37258f, 168.0f, 76.0f, 168.0f),
                    PathNode.CurveTo(82.62742f, 168.0f, 88.0f, 173.37259f, 88.0f, 180.0f),
                    PathNode.CurveTo(88.0f, 186.62741f, 82.62742f, 192.0f, 76.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 192.0f),
                    PathNode.CurveTo(115.58172f, 192.0f, 112.0f, 188.41827f, 112.0f, 184.0f),
                    PathNode.CurveTo(112.0f, 161.90862f, 94.09139f, 144.0f, 72.0f, 144.0f),
                    PathNode.CurveTo(67.58172f, 144.0f, 64.0f, 140.41827f, 64.0f, 136.0f),
                    PathNode.CurveTo(64.0f, 131.58173f, 67.58172f, 128.0f, 72.0f, 128.0f),
                    PathNode.CurveTo(102.91424f, 128.03307f, 127.966934f, 153.08577f, 128.0f, 184.0f),
                    PathNode.CurveTo(128.0f, 188.41827f, 124.41828f, 192.0f, 120.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 192.0f),
                    PathNode.CurveTo(147.58173f, 192.0f, 144.0f, 188.41827f, 144.0f, 184.0f),
                    PathNode.CurveTo(143.95592f, 144.25377f, 111.74622f, 112.04409f, 72.0f, 112.0f),
                    PathNode.CurveTo(67.58172f, 112.0f, 64.0f, 108.41828f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 99.58172f, 67.58172f, 96.0f, 72.0f, 96.0f),
                    PathNode.CurveTo(120.57822f, 96.05511f, 159.94489f, 135.42178f, 160.0f, 184.0f),
                    PathNode.CurveTo(160.0f, 188.41827f, 156.41827f, 192.0f, 152.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 192.0f),
                    PathNode.CurveTo(179.58173f, 192.0f, 176.0f, 188.41827f, 176.0f, 184.0f),
                    PathNode.CurveTo(175.93938f, 126.58752f, 129.41248f, 80.06063f, 72.0f, 80.0f),
                    PathNode.CurveTo(67.58172f, 80.0f, 64.0f, 76.41828f, 64.0f, 72.0f),
                    PathNode.CurveTo(64.0f, 67.58172f, 67.58172f, 64.0f, 72.0f, 64.0f),
                    PathNode.CurveTo(138.24448f, 64.07165f, 191.92834f, 117.75553f, 192.0f, 184.0f),
                    PathNode.CurveTo(192.0f, 188.41827f, 188.41827f, 192.0f, 184.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _rss!!
    }

private var _rss: ImageVector? = null
