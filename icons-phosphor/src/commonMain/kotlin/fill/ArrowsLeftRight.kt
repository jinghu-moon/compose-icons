package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) return _arrowsLeftRight!!
        _arrowsLeftRight = phosphorFillIcon(
            name = "ArrowsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(42.34f, 85.66f),
                    PathNode.CurveTo(40.837784f, 84.159454f, 39.993706f, 82.123276f, 39.993706f, 80.0f),
                    PathNode.CurveTo(39.993706f, 77.876724f, 40.837784f, 75.840546f, 42.34f, 74.34f),
                    PathNode.LineTo(74.34f, 42.34f),
                    PathNode.CurveTo(76.62809f, 40.04936f, 80.07126f, 39.363674f, 83.062325f, 40.60302f),
                    PathNode.CurveTo(86.05338f, 41.84236f, 88.00255f, 44.76235f, 88.0f, 48.0f),
                    PathNode.LineTo(88.0f, 72.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.CurveTo(212.41827f, 72.0f, 216.0f, 75.58172f, 216.0f, 80.0f),
                    PathNode.CurveTo(216.0f, 84.41828f, 212.41827f, 88.0f, 208.0f, 88.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.CurveTo(88.00255f, 115.237656f, 86.05338f, 118.15764f, 83.062325f, 119.39698f),
                    PathNode.CurveTo(80.07126f, 120.63632f, 76.62809f, 119.95064f, 74.34f, 117.66f),
                    PathNode.Close,
                    PathNode.MoveTo(213.66f, 170.34f),
                    PathNode.LineTo(181.66f, 138.34f),
                    PathNode.CurveTo(179.3719f, 136.04936f, 175.92874f, 135.36368f, 172.93768f, 136.60303f),
                    PathNode.CurveTo(169.94662f, 137.84236f, 167.99745f, 140.76236f, 168.0f, 144.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.CurveTo(43.581722f, 168.0f, 40.0f, 171.58173f, 40.0f, 176.0f),
                    PathNode.CurveTo(40.0f, 180.41827f, 43.581722f, 184.0f, 48.0f, 184.0f),
                    PathNode.LineTo(168.0f, 184.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.CurveTo(167.99745f, 211.23764f, 169.94662f, 214.15764f, 172.93768f, 215.39697f),
                    PathNode.CurveTo(175.92874f, 216.63632f, 179.3719f, 215.95064f, 181.66f, 213.66f),
                    PathNode.LineTo(213.66f, 181.66f),
                    PathNode.CurveTo(215.16223f, 180.15945f, 216.00629f, 178.12328f, 216.00629f, 176.0f),
                    PathNode.CurveTo(216.00629f, 173.87672f, 215.16223f, 171.84055f, 213.66f, 170.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null
