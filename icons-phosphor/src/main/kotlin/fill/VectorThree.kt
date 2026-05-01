package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VectorThree: ImageVector
    get() {
        if (_vectorThree != null) return _vectorThree!!
        _vectorThree = phosphorFillIcon(
            name = "VectorThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 141.66f),
                    PathNode.LineTo(205.66f, 173.66f),
                    PathNode.CurveTo(203.3719f, 175.95064f, 199.92874f, 176.63632f, 196.93768f, 175.39697f),
                    PathNode.CurveTo(193.94662f, 174.15764f, 191.99745f, 171.23764f, 192.0f, 168.0f),
                    PathNode.LineTo(192.0f, 144.0f),
                    PathNode.LineTo(123.31f, 144.0f),
                    PathNode.LineTo(83.31f, 184.0f),
                    PathNode.LineTo(101.66f, 202.34f),
                    PathNode.CurveTo(103.95064f, 204.6281f, 104.63632f, 208.07126f, 103.39698f, 211.06232f),
                    PathNode.CurveTo(102.15764f, 214.05338f, 99.237656f, 216.00255f, 96.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.CurveTo(39.99745f, 156.76236f, 41.94662f, 153.84236f, 44.93768f, 152.60303f),
                    PathNode.CurveTo(47.928738f, 151.36368f, 51.371906f, 152.04936f, 53.66f, 154.34f),
                    PathNode.LineTo(72.0f, 172.69f),
                    PathNode.LineTo(112.0f, 132.69f),
                    PathNode.LineTo(112.0f, 64.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.CurveTo(84.762344f, 64.00255f, 81.84236f, 62.05338f, 80.60302f, 59.06232f),
                    PathNode.CurveTo(79.36368f, 56.071262f, 80.04936f, 52.628094f, 82.34f, 50.34f),
                    PathNode.LineTo(114.34f, 18.34f),
                    PathNode.CurveTo(115.840546f, 16.837784f, 117.876724f, 15.993707f, 120.0f, 15.993707f),
                    PathNode.CurveTo(122.123276f, 15.993707f, 124.159454f, 16.837784f, 125.66f, 18.34f),
                    PathNode.LineTo(157.66f, 50.34f),
                    PathNode.CurveTo(159.95064f, 52.628094f, 160.63632f, 56.071262f, 159.39697f, 59.06232f),
                    PathNode.CurveTo(158.15764f, 62.05338f, 155.23764f, 64.00255f, 152.0f, 64.0f),
                    PathNode.LineTo(128.0f, 64.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(192.0f, 128.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(191.99745f, 100.762344f, 193.94662f, 97.84236f, 196.93768f, 96.60302f),
                    PathNode.CurveTo(199.92874f, 95.36368f, 203.3719f, 96.04936f, 205.66f, 98.34f),
                    PathNode.LineTo(237.66f, 130.34f),
                    PathNode.CurveTo(239.16223f, 131.84055f, 240.00629f, 133.87672f, 240.00629f, 136.0f),
                    PathNode.CurveTo(240.00629f, 138.12328f, 239.16223f, 140.15945f, 237.66f, 141.66f),
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
        return _vectorThree!!
    }

private var _vectorThree: ImageVector? = null
