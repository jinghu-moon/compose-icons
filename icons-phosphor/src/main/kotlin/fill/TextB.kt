package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorFillIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 156.0f),
                    PathNode.CurveTo(168.0f, 167.0457f, 159.0457f, 176.0f, 148.0f, 176.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.LineTo(148.0f, 136.0f),
                    PathNode.CurveTo(159.0457f, 136.0f, 168.0f, 144.9543f, 168.0f, 156.0f),
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
                    PathNode.MoveTo(184.0f, 156.0f),
                    PathNode.CurveTo(183.99039f, 143.14807f, 177.13011f, 131.27597f, 166.0f, 124.85f),
                    PathNode.CurveTo(175.93863f, 114.43242f, 178.71431f, 99.09503f, 173.05711f, 85.854996f),
                    PathNode.CurveTo(167.3999f, 72.61496f, 154.398f, 64.01903f, 140.0f, 64.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.CurveTo(83.58172f, 64.0f, 80.0f, 67.58172f, 80.0f, 72.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(80.0f, 188.41827f, 83.58172f, 192.0f, 88.0f, 192.0f),
                    PathNode.LineTo(148.0f, 192.0f),
                    PathNode.CurveTo(167.88223f, 192.0f, 184.0f, 175.88223f, 184.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 100.0f),
                    PathNode.CurveTo(160.0f, 88.95431f, 151.0457f, 80.0f, 140.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.LineTo(140.0f, 120.0f),
                    PathNode.CurveTo(151.0457f, 120.0f, 160.0f, 111.04569f, 160.0f, 100.0f),
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
        return _textB!!
    }

private var _textB: ImageVector? = null
