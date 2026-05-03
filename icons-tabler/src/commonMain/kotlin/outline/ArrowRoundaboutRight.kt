package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRoundaboutRight: ImageVector
    get() {
        if (_arrowRoundaboutRight != null) return _arrowRoundaboutRight!!
        _arrowRoundaboutRight = tablerOutlineIcon(
            name = "ArrowRoundaboutRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.CurveTo(13.0f, 6.238577f, 10.761424f, 4.0f, 8.0f, 4.0f),
                    PathNode.CurveTo(5.238577f, 4.0f, 3.0f, 6.238577f, 3.0f, 9.0f),
                    PathNode.CurveTo(3.0f, 11.761424f, 5.238577f, 14.0f, 8.0f, 14.0f),
                    PathNode.LineTo(8.0f, 21.0f)
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
                    PathNode.MoveTo(17.0f, 5.0f),
                    PathNode.LineTo(21.0f, 9.0f),
                    PathNode.LineTo(17.0f, 13.0f)
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
        return _arrowRoundaboutRight!!
    }

private var _arrowRoundaboutRight: ImageVector? = null
