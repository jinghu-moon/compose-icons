package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartPie2: ImageVector
    get() {
        if (_chartPie2 != null) return _chartPie2!!
        _chartPie2 = tablerFilledIcon(
            name = "ChartPie2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 2.05f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 12.552285f, 11.447715f, 13.0f, 12.0f, 13.0f),
                    PathNode.LineTo(21.95f, 13.0f),
                    PathNode.CurveTo(21.417793f, 18.3021f, 16.821436f, 22.255482f, 11.499375f, 21.988712f),
                    PathNode.CurveTo(6.177315f, 21.721943f, 1.999333f, 17.328741f, 2.0f, 12.0f),
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
        return _chartPie2!!
    }

private var _chartPie2: ImageVector? = null
