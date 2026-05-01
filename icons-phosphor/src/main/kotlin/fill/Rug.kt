package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rug: ImageVector
    get() {
        if (_rug != null) return _rug!!
        _rug = phosphorFillIcon(
            name = "Rug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 16.0f),
                    PathNode.CurveTo(195.58173f, 16.0f, 192.0f, 19.581722f, 192.0f, 24.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.LineTo(160.0f, 24.0f),
                    PathNode.CurveTo(160.0f, 19.581722f, 156.41827f, 16.0f, 152.0f, 16.0f),
                    PathNode.CurveTo(147.58173f, 16.0f, 144.0f, 19.581722f, 144.0f, 24.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(112.0f, 40.0f),
                    PathNode.LineTo(112.0f, 24.0f),
                    PathNode.CurveTo(112.0f, 19.581722f, 108.41828f, 16.0f, 104.0f, 16.0f),
                    PathNode.CurveTo(99.58172f, 16.0f, 96.0f, 19.581722f, 96.0f, 24.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.LineTo(64.0f, 24.0f),
                    PathNode.CurveTo(64.0f, 19.581722f, 60.418278f, 16.0f, 56.0f, 16.0f),
                    PathNode.CurveTo(51.581722f, 16.0f, 48.0f, 19.581722f, 48.0f, 24.0f),
                    PathNode.LineTo(48.0f, 232.0f),
                    PathNode.CurveTo(48.0f, 236.41827f, 51.581722f, 240.0f, 56.0f, 240.0f),
                    PathNode.CurveTo(60.418278f, 240.0f, 64.0f, 236.41827f, 64.0f, 232.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.LineTo(96.0f, 232.0f),
                    PathNode.CurveTo(96.0f, 236.41827f, 99.58172f, 240.0f, 104.0f, 240.0f),
                    PathNode.CurveTo(108.41828f, 240.0f, 112.0f, 236.41827f, 112.0f, 232.0f),
                    PathNode.LineTo(112.0f, 216.0f),
                    PathNode.LineTo(144.0f, 216.0f),
                    PathNode.LineTo(144.0f, 232.0f),
                    PathNode.CurveTo(144.0f, 236.41827f, 147.58173f, 240.0f, 152.0f, 240.0f),
                    PathNode.CurveTo(156.41827f, 240.0f, 160.0f, 236.41827f, 160.0f, 232.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.LineTo(192.0f, 232.0f),
                    PathNode.CurveTo(192.0f, 236.41827f, 195.58173f, 240.0f, 200.0f, 240.0f),
                    PathNode.CurveTo(204.41827f, 240.0f, 208.0f, 236.41827f, 208.0f, 232.0f),
                    PathNode.LineTo(208.0f, 24.0f),
                    PathNode.CurveTo(208.0f, 19.581722f, 204.41827f, 16.0f, 200.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.43f, 130.06f),
                    PathNode.LineTo(131.43f, 170.06f),
                    PathNode.CurveTo(130.7071f, 171.26485f, 129.40508f, 172.00206f, 128.0f, 172.00206f),
                    PathNode.CurveTo(126.59493f, 172.00206f, 125.292885f, 171.26485f, 124.57f, 170.06f),
                    PathNode.LineTo(100.57f, 130.06f),
                    PathNode.CurveTo(99.80835f, 128.79227f, 99.80835f, 127.20773f, 100.57f, 125.94f),
                    PathNode.LineTo(124.57f, 85.94f),
                    PathNode.CurveTo(125.292885f, 84.73515f, 126.59493f, 83.99793f, 128.0f, 83.99793f),
                    PathNode.CurveTo(129.40508f, 83.99793f, 130.7071f, 84.73515f, 131.43f, 85.94f),
                    PathNode.LineTo(155.43f, 125.94f),
                    PathNode.CurveTo(156.19165f, 127.20773f, 156.19165f, 128.79227f, 155.43f, 130.06f),
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
        return _rug!!
    }

private var _rug: ImageVector? = null
