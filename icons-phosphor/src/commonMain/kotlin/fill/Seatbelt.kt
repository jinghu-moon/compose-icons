package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorFillIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.CurveTo(103.69947f, 112.0f, 84.0f, 92.30053f, 84.0f, 68.0f),
                    PathNode.CurveTo(84.0f, 43.69947f, 103.69947f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(152.30052f, 24.0f, 172.0f, 43.69947f, 172.0f, 68.0f),
                    PathNode.CurveTo(171.97244f, 92.28911f, 152.28911f, 111.97244f, 128.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(77.16f, 216.0f),
                    PathNode.LineTo(197.29f, 110.0f),
                    PathNode.CurveTo(197.69519f, 109.64077f, 198.06367f, 109.24214f, 198.39f, 108.81f),
                    PathNode.CurveTo(199.4864f, 107.347824f, 200.05405f, 105.556786f, 200.0f, 103.73f),
                    PathNode.CurveTo(199.89648f, 100.63473f, 198.01576f, 97.877266f, 195.17183f, 96.65111f),
                    PathNode.CurveTo(192.32791f, 95.424934f, 189.03174f, 95.95038f, 186.71f, 98.0f),
                    PathNode.LineTo(162.17f, 119.65f),
                    PathNode.CurveTo(139.42995f, 108.90078f, 112.95853f, 109.47215f, 90.70347f, 121.19258f),
                    PathNode.CurveTo(68.44842f, 132.91301f, 53.001328f, 154.41765f, 49.0f, 179.25f),
                    PathNode.CurveTo(48.942368f, 179.61404f, 48.90896f, 179.98152f, 48.9f, 180.35f),
                    PathNode.LineTo(48.0f, 223.83f),
                    PathNode.CurveTo(47.95428f, 225.98103f, 48.77691f, 228.05981f, 50.282185f, 229.59708f),
                    PathNode.CurveTo(51.787457f, 231.13434f, 53.848484f, 232.0005f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(204.41827f, 232.0f, 208.0f, 228.41827f, 208.0f, 224.0f),
                    PathNode.CurveTo(208.0f, 219.58173f, 204.41827f, 216.0f, 200.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.12f, 143.0f),
                    PathNode.CurveTo(185.85536f, 142.72601f, 183.58147f, 143.43184f, 181.87f, 144.94f),
                    PathNode.LineTo(119.47f, 200.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.CurveTo(204.41827f, 200.0f, 208.0f, 196.41827f, 208.0f, 192.0f),
                    PathNode.CurveTo(208.02928f, 175.69052f, 203.04796f, 159.76566f, 193.73f, 146.38f),
                    PathNode.CurveTo(192.42801f, 144.50441f, 190.38664f, 143.27449f, 188.12f, 143.0f),
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
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
