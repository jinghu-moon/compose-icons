package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Home2: ImageVector
    get() {
        if (_home2 != null) return _home2!!
        _home2 = tablerFilledIcon(
            name = "Home2",
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
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.CurveTo(2.11f, 13.0f, 1.663f, 11.923f, 2.293f, 11.293f),
                    PathNode.LineTo(11.293f, 2.293f),
                    PathNode.CurveTo(11.6835f, 1.902618f, 12.3165f, 1.902618f, 12.707f, 2.293f),
                    PathNode.MoveTo(13.5f, 11.0f),
                    PathNode.LineTo(10.5f, 11.0f),
                    PathNode.CurveTo(9.671573f, 11.0f, 9.0f, 11.671573f, 9.0f, 12.5f),
                    PathNode.LineTo(9.0f, 15.5f),
                    PathNode.CurveTo(9.0f, 16.328426f, 9.671573f, 17.0f, 10.5f, 17.0f),
                    PathNode.LineTo(13.5f, 17.0f),
                    PathNode.CurveTo(14.328427f, 17.0f, 15.0f, 16.328426f, 15.0f, 15.5f),
                    PathNode.LineTo(15.0f, 12.5f),
                    PathNode.CurveTo(15.0f, 11.671573f, 14.328427f, 11.0f, 13.5f, 11.0f)
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
        return _home2!!
    }

private var _home2: ImageVector? = null
