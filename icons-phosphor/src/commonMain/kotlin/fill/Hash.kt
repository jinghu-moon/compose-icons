package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorFillIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.25f, 112.0f),
                    PathNode.LineTo(147.75f, 112.0f),
                    PathNode.LineTo(139.75f, 144.0f),
                    PathNode.LineTo(108.25f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 99.58172f, 204.41827f, 96.0f, 200.0f, 96.0f),
                    PathNode.LineTo(168.25f, 96.0f),
                    PathNode.LineTo(175.76f, 65.94f),
                    PathNode.CurveTo(176.7459f, 61.687977f, 174.14153f, 57.430504f, 169.90703f, 56.37188f),
                    PathNode.CurveTo(165.67253f, 55.313255f, 161.37103f, 57.844265f, 160.24f, 62.06f),
                    PathNode.LineTo(151.75f, 96.0f),
                    PathNode.LineTo(120.25f, 96.0f),
                    PathNode.LineTo(127.76f, 65.94f),
                    PathNode.CurveTo(128.7459f, 61.687977f, 126.14153f, 57.430504f, 121.90703f, 56.37188f),
                    PathNode.CurveTo(117.67253f, 55.313255f, 113.37105f, 57.844265f, 112.24f, 62.06f),
                    PathNode.LineTo(103.75f, 96.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.CurveTo(59.581722f, 96.0f, 56.0f, 99.58172f, 56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 108.41828f, 59.581722f, 112.0f, 64.0f, 112.0f),
                    PathNode.LineTo(99.75f, 112.0f),
                    PathNode.LineTo(91.75f, 144.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.CurveTo(51.581722f, 144.0f, 48.0f, 147.58173f, 48.0f, 152.0f),
                    PathNode.CurveTo(48.0f, 156.41827f, 51.581722f, 160.0f, 56.0f, 160.0f),
                    PathNode.LineTo(87.75f, 160.0f),
                    PathNode.LineTo(80.24f, 190.06f),
                    PathNode.CurveTo(79.169266f, 194.34563f, 81.77469f, 198.688f, 86.06f, 199.76f),
                    PathNode.CurveTo(86.71414f, 199.92259f, 87.38596f, 200.00322f, 88.06f, 200.0f),
                    PathNode.CurveTo(91.72687f, 199.99486f, 94.920784f, 197.49742f, 95.81f, 193.94f),
                    PathNode.LineTo(104.25f, 160.0f),
                    PathNode.LineTo(135.75f, 160.0f),
                    PathNode.LineTo(128.24f, 190.06f),
                    PathNode.CurveTo(127.169266f, 194.34563f, 129.77469f, 198.688f, 134.06f, 199.76f),
                    PathNode.CurveTo(134.69466f, 199.91774f, 135.34604f, 199.99832f, 136.0f, 200.0f),
                    PathNode.CurveTo(139.66687f, 199.99486f, 142.8608f, 197.49742f, 143.75f, 193.94f),
                    PathNode.LineTo(152.25f, 160.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.CurveTo(196.41827f, 160.0f, 200.0f, 156.41827f, 200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 147.58173f, 196.41827f, 144.0f, 192.0f, 144.0f),
                    PathNode.LineTo(156.25f, 144.0f),
                    PathNode.LineTo(164.25f, 112.0f),
                    PathNode.LineTo(200.0f, 112.0f),
                    PathNode.CurveTo(204.41827f, 112.0f, 208.0f, 108.41828f, 208.0f, 104.0f),
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
        return _hash!!
    }

private var _hash: ImageVector? = null
