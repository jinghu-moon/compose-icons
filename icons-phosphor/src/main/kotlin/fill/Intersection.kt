package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Intersection: ImageVector
    get() {
        if (_intersection != null) return _intersection!!
        _intersection = phosphorFillIcon(
            name = "Intersection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 176.0f),
                    PathNode.CurveTo(184.0f, 180.41827f, 180.41827f, 184.0f, 176.0f, 184.0f),
                    PathNode.CurveTo(171.58173f, 184.0f, 168.0f, 180.41827f, 168.0f, 176.0f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.CurveTo(168.0f, 97.90861f, 150.09138f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(105.90861f, 80.0f, 88.0f, 97.90861f, 88.0f, 120.0f),
                    PathNode.LineTo(88.0f, 176.0f),
                    PathNode.CurveTo(88.0f, 180.41827f, 84.41828f, 184.0f, 80.0f, 184.0f),
                    PathNode.CurveTo(75.58172f, 184.0f, 72.0f, 180.41827f, 72.0f, 176.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.CurveTo(72.0f, 89.07206f, 97.07206f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(158.92795f, 64.0f, 184.0f, 89.07206f, 184.0f, 120.0f),
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
        return _intersection!!
    }

private var _intersection: ImageVector? = null
