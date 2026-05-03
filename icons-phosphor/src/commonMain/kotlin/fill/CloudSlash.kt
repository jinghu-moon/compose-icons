package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorFillIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 128.72f),
                    PathNode.CurveTo(247.82828f, 151.7105f, 238.63936f, 173.71504f, 222.41f, 190.0f),
                    PathNode.CurveTo(221.63417f, 190.76486f, 220.57994f, 191.18018f, 219.49089f, 191.14998f),
                    PathNode.CurveTo(218.40186f, 191.11978f, 217.37225f, 190.64668f, 216.64f, 189.84f),
                    PathNode.LineTo(103.78f, 65.67f),
                    PathNode.CurveTo(103.04637f, 64.86424f, 102.67324f, 63.794056f, 102.74685f, 62.706844f),
                    PathNode.CurveTo(102.820465f, 61.619633f, 103.33446f, 60.609512f, 104.17f, 59.91f),
                    PathNode.CurveTo(120.14058f, 46.812115f, 140.21674f, 39.762447f, 160.87f, 40.0f),
                    PathNode.CurveTo(209.15f, 40.47f, 248.38f, 80.43f, 248.0f, 128.72f),
                    PathNode.Close,
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(81.33f, 88.56f),
                    PathNode.LineTo(81.27f, 88.67f),
                    PathNode.CurveTo(62.69947f, 85.949135f, 43.870605f, 91.51708f, 29.766535f, 103.90025f),
                    PathNode.CurveTo(15.662464f, 116.28342f, 7.704958f, 134.23352f, 8.0f, 153.0f),
                    PathNode.CurveTo(8.53f, 188.12f, 37.84f, 216.0f, 73.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(170.87065f, 216.00456f, 181.6473f, 213.98691f, 191.78f, 210.05f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.51067f, 222.95619f, 205.51051f, 223.89722f, 207.63692f, 223.99481f),
                    PathNode.CurveTo(209.76335f, 224.0924f, 211.84097f, 223.33852f, 213.41f, 221.9f),
                    PathNode.CurveTo(216.58073f, 218.7593f, 216.7087f, 213.67627f, 213.7f, 210.38f),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
