package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorThinIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 232.0f),
                    PathNode.CurveTo(220.0f, 234.20914f, 218.20914f, 236.0f, 216.0f, 236.0f),
                    PathNode.LineTo(112.0f, 236.0f),
                    PathNode.CurveTo(109.79086f, 236.0f, 108.0f, 234.20914f, 108.0f, 232.0f),
                    PathNode.CurveTo(108.0f, 229.79086f, 109.79086f, 228.0f, 112.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(218.20914f, 228.0f, 220.0f, 229.79086f, 220.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 160.0f),
                    PathNode.LineTo(220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 198.62741f, 214.62741f, 204.0f, 208.0f, 204.0f),
                    PathNode.LineTo(114.11f, 204.0f),
                    PathNode.CurveTo(109.55902f, 204.01741f, 105.393906f, 201.44621f, 103.37f, 197.37f),
                    PathNode.LineTo(45.26f, 81.37f),
                    PathNode.CurveTo(43.579502f, 77.98721f, 43.579502f, 74.01279f, 45.26f, 70.63f),
                    PathNode.LineTo(67.38f, 26.63f),
                    PathNode.CurveTo(70.32296f, 20.739487f, 77.46292f, 18.320826f, 83.38f, 21.21f),
                    PathNode.LineTo(117.16f, 35.48f),
                    PathNode.LineTo(117.39f, 35.59f),
                    PathNode.CurveTo(120.23729f, 37.01269f, 122.40271f, 39.508297f, 123.409805f, 42.527706f),
                    PathNode.CurveTo(124.4169f, 45.54712f, 124.18315f, 48.842945f, 122.76f, 51.69f),
                    PathNode.LineTo(122.7f, 51.79f),
                    PathNode.LineTo(108.4f, 78.26f),
                    PathNode.CurveTo(107.852715f, 79.37303f, 107.852715f, 80.67697f, 108.4f, 81.79f),
                    PathNode.LineTo(140.18f, 145.79f),
                    PathNode.CurveTo(140.85942f, 147.13832f, 142.24016f, 147.9892f, 143.75f, 147.99f),
                    PathNode.LineTo(208.0f, 147.99f),
                    PathNode.CurveTo(211.18433f, 147.99f, 214.2381f, 149.25566f, 216.48882f, 151.50826f),
                    PathNode.CurveTo(218.73955f, 153.76085f, 220.00266f, 156.81567f, 220.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 160.0f),
                    PathNode.CurveTo(212.0f, 157.79086f, 210.20914f, 156.0f, 208.0f, 156.0f),
                    PathNode.LineTo(143.77f, 156.0f),
                    PathNode.CurveTo(139.20824f, 156.02888f, 135.02867f, 153.45596f, 133.0f, 149.37f),
                    PathNode.LineTo(101.22f, 85.37f),
                    PathNode.CurveTo(99.53521f, 81.995255f, 99.53521f, 78.02474f, 101.22f, 74.65f),
                    PathNode.LineTo(101.28f, 74.54f),
                    PathNode.LineTo(115.55f, 48.07f),
                    PathNode.CurveTo(116.4858f, 46.13903f, 115.73126f, 43.813652f, 113.84f, 42.8f),
                    PathNode.LineTo(80.13f, 28.53f),
                    PathNode.LineTo(79.89f, 28.42f),
                    PathNode.CurveTo(79.33821f, 28.141253f, 78.728195f, 27.997316f, 78.11f, 28.0f),
                    PathNode.CurveTo(76.594345f, 27.998915f, 75.20826f, 28.85457f, 74.53f, 30.21f),
                    PathNode.LineTo(52.41f, 74.21f),
                    PathNode.CurveTo(51.84951f, 75.334f, 51.84951f, 76.656f, 52.41f, 77.78f),
                    PathNode.LineTo(110.52f, 193.78f),
                    PathNode.CurveTo(111.19826f, 195.13544f, 112.58434f, 195.99109f, 114.1f, 195.99f),
                    PathNode.LineTo(208.0f, 195.99f),
                    PathNode.CurveTo(210.20914f, 195.99f, 212.0f, 194.19914f, 212.0f, 191.99f),
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
        return _seat!!
    }

private var _seat: ImageVector? = null
