package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChristmasTree: ImageVector
    get() {
        if (_christmasTree != null) return _christmasTree!!
        _christmasTree = tablerFilledIcon(
            name = "ChristmasTree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 19.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.CurveTo(15.0f, 21.10457f, 14.104569f, 22.0f, 13.0f, 22.0f),
                    PathNode.LineTo(11.0f, 22.0f),
                    PathNode.CurveTo(9.895431f, 22.0f, 9.0f, 21.10457f, 9.0f, 20.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.Close,
                    PathNode.MoveTo(5.0f, 18.0f),
                    PathNode.CurveTo(4.11f, 18.0f, 3.663f, 16.923f, 4.293f, 16.293f),
                    PathNode.LineTo(7.148f, 13.436f),
                    PathNode.LineTo(5.684f, 12.949f),
                    PathNode.CurveTo(5.375487f, 12.846372f, 5.136128f, 12.600161f, 5.042245f, 12.288875f),
                    PathNode.CurveTo(4.948362f, 11.977589f, 5.011677f, 11.640093f, 5.212f, 11.384f),
                    PathNode.LineTo(5.292f, 11.293f),
                    PathNode.LineTo(8.311f, 8.273f),
                    PathNode.LineTo(7.553f, 7.894f),
                    PathNode.CurveTo(7.28534f, 7.760116f, 7.091714f, 7.513388f, 7.025296f, 7.221574f),
                    PathNode.CurveTo(6.958877f, 6.929759f, 7.026649f, 6.623537f, 7.21f, 6.387f),
                    PathNode.LineTo(7.293f, 6.293f),
                    PathNode.LineTo(11.293f, 2.293f),
                    PathNode.CurveTo(11.6835f, 1.902618f, 12.3165f, 1.902618f, 12.707f, 2.293f),
                    PathNode.LineTo(16.707f, 6.293f),
                    PathNode.CurveTo(16.934061f, 6.520312f, 17.038073f, 6.842879f, 16.98657f, 7.160014f),
                    PathNode.CurveTo(16.935068f, 7.477149f, 16.734325f, 7.750224f, 16.447f, 7.894f),
                    PathNode.LineTo(15.688f, 8.273f),
                    PathNode.LineTo(18.708f, 11.293f),
                    PathNode.CurveTo(18.937584f, 11.522952f, 19.041124f, 11.850118f, 18.985641f, 12.170287f),
                    PathNode.CurveTo(18.930159f, 12.490457f, 18.722572f, 12.763706f, 18.429f, 12.903f),
                    PathNode.LineTo(18.316f, 12.949f),
                    PathNode.LineTo(16.851f, 13.436f),
                    PathNode.LineTo(19.707f, 16.293f),
                    PathNode.CurveTo(20.31f, 16.895f, 19.927f, 17.907f, 19.114f, 17.994f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _christmasTree!!
    }

private var _christmasTree: ImageVector? = null
