package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) return _arrowsDownUp!!
        _arrowsDownUp = phosphorRegularIcon(
            name = "ArrowsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(117.66f, 170.34f),
                    PathNode.CurveTo(119.16222f, 171.84055f, 120.006294f, 173.87672f, 120.006294f, 176.0f),
                    PathNode.CurveTo(120.006294f, 178.12328f, 119.16222f, 180.15945f, 117.66f, 181.66f),
                    PathNode.LineTo(85.66f, 213.66f),
                    PathNode.CurveTo(84.159454f, 215.16223f, 82.123276f, 216.00629f, 80.0f, 216.00629f),
                    PathNode.CurveTo(77.876724f, 216.00629f, 75.840546f, 215.16223f, 74.34f, 213.66f),
                    PathNode.LineTo(42.34f, 181.66f),
                    PathNode.CurveTo(39.21407f, 178.53407f, 39.21407f, 173.46593f, 42.34f, 170.34f),
                    PathNode.CurveTo(45.46593f, 167.21407f, 50.53407f, 167.21407f, 53.66f, 170.34f),
                    PathNode.LineTo(72.0f, 188.69f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.CurveTo(72.0f, 43.581722f, 75.58172f, 40.0f, 80.0f, 40.0f),
                    PathNode.CurveTo(84.41828f, 40.0f, 88.0f, 43.581722f, 88.0f, 48.0f),
                    PathNode.LineTo(88.0f, 188.69f),
                    PathNode.LineTo(106.34f, 170.34f),
                    PathNode.CurveTo(107.840546f, 168.83777f, 109.876724f, 167.99371f, 112.0f, 167.99371f),
                    PathNode.CurveTo(114.123276f, 167.99371f, 116.159454f, 168.83777f, 117.66f, 170.34f),
                    PathNode.Close,
                    PathNode.MoveTo(213.66f, 74.34f),
                    PathNode.LineTo(181.66f, 42.34f),
                    PathNode.CurveTo(180.15945f, 40.837784f, 178.12328f, 39.993706f, 176.0f, 39.993706f),
                    PathNode.CurveTo(173.87672f, 39.993706f, 171.84055f, 40.837784f, 170.34f, 42.34f),
                    PathNode.LineTo(138.34f, 74.34f),
                    PathNode.CurveTo(135.21407f, 77.465935f, 135.21407f, 82.534065f, 138.34f, 85.66f),
                    PathNode.CurveTo(141.46593f, 88.785934f, 146.53407f, 88.785934f, 149.66f, 85.66f),
                    PathNode.LineTo(168.0f, 67.31f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.CurveTo(168.0f, 212.41827f, 171.58173f, 216.0f, 176.0f, 216.0f),
                    PathNode.CurveTo(180.41827f, 216.0f, 184.0f, 212.41827f, 184.0f, 208.0f),
                    PathNode.LineTo(184.0f, 67.31f),
                    PathNode.LineTo(202.34f, 85.66f),
                    PathNode.CurveTo(205.46593f, 88.785934f, 210.53407f, 88.785934f, 213.66f, 85.66f),
                    PathNode.CurveTo(216.78593f, 82.534065f, 216.78593f, 77.465935f, 213.66f, 74.34f),
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
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
