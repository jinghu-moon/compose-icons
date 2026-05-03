package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorDuotoneIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.69f, 102.47f),
                    PathNode.LineTo(174.48f, 141.47f),
                    PathNode.LineTo(195.25f, 205.47f),
                    PathNode.CurveTo(196.32445f, 208.7668f, 195.15276f, 212.38045f, 192.34819f, 214.41951f),
                    PathNode.CurveTo(189.54366f, 216.45857f, 185.74477f, 216.45877f, 182.94f, 214.42f),
                    PathNode.LineTo(128.0f, 174.91f),
                    PathNode.LineTo(73.06f, 214.44f),
                    PathNode.CurveTo(70.255226f, 216.47874f, 66.45636f, 216.47856f, 63.651806f, 214.43951f),
                    PathNode.CurveTo(60.84724f, 212.40045f, 59.675545f, 208.78679f, 60.75f, 205.49f),
                    PathNode.LineTo(81.52f, 141.49f),
                    PathNode.LineTo(27.31f, 102.49f),
                    PathNode.CurveTo(24.491941f, 100.45892f, 23.306637f, 96.84136f, 24.376343f, 93.536446f),
                    PathNode.CurveTo(25.446049f, 90.23154f, 28.526287f, 87.994606f, 32.0f, 88.0f),
                    PathNode.LineTo(98.87f, 88.0f),
                    PathNode.LineTo(120.39f, 21.68f),
                    PathNode.CurveTo(121.39216f, 18.313343f, 124.48735f, 16.005281f, 128.0f, 16.005281f),
                    PathNode.CurveTo(131.51265f, 16.005281f, 134.60785f, 18.313343f, 135.61f, 21.68f),
                    PathNode.LineTo(157.13f, 88.0f),
                    PathNode.LineTo(224.0f, 88.0f),
                    PathNode.CurveTo(227.46234f, 88.00658f, 230.52751f, 90.2397f, 231.59505f, 93.53336f),
                    PathNode.CurveTo(232.66258f, 96.82703f, 231.49017f, 100.433624f, 228.69f, 102.47f),
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
                    PathNode.MoveTo(239.2f, 91.06f),
                    PathNode.CurveTo(237.12717f, 84.424446f, 230.95143f, 79.93079f, 224.0f, 80.0f),
                    PathNode.LineTo(163.0f, 80.0f),
                    PathNode.LineTo(143.3f, 19.26f),
                    PathNode.CurveTo(141.24767f, 12.576676f, 135.07977f, 8.010753f, 128.08844f, 7.999277f),
                    PathNode.CurveTo(121.09711f, 7.9878f, 114.91427f, 12.53345f, 112.84f, 19.21f),
                    PathNode.LineTo(93.06f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(25.04112f, 79.97706f, 18.865395f, 84.45473f, 16.723783f, 91.075905f),
                    PathNode.CurveTo(14.582174f, 97.69709f, 16.965841f, 104.943275f, 22.62f, 109.0f),
                    PathNode.LineTo(72.09f, 144.59f),
                    PathNode.LineTo(53.14f, 203.0f),
                    PathNode.CurveTo(50.919487f, 209.609f, 53.302345f, 216.89175f, 59.0f, 220.91f),
                    PathNode.CurveTo(64.577576f, 225.04376f, 72.20242f, 225.04376f, 77.78f, 220.91f),
                    PathNode.LineTo(128.0f, 184.77f),
                    PathNode.LineTo(178.24f, 220.91f),
                    PathNode.CurveTo(183.85104f, 224.99146f, 191.45323f, 224.9913f, 197.06412f, 220.90964f),
                    PathNode.CurveTo(202.67499f, 216.82796f, 205.01569f, 209.59508f, 202.86f, 203.0f),
                    PathNode.LineTo(183.86f, 144.54f),
                    PathNode.LineTo(233.36f, 108.92f),
                    PathNode.CurveTo(239.03093f, 104.90499f, 241.40329f, 97.64978f, 239.2f, 91.06f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 24.15f),
                    PathNode.LineTo(146.12f, 80.0f),
                    PathNode.LineTo(109.88f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 96.0f),
                    PathNode.LineTo(87.87f, 96.0f),
                    PathNode.LineTo(77.3f, 128.58f),
                    PathNode.Close,
                    PathNode.MoveTo(68.36f, 208.0f),
                    PathNode.LineTo(68.36f, 208.0f),
                    PathNode.LineTo(85.75f, 154.41f),
                    PathNode.LineTo(114.3f, 174.95f),
                    PathNode.Close,
                    PathNode.MoveTo(90.93f, 138.43f),
                    PathNode.LineTo(104.69f, 96.0f),
                    PathNode.LineTo(151.31f, 96.0f),
                    PathNode.LineTo(165.07f, 138.39f),
                    PathNode.LineTo(128.0f, 165.06f),
                    PathNode.Close,
                    PathNode.MoveTo(187.64f, 208.0f),
                    PathNode.LineTo(187.64f, 208.0f),
                    PathNode.LineTo(141.73f, 175.0f),
                    PathNode.LineTo(170.28f, 154.46f),
                    PathNode.Close,
                    PathNode.MoveTo(178.7f, 128.62f),
                    PathNode.LineTo(168.13f, 96.0f),
                    PathNode.LineTo(224.0f, 96.0f),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
