package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartPie3: ImageVector
    get() {
        if (_chartPie3 != null) return _chartPie3!!
        _chartPie3 = tablerFilledIcon(
            name = "ChartPie3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 20.66f),
                    PathNode.CurveTo(13.400378f, 22.738283f, 8.890471f, 22.373207f, 5.672f, 19.743f),
                    PathNode.LineTo(12.414f, 13.0f),
                    PathNode.LineTo(21.95f, 13.0f),
                    PathNode.CurveTo(21.628183f, 16.200909f, 19.786074f, 19.051529f, 17.0f, 20.66f),
                    PathNode.MoveTo(11.0f, 2.05f),
                    PathNode.LineTo(11.0f, 11.584f),
                    PathNode.LineTo(4.257f, 18.328f),
                    PathNode.CurveTo(2.797403f, 16.542076f, 2.000043f, 14.3065f, 2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.167341f, 6.666553f, 6.013034f, 2.551084f, 11.0f, 2.05f),
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(19.786074f, 4.948472f, 21.628183f, 7.799091f, 21.95f, 11.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(13.0f, 2.05f),
                    PathNode.CurveTo(14.409661f, 2.19179f, 15.773103f, 2.6315f, 17.0f, 3.34f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chartPie3!!
    }

private var _chartPie3: ImageVector? = null
