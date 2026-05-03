package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorLightIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 144.0f),
                    PathNode.CurveTo(246.0f, 147.3137f, 243.3137f, 150.0f, 240.0f, 150.0f),
                    PathNode.LineTo(192.0f, 150.0f),
                    PathNode.CurveTo(189.72737f, 150.0f, 187.6498f, 148.71599f, 186.63344f, 146.68329f),
                    PathNode.CurveTo(185.61708f, 144.65057f, 185.83643f, 142.21811f, 187.2f, 140.4f),
                    PathNode.LineTo(230.37f, 82.85f),
                    PathNode.CurveTo(234.59319f, 77.18298f, 235.10918f, 69.5689f, 231.68916f, 63.383926f),
                    PathNode.CurveTo(228.26915f, 57.19895f, 221.54608f, 53.58774f, 214.50104f, 54.151546f),
                    PathNode.CurveTo(207.45601f, 54.71535f, 201.39284f, 59.34983f, 199.0f, 66.0f),
                    PathNode.CurveTo(197.84012f, 69.04378f, 194.4636f, 70.606186f, 191.3927f, 69.52011f),
                    PathNode.CurveTo(188.32182f, 68.43403f, 186.67834f, 65.09621f, 187.69f, 62.0f),
                    PathNode.CurveTo(188.71382f, 59.13071f, 190.16702f, 56.433353f, 192.0f, 54.0f),
                    PathNode.CurveTo(201.95769f, 40.745167f, 220.77516f, 38.072308f, 234.03f, 48.03f),
                    PathNode.CurveTo(247.28484f, 57.987694f, 249.95769f, 76.80517f, 240.0f, 90.06f),
                    PathNode.LineTo(204.0f, 138.0f),
                    PathNode.LineTo(240.0f, 138.0f),
                    PathNode.CurveTo(243.3137f, 138.0f, 246.0f, 140.6863f, 246.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(147.93f, 75.47f),
                    PathNode.CurveTo(145.42761f, 73.30113f, 141.64124f, 73.56967f, 139.47f, 76.07f),
                    PathNode.LineTo(92.0f, 130.84f),
                    PathNode.LineTo(44.53f, 76.07f),
                    PathNode.CurveTo(43.147984f, 74.3741f, 40.95246f, 73.56481f, 38.80038f, 73.95802f),
                    PathNode.CurveTo(36.648304f, 74.351234f, 34.880817f, 75.88462f, 34.187805f, 77.95966f),
                    PathNode.CurveTo(33.494797f, 80.034706f, 33.98612f, 82.322464f, 35.47f, 83.93f),
                    PathNode.LineTo(84.06f, 140.0f),
                    PathNode.LineTo(35.47f, 196.07f),
                    PathNode.CurveTo(33.98612f, 197.67754f, 33.494797f, 199.9653f, 34.187805f, 202.04036f),
                    PathNode.CurveTo(34.880817f, 204.11539f, 36.648304f, 205.64876f, 38.80038f, 206.04198f),
                    PathNode.CurveTo(40.95246f, 206.4352f, 43.147984f, 205.6259f, 44.53f, 203.93f),
                    PathNode.LineTo(92.0f, 149.16f),
                    PathNode.LineTo(139.47f, 203.93f),
                    PathNode.CurveTo(141.6688f, 206.31201f, 145.36203f, 206.51678f, 147.81068f, 204.39247f),
                    PathNode.CurveTo(150.25932f, 202.26814f, 150.57785f, 198.58296f, 148.53f, 196.07f),
                    PathNode.LineTo(99.94f, 140.0f),
                    PathNode.LineTo(148.53f, 83.93f),
                    PathNode.CurveTo(150.69887f, 81.42761f, 150.43034f, 77.64124f, 147.93f, 75.47f),
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
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
