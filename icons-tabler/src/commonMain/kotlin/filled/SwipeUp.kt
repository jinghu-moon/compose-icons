package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SwipeUp: ImageVector
    get() {
        if (_swipeUp != null) return _swipeUp!!
        _swipeUp = tablerFilledIcon(
            name = "SwipeUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.852f, 3.011f),
                    PathNode.LineTo(11.91f, 3.004f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(12.075f, 3.003f),
                    PathNode.LineTo(12.201f, 3.02f),
                    PathNode.LineTo(12.312f, 3.05f),
                    PathNode.LineTo(12.423f, 3.094f),
                    PathNode.LineTo(12.521f, 3.146f),
                    PathNode.LineTo(12.625f, 3.22f),
                    PathNode.LineTo(12.707f, 3.293f),
                    PathNode.LineTo(15.707f, 6.293f),
                    PathNode.CurveTo(15.966956f, 6.544075f, 16.071213f, 6.915878f, 15.979697f, 7.265507f),
                    PathNode.CurveTo(15.888182f, 7.615137f, 15.615137f, 7.888182f, 15.265508f, 7.979697f),
                    PathNode.CurveTo(14.915878f, 8.071213f, 14.544074f, 7.966957f, 14.293f, 7.707f),
                    PathNode.LineTo(13.0f, 6.415f),
                    PathNode.LineTo(13.001f, 11.1f),
                    PathNode.CurveTo(15.510205f, 11.619771f, 17.220802f, 13.951736f, 16.963022f, 16.501211f),
                    PathNode.CurveTo(16.705242f, 19.050686f, 14.562464f, 20.99303f, 12.0f, 21.0f),
                    PathNode.CurveTo(9.238576f, 21.0f, 7.0f, 18.761423f, 7.0f, 16.0f),
                    PathNode.LineTo(7.005f, 15.783f),
                    PathNode.CurveTo(7.104103f, 13.490138f, 8.751397f, 11.559155f, 11.0f, 11.1f),
                    PathNode.LineTo(11.0f, 6.415f),
                    PathNode.LineTo(9.707f, 7.707f),
                    PathNode.CurveTo(9.350732f, 8.063236f, 8.785086f, 8.098803f, 8.387f, 7.79f),
                    PathNode.LineTo(8.293f, 7.707f),
                    PathNode.CurveTo(7.902618f, 7.3165f, 7.902618f, 6.6835f, 8.293f, 6.293f),
                    PathNode.LineTo(11.293f, 3.293f),
                    PathNode.QuadTo(11.346f, 3.239f, 11.405f, 3.196f),
                    PathNode.LineTo(11.515f, 3.125f),
                    PathNode.LineTo(11.629f, 3.071f),
                    PathNode.LineTo(11.734f, 3.036f),
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
        return _swipeUp!!
    }

private var _swipeUp: ImageVector? = null
