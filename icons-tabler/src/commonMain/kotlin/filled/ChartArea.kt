package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartArea: ImageVector
    get() {
        if (_chartArea != null) return _chartArea!!
        _chartArea = tablerFilledIcon(
            name = "ChartArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.529093f, 18.000587f, 20.966166f, 18.41321f, 20.997171f, 18.941395f),
                    PathNode.CurveTo(21.02818f, 19.46958f, 20.642391f, 19.93051f, 20.117f, 19.993f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(3.470907f, 19.999413f, 3.033835f, 19.58679f, 3.002828f, 19.058605f),
                    PathNode.CurveTo(2.971821f, 18.53042f, 3.35761f, 18.06949f, 3.883f, 18.007f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.LineTo(20.0f, 18.0f),
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
                    PathNode.MoveTo(15.22f, 5.375f),
                    PathNode.CurveTo(15.56143f, 4.948945f, 16.181482f, 4.875501f, 16.613f, 5.21f),
                    PathNode.LineTo(16.707f, 5.293f),
                    PathNode.LineTo(20.707f, 9.293f),
                    PathNode.CurveTo(20.862423f, 9.448553f, 20.962236f, 9.650997f, 20.991f, 9.869f),
                    PathNode.LineTo(21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 15.0f),
                    PathNode.CurveTo(20.999933f, 15.506975f, 20.620493f, 15.933684f, 20.117f, 15.993f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.LineTo(3.978f, 16.0f),
                    PathNode.LineTo(3.868f, 15.991f),
                    PathNode.LineTo(3.758f, 15.971f),
                    PathNode.LineTo(3.651f, 15.937f),
                    PathNode.LineTo(3.546f, 15.891f),
                    PathNode.LineTo(3.446f, 15.832f),
                    PathNode.LineTo(3.352f, 15.762f),
                    PathNode.LineTo(3.292f, 15.707f),
                    PathNode.LineTo(3.22f, 15.625f),
                    PathNode.LineTo(3.156f, 15.536f),
                    PathNode.LineTo(3.102f, 15.44f),
                    PathNode.LineTo(3.086f, 15.405f),
                    PathNode.LineTo(3.046f, 15.302f),
                    PathNode.LineTo(3.019f, 15.196f),
                    PathNode.LineTo(3.004f, 15.088f),
                    PathNode.LineTo(3.0f, 14.978f),
                    PathNode.LineTo(3.009f, 14.868f),
                    PathNode.LineTo(3.028f, 14.763f),
                    PathNode.CurveTo(3.038f, 14.723f, 3.05f, 14.686f, 3.063f, 14.651f),
                    PathNode.LineTo(3.109f, 14.546f),
                    PathNode.LineTo(3.168f, 14.446f),
                    PathNode.LineTo(7.168f, 8.446f),
                    PathNode.CurveTo(7.421286f, 8.064662f, 7.901176f, 7.904012f, 8.333f, 8.056f),
                    PathNode.LineTo(8.447f, 8.106f),
                    PathNode.LineTo(11.724f, 9.744f),
                    PathNode.LineTo(15.219f, 5.375f),
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
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null
