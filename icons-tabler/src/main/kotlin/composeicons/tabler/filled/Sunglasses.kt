package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = tablerFilledIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 3.0f),
                    PathNode.CurveTo(8.552285f, 3.0f, 9.0f, 3.447715f, 9.0f, 4.0f),
                    PathNode.CurveTo(9.0f, 4.552285f, 8.552285f, 5.0f, 8.0f, 5.0f),
                    PathNode.LineTo(6.743f, 5.0f),
                    PathNode.LineTo(4.343f, 13.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.CurveTo(10.552285f, 13.0f, 11.0f, 13.447715f, 11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.CurveTo(13.0f, 13.447715f, 13.447715f, 13.0f, 14.0f, 13.0f),
                    PathNode.LineTo(19.656f, 13.0f),
                    PathNode.LineTo(17.256f, 5.0f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.CurveTo(15.493025f, 4.999933f, 15.066316f, 4.620493f, 15.007f, 4.117f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.CurveTo(15.0f, 3.447715f, 15.447715f, 3.0f, 16.0f, 3.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.CurveTo(18.441769f, 2.999969f, 18.831211f, 3.289817f, 18.958f, 3.713f),
                    PathNode.LineTo(21.968f, 13.749f),
                    PathNode.LineTo(21.99f, 13.861f),
                    PathNode.LineTo(21.998f, 13.941f),
                    PathNode.LineTo(22.0f, 16.5f),
                    PathNode.CurveTo(21.999357f, 18.887533f, 20.134226f, 20.858967f, 17.750393f, 20.991816f),
                    PathNode.CurveTo(15.366558f, 21.124664f, 13.293925f, 19.372677f, 13.028f, 17.0f),
                    PathNode.LineTo(10.972f, 17.0f),
                    PathNode.CurveTo(10.706075f, 19.372677f, 8.633442f, 21.124664f, 6.249608f, 20.991816f),
                    PathNode.CurveTo(3.865774f, 20.858967f, 2.000644f, 18.887533f, 2.0f, 16.5f),
                    PathNode.LineTo(2.0f, 13.982f),
                    PathNode.LineTo(2.004f, 13.911f),
                    PathNode.LineTo(2.018f, 13.808f),
                    PathNode.LineTo(2.036f, 13.732f),
                    PathNode.LineTo(5.042f, 3.712f),
                    PathNode.CurveTo(5.16915f, 3.289213f, 5.558507f, 2.999837f, 6.0f, 3.0f),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
