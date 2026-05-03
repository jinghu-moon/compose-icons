package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartAreaLine: ImageVector
    get() {
        if (_chartAreaLine != null) return _chartAreaLine!!
        _chartAreaLine = tablerFilledIcon(
            name = "ChartAreaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.22f, 9.375f),
                    PathNode.CurveTo(15.56143f, 8.948945f, 16.181482f, 8.875501f, 16.613f, 9.21f),
                    PathNode.LineTo(16.707f, 9.293f),
                    PathNode.LineTo(20.707f, 13.293f),
                    PathNode.CurveTo(20.862423f, 13.448553f, 20.962236f, 13.650997f, 20.991f, 13.869f),
                    PathNode.LineTo(21.0f, 14.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(20.999933f, 19.506975f, 20.620493f, 19.933683f, 20.117f, 19.993f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.LineTo(3.978f, 20.0f),
                    PathNode.LineTo(3.868f, 19.991f),
                    PathNode.LineTo(3.758f, 19.971f),
                    PathNode.LineTo(3.651f, 19.937f),
                    PathNode.LineTo(3.546f, 19.891f),
                    PathNode.LineTo(3.446f, 19.832f),
                    PathNode.LineTo(3.352f, 19.762f),
                    PathNode.LineTo(3.292f, 19.707f),
                    PathNode.LineTo(3.22f, 19.625f),
                    PathNode.LineTo(3.156f, 19.536f),
                    PathNode.LineTo(3.102f, 19.44f),
                    PathNode.LineTo(3.086f, 19.405f),
                    PathNode.LineTo(3.046f, 19.302f),
                    PathNode.LineTo(3.019f, 19.196f),
                    PathNode.LineTo(3.004f, 19.088f),
                    PathNode.LineTo(3.0f, 18.978f),
                    PathNode.LineTo(3.009f, 18.868f),
                    PathNode.LineTo(3.028f, 18.763f),
                    PathNode.CurveTo(3.038f, 18.723f, 3.05f, 18.686f, 3.063f, 18.651f),
                    PathNode.LineTo(3.109f, 18.546f),
                    PathNode.LineTo(3.168f, 18.446f),
                    PathNode.LineTo(7.168f, 12.446f),
                    PathNode.CurveTo(7.421286f, 12.064662f, 7.901176f, 11.904012f, 8.333f, 12.056f),
                    PathNode.LineTo(8.447f, 12.106f),
                    PathNode.LineTo(11.724f, 13.744f),
                    PathNode.LineTo(15.219f, 9.375f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.232f, 3.36f),
                    PathNode.CurveTo(15.576913f, 2.945634f, 16.188217f, 2.879284f, 16.614f, 3.21f),
                    PathNode.LineTo(16.707f, 3.293f),
                    PathNode.LineTo(20.707f, 7.293f),
                    PathNode.CurveTo(21.07921f, 7.666476f, 21.09748f, 8.264788f, 20.74875f, 8.660278f),
                    PathNode.CurveTo(20.400023f, 9.05577f, 19.804129f, 9.112535f, 19.387f, 8.79f),
                    PathNode.LineTo(19.293f, 8.707f),
                    PathNode.LineTo(16.067f, 5.482f),
                    PathNode.LineTo(11.768f, 10.64f),
                    PathNode.CurveTo(11.50058f, 10.960791f, 11.061964f, 11.08161f, 10.668f, 10.943f),
                    PathNode.LineTo(10.553f, 10.894f),
                    PathNode.LineTo(7.299f, 9.268f),
                    PathNode.LineTo(4.8f, 12.6f),
                    PathNode.CurveTo(4.497737f, 13.003097f, 3.942795f, 13.11837f, 3.505f, 12.869f),
                    PathNode.LineTo(3.4f, 12.8f),
                    PathNode.CurveTo(2.996904f, 12.497737f, 2.88163f, 11.942795f, 3.131f, 11.505f),
                    PathNode.LineTo(3.2f, 11.4f),
                    PathNode.LineTo(6.2f, 7.4f),
                    PathNode.CurveTo(6.463255f, 7.049357f, 6.924227f, 6.911106f, 7.337f, 7.059f),
                    PathNode.LineTo(7.447f, 7.106f),
                    PathNode.LineTo(10.738f, 8.751f),
                    PathNode.LineTo(15.232f, 3.36f),
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
        return _chartAreaLine!!
    }

private var _chartAreaLine: ImageVector? = null
