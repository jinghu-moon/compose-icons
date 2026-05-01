package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tie: ImageVector
    get() {
        if (_tie != null) return _tie!!
        _tie = tablerOutlineIcon(
            name = "Tie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.LineTo(16.0f, 18.0f),
                    PathNode.LineTo(13.5f, 7.0f),
                    PathNode.LineTo(14.493f, 4.351f),
                    PathNode.CurveTo(14.608089f, 4.043972f, 14.565351f, 3.700029f, 14.378619f, 3.430505f),
                    PathNode.CurveTo(14.191888f, 3.160982f, 13.88489f, 3.000123f, 13.557f, 3.0f),
                    PathNode.LineTo(10.443f, 3.0f),
                    PathNode.CurveTo(10.11511f, 3.000123f, 9.808112f, 3.160982f, 9.621381f, 3.430505f),
                    PathNode.CurveTo(9.434649f, 3.700029f, 9.391911f, 4.043972f, 9.507f, 4.351f),
                    PathNode.LineTo(10.5f, 7.0f),
                    PathNode.LineTo(8.0f, 18.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
                    PathNode.MoveTo(10.5f, 7.0f),
                    PathNode.LineTo(13.5f, 7.0f),
                    PathNode.LineTo(18.5f, 12.5f)
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
        return _tie!!
    }

private var _tie: ImageVector? = null
