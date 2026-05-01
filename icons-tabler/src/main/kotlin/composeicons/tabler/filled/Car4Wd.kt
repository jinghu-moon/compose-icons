package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Car4Wd: ImageVector
    get() {
        if (_car4Wd != null) return _car4Wd!!
        _car4Wd = tablerFilledIcon(
            name = "Car4Wd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.656855f, 2.0f, 20.0f, 3.343146f, 20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 7.0f),
                    PathNode.CurveTo(20.0f, 8.656855f, 18.656855f, 10.0f, 17.0f, 10.0f),
                    PathNode.CurveTo(15.343145f, 10.0f, 14.0f, 8.656855f, 14.0f, 7.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.CurveTo(14.0f, 15.343145f, 15.343145f, 14.0f, 17.0f, 14.0f),
                    PathNode.CurveTo(18.656855f, 14.0f, 20.0f, 15.343145f, 20.0f, 17.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.CurveTo(15.343145f, 22.0f, 14.0f, 20.656855f, 14.0f, 19.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.CurveTo(10.0f, 20.656855f, 8.656855f, 22.0f, 7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(4.0f, 15.343145f, 5.343146f, 14.0f, 7.0f, 14.0f),
                    PathNode.CurveTo(8.656855f, 14.0f, 10.0f, 15.343145f, 10.0f, 17.0f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(10.0f, 8.656855f, 8.656855f, 10.0f, 7.0f, 10.0f),
                    PathNode.CurveTo(5.343146f, 10.0f, 4.0f, 8.656855f, 4.0f, 7.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 3.343146f, 5.343146f, 2.0f, 7.0f, 2.0f),
                    PathNode.CurveTo(8.656855f, 2.0f, 10.0f, 3.343146f, 10.0f, 5.0f),
                    PathNode.LineTo(14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 3.343146f, 15.343145f, 2.0f, 17.0f, 2.0f)
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
        return _car4Wd!!
    }

private var _car4Wd: ImageVector? = null
