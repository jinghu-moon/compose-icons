package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorLightIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 110.0f),
                    PathNode.CurveTo(151.19595f, 110.0f, 170.0f, 91.19596f, 170.0f, 68.0f),
                    PathNode.CurveTo(170.0f, 44.80404f, 151.19595f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(104.80404f, 26.0f, 86.0f, 44.80404f, 86.0f, 68.0f),
                    PathNode.CurveTo(86.0f, 91.19596f, 104.80404f, 110.0f, 128.0f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 38.0f),
                    PathNode.CurveTo(144.56854f, 38.0f, 158.0f, 51.431458f, 158.0f, 68.0f),
                    PathNode.CurveTo(158.0f, 84.56854f, 144.56854f, 98.0f, 128.0f, 98.0f),
                    PathNode.CurveTo(111.43146f, 98.0f, 98.0f, 84.56854f, 98.0f, 68.0f),
                    PathNode.CurveTo(98.0f, 51.431458f, 111.43146f, 38.0f, 128.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 224.0f),
                    PathNode.CurveTo(206.0f, 227.3137f, 203.3137f, 230.0f, 200.0f, 230.0f),
                    PathNode.LineTo(56.0f, 230.0f),
                    PathNode.CurveTo(53.498886f, 230.01312f, 51.252003f, 228.47334f, 50.361607f, 226.13605f),
                    PathNode.CurveTo(49.47121f, 223.79877f, 50.124107f, 221.15433f, 52.0f, 219.5f),
                    PathNode.LineTo(152.58f, 130.75f),
                    PathNode.CurveTo(133.96701f, 123.26559f, 112.96029f, 124.65317f, 95.49348f, 134.52081f),
                    PathNode.CurveTo(78.026665f, 144.38844f, 65.99611f, 161.66483f, 62.8f, 181.47f),
                    PathNode.CurveTo(62.33426f, 184.37447f, 59.831566f, 186.51299f, 56.89f, 186.52f),
                    PathNode.CurveTo(56.555325f, 186.5237f, 56.220898f, 186.50029f, 55.89f, 186.45f),
                    PathNode.CurveTo(54.312916f, 186.20418f, 52.898773f, 185.3401f, 51.960423f, 184.04893f),
                    PathNode.CurveTo(51.02207f, 182.75777f, 50.63686f, 181.14592f, 50.89f, 179.57f),
                    PathNode.CurveTo(54.81162f, 155.10281f, 70.125595f, 133.95459f, 92.14756f, 122.59434f),
                    PathNode.CurveTo(114.169525f, 111.234085f, 140.27922f, 111.01348f, 162.49f, 122.0f),
                    PathNode.LineTo(188.0f, 99.5f),
                    PathNode.CurveTo(190.48528f, 97.30743f, 194.27744f, 97.54471f, 196.47f, 100.03f),
                    PathNode.CurveTo(198.66257f, 102.51528f, 198.42528f, 106.30743f, 195.94f, 108.5f),
                    PathNode.LineTo(71.87f, 218.0f),
                    PathNode.LineTo(200.0f, 218.0f),
                    PathNode.CurveTo(203.3137f, 218.0f, 206.0f, 220.6863f, 206.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.08f, 147.52f),
                    PathNode.CurveTo(201.1722f, 160.56807f, 206.03183f, 176.09657f, 206.0f, 192.0f),
                    PathNode.CurveTo(206.0f, 195.3137f, 203.3137f, 198.0f, 200.0f, 198.0f),
                    PathNode.CurveTo(196.6863f, 198.0f, 194.0f, 195.3137f, 194.0f, 192.0f),
                    PathNode.CurveTo(194.02686f, 178.54669f, 189.918f, 165.41023f, 182.23f, 154.37f),
                    PathNode.CurveTo(180.41695f, 151.65105f, 181.1133f, 147.98117f, 183.7963f, 146.11533f),
                    PathNode.CurveTo(186.4793f, 144.24948f, 190.16208f, 144.87398f, 192.08f, 147.52f),
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
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
