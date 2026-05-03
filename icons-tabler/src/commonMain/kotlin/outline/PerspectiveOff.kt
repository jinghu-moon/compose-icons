package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PerspectiveOff: ImageVector
    get() {
        if (_perspectiveOff != null) return _perspectiveOff!!
        _perspectiveOff = tablerOutlineIcon(
            name = "PerspectiveOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.511f, 4.502f),
                    PathNode.LineTo(18.141f, 5.877f),
                    PathNode.CurveTo(18.633835f, 5.947191f, 18.999994f, 6.369192f, 19.0f, 6.867f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.MoveTo(18.141f, 18.123f),
                    PathNode.LineTo(6.141f, 19.837f),
                    PathNode.CurveTo(5.85408f, 19.877865f, 5.563544f, 19.792242f, 5.344641f, 19.602308f),
                    PathNode.CurveTo(5.125739f, 19.412374f, 5.000003f, 19.136816f, 5.0f, 18.847f),
                    PathNode.LineTo(5.0f, 5.153f),
                    PathNode.CurveTo(5.00019f, 5.107158f, 5.003531f, 5.061383f, 5.01f, 5.016f)
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
        return _perspectiveOff!!
    }

private var _perspectiveOff: ImageVector? = null
