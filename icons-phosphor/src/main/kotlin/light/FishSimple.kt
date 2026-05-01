package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) return _fishSimple!!
        _fishSimple = phosphorLightIcon(
            name = "FishSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 76.0f),
                    PathNode.CurveTo(166.0f, 81.52285f, 161.52284f, 86.0f, 156.0f, 86.0f),
                    PathNode.CurveTo(150.47716f, 86.0f, 146.0f, 81.52285f, 146.0f, 76.0f),
                    PathNode.CurveTo(146.0f, 70.47715f, 150.47716f, 66.0f, 156.0f, 66.0f),
                    PathNode.CurveTo(161.52284f, 66.0f, 166.0f, 70.47715f, 166.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.38f, 153.9f),
                    PathNode.CurveTo(193.59f, 174.34f, 171.54f, 188.12f, 142.85f, 194.9f),
                    PathNode.CurveTo(122.35f, 199.71f, 98.27f, 200.9f, 70.85f, 198.58f),
                    PathNode.QuadTo(73.28f, 217.58f, 77.92f, 238.73f),
                    PathNode.CurveTo(78.26195f, 240.28558f, 77.97135f, 241.9133f, 77.11225f, 243.25447f),
                    PathNode.CurveTo(76.25315f, 244.59564f, 74.89606f, 245.54019f, 73.34f, 245.88f),
                    PathNode.CurveTo(72.91598f, 245.97101f, 72.48367f, 246.01793f, 72.05f, 246.02f),
                    PathNode.CurveTo(69.23398f, 246.01442f, 66.80074f, 244.0512f, 66.2f, 241.3f),
                    PathNode.QuadTo(61.13f, 218.17f, 58.63f, 197.3f),
                    PathNode.QuadTo(37.83f, 194.79f, 14.69f, 189.73f),
                    PathNode.CurveTo(11.45085f, 189.01201f, 9.40703f, 185.80415f, 10.125f, 182.565f),
                    PathNode.CurveTo(10.84297f, 179.32585f, 14.05085f, 177.28203f, 17.29f, 178.0f),
                    PathNode.QuadTo(38.43f, 182.63f, 57.41f, 185.07f),
                    PathNode.CurveTo(55.06f, 157.71f, 56.28f, 133.66f, 61.1f, 113.17f),
                    PathNode.CurveTo(67.84f, 84.49f, 81.61f, 62.44f, 102.0f, 47.64f),
                    PathNode.CurveTo(149.55f, 13.2f, 218.31f, 29.64f, 222.0f, 31.83f),
                    PathNode.CurveTo(222.87169f, 32.341984f, 223.59802f, 33.068314f, 224.11f, 33.94f),
                    PathNode.CurveTo(226.34f, 37.63f, 242.81f, 106.33f, 208.37f, 153.91f),
                    PathNode.Close,
                    PathNode.MoveTo(190.44f, 156.59f),
                    PathNode.CurveTo(143.6849f, 148.9992f, 107.0308f, 112.34509f, 99.44f, 65.59f),
                    PathNode.CurveTo(74.31f, 90.29f, 64.32f, 130.83f, 69.57f, 186.48f),
                    PathNode.CurveTo(125.19f, 191.71f, 165.72f, 181.73f, 190.43f, 156.6f),
                    PathNode.Close,
                    PathNode.MoveTo(214.06f, 41.93f),
                    PathNode.CurveTo(201.28f, 39.09f, 148.64f, 29.76f, 110.37f, 56.45f),
                    PathNode.CurveTo(114.450226f, 103.9008f, 152.07965f, 141.53445f, 199.53f, 145.62f),
                    PathNode.CurveTo(226.21f, 107.37f, 216.89f, 54.72f, 214.06f, 41.93f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
