package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pills: ImageVector
    get() {
        if (_pills != null) return _pills!!
        _pills = tablerOutlineIcon(
            name = "Pills",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 10.761424f, 5.238577f, 13.0f, 8.0f, 13.0f),
                    PathNode.CurveTo(10.761424f, 13.0f, 13.0f, 10.761424f, 13.0f, 8.0f),
                    PathNode.CurveTo(13.0f, 5.238577f, 10.761424f, 3.0f, 8.0f, 3.0f),
                    PathNode.CurveTo(5.238577f, 3.0f, 3.0f, 5.238577f, 3.0f, 8.0f)
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
                    PathNode.MoveTo(13.0f, 17.0f),
                    PathNode.CurveTo(13.0f, 19.209139f, 14.790861f, 21.0f, 17.0f, 21.0f),
                    PathNode.CurveTo(19.209139f, 21.0f, 21.0f, 19.209139f, 21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 14.790861f, 19.209139f, 13.0f, 17.0f, 13.0f),
                    PathNode.CurveTo(14.790861f, 13.0f, 13.0f, 14.790861f, 13.0f, 17.0f)
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
                    PathNode.MoveTo(4.5f, 4.5f),
                    PathNode.LineTo(11.5f, 11.5f)
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
                    PathNode.MoveTo(19.5f, 14.5f),
                    PathNode.LineTo(14.5f, 19.5f)
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
        return _pills!!
    }

private var _pills: ImageVector? = null
