package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) return _arrowsLeftRight!!
        _arrowsLeftRight = phosphorDuotoneIcon(
            name = "ArrowsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 181.66f),
                    PathNode.LineTo(181.66f, 213.66f),
                    PathNode.CurveTo(178.53407f, 216.78593f, 173.46593f, 216.78593f, 170.34f, 213.66f),
                    PathNode.CurveTo(167.21407f, 210.53407f, 167.21407f, 205.46593f, 170.34f, 202.34f),
                    PathNode.LineTo(188.69f, 184.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.CurveTo(43.581722f, 184.0f, 40.0f, 180.41827f, 40.0f, 176.0f),
                    PathNode.CurveTo(40.0f, 171.58173f, 43.581722f, 168.0f, 48.0f, 168.0f),
                    PathNode.LineTo(188.69f, 168.0f),
                    PathNode.LineTo(170.34f, 149.66f),
                    PathNode.CurveTo(167.21407f, 146.53407f, 167.21407f, 141.46593f, 170.34f, 138.34f),
                    PathNode.CurveTo(173.46593f, 135.21407f, 178.53407f, 135.21407f, 181.66f, 138.34f),
                    PathNode.LineTo(213.66f, 170.34f),
                    PathNode.CurveTo(215.16223f, 171.84055f, 216.00629f, 173.87672f, 216.00629f, 176.0f),
                    PathNode.CurveTo(216.00629f, 178.12328f, 215.16223f, 180.15945f, 213.66f, 181.66f),
                    PathNode.Close,
                    PathNode.MoveTo(74.34f, 117.66f),
                    PathNode.CurveTo(77.465935f, 120.785934f, 82.534065f, 120.785934f, 85.66f, 117.66f),
                    PathNode.CurveTo(88.785934f, 114.534065f, 88.785934f, 109.465935f, 85.66f, 106.34f),
                    PathNode.LineTo(67.31f, 88.0f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.CurveTo(212.41827f, 88.0f, 216.0f, 84.41828f, 216.0f, 80.0f),
                    PathNode.CurveTo(216.0f, 75.58172f, 212.41827f, 72.0f, 208.0f, 72.0f),
                    PathNode.LineTo(67.31f, 72.0f),
                    PathNode.LineTo(85.66f, 53.66f),
                    PathNode.CurveTo(88.785934f, 50.53407f, 88.785934f, 45.46593f, 85.66f, 42.34f),
                    PathNode.CurveTo(82.534065f, 39.21407f, 77.465935f, 39.21407f, 74.34f, 42.34f),
                    PathNode.LineTo(42.34f, 74.34f),
                    PathNode.CurveTo(40.837784f, 75.840546f, 39.993706f, 77.876724f, 39.993706f, 80.0f),
                    PathNode.CurveTo(39.993706f, 82.123276f, 40.837784f, 84.159454f, 42.34f, 85.66f),
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
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null
