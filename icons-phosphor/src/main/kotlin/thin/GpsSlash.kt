package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorThinIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 128.0f),
                    PathNode.CurveTo(244.0f, 130.20914f, 242.20914f, 132.0f, 240.0f, 132.0f),
                    PathNode.LineTo(211.9f, 132.0f),
                    PathNode.CurveTo(211.42885f, 142.49329f, 208.97212f, 152.80206f, 204.66f, 162.38f),
                    PathNode.CurveTo(204.01714f, 163.82066f, 202.58757f, 164.74889f, 201.01f, 164.75f),
                    PathNode.CurveTo(200.44719f, 164.7478f, 199.89139f, 164.62505f, 199.38f, 164.39f),
                    PathNode.CurveTo(197.37299f, 163.48116f, 196.47879f, 161.12045f, 197.38f, 159.11f),
                    PathNode.CurveTo(209.71365f, 131.52351f, 204.54697f, 99.252235f, 184.21727f, 76.8952f),
                    PathNode.CurveTo(163.88757f, 54.538177f, 132.25122f, 46.336308f, 103.62f, 56.0f),
                    PathNode.CurveTo(102.24746f, 56.537327f, 100.690636f, 56.27627f, 99.568436f, 55.320625f),
                    PathNode.CurveTo(98.446236f, 54.364975f, 97.94054f, 52.86961f, 98.25237f, 51.428997f),
                    PathNode.CurveTo(98.56421f, 49.98839f, 99.64305f, 48.836018f, 101.06f, 48.43f),
                    PathNode.CurveTo(108.466385f, 45.92035f, 116.18839f, 44.462795f, 124.0f, 44.1f),
                    PathNode.LineTo(124.0f, 16.0f),
                    PathNode.CurveTo(124.0f, 13.790861f, 125.79086f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(130.20914f, 12.0f, 132.0f, 13.790861f, 132.0f, 16.0f),
                    PathNode.LineTo(132.0f, 44.1f),
                    PathNode.CurveTo(175.2215f, 46.214294f, 209.7857f, 80.77849f, 211.9f, 124.0f),
                    PathNode.LineTo(240.0f, 124.0f),
                    PathNode.CurveTo(242.20914f, 124.0f, 244.0f, 125.79086f, 244.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.0f, 213.31f),
                    PathNode.CurveTo(211.9815f, 214.36435f, 212.32031f, 215.865f, 211.88698f, 217.23878f),
                    PathNode.CurveTo(211.45364f, 218.61255f, 210.31512f, 219.64722f, 208.90628f, 219.94757f),
                    PathNode.CurveTo(207.49747f, 220.24792f, 206.03595f, 219.76758f, 205.08f, 218.69f),
                    PathNode.LineTo(181.52f, 192.78f),
                    PathNode.CurveTo(167.52101f, 204.35051f, 150.14232f, 211.06053f, 132.0f, 211.9f),
                    PathNode.LineTo(132.0f, 240.0f),
                    PathNode.CurveTo(132.0f, 242.20914f, 130.20914f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(125.79086f, 244.0f, 124.0f, 242.20914f, 124.0f, 240.0f),
                    PathNode.LineTo(124.0f, 211.9f),
                    PathNode.CurveTo(80.77849f, 209.7857f, 46.214294f, 175.2215f, 44.1f, 132.0f),
                    PathNode.LineTo(16.0f, 132.0f),
                    PathNode.CurveTo(13.790861f, 132.0f, 12.0f, 130.20914f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 125.79086f, 13.790861f, 124.0f, 16.0f, 124.0f),
                    PathNode.LineTo(44.1f, 124.0f),
                    PathNode.CurveTo(45.117386f, 103.13781f, 53.848877f, 83.397514f, 68.6f, 68.61f),
                    PathNode.LineTo(45.0f, 42.69f),
                    PathNode.CurveTo(43.514355f, 41.033146f, 43.653145f, 38.485645f, 45.31f, 37.0f),
                    PathNode.CurveTo(46.966854f, 35.514355f, 49.514355f, 35.653145f, 51.0f, 37.31f),
                    PathNode.LineTo(184.77f, 184.5f),
                    PathNode.LineTo(184.77f, 184.5f),
                    PathNode.Close,
                    PathNode.MoveTo(176.13f, 186.84f),
                    PathNode.LineTo(74.0f, 74.53f),
                    PathNode.CurveTo(45.606083f, 103.261635f, 44.6491f, 149.18504f, 71.821434f, 179.07462f),
                    PathNode.CurveTo(98.99376f, 208.96417f, 144.80031f, 212.37527f, 176.1f, 186.84f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
