package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HashStraight: ImageVector
    get() {
        if (_hashStraight != null) return _hashStraight!!
        _hashStraight = phosphorFillIcon(
            name = "HashStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 112.0f),
                    PathNode.LineTo(144.0f, 112.0f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.LineTo(112.0f, 144.0f),
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
                    PathNode.MoveTo(160.0f, 144.0f),
                    PathNode.LineTo(160.0f, 112.0f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.CurveTo(196.41827f, 112.0f, 200.0f, 108.41828f, 200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 99.58172f, 196.41827f, 96.0f, 192.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.CurveTo(160.0f, 59.581722f, 156.41827f, 56.0f, 152.0f, 56.0f),
                    PathNode.CurveTo(147.58173f, 56.0f, 144.0f, 59.581722f, 144.0f, 64.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.LineTo(112.0f, 64.0f),
                    PathNode.CurveTo(112.0f, 59.581722f, 108.41828f, 56.0f, 104.0f, 56.0f),
                    PathNode.CurveTo(99.58172f, 56.0f, 96.0f, 59.581722f, 96.0f, 64.0f),
                    PathNode.LineTo(96.0f, 96.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.CurveTo(59.581722f, 96.0f, 56.0f, 99.58172f, 56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 108.41828f, 59.581722f, 112.0f, 64.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(59.581722f, 144.0f, 56.0f, 147.58173f, 56.0f, 152.0f),
                    PathNode.CurveTo(56.0f, 156.41827f, 59.581722f, 160.0f, 64.0f, 160.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(96.0f, 196.41827f, 99.58172f, 200.0f, 104.0f, 200.0f),
                    PathNode.CurveTo(108.41828f, 200.0f, 112.0f, 196.41827f, 112.0f, 192.0f),
                    PathNode.LineTo(112.0f, 160.0f),
                    PathNode.LineTo(144.0f, 160.0f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.CurveTo(144.0f, 196.41827f, 147.58173f, 200.0f, 152.0f, 200.0f),
                    PathNode.CurveTo(156.41827f, 200.0f, 160.0f, 196.41827f, 160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.CurveTo(196.41827f, 160.0f, 200.0f, 156.41827f, 200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 147.58173f, 196.41827f, 144.0f, 192.0f, 144.0f),
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
        return _hashStraight!!
    }

private var _hashStraight: ImageVector? = null
