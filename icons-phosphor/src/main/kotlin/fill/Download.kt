package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = phosphorFillIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(74.34f, 85.66f),
                    PathNode.CurveTo(71.214066f, 82.534065f, 71.214066f, 77.465935f, 74.34f, 74.34f),
                    PathNode.CurveTo(77.465935f, 71.214066f, 82.534065f, 71.214066f, 85.66f, 74.34f),
                    PathNode.LineTo(120.0f, 108.69f),
                    PathNode.LineTo(120.0f, 24.0f),
                    PathNode.CurveTo(120.0f, 19.581722f, 123.58172f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(132.41827f, 16.0f, 136.0f, 19.581722f, 136.0f, 24.0f),
                    PathNode.LineTo(136.0f, 108.69f),
                    PathNode.LineTo(170.34f, 74.34f),
                    PathNode.CurveTo(173.46593f, 71.214066f, 178.53407f, 71.214066f, 181.66f, 74.34f),
                    PathNode.CurveTo(184.78593f, 77.465935f, 184.78593f, 82.534065f, 181.66f, 85.66f),
                    PathNode.LineTo(133.66f, 133.66f),
                    PathNode.CurveTo(132.15945f, 135.16223f, 130.12328f, 136.00629f, 128.0f, 136.00629f),
                    PathNode.CurveTo(125.876724f, 136.00629f, 123.840546f, 135.16223f, 122.34f, 133.66f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 136.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 208.83656f, 232.83656f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(23.163445f, 216.0f, 16.0f, 208.83656f, 16.0f, 200.0f),
                    PathNode.LineTo(16.0f, 136.0f),
                    PathNode.CurveTo(16.0f, 127.163445f, 23.163445f, 120.0f, 32.0f, 120.0f),
                    PathNode.LineTo(84.4f, 120.0f),
                    PathNode.CurveTo(85.46118f, 119.99917f, 86.47921f, 120.42004f, 87.23f, 121.17f),
                    PathNode.LineTo(111.0f, 145.0f),
                    PathNode.CurveTo(115.50324f, 149.5189f, 121.62036f, 152.05893f, 128.0f, 152.05893f),
                    PathNode.CurveTo(134.37964f, 152.05893f, 140.49675f, 149.5189f, 145.0f, 145.0f),
                    PathNode.LineTo(168.8f, 121.2f),
                    PathNode.CurveTo(169.53853f, 120.44634f, 170.54492f, 120.01503f, 171.6f, 120.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.CurveTo(232.83656f, 120.0f, 240.0f, 127.163445f, 240.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 168.0f),
                    PathNode.CurveTo(200.0f, 161.37259f, 194.62741f, 156.0f, 188.0f, 156.0f),
                    PathNode.CurveTo(181.37259f, 156.0f, 176.0f, 161.37259f, 176.0f, 168.0f),
                    PathNode.CurveTo(176.0f, 174.62741f, 181.37259f, 180.0f, 188.0f, 180.0f),
                    PathNode.CurveTo(194.62741f, 180.0f, 200.0f, 174.62741f, 200.0f, 168.0f),
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
        return _download!!
    }

private var _download: ImageVector? = null
