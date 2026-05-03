package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GardenCartOff: ImageVector
    get() {
        if (_gardenCartOff != null) return _gardenCartOff!!
        _gardenCartOff = tablerOutlineIcon(
            name = "GardenCartOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.733f, 15.732f),
                    PathNode.CurveTo(15.099101f, 16.364307f, 14.851742f, 17.287333f, 15.084497f, 18.151894f),
                    PathNode.CurveTo(15.317253f, 19.016455f, 15.994583f, 19.690535f, 16.860252f, 19.91913f),
                    PathNode.CurveTo(17.725924f, 20.147726f, 18.647749f, 19.895931f, 19.277f, 19.259f)
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
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(6.000396f, 19.432116f, 6.278301f, 19.815098f, 6.688987f, 19.949492f),
                    PathNode.CurveTo(7.099672f, 20.083885f, 7.550225f, 19.939285f, 7.806f, 19.591f),
                    PathNode.LineTo(11.5f, 14.5f),
                    PathNode.LineTo(11.5f, 14.555f)
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
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.LineTo(18.0f, 14.01f),
                    PathNode.MoveTo(14.681f, 14.703f),
                    PathNode.LineTo(10.405f, 14.253f),
                    PathNode.CurveTo(8.928898f, 14.097862f, 7.660054f, 13.138144f, 7.109f, 11.76f),
                    PathNode.LineTo(4.256f, 4.63f),
                    PathNode.CurveTo(4.104643f, 4.249957f, 3.737075f, 4.000422f, 3.328f, 4.0f),
                    PathNode.LineTo(2.005f, 4.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
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
        return _gardenCartOff!!
    }

private var _gardenCartOff: ImageVector? = null
