package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorFillIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 16.0f),
                    PathNode.CurveTo(75.00579f, 16.060617f, 32.06062f, 59.005795f, 32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 136.0f, 44.56f, 167.06f, 65.61f, 195.0f),
                    PathNode.CurveTo(86.79f, 223.15f, 110.11f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(145.89f, 240.0f, 169.21f, 223.19f, 190.39f, 195.0f),
                    PathNode.CurveTo(211.44f, 167.0f, 224.0f, 136.0f, 224.0f, 112.0f),
                    PathNode.CurveTo(223.93938f, 59.005795f, 180.9942f, 16.060617f, 128.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 116.0f),
                    PathNode.CurveTo(64.0f, 109.37258f, 69.37258f, 104.0f, 76.0f, 104.0f),
                    PathNode.CurveTo(95.88225f, 104.0f, 112.0f, 120.11775f, 112.0f, 140.0f),
                    PathNode.CurveTo(112.0f, 146.62741f, 106.62742f, 152.0f, 100.0f, 152.0f),
                    PathNode.CurveTo(80.11775f, 152.0f, 64.0f, 135.88223f, 64.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 200.0f),
                    PathNode.LineTo(112.0f, 200.0f),
                    PathNode.CurveTo(107.58172f, 200.0f, 104.0f, 196.41827f, 104.0f, 192.0f),
                    PathNode.CurveTo(104.0f, 187.58173f, 107.58172f, 184.0f, 112.0f, 184.0f),
                    PathNode.LineTo(144.0f, 184.0f),
                    PathNode.CurveTo(148.41827f, 184.0f, 152.0f, 187.58173f, 152.0f, 192.0f),
                    PathNode.CurveTo(152.0f, 196.41827f, 148.41827f, 200.0f, 144.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 152.0f),
                    PathNode.CurveTo(149.37259f, 152.0f, 144.0f, 146.62741f, 144.0f, 140.0f),
                    PathNode.CurveTo(144.0f, 120.11775f, 160.11777f, 104.0f, 180.0f, 104.0f),
                    PathNode.CurveTo(186.62741f, 104.0f, 192.0f, 109.37258f, 192.0f, 116.0f),
                    PathNode.CurveTo(192.0f, 135.88223f, 175.88223f, 152.0f, 156.0f, 152.0f),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
