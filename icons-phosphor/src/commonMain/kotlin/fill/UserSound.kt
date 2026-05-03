package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorFillIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.13f, 202.85f),
                    PathNode.CurveTo(200.13358f, 205.23167f, 200.57397f, 208.55917f, 199.25899f, 211.38007f),
                    PathNode.CurveTo(197.944f, 214.20096f, 195.11234f, 216.00316f, 192.0f, 216.0f),
                    PathNode.LineTo(24.0f, 216.0f),
                    PathNode.CurveTo(20.889471f, 215.99927f, 18.061363f, 214.1956f, 16.748903f, 211.37553f),
                    PathNode.CurveTo(15.436442f, 208.55545f, 15.877598f, 205.23029f, 17.88f, 202.85f),
                    PathNode.CurveTo(32.82f, 185.07f, 51.4f, 172.44f, 72.05f, 165.68f),
                    PathNode.CurveTo(46.28388f, 149.63197f, 34.274868f, 118.44987f, 42.620495f, 89.26455f),
                    PathNode.CurveTo(50.96612f, 60.079227f, 77.6449f, 39.960007f, 108.0f, 39.960007f),
                    PathNode.CurveTo(138.3551f, 39.960007f, 165.03387f, 60.079227f, 173.3795f, 89.26455f),
                    PathNode.CurveTo(181.72514f, 118.44987f, 169.71613f, 149.63197f, 143.95f, 165.68f),
                    PathNode.CurveTo(164.6f, 172.44f, 183.18f, 185.07f, 198.13f, 202.85f),
                    PathNode.Close,
                    PathNode.MoveTo(196.86f, 61.39f),
                    PathNode.CurveTo(194.90768f, 62.222393f, 193.36613f, 63.79646f, 192.57468f, 65.765724f),
                    PathNode.CurveTo(191.78322f, 67.735f, 191.80672f, 69.93806f, 192.64f, 71.89f),
                    PathNode.CurveTo(202.4536f, 94.963196f, 202.4536f, 121.036804f, 192.64f, 144.11f),
                    PathNode.CurveTo(190.90306f, 148.17482f, 192.79019f, 152.87807f, 196.855f, 154.615f),
                    PathNode.CurveTo(200.91982f, 156.35193f, 205.62306f, 154.46481f, 207.36f, 150.4f),
                    PathNode.CurveTo(218.87965f, 123.307f, 218.87965f, 92.693f, 207.36f, 65.6f),
                    PathNode.CurveTo(205.62273f, 61.538292f, 200.92206f, 59.65355f, 196.86f, 61.39f),
                    PathNode.Close,
                    PathNode.MoveTo(236.71f, 52.85f),
                    PathNode.CurveTo(235.64111f, 50.139053f, 233.18268f, 48.223747f, 230.29263f, 47.85038f),
                    PathNode.CurveTo(227.40259f, 47.47701f, 224.53812f, 48.70464f, 222.81535f, 51.054928f),
                    PathNode.CurveTo(221.09259f, 53.405216f, 220.78407f, 56.506355f, 222.01f, 59.15f),
                    PathNode.CurveTo(235.33006f, 90.35467f, 235.33006f, 125.64533f, 222.01f, 156.85f),
                    PathNode.CurveTo(220.78407f, 159.49365f, 221.09259f, 162.59479f, 222.81535f, 164.94507f),
                    PathNode.CurveTo(224.53812f, 167.29536f, 227.40259f, 168.523f, 230.29263f, 168.14963f),
                    PathNode.CurveTo(233.18268f, 167.77625f, 235.64111f, 165.86095f, 236.71f, 163.15f),
                    PathNode.CurveTo(251.7639f, 127.92426f, 251.7639f, 88.07574f, 236.71f, 52.85f),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
