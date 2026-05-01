package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) return _arrowsMerge!!
        _arrowsMerge = phosphorDuotoneIcon(
            name = "ArrowsMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 40.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.LineTo(128.0f, 160.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.LineTo(72.0f, 40.0f),
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
                    PathNode.MoveTo(192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(192.00166f, 106.12237f, 191.15993f, 108.158424f, 189.66f, 109.66f),
                    PathNode.LineTo(136.0f, 163.31f),
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
                    PathNode.LineTo(120.0f, 163.31f),
                    PathNode.LineTo(66.34f, 109.66f),
                    PathNode.CurveTo(64.84009f, 108.158424f, 63.998333f, 106.12237f, 64.0f, 104.0f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.CurveTo(64.0f, 35.581722f, 67.58172f, 32.0f, 72.0f, 32.0f),
                    PathNode.CurveTo(76.41828f, 32.0f, 80.0f, 35.581722f, 80.0f, 40.0f),
                    PathNode.LineTo(80.0f, 100.69f),
                    PathNode.LineTo(128.0f, 148.69f),
                    PathNode.LineTo(176.0f, 100.69f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.CurveTo(176.0f, 35.581722f, 179.58173f, 32.0f, 184.0f, 32.0f),
                    PathNode.CurveTo(188.41827f, 32.0f, 192.0f, 35.581722f, 192.0f, 40.0f),
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
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
