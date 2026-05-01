package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertHexagon: ImageVector
    get() {
        if (_alertHexagon != null) return _alertHexagon!!
        _alertHexagon = tablerFilledIcon(
            name = "AlertHexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.425f, 1.414f),
                    PathNode.CurveTo(11.35981f, 0.898502f, 12.485094f, 0.86243f, 13.451f, 1.317f),
                    PathNode.LineTo(13.641f, 1.414f),
                    PathNode.LineTo(20.416f, 5.409f),
                    PathNode.LineTo(20.512f, 5.472f),
                    PathNode.LineTo(20.604f, 5.549f),
                    PathNode.LineTo(20.711f, 5.624f),
                    PathNode.CurveTo(21.413254f, 6.150586f, 21.870443f, 6.940738f, 21.977f, 7.812f),
                    PathNode.LineTo(21.995f, 8.014f),
                    PathNode.LineTo(22.0f, 8.218001f),
                    PathNode.LineTo(22.0f, 15.502f),
                    PathNode.CurveTo(22.0f, 16.608f, 21.43f, 17.631f, 20.546f, 18.195f),
                    PathNode.LineTo(20.376f, 18.295f),
                    PathNode.LineTo(13.573f, 22.597f),
                    PathNode.CurveTo(12.655f, 23.101f, 11.554f, 23.132f, 10.569f, 22.665f),
                    PathNode.LineTo(10.373f, 22.565f),
                    PathNode.LineTo(3.678f, 18.328f),
                    PathNode.CurveTo(2.709511f, 17.798483f, 2.079107f, 16.810434f, 2.007f, 15.709f),
                    PathNode.LineTo(2.0f, 15.502f),
                    PathNode.LineTo(2.0f, 8.217f),
                    PathNode.CurveTo(2.0f, 7.111f, 2.57f, 6.089f, 3.476f, 5.512f),
                    PathNode.LineTo(10.426f, 1.414f),
                    PathNode.Close,
                    PathNode.MoveTo(12.01f, 15.0f),
                    PathNode.LineTo(11.883f, 15.007f),
                    PathNode.CurveTo(11.37995f, 15.066836f, 11.001114f, 15.493402f, 11.001114f, 16.0f),
                    PathNode.CurveTo(11.001114f, 16.506598f, 11.37995f, 16.933163f, 11.883f, 16.993f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(12.127f, 16.993f),
                    PathNode.CurveTo(12.630051f, 16.933163f, 13.008885f, 16.506598f, 13.008885f, 16.0f),
                    PathNode.CurveTo(13.008885f, 15.493402f, 12.630051f, 15.066836f, 12.127f, 15.007f),
                    PathNode.LineTo(12.01f, 15.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(11.493025f, 7.000067f, 11.066316f, 7.379507f, 11.007f, 7.883f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(11.007f, 12.117f),
                    PathNode.CurveTo(11.066836f, 12.62005f, 11.493402f, 12.998886f, 12.0f, 12.998886f),
                    PathNode.CurveTo(12.506598f, 12.998886f, 12.933164f, 12.62005f, 12.993f, 12.117f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(12.993f, 7.883f),
                    PathNode.CurveTo(12.933684f, 7.379507f, 12.506975f, 7.000067f, 12.0f, 7.0f),
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
        return _alertHexagon!!
    }

private var _alertHexagon: ImageVector? = null
