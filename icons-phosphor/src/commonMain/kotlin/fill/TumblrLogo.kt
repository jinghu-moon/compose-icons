package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorFillIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 120.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.CurveTo(152.0f, 172.41827f, 155.58173f, 176.0f, 160.0f, 176.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.CurveTo(196.41827f, 176.0f, 200.0f, 179.58173f, 200.0f, 184.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(200.0f, 236.41827f, 196.41827f, 240.0f, 192.0f, 240.0f),
                    PathNode.LineTo(152.0f, 240.0f),
                    PathNode.CurveTo(116.66977f, 239.96143f, 88.03858f, 211.33023f, 88.0f, 176.0f),
                    PathNode.LineTo(88.0f, 120.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.CurveTo(59.581722f, 120.0f, 56.0f, 116.41828f, 56.0f, 112.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.CurveTo(56.0f, 67.58172f, 59.581722f, 64.0f, 64.0f, 64.0f),
                    PathNode.CurveTo(86.09139f, 64.0f, 104.0f, 46.09139f, 104.0f, 24.0f),
                    PathNode.CurveTo(104.0f, 19.581722f, 107.58172f, 16.0f, 112.0f, 16.0f),
                    PathNode.LineTo(144.0f, 16.0f),
                    PathNode.CurveTo(148.41827f, 16.0f, 152.0f, 19.581722f, 152.0f, 24.0f),
                    PathNode.LineTo(152.0f, 64.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.CurveTo(196.41827f, 64.0f, 200.0f, 67.58172f, 200.0f, 72.0f),
                    PathNode.LineTo(200.0f, 112.0f),
                    PathNode.CurveTo(200.0f, 116.41828f, 196.41827f, 120.0f, 192.0f, 120.0f),
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
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null
