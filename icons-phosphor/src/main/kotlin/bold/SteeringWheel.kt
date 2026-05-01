package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorBoldIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 144.0f),
                    PathNode.CurveTo(144.0f, 152.83656f, 136.83656f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(119.163445f, 160.0f, 112.0f, 152.83656f, 112.0f, 144.0f),
                    PathNode.CurveTo(112.0f, 135.16344f, 119.163445f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(136.83656f, 128.0f, 144.0f, 135.16344f, 144.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 187.64676f, 187.64676f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(68.35325f, 236.0f, 20.0f, 187.64676f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 68.35325f, 68.35325f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(187.61934f, 20.066133f, 235.93387f, 68.38066f, 236.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.55f, 156.0f),
                    PathNode.LineTo(207.18f, 156.0f),
                    PathNode.CurveTo(207.97f, 153.79f, 208.67f, 151.53f, 209.27f, 149.24f),
                    PathNode.CurveTo(164.14711f, 104.93587f, 91.85289f, 104.93587f, 46.73f, 149.24f),
                    PathNode.QuadTo(47.63f, 152.68f, 48.82f, 156.0f),
                    PathNode.LineTo(90.45f, 156.0f),
                    PathNode.CurveTo(98.78752f, 156.02225f, 106.24299f, 161.19688f, 109.18f, 169.0f),
                    PathNode.LineTo(125.24f, 211.93f),
                    PathNode.CurveTo(126.16f, 211.93f, 127.07f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(128.93f, 212.0f, 129.82f, 212.0f, 130.72f, 211.93f),
                    PathNode.LineTo(146.82f, 168.93f),
                    PathNode.CurveTo(149.78452f, 161.15811f, 157.23193f, 156.01689f, 165.55f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.41f, 119.73f),
                    PathNode.CurveTo(94.00362f, 82.755714f, 161.99638f, 82.755714f, 211.59f, 119.73f),
                    PathNode.CurveTo(207.32875f, 76.75908f, 171.18169f, 44.019264f, 128.0f, 44.019264f),
                    PathNode.CurveTo(84.81831f, 44.019264f, 48.67124f, 76.75908f, 44.41f, 119.73f),
                    PathNode.Close,
                    PathNode.MoveTo(97.49f, 206.24f),
                    PathNode.LineTo(87.68f, 180.0f),
                    PathNode.LineTo(62.1f, 180.0f),
                    PathNode.CurveTo(71.3675f, 191.72356f, 83.57965f, 200.77827f, 97.49f, 206.24f),
                    PathNode.Close,
                    PathNode.MoveTo(193.9f, 180.0f),
                    PathNode.LineTo(168.32f, 180.0f),
                    PathNode.LineTo(158.48f, 206.25f),
                    PathNode.CurveTo(172.40498f, 200.79474f, 184.6292f, 191.73529f, 193.9f, 180.0f),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
