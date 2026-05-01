package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorRegularIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.0f, 40.0f),
                    PathNode.CurveTo(157.35f, 40.0f, 139.27f, 48.88f, 128.0f, 63.89f),
                    PathNode.CurveTo(116.73f, 48.88f, 98.65f, 40.0f, 78.0f, 40.0f),
                    PathNode.CurveTo(43.774338f, 40.03858f, 16.038576f, 67.77434f, 16.0f, 102.0f),
                    PathNode.CurveTo(16.0f, 172.0f, 119.79f, 228.66f, 124.21f, 231.0f),
                    PathNode.CurveTo(126.57634f, 232.27296f, 129.42366f, 232.27296f, 131.79f, 231.0f),
                    PathNode.CurveTo(136.21f, 228.66f, 240.0f, 172.0f, 240.0f, 102.0f),
                    PathNode.CurveTo(239.96143f, 67.77434f, 212.22566f, 40.03858f, 178.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 214.8f),
                    PathNode.CurveTo(109.74f, 204.16f, 32.0f, 155.69f, 32.0f, 102.0f),
                    PathNode.CurveTo(32.033054f, 76.608604f, 52.608604f, 56.033054f, 78.0f, 56.0f),
                    PathNode.CurveTo(97.45f, 56.0f, 113.78f, 66.36f, 120.6f, 83.0f),
                    PathNode.CurveTo(121.83271f, 86.00094f, 124.755745f, 87.960266f, 128.0f, 87.960266f),
                    PathNode.CurveTo(131.24426f, 87.960266f, 134.16728f, 86.00094f, 135.4f, 83.0f),
                    PathNode.CurveTo(142.22f, 66.33f, 158.55f, 56.0f, 178.0f, 56.0f),
                    PathNode.CurveTo(203.39139f, 56.033054f, 223.96695f, 76.608604f, 224.0f, 102.0f),
                    PathNode.CurveTo(224.0f, 155.61f, 146.24f, 204.15f, 128.0f, 214.8f),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
