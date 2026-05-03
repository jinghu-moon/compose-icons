package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Blade: ImageVector
    get() {
        if (_blade != null) return _blade!!
        _blade = tablerFilledIcon(
            name = "Blade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.586f, 3.0f),
                    PathNode.CurveTo(12.367f, 2.219236f, 13.633f, 2.219236f, 14.414f, 3.0f),
                    PathNode.LineTo(15.0f, 3.585f),
                    PathNode.LineTo(15.586f, 3.0f),
                    PathNode.CurveTo(16.319538f, 2.266857f, 17.491793f, 2.216059f, 18.286f, 2.883f),
                    PathNode.LineTo(18.414f, 3.0f),
                    PathNode.LineTo(21.0f, 5.586f),
                    PathNode.CurveTo(21.780764f, 6.367f, 21.780764f, 7.633001f, 21.0f, 8.414f),
                    PathNode.LineTo(20.414f, 9.0f),
                    PathNode.LineTo(21.0f, 9.586f),
                    PathNode.CurveTo(21.780764f, 10.367f, 21.780764f, 11.633f, 21.0f, 12.414f),
                    PathNode.LineTo(12.414f, 21.0f),
                    PathNode.CurveTo(11.633f, 21.780764f, 10.367f, 21.780764f, 9.586f, 21.0f),
                    PathNode.LineTo(9.0f, 20.414f),
                    PathNode.LineTo(8.414f, 21.0f),
                    PathNode.CurveTo(7.633001f, 21.780764f, 6.367f, 21.780764f, 5.586f, 21.0f),
                    PathNode.LineTo(3.0f, 18.414f),
                    PathNode.CurveTo(2.219236f, 17.633f, 2.219236f, 16.367f, 3.0f, 15.586f),
                    PathNode.LineTo(3.585f, 14.999f),
                    PathNode.LineTo(3.0f, 14.414f),
                    PathNode.CurveTo(2.266857f, 13.680463f, 2.216059f, 12.508207f, 2.883f, 11.714f),
                    PathNode.LineTo(3.0f, 11.585f),
                    PathNode.Close,
                    PathNode.MoveTo(14.613f, 7.21f),
                    PathNode.CurveTo(14.19587f, 6.887466f, 13.599978f, 6.944231f, 13.251248f, 7.339721f),
                    PathNode.CurveTo(12.902519f, 7.735213f, 12.92079f, 8.333524f, 13.293f, 8.707f),
                    PathNode.LineTo(13.585f, 9.0f),
                    PathNode.LineTo(12.517f, 10.067f),
                    PathNode.CurveTo(11.941579f, 9.913982f, 11.327909f, 10.024899f, 10.842457f, 10.369661f),
                    PathNode.CurveTo(10.357006f, 10.714424f, 10.050103f, 11.257292f, 10.005f, 11.851f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.LineTo(10.005f, 12.15f),
                    PathNode.CurveTo(10.015f, 12.275f, 10.035f, 12.398f, 10.067f, 12.517f),
                    PathNode.LineTo(9.0f, 13.585f),
                    PathNode.LineTo(8.707f, 13.293f),
                    PathNode.LineTo(8.613f, 13.21f),
                    PathNode.CurveTo(8.195871f, 12.887465f, 7.599979f, 12.94423f, 7.251249f, 13.339722f),
                    PathNode.CurveTo(6.902519f, 13.735212f, 6.920789f, 14.333524f, 7.293f, 14.707f),
                    PathNode.LineTo(7.585f, 15.0f),
                    PathNode.LineTo(7.293f, 15.293f),
                    PathNode.LineTo(7.21f, 15.387f),
                    PathNode.CurveTo(6.887466f, 15.80413f, 6.944231f, 16.400023f, 7.339721f, 16.74875f),
                    PathNode.CurveTo(7.735213f, 17.09748f, 8.333524f, 17.07921f, 8.707f, 16.707f),
                    PathNode.LineTo(9.0f, 16.415f),
                    PathNode.LineTo(9.293f, 16.707f),
                    PathNode.LineTo(9.387f, 16.79f),
                    PathNode.CurveTo(9.80413f, 17.112535f, 10.400022f, 17.055767f, 10.748752f, 16.660278f),
                    PathNode.CurveTo(11.097481f, 16.264788f, 11.07921f, 15.666476f, 10.707f, 15.293f),
                    PathNode.LineTo(10.415f, 15.0f),
                    PathNode.LineTo(11.484f, 13.933f),
                    PathNode.CurveTo(12.173947f, 14.115812f, 12.909049f, 13.917665f, 13.413648f, 13.41286f),
                    PathNode.CurveTo(13.918246f, 12.908055f, 14.116095f, 12.172873f, 13.933f, 11.483f),
                    PathNode.LineTo(15.0f, 10.415f),
                    PathNode.LineTo(15.293f, 10.707f),
                    PathNode.LineTo(15.387f, 10.79f),
                    PathNode.CurveTo(15.80413f, 11.112535f, 16.400023f, 11.05577f, 16.74875f, 10.660278f),
                    PathNode.CurveTo(17.09748f, 10.264788f, 17.07921f, 9.666476f, 16.707f, 9.293f),
                    PathNode.LineTo(16.415f, 9.0f),
                    PathNode.LineTo(16.707f, 8.707f),
                    PathNode.LineTo(16.79f, 8.613f),
                    PathNode.CurveTo(17.112535f, 8.195871f, 17.055767f, 7.599979f, 16.660278f, 7.251249f),
                    PathNode.CurveTo(16.264788f, 6.902519f, 15.666476f, 6.920789f, 15.293f, 7.293f),
                    PathNode.LineTo(15.0f, 7.585f),
                    PathNode.LineTo(14.707f, 7.293f),
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
        return _blade!!
    }

private var _blade: ImageVector? = null
