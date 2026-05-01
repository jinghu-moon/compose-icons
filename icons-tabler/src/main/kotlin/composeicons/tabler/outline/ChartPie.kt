package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = tablerOutlineIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 3.2f),
                    PathNode.CurveTo(5.670017f, 4.203791f, 2.721258f, 8.21823f, 3.058442f, 12.650233f),
                    PathNode.CurveTo(3.395626f, 17.082237f, 6.917764f, 20.604374f, 11.349767f, 20.941557f),
                    PathNode.CurveTo(15.78177f, 21.278742f, 19.79621f, 18.329983f, 20.8f, 14.0f),
                    PathNode.CurveTo(20.8f, 13.447715f, 20.352285f, 13.0f, 19.8f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.CurveTo(11.895431f, 13.0f, 11.0f, 12.104569f, 11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.CurveTo(10.974905f, 3.760692f, 10.855027f, 3.541397f, 10.667133f, 3.391083f),
                    PathNode.CurveTo(10.47924f, 3.240769f, 10.23898f, 3.171952f, 10.0f, 3.2f)
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
                    PathNode.MoveTo(15.0f, 3.5f),
                    PathNode.CurveTo(17.571806f, 4.405564f, 19.594437f, 6.428194f, 20.5f, 9.0f),
                    PathNode.LineTo(16.0f, 9.0f),
                    PathNode.CurveTo(15.447715f, 9.0f, 15.0f, 8.552285f, 15.0f, 8.0f),
                    PathNode.LineTo(15.0f, 3.5f)
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
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
