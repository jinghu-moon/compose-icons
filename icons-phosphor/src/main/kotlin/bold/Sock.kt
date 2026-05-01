package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorBoldIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 12.0f),
                    PathNode.LineTo(104.0f, 12.0f),
                    PathNode.CurveTo(92.95431f, 12.0f, 84.0f, 20.954306f, 84.0f, 32.0f),
                    PathNode.LineTo(84.0f, 107.0f),
                    PathNode.LineTo(46.43f, 144.6f),
                    PathNode.CurveTo(21.853329f, 169.17667f, 21.853329f, 209.02333f, 46.43f, 233.6f),
                    PathNode.CurveTo(71.006676f, 258.17667f, 110.853325f, 258.17667f, 135.43f, 233.6f),
                    PathNode.LineTo(203.83f, 165.2f),
                    PathNode.CurveTo(209.09872f, 159.9605f, 212.05157f, 152.83043f, 212.03f, 145.4f),
                    PathNode.LineTo(212.03f, 32.0f),
                    PathNode.CurveTo(212.03f, 26.690468f, 209.91875f, 21.598839f, 206.16153f, 17.847248f),
                    PathNode.CurveTo(202.40433f, 14.095656f, 197.30952f, 11.992036f, 192.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 36.0f),
                    PathNode.LineTo(188.0f, 52.0f),
                    PathNode.LineTo(108.0f, 52.0f),
                    PathNode.LineTo(108.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.43f, 216.6f),
                    PathNode.CurveTo(108.71415f, 226.9451f, 94.136406f, 231.17969f, 80.390144f, 227.64996f),
                    PathNode.CurveTo(66.64388f, 224.12022f, 55.90977f, 213.38612f, 52.38004f, 199.63986f),
                    PathNode.CurveTo(48.850307f, 185.89359f, 53.084904f, 171.31586f, 63.43f, 161.6f),
                    PathNode.LineTo(104.52f, 120.52f),
                    PathNode.CurveTo(106.766235f, 118.25537f, 108.01844f, 115.18964f, 108.0f, 112.0f),
                    PathNode.LineTo(108.0f, 76.0f),
                    PathNode.LineTo(188.0f, 76.0f),
                    PathNode.LineTo(188.0f, 101.21f),
                    PathNode.CurveTo(160.08286f, 106.94412f, 140.03375f, 131.50006f, 140.0f, 160.0f),
                    PathNode.CurveTo(139.98312f, 169.79073f, 142.38783f, 179.43365f, 147.0f, 188.07f),
                    PathNode.Close,
                    PathNode.MoveTo(186.83f, 148.2f),
                    PathNode.LineTo(165.32f, 169.71f),
                    PathNode.CurveTo(160.24232f, 151.46153f, 170.14903f, 132.39502f, 188.0f, 126.06f),
                    PathNode.LineTo(188.0f, 145.37f),
                    PathNode.CurveTo(188.00084f, 146.43118f, 187.57996f, 147.44922f, 186.83f, 148.2f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sock!!
    }

private var _sock: ImageVector? = null
