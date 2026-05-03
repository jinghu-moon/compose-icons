package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutSidebarLeftExpand: ImageVector
    get() {
        if (_layoutSidebarLeftExpand != null) return _layoutSidebarLeftExpand!!
        _layoutSidebarLeftExpand = tablerFilledIcon(
            name = "LayoutSidebarLeftExpand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.CurveTo(19.588558f, 2.999912f, 20.901804f, 4.238179f, 20.995f, 5.824f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.000088f, 19.588558f, 19.761822f, 20.901804f, 18.176f, 20.995f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.411443f, 21.000088f, 3.098195f, 19.761822f, 3.005f, 18.176f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(2.999912f, 4.411443f, 4.238179f, 3.098195f, 5.824f, 3.005f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 5.0f),
                    PathNode.LineTo(9.0f, 5.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.506975f, 18.999933f, 18.933683f, 18.620493f, 18.993f, 18.117f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(18.999933f, 5.493026f, 18.620493f, 5.066316f, 18.117f, 5.007f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.613f, 9.21f),
                    PathNode.LineTo(13.707f, 9.293f),
                    PathNode.LineTo(15.707f, 11.293f),
                    PathNode.CurveTo(16.063234f, 11.649268f, 16.098803f, 12.214914f, 15.79f, 12.613f),
                    PathNode.LineTo(15.707f, 12.707f),
                    PathNode.LineTo(13.707f, 14.707f),
                    PathNode.CurveTo(13.333524f, 15.07921f, 12.735212f, 15.097481f, 12.339722f, 14.748752f),
                    PathNode.CurveTo(11.94423f, 14.400022f, 11.887465f, 13.80413f, 12.21f, 13.387f),
                    PathNode.LineTo(12.293f, 13.293f),
                    PathNode.LineTo(13.585f, 12.0f),
                    PathNode.LineTo(12.293f, 10.707f),
                    PathNode.CurveTo(11.936765f, 10.350732f, 11.901197f, 9.785086f, 12.21f, 9.387f),
                    PathNode.LineTo(12.293f, 9.293f),
                    PathNode.CurveTo(12.649268f, 8.936765f, 13.214914f, 8.901197f, 13.613f, 9.21f),
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
        return _layoutSidebarLeftExpand!!
    }

private var _layoutSidebarLeftExpand: ImageVector? = null
