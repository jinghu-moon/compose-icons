package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SearchOff: ImageVector
    get() {
        if (_searchOff != null) return _searchOff!!
        _searchOff = tablerOutlineIcon(
            name = "SearchOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.039f, 5.062f),
                    PathNode.CurveTo(2.307952f, 7.798571f, 2.312429f, 12.230952f, 5.049001f, 14.962f),
                    PathNode.CurveTo(7.785571f, 17.693048f, 12.217952f, 17.68857f, 14.949f, 14.952f),
                    PathNode.MoveTo(16.533f, 12.518f),
                    PathNode.CurveTo(17.529833f, 9.93669f, 16.912518f, 7.010426f, 14.957938f, 5.051739f),
                    PathNode.CurveTo(13.003359f, 3.09305f, 10.078398f, 2.46959f, 7.495f, 3.461f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _searchOff!!
    }

private var _searchOff: ImageVector? = null
