package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InfinityOff: ImageVector
    get() {
        if (_infinityOff != null) return _infinityOff!!
        _infinityOff = tablerOutlineIcon(
            name = "InfinityOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.165f, 8.174f),
                    PathNode.CurveTo(6.952615f, 7.804545f, 5.636872f, 8.031533f, 4.618358f, 8.785856f),
                    PathNode.CurveTo(3.599844f, 9.540179f, 2.99909f, 10.732572f, 2.999f, 12.0f),
                    PathNode.CurveTo(2.998941f, 13.618023f, 3.973663f, 15.076725f, 5.468573f, 15.695791f),
                    PathNode.CurveTo(6.963483f, 16.314857f, 8.684116f, 15.972346f, 9.828f, 14.828f),
                    PathNode.CurveTo(10.71558f, 14.023072f, 11.451274f, 13.06518f, 12.0f, 12.0f),
                    PathNode.MoveTo(13.677f, 9.653f),
                    PathNode.CurveTo(13.836416f, 9.487019f, 14.001514f, 9.32659f, 14.172f, 9.172f),
                    PathNode.CurveTo(15.240541f, 8.101839f, 16.821264f, 7.725798f, 18.257235f, 8.200154f),
                    PathNode.CurveTo(19.693205f, 8.674509f, 20.738884f, 9.918152f, 20.959698f, 11.414235f),
                    PathNode.CurveTo(21.180511f, 12.910318f, 20.538702f, 14.403025f, 19.301f, 15.272f),
                    PathNode.MoveTo(15.78f, 15.809f),
                    PathNode.CurveTo(15.173552f, 15.614664f, 14.622268f, 15.278339f, 14.172f, 14.828f),
                    PathNode.CurveTo(13.28442f, 14.023072f, 12.548726f, 13.06518f, 12.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _infinityOff!!
    }

private var _infinityOff: ImageVector? = null
