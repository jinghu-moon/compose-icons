package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EditCircle: ImageVector
    get() {
        if (_editCircle != null) return _editCircle!!
        _editCircle = tablerOutlineIcon(
            name = "EditCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(20.385f, 6.585f),
                    PathNode.CurveTo(21.205141f, 5.764858f, 21.205141f, 4.435143f, 20.385f, 3.615f),
                    PathNode.CurveTo(19.564857f, 2.794857f, 18.235144f, 2.794857f, 17.415f, 3.615f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(12.0f, 15.0f)
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
                    PathNode.MoveTo(16.0f, 5.0f),
                    PathNode.LineTo(19.0f, 8.0f)
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
                    PathNode.MoveTo(9.0f, 7.07f),
                    PathNode.CurveTo(5.360396f, 7.588573f, 2.74212f, 10.834309f, 3.00536f, 14.501234f),
                    PathNode.CurveTo(3.268599f, 18.16816f, 6.323644f, 21.006622f, 10.0f, 21.0f),
                    PathNode.CurveTo(13.48f, 21.000397f, 16.431858f, 18.444307f, 16.929f, 15.0f)
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
        return _editCircle!!
    }

private var _editCircle: ImageVector? = null
