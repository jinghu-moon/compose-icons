package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorFillIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.0f, 80.12f),
                    PathNode.CurveTo(229.44301f, 74.95603f, 222.88715f, 71.99861f, 216.0f, 72.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(160.0f, 33.90861f, 142.09138f, 16.0f, 120.0f, 16.0f),
                    PathNode.CurveTo(116.96868f, 15.997829f, 114.19651f, 17.70914f, 112.84f, 20.42f),
                    PathNode.LineTo(75.06f, 96.0f),
                    PathNode.LineTo(32.0f, 96.0f),
                    PathNode.CurveTo(23.163445f, 96.0f, 16.0f, 103.163445f, 16.0f, 112.0f),
                    PathNode.LineTo(16.0f, 200.0f),
                    PathNode.CurveTo(16.0f, 208.83656f, 23.163445f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(204.0f, 216.0f),
                    PathNode.CurveTo(216.098f, 216.00415f, 226.30775f, 207.00311f, 227.82f, 195.0f),
                    PathNode.LineTo(239.82f, 99.0f),
                    PathNode.CurveTo(240.6804f, 92.16297f, 238.56049f, 85.28597f, 234.0f, 80.12f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 112.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
