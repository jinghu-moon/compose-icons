package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorDuotoneIcon(
            name = "ArrowsInLineVertical",
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
                    PathNode.MoveTo(122.34f, 101.66f),
                    PathNode.CurveTo(123.840546f, 103.16222f, 125.876724f, 104.006294f, 128.0f, 104.006294f),
                    PathNode.CurveTo(130.12328f, 104.006294f, 132.15945f, 103.16222f, 133.66f, 101.66f),
                    PathNode.LineTo(165.66f, 69.66f),
                    PathNode.CurveTo(168.78593f, 66.534065f, 168.78593f, 61.46593f, 165.66f, 58.34f),
                    PathNode.CurveTo(162.53407f, 55.21407f, 157.46593f, 55.21407f, 154.34f, 58.34f),
                    PathNode.LineTo(136.0f, 76.69f),
                    PathNode.LineTo(136.0f, 16.0f),
                    PathNode.CurveTo(136.0f, 11.581722f, 132.41827f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(123.58172f, 8.0f, 120.0f, 11.581722f, 120.0f, 16.0f),
                    PathNode.LineTo(120.0f, 76.69f),
                    PathNode.LineTo(101.66f, 58.34f),
                    PathNode.CurveTo(98.534065f, 55.21407f, 93.465935f, 55.21407f, 90.34f, 58.34f),
                    PathNode.CurveTo(87.214066f, 61.46593f, 87.214066f, 66.534065f, 90.34f, 69.66f),
                    PathNode.Close,
                    PathNode.MoveTo(133.66f, 154.34f),
                    PathNode.CurveTo(132.15945f, 152.83777f, 130.12328f, 151.99371f, 128.0f, 151.99371f),
                    PathNode.CurveTo(125.876724f, 151.99371f, 123.840546f, 152.83777f, 122.34f, 154.34f),
                    PathNode.LineTo(90.34f, 186.34f),
                    PathNode.CurveTo(87.214066f, 189.46593f, 87.214066f, 194.53407f, 90.34f, 197.66f),
                    PathNode.CurveTo(93.465935f, 200.78593f, 98.534065f, 200.78593f, 101.66f, 197.66f),
                    PathNode.LineTo(120.0f, 179.31f),
                    PathNode.LineTo(120.0f, 240.0f),
                    PathNode.CurveTo(120.0f, 244.41827f, 123.58172f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(132.41827f, 248.0f, 136.0f, 244.41827f, 136.0f, 240.0f),
                    PathNode.LineTo(136.0f, 179.31f),
                    PathNode.LineTo(154.34f, 197.66f),
                    PathNode.CurveTo(157.46593f, 200.78593f, 162.53407f, 200.78593f, 165.66f, 197.66f),
                    PathNode.CurveTo(168.78593f, 194.53407f, 168.78593f, 189.46593f, 165.66f, 186.34f),
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
        return _arrowsInLineVertical!!
    }

private var _arrowsInLineVertical: ImageVector? = null
