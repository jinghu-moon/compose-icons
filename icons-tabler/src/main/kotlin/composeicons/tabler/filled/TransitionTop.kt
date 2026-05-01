package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TransitionTop: ImageVector
    get() {
        if (_transitionTop != null) return _transitionTop!!
        _transitionTop = tablerFilledIcon(
            name = "TransitionTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.LineTo(12.081f, 6.003f),
                    PathNode.LineTo(12.201f, 6.02f),
                    PathNode.LineTo(12.312f, 6.05f),
                    PathNode.LineTo(12.423f, 6.094f),
                    PathNode.LineTo(12.521f, 6.146f),
                    PathNode.LineTo(12.625f, 6.22f),
                    PathNode.LineTo(12.707f, 6.293f),
                    PathNode.LineTo(15.707f, 9.293f),
                    PathNode.CurveTo(15.966956f, 9.544074f, 16.071213f, 9.915878f, 15.979697f, 10.265508f),
                    PathNode.CurveTo(15.888182f, 10.615137f, 15.615137f, 10.888182f, 15.265508f, 10.979697f),
                    PathNode.CurveTo(14.915878f, 11.071213f, 14.544074f, 10.966956f, 14.293f, 10.707f),
                    PathNode.LineTo(13.0f, 9.415f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.CurveTo(20.209139f, 14.0f, 22.0f, 15.790861f, 22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 20.209139f, 20.209139f, 22.0f, 18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(3.790861f, 22.0f, 2.0f, 20.209139f, 2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 15.790861f, 3.790861f, 14.0f, 6.0f, 14.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 9.415f),
                    PathNode.LineTo(9.707f, 10.707f),
                    PathNode.CurveTo(9.350732f, 11.063235f, 8.785086f, 11.098803f, 8.387f, 10.79f),
                    PathNode.LineTo(8.293f, 10.707f),
                    PathNode.CurveTo(7.902618f, 10.3165f, 7.902618f, 9.6835f, 8.293f, 9.293f),
                    PathNode.LineTo(11.293f, 6.293f),
                    PathNode.LineTo(11.405f, 6.196f),
                    PathNode.LineTo(11.515f, 6.125f),
                    PathNode.LineTo(11.577f, 6.094f),
                    PathNode.LineTo(11.658f, 6.06f),
                    PathNode.LineTo(11.734f, 6.036f),
                    PathNode.LineTo(11.852f, 6.011f),
                    PathNode.LineTo(11.91f, 6.004f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.CurveTo(20.209139f, 2.0f, 22.0f, 3.790861f, 22.0f, 6.0f),
                    PathNode.CurveTo(21.999413f, 6.529094f, 21.58679f, 6.966165f, 21.058605f, 6.997172f),
                    PathNode.CurveTo(20.53042f, 7.028179f, 20.06949f, 6.642391f, 20.007f, 6.117f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.CurveTo(20.0f, 4.895431f, 19.10457f, 4.0f, 18.0f, 4.0f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.CurveTo(4.895431f, 4.0f, 4.0f, 4.895431f, 4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 6.552285f, 3.552285f, 7.0f, 3.0f, 7.0f),
                    PathNode.CurveTo(2.447715f, 7.0f, 2.0f, 6.552285f, 2.0f, 6.0f),
                    PathNode.CurveTo(2.0f, 3.790861f, 3.790861f, 2.0f, 6.0f, 2.0f),
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
        return _transitionTop!!
    }

private var _transitionTop: ImageVector? = null
