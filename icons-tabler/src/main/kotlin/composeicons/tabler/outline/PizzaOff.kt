package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PizzaOff: ImageVector
    get() {
        if (_pizzaOff != null) return _pizzaOff!!
        _pizzaOff = tablerOutlineIcon(
            name = "PizzaOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.313f, 6.277f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(17.34f, 13.376f),
                    PathNode.MoveTo(19.817f, 19.839f),
                    PathNode.CurveTo(17.357674f, 20.937883f, 14.693662f, 21.503948f, 12.0f, 21.5f),
                    PathNode.CurveTo(8.96f, 21.5f, 6.048f, 20.786f, 3.5f, 19.517f),
                    PathNode.LineTo(8.934f, 8.958f)
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
                    PathNode.MoveTo(5.38f, 15.866f),
                    PathNode.CurveTo(7.48998f, 16.943302f, 9.82591f, 17.503378f, 12.195f, 17.5f),
                    PathNode.CurveTo(13.755f, 17.5f, 15.3f, 17.26f, 16.777f, 16.787f)
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
                    PathNode.MoveTo(11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 13.99f)
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
        return _pizzaOff!!
    }

private var _pizzaOff: ImageVector? = null
