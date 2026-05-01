package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutSidebarRightCollapse: ImageVector
    get() {
        if (_layoutSidebarRightCollapse != null) return _layoutSidebarRightCollapse!!
        _layoutSidebarRightCollapse = tablerFilledIcon(
            name = "LayoutSidebarRightCollapse",
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
                    PathNode.MoveTo(15.0f, 5.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(5.493026f, 5.000067f, 5.066316f, 5.379507f, 5.007f, 5.883f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(5.000067f, 18.506975f, 5.379507f, 18.933683f, 5.883f, 18.993f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.613f, 9.21f),
                    PathNode.LineTo(9.707f, 9.293f),
                    PathNode.LineTo(11.707f, 11.293f),
                    PathNode.CurveTo(12.063235f, 11.649268f, 12.098803f, 12.214914f, 11.79f, 12.613f),
                    PathNode.LineTo(11.707f, 12.707f),
                    PathNode.LineTo(9.707f, 14.707f),
                    PathNode.CurveTo(9.333524f, 15.07921f, 8.735212f, 15.097481f, 8.339722f, 14.748752f),
                    PathNode.CurveTo(7.944231f, 14.400022f, 7.887466f, 13.80413f, 8.21f, 13.387f),
                    PathNode.LineTo(8.293f, 13.293f),
                    PathNode.LineTo(9.585f, 12.0f),
                    PathNode.LineTo(8.293f, 10.707f),
                    PathNode.CurveTo(7.936765f, 10.350732f, 7.901198f, 9.785086f, 8.21f, 9.387f),
                    PathNode.LineTo(8.293f, 9.293f),
                    PathNode.CurveTo(8.649268f, 8.936765f, 9.214914f, 8.901197f, 9.613f, 9.21f),
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
        return _layoutSidebarRightCollapse!!
    }

private var _layoutSidebarRightCollapse: ImageVector? = null
