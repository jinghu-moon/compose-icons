package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorFillIcon(
            name = "RssSimple",
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
                    PathNode.MoveTo(136.0f, 192.0f),
                    PathNode.CurveTo(131.58173f, 192.0f, 128.0f, 188.41827f, 128.0f, 184.0f),
                    PathNode.CurveTo(127.966934f, 153.08577f, 102.91424f, 128.03307f, 72.0f, 128.0f),
                    PathNode.CurveTo(67.58172f, 128.0f, 64.0f, 124.41828f, 64.0f, 120.0f),
                    PathNode.CurveTo(64.0f, 115.58172f, 67.58172f, 112.0f, 72.0f, 112.0f),
                    PathNode.CurveTo(111.74622f, 112.04409f, 143.95592f, 144.25377f, 144.0f, 184.0f),
                    PathNode.CurveTo(144.0f, 188.41827f, 140.41827f, 192.0f, 136.0f, 192.0f),
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
        return _rssSimple!!
    }

private var _rssSimple: ImageVector? = null
