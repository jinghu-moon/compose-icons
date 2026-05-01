package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartCircles: ImageVector
    get() {
        if (_chartCircles != null) return _chartCircles!!
        _chartCircles = tablerOutlineIcon(
            name = "ChartCircles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 9.5f),
                    PathNode.CurveTo(4.0f, 12.537566f, 6.462434f, 15.0f, 9.5f, 15.0f),
                    PathNode.CurveTo(12.537566f, 15.0f, 15.0f, 12.537566f, 15.0f, 9.5f),
                    PathNode.CurveTo(15.0f, 6.462434f, 12.537566f, 4.0f, 9.5f, 4.0f),
                    PathNode.CurveTo(6.462434f, 4.0f, 4.0f, 6.462434f, 4.0f, 9.5f)
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
                    PathNode.MoveTo(9.0f, 14.5f),
                    PathNode.CurveTo(9.0f, 17.537565f, 11.462434f, 20.0f, 14.5f, 20.0f),
                    PathNode.CurveTo(17.537565f, 20.0f, 20.0f, 17.537565f, 20.0f, 14.5f),
                    PathNode.CurveTo(20.0f, 11.462434f, 17.537565f, 9.0f, 14.5f, 9.0f),
                    PathNode.CurveTo(11.462434f, 9.0f, 9.0f, 11.462434f, 9.0f, 14.5f)
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
        return _chartCircles!!
    }

private var _chartCircles: ImageVector? = null
