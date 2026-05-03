package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowCapsule: ImageVector
    get() {
        if (_arrowCapsule != null) return _arrowCapsule!!
        _arrowCapsule = tablerOutlineIcon(
            name = "ArrowCapsule",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 15.0f),
                    PathNode.CurveTo(18.0f, 18.31371f, 15.313708f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(8.686292f, 21.0f, 6.0f, 18.31371f, 6.0f, 15.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.CurveTo(6.0f, 5.686292f, 8.686292f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(15.313708f, 3.0f, 18.0f, 5.686292f, 18.0f, 9.0f),
                    PathNode.LineTo(18.0f, 11.0f)
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
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.LineTo(21.0f, 8.0f)
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
        return _arrowCapsule!!
    }

private var _arrowCapsule: ImageVector? = null
