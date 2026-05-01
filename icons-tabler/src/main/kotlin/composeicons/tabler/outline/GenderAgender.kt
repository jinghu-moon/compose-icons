package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderAgender: ImageVector
    get() {
        if (_genderAgender != null) return _genderAgender!!
        _genderAgender = tablerOutlineIcon(
            name = "GenderAgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 15.313708f, 8.686292f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(15.313708f, 18.0f, 18.0f, 15.313708f, 18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 8.686292f, 15.313708f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(8.686292f, 6.0f, 6.0f, 8.686292f, 6.0f, 12.0f)
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
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.LineTo(18.0f, 12.0f)
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
        return _genderAgender!!
    }

private var _genderAgender: ImageVector? = null
