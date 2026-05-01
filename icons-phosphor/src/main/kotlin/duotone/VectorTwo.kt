package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorDuotoneIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.LineTo(80.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(216.83656f, 40.0f, 224.0f, 47.163445f, 224.0f, 56.0f),
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
                    PathNode.MoveTo(229.66f, 197.66f),
                    PathNode.LineTo(197.66f, 229.66f),
                    PathNode.CurveTo(194.53407f, 232.78593f, 189.46593f, 232.78593f, 186.34f, 229.66f),
                    PathNode.CurveTo(183.21407f, 226.53407f, 183.21407f, 221.46593f, 186.34f, 218.34f),
                    PathNode.LineTo(204.69f, 200.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.CurveTo(75.58172f, 200.0f, 72.0f, 196.41827f, 72.0f, 192.0f),
                    PathNode.LineTo(72.0f, 59.31f),
                    PathNode.LineTo(53.66f, 77.66f),
                    PathNode.CurveTo(50.53407f, 80.785934f, 45.46593f, 80.785934f, 42.34f, 77.66f),
                    PathNode.CurveTo(39.21407f, 74.534065f, 39.21407f, 69.465935f, 42.34f, 66.34f),
                    PathNode.LineTo(74.34f, 34.34f),
                    PathNode.CurveTo(75.840546f, 32.837784f, 77.876724f, 31.993708f, 80.0f, 31.993708f),
                    PathNode.CurveTo(82.123276f, 31.993708f, 84.159454f, 32.837784f, 85.66f, 34.34f),
                    PathNode.LineTo(117.66f, 66.34f),
                    PathNode.CurveTo(120.785934f, 69.465935f, 120.785934f, 74.534065f, 117.66f, 77.66f),
                    PathNode.CurveTo(114.534065f, 80.785934f, 109.465935f, 80.785934f, 106.34f, 77.66f),
                    PathNode.LineTo(88.0f, 59.31f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.LineTo(204.69f, 184.0f),
                    PathNode.LineTo(186.34f, 165.66f),
                    PathNode.CurveTo(183.21407f, 162.53407f, 183.21407f, 157.46593f, 186.34f, 154.34f),
                    PathNode.CurveTo(189.46593f, 151.21407f, 194.53407f, 151.21407f, 197.66f, 154.34f),
                    PathNode.LineTo(229.66f, 186.34f),
                    PathNode.CurveTo(231.16223f, 187.84055f, 232.00629f, 189.87672f, 232.00629f, 192.0f),
                    PathNode.CurveTo(232.00629f, 194.12328f, 231.16223f, 196.15945f, 229.66f, 197.66f),
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
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
