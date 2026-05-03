package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorDuotoneIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.6f, 208.0f),
                    PathNode.CurveTo(44.6f, 208.0f, 44.6f, 112.0f, 140.6f, 112.0f),
                    PathNode.CurveTo(155.84612f, 112.05481f, 170.97185f, 114.70257f, 185.33f, 119.83f),
                    PathNode.LineTo(185.33f, 119.83f),
                    PathNode.CurveTo(187.0f, 162.36f, 159.88f, 208.0f, 108.6f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(253.93f, 154.63f),
                    PathNode.CurveTo(252.61f, 153.17f, 229.84f, 128.41f, 192.93f, 114.07f),
                    PathNode.CurveTo(191.21f, 95.65f, 184.47f, 78.9f, 173.52f, 66.15f),
                    PathNode.CurveTo(158.87f, 49.0f, 137.58f, 40.0f, 112.0f, 40.0f),
                    PathNode.CurveTo(60.48f, 40.0f, 26.89f, 86.18f, 25.49f, 88.15f),
                    PathNode.CurveTo(23.108124f, 91.73908f, 23.995651f, 96.56973f, 27.497736f, 99.07777f),
                    PathNode.CurveTo(30.999823f, 101.58579f, 35.858986f, 100.87066f, 38.49f, 97.46f),
                    PathNode.CurveTo(38.8f, 97.05f, 68.81f, 56.0f, 112.0f, 56.0f),
                    PathNode.CurveTo(132.77f, 56.0f, 149.86f, 63.11f, 161.41f, 76.57f),
                    PathNode.CurveTo(168.83f, 85.21f, 173.85f, 96.26f, 176.08f, 108.57f),
                    PathNode.CurveTo(164.49559f, 105.5451f, 152.57281f, 104.009384f, 140.6f, 104.0f),
                    PathNode.CurveTo(114.54f, 104.0f, 92.67f, 110.81f, 77.34f, 123.69f),
                    PathNode.CurveTo(63.78f, 135.09f, 56.0f, 151.0f, 56.0f, 167.25f),
                    PathNode.CurveTo(55.8753f, 179.99976f, 60.87199f, 192.2663f, 69.87f, 201.3f),
                    PathNode.CurveTo(79.53f, 210.92f, 92.93f, 216.0f, 108.6f, 216.0f),
                    PathNode.CurveTo(160.41f, 216.0f, 189.78f, 173.87f, 193.09f, 131.58f),
                    PathNode.CurveTo(211.37656f, 139.7088f, 227.99225f, 151.16685f, 242.09f, 165.37f),
                    PathNode.CurveTo(245.05577f, 168.64505f, 250.11494f, 168.89577f, 253.39f, 165.93f),
                    PathNode.CurveTo(256.66504f, 162.96423f, 256.91577f, 157.90504f, 253.95f, 154.63f),
                    PathNode.Close,
                    PathNode.MoveTo(159.47f, 176.27f),
                    PathNode.CurveTo(150.64f, 187.09f, 134.66f, 200.0f, 108.6f, 200.0f),
                    PathNode.CurveTo(83.32f, 200.0f, 72.0f, 183.55f, 72.0f, 167.25f),
                    PathNode.CurveTo(72.0f, 144.49f, 93.47f, 120.0f, 140.6f, 120.0f),
                    PathNode.CurveTo(153.07553f, 120.03746f, 165.47438f, 121.95224f, 177.38f, 125.68f),
                    PathNode.CurveTo(176.93f, 144.44f, 170.46f, 162.78f, 159.47f, 176.27f),
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
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
