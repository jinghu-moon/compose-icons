package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Circle: ImageVector
    get() {
        if (_circle != null) return _circle!!
        _circle = tablerFilledIcon(
            name = "Circle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 3.34f),
                    PathNode.CurveTo(10.893687f, 1.092121f, 15.808843f, 1.719113f, 19.013529f, 4.872484f),
                    PathNode.CurveTo(22.218218f, 8.025853f, 22.924465f, 12.930247f, 20.739729f, 16.85971f),
                    PathNode.CurveTo(18.554993f, 20.789177f, 14.016456f, 22.777529f, 9.646723f, 21.71961f),
                    PathNode.CurveTo(5.27699f, 20.66169f, 2.150494f, 16.817617f, 2.005f, 12.324f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.11715f, 8.220726f, 4.006017f, 5.068456f, 7.0f, 3.34f),
                    PathNode.Close
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
        return _circle!!
    }

private var _circle: ImageVector? = null
