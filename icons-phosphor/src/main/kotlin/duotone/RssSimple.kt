package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorDuotoneIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.CurveTo(147.94728f, 40.0f, 216.0f, 108.05272f, 216.0f, 192.0f),
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
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 196.41827f, 220.41827f, 200.0f, 216.0f, 200.0f),
                    PathNode.CurveTo(211.58173f, 200.0f, 208.0f, 196.41827f, 208.0f, 192.0f),
                    PathNode.CurveTo(208.0f, 112.6f, 143.4f, 48.0f, 64.0f, 48.0f),
                    PathNode.CurveTo(59.581722f, 48.0f, 56.0f, 44.418278f, 56.0f, 40.0f),
                    PathNode.CurveTo(56.0f, 35.581722f, 59.581722f, 32.0f, 64.0f, 32.0f),
                    PathNode.CurveTo(152.22f, 32.0f, 224.0f, 103.78f, 224.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 104.0f),
                    PathNode.CurveTo(59.581722f, 104.0f, 56.0f, 107.58172f, 56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 116.41828f, 59.581722f, 120.0f, 64.0f, 120.0f),
                    PathNode.CurveTo(103.74622f, 120.04409f, 135.95592f, 152.25377f, 136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 196.41827f, 139.58173f, 200.0f, 144.0f, 200.0f),
                    PathNode.CurveTo(148.41827f, 200.0f, 152.0f, 196.41827f, 152.0f, 192.0f),
                    PathNode.CurveTo(151.94489f, 143.42178f, 112.57822f, 104.05511f, 64.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 176.0f),
                    PathNode.CurveTo(61.37258f, 176.0f, 56.0f, 181.37259f, 56.0f, 188.0f),
                    PathNode.CurveTo(56.0f, 194.62741f, 61.37258f, 200.0f, 68.0f, 200.0f),
                    PathNode.CurveTo(74.62742f, 200.0f, 80.0f, 194.62741f, 80.0f, 188.0f),
                    PathNode.CurveTo(80.0f, 181.37259f, 74.62742f, 176.0f, 68.0f, 176.0f),
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
        return _rssSimple!!
    }

private var _rssSimple: ImageVector? = null
