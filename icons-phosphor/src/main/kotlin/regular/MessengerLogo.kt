package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) return _messengerLogo!!
        _messengerLogo = phosphorRegularIcon(
            name = "MessengerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(181.66f, 106.34f),
                    PathNode.CurveTo(183.16223f, 107.840546f, 184.00629f, 109.876724f, 184.00629f, 112.0f),
                    PathNode.CurveTo(184.00629f, 114.123276f, 183.16223f, 116.159454f, 181.66f, 117.66f),
                    PathNode.LineTo(149.66f, 149.66f),
                    PathNode.CurveTo(148.15945f, 151.16223f, 146.12328f, 152.00629f, 144.0f, 152.00629f),
                    PathNode.CurveTo(141.87672f, 152.00629f, 139.84055f, 151.16223f, 138.34f, 149.66f),
                    PathNode.LineTo(112.0f, 123.31f),
                    PathNode.LineTo(85.66f, 149.66f),
                    PathNode.CurveTo(82.534065f, 152.78593f, 77.465935f, 152.78593f, 74.34f, 149.66f),
                    PathNode.CurveTo(71.214066f, 146.53407f, 71.214066f, 141.46593f, 74.34f, 138.34f),
                    PathNode.LineTo(106.34f, 106.34f),
                    PathNode.CurveTo(107.840546f, 104.83778f, 109.876724f, 103.993706f, 112.0f, 103.993706f),
                    PathNode.CurveTo(114.123276f, 103.993706f, 116.159454f, 104.83778f, 117.66f, 106.34f),
                    PathNode.LineTo(144.0f, 132.69f),
                    PathNode.LineTo(170.34f, 106.34f),
                    PathNode.CurveTo(171.84055f, 104.83778f, 173.87672f, 103.993706f, 176.0f, 103.993706f),
                    PathNode.CurveTo(178.12328f, 103.993706f, 180.15945f, 104.83778f, 181.66f, 106.34f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.00797f, 164.52303f, 212.85693f, 198.37349f, 181.54701f, 217.17828f),
                    PathNode.CurveTo(150.23709f, 235.98308f, 111.35765f, 236.98582f, 79.12f, 219.82f),
                    PathNode.LineTo(45.07f, 231.17f),
                    PathNode.CurveTo(39.320145f, 233.08752f, 32.980404f, 231.59138f, 28.694513f, 227.30548f),
                    PathNode.CurveTo(24.408623f, 223.0196f, 22.912483f, 216.67986f, 24.83f, 210.93f),
                    PathNode.LineTo(36.18f, 176.88f),
                    PathNode.CurveTo(15.858562f, 138.67328f, 21.319912f, 91.87539f, 49.892963f, 59.374695f),
                    PathNode.CurveTo(78.46601f, 26.873999f, 124.17886f, 15.463294f, 164.67383f, 30.723438f),
                    PathNode.CurveTo(205.1688f, 45.98358f, 231.98225f, 84.725136f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(215.9895f, 91.00305f, 192.83955f, 57.96352f, 158.06946f, 45.321724f),
                    PathNode.CurveTo(123.29937f, 32.679928f, 84.33522f, 43.135864f, 60.565414f, 71.4867f),
                    PathNode.CurveTo(36.7956f, 99.83755f, 33.296803f, 140.02821f, 51.81f, 172.06f),
                    PathNode.CurveTo(52.956802f, 174.04477f, 53.19712f, 176.42612f, 52.47f, 178.6f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.LineTo(77.4f, 203.52f),
                    PathNode.CurveTo(79.575294f, 202.7959f, 81.95672f, 203.03987f, 83.94f, 204.19f),
                    PathNode.CurveTo(111.167854f, 219.93861f, 144.7311f, 219.95706f, 171.97624f, 204.23839f),
                    PathNode.CurveTo(199.22139f, 188.51971f, 216.00516f, 159.45433f, 216.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
