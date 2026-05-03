package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartPieOff: ImageVector
    get() {
        if (_chartPieOff != null) return _chartPieOff!!
        _chartPieOff = tablerOutlineIcon(
            name = "ChartPieOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.63f, 5.643f),
                    PathNode.CurveTo(2.11885f, 9.161606f, 2.124894f, 14.86035f, 5.6435f, 18.3715f),
                    PathNode.CurveTo(9.162107f, 21.88265f, 14.860849f, 21.876606f, 18.372f, 18.358f),
                    PathNode.MoveTo(20.046f, 16.068f),
                    PathNode.CurveTo(20.380724f, 15.411993f, 20.633938f, 14.717502f, 20.8f, 14.0f),
                    PathNode.CurveTo(20.8f, 13.447715f, 20.352285f, 13.0f, 19.8f, 13.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.MoveTo(13.0f, 13.0f),
                    PathNode.CurveTo(11.895431f, 13.0f, 11.0f, 12.104569f, 11.0f, 11.0f),
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.CurveTo(10.974905f, 3.760692f, 10.855027f, 3.541397f, 10.667133f, 3.391083f),
                    PathNode.CurveTo(10.47924f, 3.240769f, 10.23898f, 3.171952f, 10.0f, 3.2f),
                    PathNode.CurveTo(9.28641f, 3.365037f, 8.595635f, 3.616564f, 7.943f, 3.949f)
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
                    PathNode.MoveTo(15.0f, 3.5f),
                    PathNode.CurveTo(17.571806f, 4.405564f, 19.594437f, 6.428194f, 20.5f, 9.0f),
                    PathNode.LineTo(16.0f, 9.0f),
                    PathNode.CurveTo(15.447715f, 9.0f, 15.0f, 8.552285f, 15.0f, 8.0f),
                    PathNode.LineTo(15.0f, 3.5f)
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
        return _chartPieOff!!
    }

private var _chartPieOff: ImageVector? = null
