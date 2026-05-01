package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorFillIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 160.0f),
                    PathNode.CurveTo(176.0f, 180.66066f, 162.77936f, 199.00333f, 143.17894f, 205.5368f),
                    PathNode.CurveTo(123.57851f, 212.07027f, 101.9964f, 205.32852f, 89.6f, 188.8f),
                    PathNode.CurveTo(86.949036f, 185.26538f, 87.665375f, 180.25096f, 91.2f, 177.6f),
                    PathNode.CurveTo(94.73462f, 174.94904f, 99.74903f, 175.66537f, 102.4f, 179.2f),
                    PathNode.CurveTo(110.66426f, 190.21902f, 125.05234f, 194.71352f, 138.1193f, 190.35786f),
                    PathNode.CurveTo(151.18623f, 186.00221f, 160.0f, 173.77377f, 160.0f, 160.0f),
                    PathNode.LineTo(160.0f, 147.74f),
                    PathNode.CurveTo(145.89627f, 160.35477f, 125.69746f, 163.50656f, 108.421f, 155.7883f),
                    PathNode.CurveTo(91.14455f, 148.07004f, 80.01462f, 130.92213f, 80.0f, 112.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.CurveTo(80.01462f, 85.077866f, 91.14455f, 67.92996f, 108.421f, 60.2117f),
                    PathNode.CurveTo(125.69746f, 52.493446f, 145.89627f, 55.645233f, 160.0f, 68.26f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.CurveTo(160.0f, 59.581722f, 163.58173f, 56.0f, 168.0f, 56.0f),
                    PathNode.CurveTo(172.41827f, 56.0f, 176.0f, 59.581722f, 176.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 104.0f),
                    PathNode.LineTo(160.0f, 112.0f),
                    PathNode.CurveTo(160.0f, 129.67311f, 145.67311f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(110.32689f, 144.0f, 96.0f, 129.67311f, 96.0f, 112.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 86.32689f, 110.32689f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(145.67311f, 72.0f, 160.0f, 86.32689f, 160.0f, 104.0f),
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
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
