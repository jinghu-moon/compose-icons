package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) return _arrowsDownUp!!
        _arrowsDownUp = phosphorFillIcon(
            name = "ArrowsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(119.39f, 172.94f),
                    PathNode.CurveTo(120.630066f, 175.92903f, 119.94724f, 179.37076f, 117.66f, 181.66f),
                    PathNode.LineTo(85.66f, 213.66f),
                    PathNode.CurveTo(84.159454f, 215.16223f, 82.123276f, 216.00629f, 80.0f, 216.00629f),
                    PathNode.CurveTo(77.876724f, 216.00629f, 75.840546f, 215.16223f, 74.34f, 213.66f),
                    PathNode.LineTo(42.34f, 181.66f),
                    PathNode.CurveTo(40.04936f, 179.3719f, 39.363674f, 175.92874f, 40.60302f, 172.93768f),
                    PathNode.CurveTo(41.84236f, 169.94662f, 44.76235f, 167.99745f, 48.0f, 168.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.CurveTo(72.0f, 43.581722f, 75.58172f, 40.0f, 80.0f, 40.0f),
                    PathNode.CurveTo(84.41828f, 40.0f, 88.0f, 43.581722f, 88.0f, 48.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.CurveTo(115.23568f, 168.00067f, 118.15235f, 169.95038f, 119.39f, 172.94f),
                    PathNode.Close,
                    PathNode.MoveTo(213.66f, 74.34f),
                    PathNode.LineTo(181.66f, 42.34f),
                    PathNode.CurveTo(180.15945f, 40.837784f, 178.12328f, 39.993706f, 176.0f, 39.993706f),
                    PathNode.CurveTo(173.87672f, 39.993706f, 171.84055f, 40.837784f, 170.34f, 42.34f),
                    PathNode.LineTo(138.34f, 74.34f),
                    PathNode.CurveTo(136.04936f, 76.62809f, 135.36368f, 80.07126f, 136.60303f, 83.062325f),
                    PathNode.CurveTo(137.84236f, 86.05338f, 140.76236f, 88.00255f, 144.0f, 88.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.CurveTo(168.0f, 212.41827f, 171.58173f, 216.0f, 176.0f, 216.0f),
                    PathNode.CurveTo(180.41827f, 216.0f, 184.0f, 212.41827f, 184.0f, 208.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.CurveTo(211.23764f, 88.00255f, 214.15764f, 86.05338f, 215.39697f, 83.062325f),
                    PathNode.CurveTo(216.63632f, 80.07126f, 215.95064f, 76.62809f, 213.66f, 74.34f),
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
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
