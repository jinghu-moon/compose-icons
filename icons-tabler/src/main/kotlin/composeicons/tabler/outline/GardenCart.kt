package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GardenCart: ImageVector
    get() {
        if (_gardenCart != null) return _gardenCart!!
        _gardenCart = tablerOutlineIcon(
            name = "GardenCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 17.5f),
                    PathNode.CurveTo(15.0f, 18.880713f, 16.119287f, 20.0f, 17.5f, 20.0f),
                    PathNode.CurveTo(18.880713f, 20.0f, 20.0f, 18.880713f, 20.0f, 17.5f),
                    PathNode.CurveTo(20.0f, 16.119287f, 18.880713f, 15.0f, 17.5f, 15.0f),
                    PathNode.CurveTo(16.119287f, 15.0f, 15.0f, 16.119287f, 15.0f, 17.5f)
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
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(6.000396f, 19.432116f, 6.278301f, 19.815098f, 6.688987f, 19.949492f),
                    PathNode.CurveTo(7.099672f, 20.083885f, 7.550225f, 19.939285f, 7.806f, 19.591f),
                    PathNode.LineTo(11.5f, 14.5f),
                    PathNode.LineTo(11.5f, 14.555f)
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
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.LineTo(17.5f, 15.0f),
                    PathNode.LineTo(10.4f, 14.253f),
                    PathNode.CurveTo(8.923899f, 14.097862f, 7.655054f, 13.138144f, 7.104f, 11.76f),
                    PathNode.LineTo(4.251f, 4.63f),
                    PathNode.CurveTo(4.099643f, 4.249957f, 3.732074f, 4.000422f, 3.323f, 4.0f),
                    PathNode.LineTo(2.0f, 4.0f)
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
        return _gardenCart!!
    }

private var _gardenCart: ImageVector? = null
