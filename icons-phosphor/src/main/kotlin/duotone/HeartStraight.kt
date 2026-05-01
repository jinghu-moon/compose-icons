package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorDuotoneIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(217.36f, 133.36f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.LineTo(38.64f, 133.36f),
                    PathNode.CurveTo(19.111212f, 113.831215f, 19.111212f, 82.16879f, 38.64f, 62.64f),
                    PathNode.CurveTo(58.16879f, 43.111214f, 89.831215f, 43.111214f, 109.36f, 62.64f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.LineTo(146.64f, 62.64f),
                    PathNode.CurveTo(166.1688f, 43.11121f, 197.8312f, 43.11121f, 217.36f, 62.64f),
                    PathNode.CurveTo(236.8888f, 82.168785f, 236.8888f, 113.831215f, 217.36f, 133.36f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.0f, 57.0f),
                    PathNode.CurveTo(200.37325f, 34.42983f, 163.7618f, 34.38514f, 141.08f, 56.9f),
                    PathNode.LineTo(128.0f, 69.05f),
                    PathNode.LineTo(114.91f, 56.86f),
                    PathNode.CurveTo(92.22767f, 34.241177f, 55.503822f, 34.292664f, 32.885f, 56.975f),
                    PathNode.CurveTo(10.266178f, 79.65733f, 10.317665f, 116.38118f, 33.0f, 139.0f),
                    PathNode.LineTo(122.35f, 229.66f),
                    PathNode.CurveTo(123.85366f, 231.18686f, 125.90703f, 232.04662f, 128.05f, 232.04662f),
                    PathNode.CurveTo(130.19296f, 232.04662f, 132.24634f, 231.18686f, 133.75f, 229.66f),
                    PathNode.LineTo(223.0f, 139.0f),
                    PathNode.CurveTo(245.63416f, 116.35239f, 245.63416f, 79.64761f, 223.0f, 57.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.65f, 127.76f),
                    PathNode.LineTo(128.0f, 212.6f),
                    PathNode.LineTo(44.3f, 127.68f),
                    PathNode.CurveTo(27.897142f, 111.277145f, 27.897144f, 84.68285f, 44.3f, 68.28f),
                    PathNode.CurveTo(60.702854f, 51.877144f, 87.29714f, 51.877144f, 103.7f, 68.28f),
                    PathNode.LineTo(103.9f, 68.48f),
                    PathNode.LineTo(122.55f, 85.83f),
                    PathNode.CurveTo(125.621254f, 88.688126f, 130.37874f, 88.688126f, 133.45f, 85.83f),
                    PathNode.LineTo(152.1f, 68.48f),
                    PathNode.LineTo(152.3f, 68.28f),
                    PathNode.CurveTo(168.7139f, 51.888187f, 195.30818f, 51.906097f, 211.7f, 68.32f),
                    PathNode.CurveTo(228.09181f, 84.7339f, 228.0739f, 111.328186f, 211.66f, 127.72f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
