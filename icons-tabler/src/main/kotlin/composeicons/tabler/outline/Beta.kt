package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Beta: ImageVector
    get() {
        if (_beta != null) return _beta!!
        _beta = tablerOutlineIcon(
            name = "Beta",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 22.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.CurveTo(8.0f, 5.790861f, 9.790861f, 4.0f, 12.0f, 4.0f),
                    PathNode.LineTo(12.5f, 4.0f),
                    PathNode.CurveTo(14.432997f, 4.0f, 16.0f, 5.567004f, 16.0f, 7.5f),
                    PathNode.CurveTo(16.0f, 9.432997f, 14.432997f, 11.0f, 12.5f, 11.0f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.LineTo(12.5f, 11.0f),
                    PathNode.CurveTo(14.985281f, 11.0f, 17.0f, 13.014719f, 17.0f, 15.5f),
                    PathNode.CurveTo(17.0f, 17.98528f, 14.985281f, 20.0f, 12.5f, 20.0f),
                    PathNode.CurveTo(10.014719f, 20.0f, 8.0f, 17.98528f, 8.0f, 15.5f),
                    PathNode.LineTo(8.0f, 15.0f)
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
        return _beta!!
    }

private var _beta: ImageVector? = null
