package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorFillIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 102.0f),
                    PathNode.CurveTo(240.0f, 172.0f, 136.21f, 228.66f, 131.79f, 231.0f),
                    PathNode.CurveTo(129.42366f, 232.27296f, 126.57634f, 232.27296f, 124.21f, 231.0f),
                    PathNode.CurveTo(119.79f, 228.66f, 16.0f, 172.0f, 16.0f, 102.0f),
                    PathNode.CurveTo(16.038576f, 67.77434f, 43.774338f, 40.03858f, 78.0f, 40.0f),
                    PathNode.CurveTo(98.65f, 40.0f, 116.73f, 48.88f, 128.0f, 63.89f),
                    PathNode.CurveTo(139.27f, 48.88f, 157.35f, 40.0f, 178.0f, 40.0f),
                    PathNode.CurveTo(212.22566f, 40.03858f, 239.96143f, 67.77434f, 240.0f, 102.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _heart!!
    }

private var _heart: ImageVector? = null
