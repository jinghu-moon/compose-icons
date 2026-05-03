package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorRegularIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(255.59f, 189.47f),
                    PathNode.CurveTo(254.91913f, 187.45691f, 253.47597f, 185.79283f, 251.57806f, 184.84387f),
                    PathNode.CurveTo(249.68016f, 183.89491f, 247.48299f, 183.73885f, 245.47f, 184.41f),
                    PathNode.LineTo(228.05f, 190.22f),
                    PathNode.LineTo(199.15f, 132.42f),
                    PathNode.CurveTo(197.7951f, 129.71236f, 195.02771f, 128.00162f, 192.0f, 128.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.LineTo(112.0f, 104.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.CurveTo(172.41827f, 104.0f, 176.0f, 100.41828f, 176.0f, 96.0f),
                    PathNode.CurveTo(176.0f, 91.58172f, 172.41827f, 88.0f, 168.0f, 88.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.LineTo(112.0f, 79.0f),
                    PathNode.CurveTo(127.602455f, 74.971466f, 137.7754f, 59.969707f, 135.74495f, 43.983997f),
                    PathNode.CurveTo(133.7145f, 27.998285f, 120.11414f, 16.016132f, 104.0f, 16.016132f),
                    PathNode.CurveTo(87.88586f, 16.016132f, 74.2855f, 27.998285f, 72.25505f, 43.983997f),
                    PathNode.CurveTo(70.2246f, 59.969707f, 80.397545f, 74.971466f, 96.0f, 79.0f),
                    PathNode.LineTo(96.0f, 89.81f),
                    PathNode.CurveTo(60.288013f, 97.972275f, 36.397778f, 131.64789f, 40.494057f, 168.05104f),
                    PathNode.CurveTo(44.59034f, 204.4542f, 75.36711f, 231.97838f, 112.0f, 232.0f),
                    PathNode.CurveTo(145.52f, 232.0f, 175.69f, 209.29f, 183.75f, 178.0f),
                    PathNode.CurveTo(184.85457f, 173.71979f, 182.28021f, 169.35457f, 178.0f, 168.25f),
                    PathNode.CurveTo(173.71979f, 167.14543f, 169.35457f, 169.71979f, 168.25f, 174.0f),
                    PathNode.CurveTo(162.09f, 198.0f, 137.91f, 216.0f, 112.0f, 216.0f),
                    PathNode.CurveTo(84.20223f, 215.99063f, 60.61895f, 195.59163f, 56.60559f, 168.08511f),
                    PathNode.CurveTo(52.592236f, 140.57858f, 69.36378f, 114.29158f, 96.0f, 106.34f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(96.0f, 140.41827f, 99.58172f, 144.0f, 104.0f, 144.0f),
                    PathNode.LineTo(187.05f, 144.0f),
                    PathNode.LineTo(216.84f, 203.58f),
                    PathNode.CurveTo(218.62476f, 207.13869f, 222.75465f, 208.84349f, 226.53f, 207.58f),
                    PathNode.LineTo(250.53f, 199.58f),
                    PathNode.CurveTo(254.71683f, 198.18288f, 256.98108f, 193.65883f, 255.59f, 189.47f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 48.0f),
                    PathNode.CurveTo(88.0f, 39.163445f, 95.163445f, 32.0f, 104.0f, 32.0f),
                    PathNode.CurveTo(112.836555f, 32.0f, 120.0f, 39.163445f, 120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 56.836555f, 112.836555f, 64.0f, 104.0f, 64.0f),
                    PathNode.CurveTo(95.163445f, 64.0f, 88.0f, 56.836555f, 88.0f, 48.0f),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
