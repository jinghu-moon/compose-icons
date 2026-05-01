package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Award: ImageVector
    get() {
        if (_award != null) return _award!!
        _award = tablerOutlineIcon(
            name = "Award",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 9.0f),
                    PathNode.CurveTo(6.0f, 12.313708f, 8.686292f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(15.313708f, 15.0f, 18.0f, 12.313708f, 18.0f, 9.0f),
                    PathNode.CurveTo(18.0f, 5.686292f, 15.313708f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(8.686292f, 3.0f, 6.0f, 5.686292f, 6.0f, 9.0f)
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
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(15.4f, 20.89f),
                    PathNode.LineTo(16.998f, 17.657f),
                    PathNode.LineTo(20.596f, 17.889f),
                    PathNode.LineTo(17.196f, 12.0f)
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
                    PathNode.MoveTo(6.802f, 12.0f),
                    PathNode.LineTo(3.402f, 17.89f),
                    PathNode.LineTo(7.0f, 17.657f),
                    PathNode.LineTo(8.598f, 20.889f),
                    PathNode.LineTo(11.998f, 15.0f)
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
        return _award!!
    }

private var _award: ImageVector? = null
