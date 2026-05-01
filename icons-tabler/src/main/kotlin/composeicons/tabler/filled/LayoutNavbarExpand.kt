package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutNavbarExpand: ImageVector
    get() {
        if (_layoutNavbarExpand != null) return _layoutNavbarExpand!!
        _layoutNavbarExpand = tablerFilledIcon(
            name = "LayoutNavbarExpand",
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
                    PathNode.MoveTo(19.0f, 9.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(5.000067f, 18.506975f, 5.379507f, 18.933683f, 5.883f, 18.993f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.506975f, 18.999933f, 18.933683f, 18.620493f, 18.993f, 18.117f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.613f, 12.21f),
                    PathNode.LineTo(10.707f, 12.293f),
                    PathNode.LineTo(12.0f, 13.585f),
                    PathNode.LineTo(13.293f, 12.293f),
                    PathNode.CurveTo(13.649268f, 11.936765f, 14.214914f, 11.901197f, 14.613f, 12.21f),
                    PathNode.LineTo(14.707f, 12.293f),
                    PathNode.CurveTo(15.063235f, 12.649268f, 15.098803f, 13.214914f, 14.79f, 13.613f),
                    PathNode.LineTo(14.707f, 13.707f),
                    PathNode.LineTo(12.707f, 15.707f),
                    PathNode.CurveTo(12.350732f, 16.063234f, 11.785086f, 16.098803f, 11.387f, 15.79f),
                    PathNode.LineTo(11.293f, 15.707f),
                    PathNode.LineTo(9.293f, 13.707f),
                    PathNode.CurveTo(8.92079f, 13.333524f, 8.902519f, 12.735212f, 9.251248f, 12.339722f),
                    PathNode.CurveTo(9.599978f, 11.94423f, 10.19587f, 11.887465f, 10.613f, 12.21f),
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
        return _layoutNavbarExpand!!
    }

private var _layoutNavbarExpand: ImageVector? = null
