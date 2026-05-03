package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = phosphorFillIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 52.418278f, 220.41827f, 56.0f, 216.0f, 56.0f),
                    PathNode.LineTo(200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.CurveTo(200.0f, 212.41827f, 196.41827f, 216.0f, 192.0f, 216.0f),
                    PathNode.LineTo(152.0f, 216.0f),
                    PathNode.CurveTo(149.08694f, 215.99739f, 146.40555f, 214.41154f, 145.0f, 211.86f),
                    PathNode.LineTo(72.0f, 79.15f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.LineTo(88.0f, 200.0f),
                    PathNode.CurveTo(92.41828f, 200.0f, 96.0f, 203.58173f, 96.0f, 208.0f),
                    PathNode.CurveTo(96.0f, 212.41827f, 92.41828f, 216.0f, 88.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(35.581722f, 216.0f, 32.0f, 212.41827f, 32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 203.58173f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(35.581722f, 56.0f, 32.0f, 52.418278f, 32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 43.581722f, 35.581722f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.CurveTo(106.91306f, 40.00261f, 109.594444f, 41.58846f, 111.0f, 44.14f),
                    PathNode.LineTo(184.0f, 176.85f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(163.58173f, 56.0f, 160.0f, 52.418278f, 160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 43.581722f, 163.58173f, 40.0f, 168.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(220.41827f, 40.0f, 224.0f, 43.581722f, 224.0f, 48.0f),
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
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
