package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorFillIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.13f, 194.85f),
                    PathNode.CurveTo(200.13358f, 197.23167f, 200.57397f, 200.55917f, 199.25899f, 203.38007f),
                    PathNode.CurveTo(197.944f, 206.20096f, 195.11234f, 208.00316f, 192.0f, 208.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(20.889471f, 207.99927f, 18.061363f, 206.1956f, 16.748903f, 203.37553f),
                    PathNode.CurveTo(15.436442f, 200.55545f, 15.877598f, 197.23029f, 17.88f, 194.85f),
                    PathNode.CurveTo(32.82f, 177.07f, 51.4f, 164.44f, 72.05f, 157.68f),
                    PathNode.CurveTo(46.28388f, 141.63197f, 34.274868f, 110.44987f, 42.620495f, 81.26455f),
                    PathNode.CurveTo(50.96612f, 52.079227f, 77.6449f, 31.960009f, 108.0f, 31.960009f),
                    PathNode.CurveTo(138.3551f, 31.960009f, 165.03387f, 52.079227f, 173.3795f, 81.26455f),
                    PathNode.CurveTo(181.72514f, 110.44987f, 169.71613f, 141.63197f, 143.95f, 157.68f),
                    PathNode.CurveTo(164.6f, 164.44f, 183.18f, 177.07f, 198.13f, 194.85f),
                    PathNode.Close,
                    PathNode.MoveTo(255.18f, 154.0f),
                    PathNode.CurveTo(253.74883f, 156.47887f, 251.10234f, 158.00421f, 248.24f, 158.0f),
                    PathNode.CurveTo(246.83537f, 158.00435f, 245.45486f, 157.63506f, 244.24f, 156.93f),
                    PathNode.LineTo(239.57f, 154.23f),
                    PathNode.CurveTo(237.3351f, 156.14743f, 234.76535f, 157.63571f, 231.99f, 158.62f),
                    PathNode.LineTo(231.99f, 164.0f),
                    PathNode.CurveTo(231.99f, 168.41827f, 228.40828f, 172.0f, 223.99f, 172.0f),
                    PathNode.CurveTo(219.57172f, 172.0f, 215.99f, 168.41827f, 215.99f, 164.0f),
                    PathNode.LineTo(215.99f, 158.62f),
                    PathNode.CurveTo(213.21466f, 157.63571f, 210.64491f, 156.14743f, 208.41f, 154.23f),
                    PathNode.LineTo(203.74f, 156.93f),
                    PathNode.CurveTo(202.52515f, 157.63506f, 201.14462f, 158.00435f, 199.74f, 158.0f),
                    PathNode.CurveTo(196.1179f, 158.0014f, 192.94678f, 155.56902f, 192.00941f, 152.07031f),
                    PathNode.CurveTo(191.07205f, 148.57162f, 192.60236f, 144.87964f, 195.74f, 143.07f),
                    PathNode.LineTo(200.4f, 140.38f),
                    PathNode.CurveTo(199.85332f, 137.48558f, 199.85332f, 134.51442f, 200.4f, 131.62f),
                    PathNode.LineTo(195.74f, 128.93f),
                    PathNode.CurveTo(191.91267f, 126.72086f, 190.60086f, 121.82733f, 192.81f, 118.0f),
                    PathNode.CurveTo(195.01913f, 114.17267f, 199.91267f, 112.86086f, 203.74f, 115.07f),
                    PathNode.LineTo(208.41f, 117.77f),
                    PathNode.CurveTo(210.64491f, 115.85257f, 213.21466f, 114.36428f, 215.99f, 113.38f),
                    PathNode.LineTo(215.99f, 108.0f),
                    PathNode.CurveTo(215.99f, 103.58172f, 219.57172f, 100.0f, 223.99f, 100.0f),
                    PathNode.CurveTo(228.40828f, 100.0f, 231.99f, 103.58172f, 231.99f, 108.0f),
                    PathNode.LineTo(231.99f, 113.38f),
                    PathNode.CurveTo(234.76535f, 114.36428f, 237.3351f, 115.85257f, 239.57f, 117.77f),
                    PathNode.LineTo(244.24f, 115.07f),
                    PathNode.CurveTo(248.06734f, 112.86086f, 252.96086f, 114.17267f, 255.17f, 118.0f),
                    PathNode.CurveTo(257.37915f, 121.82733f, 256.06732f, 126.72086f, 252.24f, 128.93f),
                    PathNode.LineTo(247.58f, 131.62f),
                    PathNode.CurveTo(248.12668f, 134.51442f, 248.12668f, 137.48558f, 247.58f, 140.38f),
                    PathNode.LineTo(252.24f, 143.07f),
                    PathNode.CurveTo(254.07997f, 144.12889f, 255.4236f, 145.8757f, 255.97504f, 147.92574f),
                    PathNode.CurveTo(256.52646f, 149.9758f, 256.24045f, 152.16093f, 255.18f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 144.0f),
                    PathNode.CurveTo(228.41827f, 144.0f, 232.0f, 140.41827f, 232.0f, 136.0f),
                    PathNode.CurveTo(232.0f, 131.58173f, 228.41827f, 128.0f, 224.0f, 128.0f),
                    PathNode.CurveTo(219.58173f, 128.0f, 216.0f, 131.58173f, 216.0f, 136.0f),
                    PathNode.CurveTo(216.0f, 140.41827f, 219.58173f, 144.0f, 224.0f, 144.0f),
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
        return _userGear!!
    }

private var _userGear: ImageVector? = null
