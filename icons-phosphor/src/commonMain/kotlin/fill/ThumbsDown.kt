package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorFillIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.82f, 157.0f),
                    PathNode.LineTo(227.82f, 61.0f),
                    PathNode.CurveTo(226.30775f, 48.996887f, 216.098f, 39.995846f, 204.0f, 40.0f),
                    PathNode.LineTo(32.0f, 40.0f),
                    PathNode.CurveTo(23.163445f, 40.0f, 16.0f, 47.163445f, 16.0f, 56.0f),
                    PathNode.LineTo(16.0f, 144.0f),
                    PathNode.CurveTo(16.0f, 152.83656f, 23.163445f, 160.0f, 32.0f, 160.0f),
                    PathNode.LineTo(75.06f, 160.0f),
                    PathNode.LineTo(112.84f, 235.58f),
                    PathNode.CurveTo(114.19651f, 238.29086f, 116.96868f, 240.00217f, 120.0f, 240.0f),
                    PathNode.CurveTo(142.09138f, 240.0f, 160.0f, 222.09138f, 160.0f, 200.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.CurveTo(222.88945f, 184.00237f, 229.44768f, 181.0439f, 234.00551f, 175.8776f),
                    PathNode.CurveTo(238.56334f, 170.71129f, 240.68118f, 163.83542f, 239.82f, 157.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 144.0f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
