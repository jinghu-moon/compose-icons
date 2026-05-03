package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorFillIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 92.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.CurveTo(216.0f, 124.836555f, 208.83656f, 132.0f, 200.0f, 132.0f),
                    PathNode.LineTo(156.0f, 132.0f),
                    PathNode.LineTo(156.0f, 224.0f),
                    PathNode.CurveTo(156.0f, 232.83656f, 148.83656f, 240.0f, 140.0f, 240.0f),
                    PathNode.LineTo(116.0f, 240.0f),
                    PathNode.CurveTo(107.163445f, 240.0f, 100.0f, 232.83656f, 100.0f, 224.0f),
                    PathNode.LineTo(100.0f, 132.0f),
                    PathNode.LineTo(56.0f, 132.0f),
                    PathNode.CurveTo(47.163445f, 132.0f, 40.0f, 124.836555f, 40.0f, 116.0f),
                    PathNode.LineTo(40.0f, 92.0f),
                    PathNode.CurveTo(40.0f, 83.163445f, 47.163445f, 76.0f, 56.0f, 76.0f),
                    PathNode.LineTo(100.0f, 76.0f),
                    PathNode.LineTo(100.0f, 32.0f),
                    PathNode.CurveTo(100.0f, 23.163445f, 107.163445f, 16.0f, 116.0f, 16.0f),
                    PathNode.LineTo(140.0f, 16.0f),
                    PathNode.CurveTo(148.83656f, 16.0f, 156.0f, 23.163445f, 156.0f, 32.0f),
                    PathNode.LineTo(156.0f, 76.0f),
                    PathNode.LineTo(200.0f, 76.0f),
                    PathNode.CurveTo(208.83656f, 76.0f, 216.0f, 83.163445f, 216.0f, 92.0f),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
