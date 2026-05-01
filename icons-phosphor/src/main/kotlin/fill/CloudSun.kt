package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) return _cloudSun!!
        _cloudSun = phosphorFillIcon(
            name = "CloudSun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 72.0f),
                    PathNode.CurveTo(157.1547f, 71.99586f, 150.34006f, 72.91411f, 143.74f, 74.73f),
                    PathNode.CurveTo(141.13464f, 70.47903f, 137.96964f, 66.5976f, 134.33f, 63.19f),
                    PathNode.LineTo(143.84f, 49.62f),
                    PathNode.CurveTo(146.37498f, 45.999775f, 145.49521f, 41.009987f, 141.87502f, 38.475f),
                    PathNode.CurveTo(138.25479f, 35.940014f, 133.26498f, 36.819775f, 130.73f, 40.44f),
                    PathNode.LineTo(121.22f, 54.0f),
                    PathNode.CurveTo(113.39964f, 50.051384f, 104.76068f, 47.99612f, 96.0f, 48.0f),
                    PathNode.CurveTo(95.41f, 48.0f, 94.84f, 48.0f, 94.26f, 48.0f),
                    PathNode.LineTo(91.37f, 31.71f),
                    PathNode.CurveTo(90.95701f, 28.819878f, 89.002426f, 26.384222f, 86.270325f, 25.35515f),
                    PathNode.CurveTo(83.53822f, 24.326078f, 80.46248f, 24.867018f, 78.24544f, 26.766512f),
                    PathNode.CurveTo(76.02839f, 28.666006f, 75.022125f, 31.622393f, 75.62f, 34.48f),
                    PathNode.LineTo(78.5f, 50.82f),
                    PathNode.CurveTo(69.62755f, 53.754574f, 61.628735f, 58.8591f, 55.23f, 65.67f),
                    PathNode.LineTo(41.61f, 56.14f),
                    PathNode.CurveTo(39.26923f, 54.459305f, 36.20544f, 54.167374f, 33.589382f, 55.375763f),
                    PathNode.CurveTo(30.97333f, 56.58415f, 29.209309f, 59.1061f, 28.9714f, 61.97792f),
                    PathNode.CurveTo(28.733488f, 64.84974f, 30.058456f, 67.627594f, 32.44f, 69.25f),
                    PathNode.LineTo(46.0f, 78.77f),
                    PathNode.CurveTo(42.037403f, 86.58881f, 39.98138f, 95.2344f, 40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 104.57f, 40.0f, 105.15f, 40.0f, 105.72f),
                    PathNode.LineTo(23.71f, 108.6f),
                    PathNode.CurveTo(19.622583f, 109.31604f, 16.761213f, 113.03852f, 17.120472f, 117.17261f),
                    PathNode.CurveTo(17.47973f, 121.30669f, 20.940338f, 124.479774f, 25.09f, 124.48f),
                    PathNode.CurveTo(25.555893f, 124.47937f, 26.020893f, 124.439224f, 26.48f, 124.36f),
                    PathNode.LineTo(42.8f, 121.48f),
                    PathNode.CurveTo(44.233917f, 125.84572f, 46.202187f, 130.01738f, 48.66f, 133.9f),
                    PathNode.CurveTo(33.000504f, 148.44528f, 27.835588f, 171.09093f, 35.63971f, 190.98769f),
                    PathNode.CurveTo(43.44383f, 210.88443f, 62.62748f, 223.97983f, 84.0f, 224.0f),
                    PathNode.LineTo(164.0f, 224.0f),
                    PathNode.CurveTo(205.97365f, 224.0f, 240.0f, 189.97365f, 240.0f, 148.0f),
                    PathNode.CurveTo(240.0f, 106.02636f, 205.97365f, 72.0f, 164.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.92f, 120.76f),
                    PathNode.CurveTo(82.40342f, 118.94468f, 71.58306f, 120.40019f, 61.92f, 124.93f),
                    PathNode.CurveTo(50.809513f, 106.578674f, 56.154076f, 82.730064f, 74.033806f, 70.87555f),
                    PathNode.CurveTo(91.913536f, 59.02104f, 115.96145f, 63.38202f, 128.54f, 80.76f),
                    PathNode.CurveTo(112.22088f, 89.348015f, 99.56646f, 103.55848f, 92.92f, 120.76f),
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
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
