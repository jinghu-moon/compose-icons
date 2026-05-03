package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InfoHexagon: ImageVector
    get() {
        if (_infoHexagon != null) return _infoHexagon!!
        _infoHexagon = tablerFilledIcon(
            name = "InfoHexagon",
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
                    PathNode.MoveTo(12.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(10.883f, 11.007f),
                    PathNode.CurveTo(10.37995f, 11.066836f, 10.001114f, 11.493402f, 10.001114f, 12.0f),
                    PathNode.CurveTo(10.001114f, 12.506598f, 10.37995f, 12.933164f, 10.883f, 12.993f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.LineTo(11.007f, 16.117f),
                    PathNode.CurveTo(11.061188f, 16.57649f, 11.423509f, 16.938812f, 11.883f, 16.993f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.117f, 16.993f),
                    PathNode.CurveTo(13.576491f, 16.938812f, 13.938812f, 16.57649f, 13.993f, 16.117f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.LineTo(13.993f, 15.883f),
                    PathNode.CurveTo(13.944025f, 15.465035f, 13.638621f, 15.122455f, 13.229f, 15.026f),
                    PathNode.LineTo(13.117f, 15.006f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(12.993f, 11.883f),
                    PathNode.CurveTo(12.938812f, 11.423509f, 12.576491f, 11.061188f, 12.117f, 11.007f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.01f, 8.0f),
                    PathNode.LineTo(11.883f, 8.007f),
                    PathNode.CurveTo(11.37995f, 8.066837f, 11.001114f, 8.493402f, 11.001114f, 9.0f),
                    PathNode.CurveTo(11.001114f, 9.506598f, 11.37995f, 9.933164f, 11.883f, 9.993f),
                    PathNode.LineTo(12.0f, 10.0f),
                    PathNode.LineTo(12.127f, 9.993f),
                    PathNode.CurveTo(12.630051f, 9.933164f, 13.008885f, 9.506598f, 13.008885f, 9.0f),
                    PathNode.CurveTo(13.008885f, 8.493402f, 12.630051f, 8.066837f, 12.127f, 8.007f),
                    PathNode.LineTo(12.01f, 8.0f),
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
        return _infoHexagon!!
    }

private var _infoHexagon: ImageVector? = null
