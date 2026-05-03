package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutBottombarExpand: ImageVector
    get() {
        if (_layoutBottombarExpand != null) return _layoutBottombarExpand!!
        _layoutBottombarExpand = tablerFilledIcon(
            name = "LayoutBottombarExpand",
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
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(5.493026f, 5.000067f, 5.066316f, 5.379507f, 5.007f, 5.883f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(18.999933f, 5.493026f, 18.620493f, 5.066316f, 18.117f, 5.007f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.613f, 8.21f),
                    PathNode.LineTo(12.707f, 8.293f),
                    PathNode.LineTo(14.707f, 10.293f),
                    PathNode.CurveTo(15.07921f, 10.666476f, 15.097481f, 11.264788f, 14.748752f, 11.660278f),
                    PathNode.CurveTo(14.400022f, 12.05577f, 13.80413f, 12.112535f, 13.387f, 11.79f),
                    PathNode.LineTo(13.293f, 11.707f),
                    PathNode.LineTo(12.0f, 10.415f),
                    PathNode.LineTo(10.707f, 11.707f),
                    PathNode.CurveTo(10.350732f, 12.063235f, 9.785086f, 12.098803f, 9.387f, 11.79f),
                    PathNode.LineTo(9.293f, 11.707f),
                    PathNode.CurveTo(8.936765f, 11.350732f, 8.901197f, 10.785086f, 9.21f, 10.387f),
                    PathNode.LineTo(9.293f, 10.293f),
                    PathNode.LineTo(11.293f, 8.293f),
                    PathNode.CurveTo(11.649268f, 7.936765f, 12.214914f, 7.901198f, 12.613f, 8.21f),
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
        return _layoutBottombarExpand!!
    }

private var _layoutBottombarExpand: ImageVector? = null
