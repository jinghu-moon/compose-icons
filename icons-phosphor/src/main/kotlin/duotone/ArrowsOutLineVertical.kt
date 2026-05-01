package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) return _arrowsOutLineVertical!!
        _arrowsOutLineVertical = phosphorDuotoneIcon(
            name = "ArrowsOutLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 32.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(216.0f, 232.83656f, 208.83656f, 240.0f, 200.0f, 240.0f),
                    PathNode.LineTo(56.0f, 240.0f),
                    PathNode.CurveTo(47.163445f, 240.0f, 40.0f, 232.83656f, 40.0f, 224.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(40.0f, 23.163445f, 47.163445f, 16.0f, 56.0f, 16.0f),
                    PathNode.LineTo(200.0f, 16.0f),
                    PathNode.CurveTo(208.83656f, 16.0f, 216.0f, 23.163445f, 216.0f, 32.0f),
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
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 132.41827f, 220.41827f, 136.0f, 216.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(35.581722f, 136.0f, 32.0f, 132.41827f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 123.58172f, 35.581722f, 120.0f, 40.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(220.41827f, 120.0f, 224.0f, 123.58172f, 224.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(101.66f, 53.66f),
                    PathNode.LineTo(120.0f, 35.31f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.CurveTo(120.0f, 100.41828f, 123.58172f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(132.41827f, 104.0f, 136.0f, 100.41828f, 136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 35.31f),
                    PathNode.LineTo(154.34f, 53.66f),
                    PathNode.CurveTo(157.46593f, 56.78593f, 162.53407f, 56.78593f, 165.66f, 53.66f),
                    PathNode.CurveTo(168.78593f, 50.53407f, 168.78593f, 45.46593f, 165.66f, 42.34f),
                    PathNode.LineTo(133.66f, 10.34f),
                    PathNode.CurveTo(132.15945f, 8.837784f, 130.12328f, 7.993707f, 128.0f, 7.993707f),
                    PathNode.CurveTo(125.876724f, 7.993707f, 123.840546f, 8.837784f, 122.34f, 10.34f),
                    PathNode.LineTo(90.34f, 42.34f),
                    PathNode.CurveTo(87.214066f, 45.46593f, 87.214066f, 50.53407f, 90.34f, 53.66f),
                    PathNode.CurveTo(93.465935f, 56.78593f, 98.534065f, 56.78593f, 101.66f, 53.66f),
                    PathNode.Close,
                    PathNode.MoveTo(154.34f, 202.34f),
                    PathNode.LineTo(136.0f, 220.69f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.CurveTo(136.0f, 155.58173f, 132.41827f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(123.58172f, 152.0f, 120.0f, 155.58173f, 120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 220.69f),
                    PathNode.LineTo(101.66f, 202.34f),
                    PathNode.CurveTo(98.534065f, 199.21407f, 93.465935f, 199.21407f, 90.34f, 202.34f),
                    PathNode.CurveTo(87.214066f, 205.46593f, 87.214066f, 210.53407f, 90.34f, 213.66f),
                    PathNode.LineTo(122.34f, 245.66f),
                    PathNode.CurveTo(123.840546f, 247.16223f, 125.876724f, 248.00629f, 128.0f, 248.00629f),
                    PathNode.CurveTo(130.12328f, 248.00629f, 132.15945f, 247.16223f, 133.66f, 245.66f),
                    PathNode.LineTo(165.66f, 213.66f),
                    PathNode.CurveTo(168.78593f, 210.53407f, 168.78593f, 205.46593f, 165.66f, 202.34f),
                    PathNode.CurveTo(162.53407f, 199.21407f, 157.46593f, 199.21407f, 154.34f, 202.34f),
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
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
