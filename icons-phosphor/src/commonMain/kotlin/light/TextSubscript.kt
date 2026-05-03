package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorLightIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 208.0f),
                    PathNode.CurveTo(246.0f, 211.3137f, 243.3137f, 214.0f, 240.0f, 214.0f),
                    PathNode.LineTo(192.0f, 214.0f),
                    PathNode.CurveTo(189.72737f, 214.0f, 187.6498f, 212.71599f, 186.63344f, 210.68329f),
                    PathNode.CurveTo(185.61708f, 208.65057f, 185.83643f, 206.21811f, 187.2f, 204.4f),
                    PathNode.LineTo(230.37f, 146.84f),
                    PathNode.CurveTo(234.59915f, 141.17259f, 235.1181f, 133.55396f, 231.69652f, 127.36542f),
                    PathNode.CurveTo(228.27495f, 121.17688f, 221.5468f, 117.56509f, 214.4982f, 118.13304f),
                    PathNode.CurveTo(207.44962f, 118.70099f, 201.38657f, 123.34347f, 199.0f, 130.0f),
                    PathNode.CurveTo(198.32352f, 132.07042f, 196.57814f, 133.61162f, 194.43991f, 134.02663f),
                    PathNode.CurveTo(192.30168f, 134.44164f, 190.10648f, 133.66525f, 188.7046f, 131.99823f),
                    PathNode.CurveTo(187.30273f, 130.33119f, 186.91438f, 128.03535f, 187.69f, 126.0f),
                    PathNode.CurveTo(191.6841f, 114.9295f, 201.78236f, 107.216934f, 213.51376f, 106.27708f),
                    PathNode.CurveTo(225.24515f, 105.33722f, 236.4425f, 111.34367f, 242.14818f, 121.637085f),
                    PathNode.CurveTo(247.85385f, 131.9305f, 247.01382f, 144.60933f, 240.0f, 154.06f),
                    PathNode.LineTo(204.0f, 202.0f),
                    PathNode.LineTo(240.0f, 202.0f),
                    PathNode.CurveTo(243.3137f, 202.0f, 246.0f, 204.6863f, 246.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(147.93f, 51.47f),
                    PathNode.CurveTo(145.42761f, 49.301136f, 141.64124f, 49.56967f, 139.47f, 52.07f),
                    PathNode.LineTo(92.0f, 106.84f),
                    PathNode.LineTo(44.53f, 52.07f),
                    PathNode.CurveTo(43.147984f, 50.374092f, 40.95246f, 49.564808f, 38.80038f, 49.958023f),
                    PathNode.CurveTo(36.648304f, 50.35124f, 34.880817f, 51.884617f, 34.187805f, 53.95966f),
                    PathNode.CurveTo(33.494797f, 56.034706f, 33.98612f, 58.322468f, 35.47f, 59.93f),
                    PathNode.LineTo(84.06f, 116.0f),
                    PathNode.LineTo(35.47f, 172.07f),
                    PathNode.CurveTo(33.98612f, 173.67754f, 33.494797f, 175.9653f, 34.187805f, 178.04036f),
                    PathNode.CurveTo(34.880817f, 180.11539f, 36.648304f, 181.64876f, 38.80038f, 182.04198f),
                    PathNode.CurveTo(40.95246f, 182.4352f, 43.147984f, 181.6259f, 44.53f, 179.93f),
                    PathNode.LineTo(92.0f, 125.16f),
                    PathNode.LineTo(139.47f, 179.93f),
                    PathNode.CurveTo(141.6688f, 182.31201f, 145.36203f, 182.51678f, 147.81068f, 180.39247f),
                    PathNode.CurveTo(150.25932f, 178.26814f, 150.57785f, 174.58296f, 148.53f, 172.07f),
                    PathNode.LineTo(99.94f, 116.0f),
                    PathNode.LineTo(148.53f, 59.93f),
                    PathNode.CurveTo(150.69887f, 57.427612f, 150.43034f, 53.64124f, 147.93f, 51.47f),
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
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
