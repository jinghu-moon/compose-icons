package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorDuotoneIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.0f, 72.0f),
                    PathNode.LineTo(108.0f, 144.0f),
                    PathNode.LineTo(40.0f, 144.0f),
                    PathNode.CurveTo(35.581722f, 144.0f, 32.0f, 140.41827f, 32.0f, 136.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.CurveTo(32.0f, 67.58172f, 35.581722f, 64.0f, 40.0f, 64.0f),
                    PathNode.LineTo(100.0f, 64.0f),
                    PathNode.CurveTo(104.41828f, 64.0f, 108.0f, 67.58172f, 108.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(156.0f, 64.0f),
                    PathNode.CurveTo(151.58173f, 64.0f, 148.0f, 67.58172f, 148.0f, 72.0f),
                    PathNode.LineTo(148.0f, 136.0f),
                    PathNode.CurveTo(148.0f, 140.41827f, 151.58173f, 144.0f, 156.0f, 144.0f),
                    PathNode.LineTo(224.0f, 144.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(224.0f, 67.58172f, 220.41827f, 64.0f, 216.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(31.163445f, 56.0f, 24.0f, 63.163445f, 24.0f, 72.0f),
                    PathNode.LineTo(24.0f, 136.0f),
                    PathNode.CurveTo(24.0f, 144.83656f, 31.163445f, 152.0f, 40.0f, 152.0f),
                    PathNode.LineTo(100.0f, 152.0f),
                    PathNode.LineTo(100.0f, 160.0f),
                    PathNode.CurveTo(100.0f, 177.67311f, 85.67311f, 192.0f, 68.0f, 192.0f),
                    PathNode.CurveTo(63.581722f, 192.0f, 60.0f, 195.58173f, 60.0f, 200.0f),
                    PathNode.CurveTo(60.0f, 204.41827f, 63.581722f, 208.0f, 68.0f, 208.0f),
                    PathNode.CurveTo(94.498245f, 207.97244f, 115.97244f, 186.49825f, 116.0f, 160.0f),
                    PathNode.LineTo(116.0f, 72.0f),
                    PathNode.CurveTo(116.0f, 63.163445f, 108.836555f, 56.0f, 100.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.LineTo(100.0f, 72.0f),
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
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 136.0f),
                    PathNode.LineTo(156.0f, 136.0f),
                    PathNode.LineTo(156.0f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _quotes!!
    }

private var _quotes: ImageVector? = null
