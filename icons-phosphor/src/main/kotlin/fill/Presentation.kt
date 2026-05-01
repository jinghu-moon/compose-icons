package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Presentation: ImageVector
    get() {
        if (_presentation != null) return _presentation!!
        _presentation = phosphorFillIcon(
            name = "Presentation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(136.0f, 19.581722f, 132.41827f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 184.83656f, 31.163445f, 192.0f, 40.0f, 192.0f),
                    PathNode.LineTo(79.36f, 192.0f),
                    PathNode.LineTo(57.75f, 219.0f),
                    PathNode.CurveTo(54.988575f, 222.45178f, 55.54822f, 227.48857f, 59.0f, 230.25f),
                    PathNode.CurveTo(62.45178f, 233.01143f, 67.48858f, 232.45178f, 70.25f, 229.0f),
                    PathNode.LineTo(99.84f, 192.0f),
                    PathNode.LineTo(156.16f, 192.0f),
                    PathNode.LineTo(185.75f, 229.0f),
                    PathNode.CurveTo(188.51143f, 232.45178f, 193.54822f, 233.01143f, 197.0f, 230.25f),
                    PathNode.CurveTo(200.45178f, 227.48857f, 201.01143f, 222.45178f, 198.25f, 219.0f),
                    PathNode.LineTo(176.64f, 192.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(224.83656f, 192.0f, 232.0f, 184.83656f, 232.0f, 176.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
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
        return _presentation!!
    }

private var _presentation: ImageVector? = null
