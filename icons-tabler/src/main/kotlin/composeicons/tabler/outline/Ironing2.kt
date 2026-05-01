package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ironing2: ImageVector
    get() {
        if (_ironing2 != null) return _ironing2!!
        _ironing2 = tablerOutlineIcon(
            name = "Ironing2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 15.0f),
                    PathNode.LineTo(10.01f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 6.0f),
                    PathNode.LineTo(16.459f, 6.0f),
                    PathNode.CurveTo(17.925512f, 6.000105f, 19.177004f, 7.060426f, 19.418f, 8.507f),
                    PathNode.LineTo(19.995f, 11.971f),
                    PathNode.LineTo(20.805f, 16.836f),
                    PathNode.CurveTo(20.853155f, 17.12565f, 20.771576f, 17.42183f, 20.581902f, 17.645973f),
                    PathNode.CurveTo(20.392227f, 17.870115f, 20.113626f, 17.99957f, 19.82f, 18.0f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.CurveTo(3.0f, 14.134007f, 6.134007f, 11.0f, 10.0f, 11.0f),
                    PathNode.LineTo(19.8f, 11.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 15.0f),
                    PathNode.LineTo(14.01f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _ironing2!!
    }

private var _ironing2: ImageVector? = null
