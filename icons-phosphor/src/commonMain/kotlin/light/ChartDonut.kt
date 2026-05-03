package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorLightIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(124.686295f, 26.0f, 122.0f, 28.68629f, 122.0f, 32.0f),
                    PathNode.LineTo(122.0f, 88.0f),
                    PathNode.CurveTo(122.0f, 91.313705f, 124.686295f, 94.0f, 128.0f, 94.0f),
                    PathNode.CurveTo(143.38812f, 94.00233f, 156.8563f, 104.339645f, 160.83734f, 119.20387f),
                    PathNode.CurveTo(164.81839f, 134.0681f, 158.31972f, 149.7531f, 144.99265f, 157.44614f),
                    PathNode.CurveTo(131.66556f, 165.1392f, 114.832954f, 162.92218f, 103.95232f, 152.04073f),
                    PathNode.CurveTo(93.07169f, 141.15927f, 90.85594f, 124.32649f, 98.55f, 111.0f),
                    PathNode.CurveTo(99.34655f, 109.62108f, 99.56226f, 107.98207f, 99.14961f, 106.44401f),
                    PathNode.CurveTo(98.73696f, 104.905945f, 97.729805f, 103.59502f, 96.35f, 102.8f),
                    PathNode.LineTo(47.85f, 74.8f),
                    PathNode.CurveTo(46.47108f, 74.00345f, 44.832066f, 73.78774f, 43.294006f, 74.20039f),
                    PathNode.CurveTo(41.755947f, 74.61304f, 40.44502f, 75.6202f, 39.65f, 77.0f),
                    PathNode.CurveTo(16.567827f, 116.97949f, 23.215086f, 167.47781f, 55.856976f, 200.12216f),
                    PathNode.CurveTo(88.49887f, 232.76653f, 138.99667f, 239.4176f, 178.97792f, 216.33842f),
                    PathNode.CurveTo(218.95917f, 193.2593f, 238.45517f, 146.2043f, 226.51201f, 101.61162f),
                    PathNode.CurveTo(214.56886f, 57.01893f, 174.16435f, 26.006973f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(47.21f, 88.29f),
                    PathNode.LineTo(85.5f, 110.39f),
                    PathNode.CurveTo(83.187965f, 115.97312f, 81.99865f, 121.95709f, 82.0f, 128.0f),
                    PathNode.CurveTo(82.00685f, 130.00642f, 82.14045f, 132.01042f, 82.4f, 134.0f),
                    PathNode.LineTo(39.7f, 145.45f),
                    PathNode.CurveTo(35.88825f, 126.087975f, 38.52617f, 106.010284f, 47.21f, 88.29f),
                    PathNode.Close,
                    PathNode.MoveTo(42.81f, 157.0f),
                    PathNode.LineTo(85.51f, 145.56f),
                    PathNode.CurveTo(91.81946f, 160.72531f, 105.718445f, 171.39047f, 122.0f, 173.56f),
                    PathNode.LineTo(122.0f, 217.76f),
                    PathNode.CurveTo(85.78141f, 215.28789f, 54.574467f, 191.34378f, 42.81f, 157.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 217.8f),
                    PathNode.LineTo(134.0f, 173.6f),
                    PathNode.CurveTo(156.88177f, 170.5819f, 173.9847f, 151.07497f, 173.9847f, 127.995f),
                    PathNode.CurveTo(173.9847f, 104.91503f, 156.88177f, 85.40811f, 134.0f, 82.39f),
                    PathNode.LineTo(134.0f, 38.2f),
                    PathNode.CurveTo(181.27261f, 41.356773f, 218.00334f, 80.62209f, 218.00334f, 128.0f),
                    PathNode.CurveTo(218.00334f, 175.3779f, 181.27261f, 214.64323f, 134.0f, 217.8f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
