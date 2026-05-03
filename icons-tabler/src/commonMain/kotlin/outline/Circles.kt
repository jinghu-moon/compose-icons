package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Circles: ImageVector
    get() {
        if (_circles != null) return _circles!!
        _circles = tablerOutlineIcon(
            name = "Circles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 7.0f),
                    PathNode.CurveTo(8.0f, 9.209139f, 9.790861f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(14.209139f, 11.0f, 16.0f, 9.209139f, 16.0f, 7.0f),
                    PathNode.CurveTo(16.0f, 4.790861f, 14.209139f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(9.790861f, 3.0f, 8.0f, 4.790861f, 8.0f, 7.0f)
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
                    PathNode.MoveTo(2.5f, 17.0f),
                    PathNode.CurveTo(2.5f, 19.209139f, 4.290861f, 21.0f, 6.5f, 21.0f),
                    PathNode.CurveTo(8.709139f, 21.0f, 10.5f, 19.209139f, 10.5f, 17.0f),
                    PathNode.CurveTo(10.5f, 14.790861f, 8.709139f, 13.0f, 6.5f, 13.0f),
                    PathNode.CurveTo(4.290861f, 13.0f, 2.5f, 14.790861f, 2.5f, 17.0f)
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
                    PathNode.MoveTo(13.5f, 17.0f),
                    PathNode.CurveTo(13.5f, 19.209139f, 15.290861f, 21.0f, 17.5f, 21.0f),
                    PathNode.CurveTo(19.709139f, 21.0f, 21.5f, 19.209139f, 21.5f, 17.0f),
                    PathNode.CurveTo(21.5f, 14.790861f, 19.709139f, 13.0f, 17.5f, 13.0f),
                    PathNode.CurveTo(15.290861f, 13.0f, 13.5f, 14.790861f, 13.5f, 17.0f)
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
        return _circles!!
    }

private var _circles: ImageVector? = null
