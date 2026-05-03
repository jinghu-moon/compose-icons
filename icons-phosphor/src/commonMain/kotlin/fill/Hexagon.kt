package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = phosphorFillIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 80.18f),
                    PathNode.LineTo(232.0f, 175.82f),
                    PathNode.CurveTo(231.98676f, 181.6546f, 228.79852f, 187.01941f, 223.68f, 189.82f),
                    PathNode.LineTo(135.68f, 237.99f),
                    PathNode.CurveTo(130.90053f, 240.63086f, 125.099464f, 240.63086f, 120.32f, 237.99f),
                    PathNode.LineTo(32.32f, 189.82f),
                    PathNode.CurveTo(27.201473f, 187.01941f, 24.013245f, 181.6546f, 24.0f, 175.82f),
                    PathNode.LineTo(24.0f, 80.18f),
                    PathNode.CurveTo(24.013245f, 74.345406f, 27.201473f, 68.9806f, 32.32f, 66.18f),
                    PathNode.LineTo(120.32f, 18.01f),
                    PathNode.CurveTo(125.099464f, 15.369137f, 130.90053f, 15.369137f, 135.68f, 18.01f),
                    PathNode.LineTo(223.68f, 66.18f),
                    PathNode.CurveTo(228.79852f, 68.9806f, 231.98676f, 74.345406f, 232.0f, 80.18f),
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
