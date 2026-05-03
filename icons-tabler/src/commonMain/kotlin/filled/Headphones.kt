package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = tablerFilledIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.000088f, 19.588558f, 19.761822f, 20.901804f, 18.176f, 20.995f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.CurveTo(15.411443f, 21.000088f, 14.098195f, 19.761822f, 14.005f, 18.176f),
                    PathNode.LineTo(14.0f, 18.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.CurveTo(13.999911f, 13.411443f, 15.238178f, 12.098195f, 16.824f, 12.005f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.CurveTo(18.351f, 12.0f, 18.688f, 12.06f, 19.0f, 12.171f),
                    PathNode.LineTo(19.0f, 12.0f),
                    PathNode.CurveTo(19.001863f, 8.179467f, 15.939989f, 5.063118f, 12.120017f, 4.997614f),
                    PathNode.CurveTo(8.300046f, 4.93211f, 5.133126f, 7.94165f, 5.004f, 11.76f),
                    PathNode.LineTo(5.0f, 12.0f),
                    PathNode.LineTo(5.0f, 12.17f),
                    PathNode.CurveTo(5.25f, 12.082f, 5.516f, 12.026f, 5.791f, 12.007f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.CurveTo(8.588557f, 11.999911f, 9.901805f, 13.238178f, 9.995f, 14.824f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 18.0f),
                    PathNode.CurveTo(10.000089f, 19.588558f, 8.761822f, 20.901804f, 7.176f, 20.995f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.411443f, 21.000088f, 3.098195f, 19.761822f, 3.005f, 18.176f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.001791f, 7.082388f, 6.950405f, 3.076661f, 11.867484f, 3.004254f),
                    PathNode.CurveTo(16.784563f, 2.931848f, 20.849413f, 6.819573f, 20.996f, 11.735f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(21.0f, 18.0f),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
