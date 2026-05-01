package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) return _swipeRight!!
        _swipeRight = tablerFilledIcon(
            name = "SwipeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 7.0f),
                    PathNode.CurveTo(10.376343f, 6.999515f, 12.424731f, 8.671669f, 12.9f, 11.0f),
                    PathNode.LineTo(17.585f, 11.0f),
                    PathNode.LineTo(16.293f, 9.707f),
                    PathNode.CurveTo(15.936765f, 9.350732f, 15.901197f, 8.785086f, 16.21f, 8.387f),
                    PathNode.LineTo(16.293f, 8.293f),
                    PathNode.CurveTo(16.6835f, 7.902618f, 17.3165f, 7.902618f, 17.707f, 8.293f),
                    PathNode.LineTo(20.707f, 11.293f),
                    PathNode.QuadTo(20.761f, 11.346f, 20.804f, 11.405f),
                    PathNode.LineTo(20.875f, 11.515f),
                    PathNode.LineTo(20.929f, 11.629f),
                    PathNode.LineTo(20.964f, 11.734f),
                    PathNode.LineTo(20.994f, 11.882f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(20.997f, 12.075f),
                    PathNode.LineTo(20.98f, 12.201f),
                    PathNode.LineTo(20.95f, 12.312f),
                    PathNode.LineTo(20.906f, 12.423f),
                    PathNode.LineTo(20.854f, 12.521f),
                    PathNode.LineTo(20.78f, 12.625f),
                    PathNode.LineTo(20.707f, 12.707f),
                    PathNode.LineTo(17.707f, 15.707f),
                    PathNode.CurveTo(17.31462f, 16.085972f, 16.690916f, 16.080553f, 16.305182f, 15.694818f),
                    PathNode.CurveTo(15.919448f, 15.309085f, 15.914028f, 14.685379f, 16.293f, 14.293f),
                    PathNode.LineTo(17.584f, 13.0f),
                    PathNode.LineTo(12.9f, 13.001f),
                    PathNode.CurveTo(12.380229f, 15.510205f, 10.048264f, 17.220802f, 7.49879f, 16.963022f),
                    PathNode.CurveTo(4.949315f, 16.705242f, 3.006969f, 14.562464f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 9.238576f, 5.238577f, 7.0f, 8.0f, 7.0f)
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
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
