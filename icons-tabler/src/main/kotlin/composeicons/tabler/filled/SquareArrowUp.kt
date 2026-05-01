package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareArrowUp: ImageVector
    get() {
        if (_squareArrowUp != null) return _squareArrowUp!!
        _squareArrowUp = tablerFilledIcon(
            name = "SquareArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(20.656855f, 2.0f, 22.0f, 3.343146f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.656855f, 20.656855f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.343146f, 22.0f, 2.0f, 20.656855f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.343146f, 3.343146f, 2.0f, 5.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(11.91f, 7.004f),
                    PathNode.LineTo(11.852f, 7.011f),
                    PathNode.LineTo(11.734f, 7.036f),
                    PathNode.LineTo(11.629f, 7.071f),
                    PathNode.LineTo(11.516f, 7.125f),
                    PathNode.LineTo(11.405f, 7.196f),
                    PathNode.CurveTo(11.365337f, 7.225542f, 11.327903f, 7.257963f, 11.293f, 7.293f),
                    PathNode.LineTo(7.293f, 11.293f),
                    PathNode.LineTo(7.21f, 11.387f),
                    PathNode.CurveTo(6.901198f, 11.785086f, 6.936765f, 12.350732f, 7.293f, 12.707f),
                    PathNode.LineTo(7.387f, 12.79f),
                    PathNode.CurveTo(7.785085f, 13.098803f, 8.350732f, 13.063235f, 8.707f, 12.707f),
                    PathNode.LineTo(11.0f, 10.415f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.LineTo(11.007f, 16.117f),
                    PathNode.CurveTo(11.06949f, 16.642391f, 11.530421f, 17.02818f, 12.058605f, 16.997171f),
                    PathNode.CurveTo(12.586789f, 16.966166f, 12.999413f, 16.529093f, 13.0f, 16.0f),
                    PathNode.LineTo(13.0f, 10.415f),
                    PathNode.LineTo(15.293f, 12.707f),
                    PathNode.LineTo(15.387f, 12.79f),
                    PathNode.CurveTo(15.80413f, 13.112535f, 16.400023f, 13.05577f, 16.74875f, 12.660278f),
                    PathNode.CurveTo(17.09748f, 12.264788f, 17.07921f, 11.666476f, 16.707f, 11.293f),
                    PathNode.LineTo(12.707f, 7.293f),
                    PathNode.LineTo(12.625f, 7.22f),
                    PathNode.LineTo(12.521f, 7.146f),
                    PathNode.LineTo(12.423f, 7.094f),
                    PathNode.LineTo(12.313f, 7.05f),
                    PathNode.LineTo(12.201f, 7.02f),
                    PathNode.LineTo(12.075f, 7.003f),
                    PathNode.LineTo(12.0f, 7.0f),
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
        return _squareArrowUp!!
    }

private var _squareArrowUp: ImageVector? = null
