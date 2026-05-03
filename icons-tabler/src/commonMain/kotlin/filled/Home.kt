package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Home: ImageVector
    get() {
        if (_home != null) return _home!!
        _home = tablerFilledIcon(
            name = "Home",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.707f, 2.293f),
                    PathNode.LineTo(21.707f, 11.293f),
                    PathNode.CurveTo(22.337f, 11.923f, 21.891f, 13.0f, 21.0f, 13.0f),
                    PathNode.LineTo(20.0f, 13.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(16.0f, 22.0f),
                    PathNode.LineTo(16.0f, 15.0f),
                    PathNode.CurveTo(16.000088f, 13.411443f, 14.761822f, 12.098195f, 13.176f, 12.005f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.CurveTo(9.343145f, 12.0f, 8.0f, 13.343145f, 8.0f, 15.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.CurveTo(2.11f, 13.0f, 1.663f, 11.923f, 2.293f, 11.293f),
                    PathNode.LineTo(11.293f, 2.293f),
                    PathNode.CurveTo(11.6835f, 1.902618f, 12.3165f, 1.902618f, 12.707f, 2.293f),
                    PathNode.MoveTo(13.0f, 14.0f),
                    PathNode.CurveTo(13.552285f, 14.0f, 14.0f, 14.447715f, 14.0f, 15.0f),
                    PathNode.LineTo(14.0f, 22.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.CurveTo(10.000067f, 14.493025f, 10.379507f, 14.066316f, 10.883f, 14.007f),
                    PathNode.LineTo(11.0f, 14.0f),
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
        return _home!!
    }

private var _home: ImageVector? = null
