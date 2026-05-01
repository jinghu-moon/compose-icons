package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutBottombar: ImageVector
    get() {
        if (_layoutBottombar != null) return _layoutBottombar!!
        _layoutBottombar = tablerFilledIcon(
            name = "LayoutBottombar",
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
        return _layoutBottombar!!
    }

private var _layoutBottombar: ImageVector? = null
