package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorFillIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 104.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 200.60106f, 176.60106f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(79.39894f, 240.0f, 40.0f, 200.60106f, 40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(40.0f, 55.163445f, 47.163445f, 48.0f, 56.0f, 48.0f),
                    PathNode.CurveTo(64.836555f, 48.0f, 72.0f, 55.163445f, 72.0f, 64.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.CurveTo(72.0f, 124.41828f, 75.58172f, 128.0f, 80.0f, 128.0f),
                    PathNode.CurveTo(84.41828f, 128.0f, 88.0f, 124.41828f, 88.0f, 120.0f),
                    PathNode.LineTo(88.0f, 32.0f),
                    PathNode.CurveTo(88.0f, 23.163445f, 95.163445f, 16.0f, 104.0f, 16.0f),
                    PathNode.CurveTo(112.836555f, 16.0f, 120.0f, 23.163445f, 120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.CurveTo(120.0f, 116.41828f, 123.58172f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(132.41827f, 120.0f, 136.0f, 116.41828f, 136.0f, 112.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.CurveTo(136.0f, 39.163445f, 143.16344f, 32.0f, 152.0f, 32.0f),
                    PathNode.CurveTo(160.83656f, 32.0f, 168.0f, 39.163445f, 168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 128.67f),
                    PathNode.CurveTo(144.92192f, 132.60428f, 128.03224f, 152.58899f, 128.0f, 176.0f),
                    PathNode.CurveTo(128.0f, 180.41827f, 131.58173f, 184.0f, 136.0f, 184.0f),
                    PathNode.CurveTo(140.41827f, 184.0f, 144.0f, 180.41827f, 144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 158.32689f, 158.32689f, 144.0f, 176.0f, 144.0f),
                    PathNode.CurveTo(180.41827f, 144.0f, 184.0f, 140.41827f, 184.0f, 136.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 95.163445f, 191.16344f, 88.0f, 200.0f, 88.0f),
                    PathNode.CurveTo(208.83656f, 88.0f, 216.0f, 95.163445f, 216.0f, 104.0f),
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
        return _handPalm!!
    }

private var _handPalm: ImageVector? = null
