package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartPie4: ImageVector
    get() {
        if (_chartPie4 != null) return _chartPie4!!
        _chartPie4 = tablerFilledIcon(
            name = "ChartPie4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.844f, 13.57f),
                    PathNode.LineTo(16.687f, 20.834f),
                    PathNode.CurveTo(13.130675f, 22.72111f, 8.789492f, 22.291521f, 5.672f, 19.744f),
                    PathNode.Close,
                    PathNode.MoveTo(18.351f, 19.724f),
                    PathNode.LineTo(13.87f, 13.0f),
                    PathNode.LineTo(21.951f, 13.0f),
                    PathNode.CurveTo(21.698177f, 15.515522f, 20.50193f, 17.841919f, 18.603f, 19.511f),
                    PathNode.Close,
                    PathNode.MoveTo(11.001f, 2.05f),
                    PathNode.LineTo(11.001f, 11.584f),
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
        return _chartPie4!!
    }

private var _chartPie4: ImageVector? = null
