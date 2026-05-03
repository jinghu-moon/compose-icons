package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorRegularIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 156.41827f, 212.41827f, 160.0f, 208.0f, 160.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.LineTo(136.0f, 212.69f),
                    PathNode.LineTo(154.34f, 194.34f),
                    PathNode.CurveTo(157.46593f, 191.21407f, 162.53407f, 191.21407f, 165.66f, 194.34f),
                    PathNode.CurveTo(168.78593f, 197.46593f, 168.78593f, 202.53407f, 165.66f, 205.66f),
                    PathNode.LineTo(133.66f, 237.66f),
                    PathNode.CurveTo(132.15945f, 239.16223f, 130.12328f, 240.00629f, 128.0f, 240.00629f),
                    PathNode.CurveTo(125.876724f, 240.00629f, 123.840546f, 239.16223f, 122.34f, 237.66f),
                    PathNode.LineTo(90.34f, 205.66f),
                    PathNode.CurveTo(87.214066f, 202.53407f, 87.214066f, 197.46593f, 90.34f, 194.34f),
                    PathNode.CurveTo(93.465935f, 191.21407f, 98.534065f, 191.21407f, 101.66f, 194.34f),
                    PathNode.LineTo(120.0f, 212.69f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.CurveTo(43.581722f, 160.0f, 40.0f, 156.41827f, 40.0f, 152.0f),
                    PathNode.CurveTo(40.0f, 147.58173f, 43.581722f, 144.0f, 48.0f, 144.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.CurveTo(212.41827f, 144.0f, 216.0f, 147.58173f, 216.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 112.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.CurveTo(212.41827f, 112.0f, 216.0f, 108.41828f, 216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 99.58172f, 212.41827f, 96.0f, 208.0f, 96.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 43.31f),
                    PathNode.LineTo(154.34f, 61.66f),
                    PathNode.CurveTo(157.46593f, 64.785934f, 162.53407f, 64.785934f, 165.66f, 61.66f),
                    PathNode.CurveTo(168.78593f, 58.53407f, 168.78593f, 53.46593f, 165.66f, 50.34f),
                    PathNode.LineTo(133.66f, 18.34f),
                    PathNode.CurveTo(132.15945f, 16.837784f, 130.12328f, 15.993707f, 128.0f, 15.993707f),
                    PathNode.CurveTo(125.876724f, 15.993707f, 123.840546f, 16.837784f, 122.34f, 18.34f),
                    PathNode.LineTo(90.34f, 50.34f),
                    PathNode.CurveTo(87.214066f, 53.46593f, 87.214066f, 58.53407f, 90.34f, 61.66f),
                    PathNode.CurveTo(93.465935f, 64.785934f, 98.534065f, 64.785934f, 101.66f, 61.66f),
                    PathNode.LineTo(120.0f, 43.31f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.CurveTo(43.581722f, 96.0f, 40.0f, 99.58172f, 40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 108.41828f, 43.581722f, 112.0f, 48.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
