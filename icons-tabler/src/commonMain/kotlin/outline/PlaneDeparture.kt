package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) return _planeDeparture!!
        _planeDeparture = tablerOutlineIcon(
            name = "PlaneDeparture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.639f, 10.258f),
                    PathNode.LineTo(19.469f, 8.964f),
                    PathNode.CurveTo(20.16435f, 8.76318f, 20.913944f, 8.953707f, 21.42901f, 9.462184f),
                    PathNode.CurveTo(21.944075f, 9.97066f, 22.144238f, 10.717738f, 21.952387f, 11.415617f),
                    PathNode.CurveTo(21.760534f, 12.113496f, 21.20661f, 12.65327f, 20.504f, 12.827f),
                    PathNode.LineTo(6.015f, 16.71f),
                    PathNode.LineTo(1.565f, 11.69f),
                    PathNode.LineTo(4.462f, 10.914f),
                    PathNode.LineTo(6.912f, 12.328f),
                    PathNode.LineTo(9.809f, 11.552f),
                    PathNode.LineTo(6.066f, 5.308f),
                    PathNode.LineTo(8.964f, 4.531f),
                    PathNode.LineTo(14.639f, 10.258f)
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
                    PathNode.MoveTo(3.0f, 21.0f),
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
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
