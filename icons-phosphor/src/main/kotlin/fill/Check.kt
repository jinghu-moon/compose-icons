package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = phosphorFillIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.66f, 85.66f),
                    PathNode.LineTo(109.66f, 181.66f),
                    PathNode.CurveTo(108.159454f, 183.16223f, 106.123276f, 184.00629f, 104.0f, 184.00629f),
                    PathNode.CurveTo(101.876724f, 184.00629f, 99.840546f, 183.16223f, 98.34f, 181.66f),
                    PathNode.LineTo(58.34f, 141.66f),
                    PathNode.CurveTo(55.21407f, 138.53407f, 55.21407f, 133.46593f, 58.34f, 130.34f),
                    PathNode.CurveTo(61.46593f, 127.214066f, 66.534065f, 127.214066f, 69.66f, 130.34f),
                    PathNode.LineTo(104.0f, 164.69f),
                    PathNode.LineTo(194.34f, 74.34f),
                    PathNode.CurveTo(197.46593f, 71.214066f, 202.53407f, 71.214066f, 205.66f, 74.34f),
                    PathNode.CurveTo(208.78593f, 77.465935f, 208.78593f, 82.534065f, 205.66f, 85.66f),
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
        return _check!!
    }

private var _check: ImageVector? = null
