package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorFillIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 197.66f),
                    PathNode.LineTo(197.66f, 229.66f),
                    PathNode.CurveTo(195.3719f, 231.95064f, 191.92874f, 232.63632f, 188.93768f, 231.39697f),
                    PathNode.CurveTo(185.94662f, 230.15764f, 183.99745f, 227.23764f, 184.0f, 224.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.CurveTo(75.58172f, 200.0f, 72.0f, 196.41827f, 72.0f, 192.0f),
                    PathNode.LineTo(72.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.CurveTo(44.76235f, 80.00255f, 41.84236f, 78.05338f, 40.60302f, 75.062325f),
                    PathNode.CurveTo(39.363674f, 72.07126f, 40.04936f, 68.62809f, 42.34f, 66.34f),
                    PathNode.LineTo(74.34f, 34.34f),
                    PathNode.CurveTo(75.840546f, 32.837784f, 77.876724f, 31.993708f, 80.0f, 31.993708f),
                    PathNode.CurveTo(82.123276f, 31.993708f, 84.159454f, 32.837784f, 85.66f, 34.34f),
                    PathNode.LineTo(117.66f, 66.34f),
                    PathNode.CurveTo(119.95064f, 68.62809f, 120.63632f, 72.07126f, 119.39698f, 75.062325f),
                    PathNode.CurveTo(118.15764f, 78.05338f, 115.237656f, 80.00255f, 112.0f, 80.0f),
                    PathNode.LineTo(88.0f, 80.0f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 160.0f),
                    PathNode.CurveTo(183.99745f, 156.76236f, 185.94662f, 153.84236f, 188.93768f, 152.60303f),
                    PathNode.CurveTo(191.92874f, 151.36368f, 195.3719f, 152.04936f, 197.66f, 154.34f),
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
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
