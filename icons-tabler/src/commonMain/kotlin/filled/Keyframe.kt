package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Keyframe: ImageVector
    get() {
        if (_keyframe != null) return _keyframe!!
        _keyframe = tablerFilledIcon(
            name = "Keyframe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(11.223883f, 4.004372f, 10.490333f, 4.355376f, 10.0f, 4.957f),
                    PathNode.LineTo(5.645f, 10.197f),
                    PathNode.CurveTo(4.789071f, 11.242685f, 4.786146f, 12.745992f, 5.638f, 13.795f),
                    PathNode.LineTo(10.006f, 19.051f),
                    PathNode.CurveTo(10.505f, 19.651f, 11.231f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(12.776117f, 19.995628f, 13.509667f, 19.644625f, 14.0f, 19.043f),
                    PathNode.LineTo(18.355f, 13.803f),
                    PathNode.CurveTo(19.21093f, 12.757315f, 19.213854f, 11.254008f, 18.362f, 10.205f),
                    PathNode.LineTo(13.994f, 4.949f),
                    PathNode.CurveTo(13.503983f, 4.351302f, 12.772883f, 4.003351f, 12.0f, 4.0f),
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
        return _keyframe!!
    }

private var _keyframe: ImageVector? = null
