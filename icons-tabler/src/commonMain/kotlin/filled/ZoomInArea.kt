package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomInArea: ImageVector
    get() {
        if (_zoomInArea != null) return _zoomInArea!!
        _zoomInArea = tablerFilledIcon(
            name = "ZoomInArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.CurveTo(17.245083f, 8.999829f, 19.302423f, 10.253057f, 20.332142f, 12.248071f),
                    PathNode.CurveTo(21.36186f, 14.243085f, 21.191652f, 16.646053f, 19.891f, 18.476f),
                    PathNode.LineTo(22.707f, 21.293f),
                    PathNode.CurveTo(23.07921f, 21.666477f, 23.09748f, 22.264788f, 22.74875f, 22.660278f),
                    PathNode.CurveTo(22.400023f, 23.055767f, 21.804129f, 23.112535f, 21.387f, 22.79f),
                    PathNode.LineTo(21.293f, 22.707f),
                    PathNode.LineTo(18.476f, 19.891f),
                    PathNode.CurveTo(16.678988f, 21.168354f, 14.326182f, 21.357256f, 12.34839f, 20.382977f),
                    PathNode.CurveTo(10.370596f, 19.408695f, 9.086459f, 17.4282f, 9.004f, 15.225f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(9.004f, 14.775f),
                    PathNode.CurveTo(9.124984f, 11.551026f, 11.773757f, 8.999882f, 15.0f, 9.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.CurveTo(14.493025f, 12.000067f, 14.066316f, 12.379507f, 14.007f, 12.883f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(12.883f, 14.007f),
                    PathNode.CurveTo(12.37995f, 14.066836f, 12.001114f, 14.493402f, 12.001114f, 15.0f),
                    PathNode.CurveTo(12.001114f, 15.506598f, 12.37995f, 15.933164f, 12.883f, 15.993f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.LineTo(14.007f, 17.117f),
                    PathNode.CurveTo(14.066836f, 17.62005f, 14.493402f, 17.998886f, 15.0f, 17.998886f),
                    PathNode.CurveTo(15.506598f, 17.998886f, 15.933164f, 17.62005f, 15.993f, 17.117f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.LineTo(17.0f, 16.0f),
                    PathNode.LineTo(17.117f, 15.993f),
                    PathNode.CurveTo(17.62005f, 15.933164f, 17.998886f, 15.506598f, 17.998886f, 15.0f),
                    PathNode.CurveTo(17.998886f, 14.493402f, 17.62005f, 14.066836f, 17.117f, 14.007f),
                    PathNode.LineTo(17.0f, 14.0f),
                    PathNode.LineTo(16.0f, 14.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.LineTo(15.993f, 12.883f),
                    PathNode.CurveTo(15.933684f, 12.379507f, 15.506975f, 12.000067f, 15.0f, 12.0f),
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
                    PathNode.MoveTo(3.0f, 14.0f),
                    PathNode.CurveTo(3.506975f, 14.000067f, 3.933684f, 14.379507f, 3.993f, 14.883f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(4.000067f, 16.506975f, 4.379507f, 16.933683f, 4.883f, 16.993f),
                    PathNode.LineTo(5.0f, 17.0f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.CurveTo(6.529094f, 17.000587f, 6.966165f, 17.41321f, 6.997172f, 17.941395f),
                    PathNode.CurveTo(7.028179f, 18.46958f, 6.642391f, 18.93051f, 6.117f, 18.993f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(3.411442f, 19.000088f, 2.098195f, 17.761822f, 2.005f, 16.176f),
                    PathNode.LineTo(2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 15.0f),
                    PathNode.CurveTo(2.0f, 14.447715f, 2.447715f, 14.0f, 3.0f, 14.0f),
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
                    PathNode.MoveTo(3.0f, 9.0f),
                    PathNode.CurveTo(3.506975f, 9.000067f, 3.933684f, 9.379507f, 3.993f, 9.883f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.LineTo(4.0f, 11.0f),
                    PathNode.CurveTo(3.999413f, 11.529094f, 3.58679f, 11.966165f, 3.058605f, 11.997172f),
                    PathNode.CurveTo(2.530421f, 12.028179f, 2.069491f, 11.64239f, 2.007f, 11.117f),
                    PathNode.LineTo(2.0f, 11.0f),
                    PathNode.LineTo(2.0f, 10.0f),
                    PathNode.CurveTo(2.0f, 9.447715f, 2.447715f, 9.0f, 3.0f, 9.0f),
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
                    PathNode.MoveTo(6.0f, 2.0f),
                    PathNode.CurveTo(6.529094f, 2.000587f, 6.966165f, 2.413211f, 6.997172f, 2.941395f),
                    PathNode.CurveTo(7.028179f, 3.469579f, 6.642391f, 3.930509f, 6.117f, 3.993f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(4.493026f, 4.000067f, 4.066316f, 4.379507f, 4.007f, 4.883f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.LineTo(4.0f, 6.0f),
                    PathNode.CurveTo(3.999413f, 6.529094f, 3.58679f, 6.966165f, 3.058605f, 6.997172f),
                    PathNode.CurveTo(2.530421f, 7.028179f, 2.069491f, 6.642391f, 2.007f, 6.117f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(1.999912f, 3.411442f, 3.238179f, 2.098195f, 4.824f, 2.005f),
                    PathNode.LineTo(5.0f, 2.0f),
                    PathNode.LineTo(6.0f, 2.0f),
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
                    PathNode.MoveTo(11.0f, 2.0f),
                    PathNode.CurveTo(11.529094f, 2.000587f, 11.966165f, 2.413211f, 11.997172f, 2.941395f),
                    PathNode.CurveTo(12.028179f, 3.469579f, 11.64239f, 3.930509f, 11.117f, 3.993f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.CurveTo(9.470906f, 3.999413f, 9.033835f, 3.58679f, 9.002828f, 3.058605f),
                    PathNode.CurveTo(8.971821f, 2.530421f, 9.35761f, 2.069491f, 9.883f, 2.007f),
                    PathNode.LineTo(10.0f, 2.0f),
                    PathNode.LineTo(11.0f, 2.0f),
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
                    PathNode.MoveTo(16.0f, 2.0f),
                    PathNode.CurveTo(17.588558f, 1.999912f, 18.901804f, 3.238179f, 18.995f, 4.824f),
                    PathNode.LineTo(19.0f, 5.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(18.999413f, 6.529094f, 18.58679f, 6.966165f, 18.058605f, 6.997172f),
                    PathNode.CurveTo(17.53042f, 7.028179f, 17.06949f, 6.642391f, 17.007f, 6.117f),
                    PathNode.LineTo(17.0f, 6.0f),
                    PathNode.LineTo(17.0f, 5.0f),
                    PathNode.CurveTo(16.999933f, 4.493026f, 16.620493f, 4.066316f, 16.117f, 4.007f),
                    PathNode.LineTo(16.0f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.CurveTo(14.470906f, 3.999413f, 14.033835f, 3.58679f, 14.002828f, 3.058605f),
                    PathNode.CurveTo(13.971821f, 2.530421f, 14.35761f, 2.069491f, 14.883f, 2.007f),
                    PathNode.LineTo(15.0f, 2.0f),
                    PathNode.LineTo(16.0f, 2.0f),
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
        return _zoomInArea!!
    }

private var _zoomInArea: ImageVector? = null
