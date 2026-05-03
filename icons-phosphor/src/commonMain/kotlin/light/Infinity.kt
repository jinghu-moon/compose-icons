package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorLightIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 128.0f),
                    PathNode.CurveTo(245.99695f, 149.83862f, 232.84032f, 169.52551f, 212.66388f, 177.88239f),
                    PathNode.CurveTo(192.48746f, 186.23926f, 169.26376f, 181.62073f, 153.82f, 166.18f),
                    PathNode.CurveTo(153.73164f, 166.09831f, 153.64816f, 166.01149f, 153.57f, 165.92f),
                    PathNode.LineTo(93.57f, 98.18f),
                    PathNode.CurveTo(77.13269f, 81.87693f, 50.602425f, 81.94945f, 34.25449f, 98.34213f),
                    PathNode.CurveTo(17.906546f, 114.73482f, 17.906546f, 141.26518f, 34.25449f, 157.65787f),
                    PathNode.CurveTo(50.602425f, 174.05057f, 77.13269f, 174.12308f, 93.57f, 157.82f),
                    PathNode.LineTo(102.14f, 148.15f),
                    PathNode.CurveTo(104.34914f, 145.66472f, 108.15472f, 145.44086f, 110.64f, 147.65f),
                    PathNode.CurveTo(113.12528f, 149.85915f, 113.34914f, 153.66472f, 111.14f, 156.15f),
                    PathNode.LineTo(102.45f, 165.96f),
                    PathNode.CurveTo(102.37183f, 166.0515f, 102.28836f, 166.1383f, 102.2f, 166.22f),
                    PathNode.CurveTo(86.75694f, 181.6661f, 63.529747f, 186.28807f, 43.35002f, 177.93051f),
                    PathNode.CurveTo(23.170298f, 169.57297f, 10.012468f, 149.88193f, 10.012468f, 128.04f),
                    PathNode.CurveTo(10.012468f, 106.19807f, 23.170298f, 86.507034f, 43.35002f, 78.14948f),
                    PathNode.CurveTo(63.529747f, 69.79194f, 86.75694f, 74.4139f, 102.2f, 89.86f),
                    PathNode.CurveTo(102.28836f, 89.94169f, 102.37183f, 90.02851f, 102.45f, 90.12f),
                    PathNode.LineTo(162.45f, 157.86f),
                    PathNode.CurveTo(178.88731f, 174.16307f, 205.41757f, 174.09056f, 221.76552f, 157.69788f),
                    PathNode.CurveTo(238.11345f, 141.30516f, 238.11345f, 114.77482f, 221.76552f, 98.38213f),
                    PathNode.CurveTo(205.41757f, 81.98945f, 178.88731f, 81.91693f, 162.45f, 98.22f),
                    PathNode.LineTo(153.88f, 107.89f),
                    PathNode.CurveTo(151.67087f, 110.37528f, 147.86528f, 110.59914f, 145.38f, 108.39f),
                    PathNode.CurveTo(142.89471f, 106.18086f, 142.67087f, 102.37528f, 144.88f, 99.89f),
                    PathNode.LineTo(153.57f, 90.08f),
                    PathNode.CurveTo(153.64816f, 89.98851f, 153.73164f, 89.901695f, 153.82f, 89.82f),
                    PathNode.CurveTo(169.26376f, 74.37929f, 192.48746f, 69.76075f, 212.66388f, 78.117615f),
                    PathNode.CurveTo(232.84032f, 86.47448f, 245.99695f, 106.16138f, 246.0f, 128.0f),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
