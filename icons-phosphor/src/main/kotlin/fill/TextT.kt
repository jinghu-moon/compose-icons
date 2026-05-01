package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextT: ImageVector
    get() {
        if (_textT != null) return _textT!!
        _textT = phosphorFillIcon(
            name = "TextT",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 96.0f),
                    PathNode.CurveTo(184.0f, 100.41828f, 180.41827f, 104.0f, 176.0f, 104.0f),
                    PathNode.CurveTo(171.58173f, 104.0f, 168.0f, 100.41828f, 168.0f, 96.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.LineTo(148.0f, 176.0f),
                    PathNode.CurveTo(152.41827f, 176.0f, 156.0f, 179.58173f, 156.0f, 184.0f),
                    PathNode.CurveTo(156.0f, 188.41827f, 152.41827f, 192.0f, 148.0f, 192.0f),
                    PathNode.LineTo(108.0f, 192.0f),
                    PathNode.CurveTo(103.58172f, 192.0f, 100.0f, 188.41827f, 100.0f, 184.0f),
                    PathNode.CurveTo(100.0f, 179.58173f, 103.58172f, 176.0f, 108.0f, 176.0f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.CurveTo(88.0f, 100.41828f, 84.41828f, 104.0f, 80.0f, 104.0f),
                    PathNode.CurveTo(75.58172f, 104.0f, 72.0f, 100.41828f, 72.0f, 96.0f),
                    PathNode.LineTo(72.0f, 80.0f),
                    PathNode.CurveTo(72.0f, 75.58172f, 75.58172f, 72.0f, 80.0f, 72.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(180.41827f, 72.0f, 184.0f, 75.58172f, 184.0f, 80.0f),
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
        return _textT!!
    }

private var _textT: ImageVector? = null
