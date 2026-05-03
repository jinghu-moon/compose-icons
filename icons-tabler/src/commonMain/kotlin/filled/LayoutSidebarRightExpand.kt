package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutSidebarRightExpand: ImageVector
    get() {
        if (_layoutSidebarRightExpand != null) return _layoutSidebarRightExpand!!
        _layoutSidebarRightExpand = tablerFilledIcon(
            name = "LayoutSidebarRightExpand",
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
                    PathNode.MoveTo(11.707f, 9.293f),
                    PathNode.CurveTo(12.063235f, 9.649268f, 12.098803f, 10.214914f, 11.79f, 10.613f),
                    PathNode.LineTo(11.707f, 10.707f),
                    PathNode.LineTo(10.415f, 12.0f),
                    PathNode.LineTo(11.707f, 13.293f),
                    PathNode.CurveTo(12.063235f, 13.649268f, 12.098803f, 14.214914f, 11.79f, 14.613f),
                    PathNode.LineTo(11.707f, 14.707f),
                    PathNode.CurveTo(11.350732f, 15.063235f, 10.785086f, 15.098803f, 10.387f, 14.79f),
                    PathNode.LineTo(10.293f, 14.707f),
                    PathNode.LineTo(8.293f, 12.707f),
                    PathNode.CurveTo(7.936765f, 12.350732f, 7.901198f, 11.785086f, 8.21f, 11.387f),
                    PathNode.LineTo(8.293f, 11.293f),
                    PathNode.LineTo(10.293f, 9.293f),
                    PathNode.CurveTo(10.6835f, 8.902618f, 11.3165f, 8.902618f, 11.707f, 9.293f),
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
        return _layoutSidebarRightExpand!!
    }

private var _layoutSidebarRightExpand: ImageVector? = null
