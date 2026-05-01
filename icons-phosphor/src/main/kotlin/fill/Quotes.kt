package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorFillIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 72.0f),
                    PathNode.LineTo(116.0f, 160.0f),
                    PathNode.CurveTo(115.97244f, 186.49825f, 94.498245f, 207.97244f, 68.0f, 208.0f),
                    PathNode.CurveTo(63.581722f, 208.0f, 60.0f, 204.41827f, 60.0f, 200.0f),
                    PathNode.CurveTo(60.0f, 195.58173f, 63.581722f, 192.0f, 68.0f, 192.0f),
                    PathNode.CurveTo(85.67311f, 192.0f, 100.0f, 177.67311f, 100.0f, 160.0f),
                    PathNode.LineTo(100.0f, 152.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.CurveTo(31.163445f, 152.0f, 24.0f, 144.83656f, 24.0f, 136.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(24.0f, 63.163445f, 31.163445f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(100.0f, 56.0f),
                    PathNode.CurveTo(108.836555f, 56.0f, 116.0f, 63.163445f, 116.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(156.0f, 56.0f),
                    PathNode.CurveTo(147.16344f, 56.0f, 140.0f, 63.163445f, 140.0f, 72.0f),
                    PathNode.LineTo(140.0f, 136.0f),
                    PathNode.CurveTo(140.0f, 144.83656f, 147.16344f, 152.0f, 156.0f, 152.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.CurveTo(216.0f, 177.67311f, 201.67311f, 192.0f, 184.0f, 192.0f),
                    PathNode.CurveTo(179.58173f, 192.0f, 176.0f, 195.58173f, 176.0f, 200.0f),
                    PathNode.CurveTo(176.0f, 204.41827f, 179.58173f, 208.0f, 184.0f, 208.0f),
                    PathNode.CurveTo(210.49825f, 207.97244f, 231.97244f, 186.49825f, 232.0f, 160.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.CurveTo(232.0f, 63.163445f, 224.83656f, 56.0f, 216.0f, 56.0f),
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
        return _quotes!!
    }

private var _quotes: ImageVector? = null
