package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorRegularIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 221.66f),
                    PathNode.LineTo(181.66f, 245.66f),
                    PathNode.CurveTo(178.53407f, 248.78593f, 173.46593f, 248.78593f, 170.34f, 245.66f),
                    PathNode.CurveTo(167.21407f, 242.53407f, 167.21407f, 237.46593f, 170.34f, 234.34f),
                    PathNode.LineTo(180.69f, 224.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(66.74516f, 224.0f, 56.0f, 213.25484f, 56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 99.58172f, 59.581722f, 96.0f, 64.0f, 96.0f),
                    PathNode.CurveTo(68.41828f, 96.0f, 72.0f, 99.58172f, 72.0f, 104.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(72.0f, 204.41827f, 75.58172f, 208.0f, 80.0f, 208.0f),
                    PathNode.LineTo(180.69f, 208.0f),
                    PathNode.LineTo(170.34f, 197.66f),
                    PathNode.CurveTo(167.21407f, 194.53407f, 167.21407f, 189.46593f, 170.34f, 186.34f),
                    PathNode.CurveTo(173.46593f, 183.21407f, 178.53407f, 183.21407f, 181.66f, 186.34f),
                    PathNode.LineTo(205.66f, 210.34f),
                    PathNode.CurveTo(207.16223f, 211.84055f, 208.00629f, 213.87672f, 208.00629f, 216.0f),
                    PathNode.CurveTo(208.00629f, 218.12328f, 207.16223f, 220.15945f, 205.66f, 221.66f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 72.0f),
                    PathNode.CurveTo(83.237656f, 72.00255f, 86.15764f, 70.05338f, 87.39698f, 67.062325f),
                    PathNode.CurveTo(88.63632f, 64.07126f, 87.95064f, 60.628094f, 85.66f, 58.34f),
                    PathNode.LineTo(75.31f, 48.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.CurveTo(180.41827f, 48.0f, 184.0f, 51.581722f, 184.0f, 56.0f),
                    PathNode.LineTo(184.0f, 152.0f),
                    PathNode.CurveTo(184.0f, 156.41827f, 187.58173f, 160.0f, 192.0f, 160.0f),
                    PathNode.CurveTo(196.41827f, 160.0f, 200.0f, 156.41827f, 200.0f, 152.0f),
                    PathNode.LineTo(200.0f, 56.0f),
                    PathNode.CurveTo(200.0f, 42.745167f, 189.25484f, 32.0f, 176.0f, 32.0f),
                    PathNode.LineTo(75.31f, 32.0f),
                    PathNode.LineTo(85.66f, 21.66f),
                    PathNode.CurveTo(88.785934f, 18.53407f, 88.785934f, 13.465932f, 85.66f, 10.34f),
                    PathNode.CurveTo(82.534065f, 7.214069f, 77.465935f, 7.214069f, 74.34f, 10.34f),
                    PathNode.LineTo(50.34f, 34.34f),
                    PathNode.CurveTo(48.837784f, 35.840546f, 47.993706f, 37.876724f, 47.993706f, 40.0f),
                    PathNode.CurveTo(47.993706f, 42.123276f, 48.837784f, 44.159454f, 50.34f, 45.66f),
                    PathNode.LineTo(74.34f, 69.66f),
                    PathNode.CurveTo(75.841576f, 71.15991f, 77.87763f, 72.00167f, 80.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
