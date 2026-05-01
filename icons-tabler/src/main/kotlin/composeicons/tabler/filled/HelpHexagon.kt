package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpHexagon: ImageVector
    get() {
        if (_helpHexagon != null) return _helpHexagon!!
        _helpHexagon = tablerFilledIcon(
            name = "HelpHexagon",
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
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.CurveTo(11.493025f, 15.000067f, 11.066316f, 15.379507f, 11.007f, 15.883f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.LineTo(11.007f, 16.127f),
                    PathNode.CurveTo(11.066836f, 16.63005f, 11.493402f, 17.008886f, 12.0f, 17.008886f),
                    PathNode.CurveTo(12.506598f, 17.008886f, 12.933164f, 16.63005f, 12.993f, 16.127f),
                    PathNode.LineTo(13.0f, 16.01f),
                    PathNode.LineTo(12.993f, 15.883f),
                    PathNode.CurveTo(12.933684f, 15.379507f, 12.506975f, 15.000067f, 12.0f, 15.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.368f, 8.327f),
                    PathNode.CurveTo(12.135484f, 7.696894f, 10.631351f, 7.998466f, 9.737f, 9.055f),
                    PathNode.CurveTo(9.393181f, 9.457747f, 9.42294f, 10.058702f, 9.804867f, 10.425511f),
                    PathNode.CurveTo(10.186793f, 10.792319f, 10.78846f, 10.797796f, 11.177f, 10.438f),
                    PathNode.LineTo(11.348f, 10.258f),
                    PathNode.CurveTo(11.650156f, 9.980648f, 12.093066f, 9.920795f, 12.458f, 10.108f),
                    PathNode.CurveTo(12.852452f, 10.30763f, 13.069013f, 10.742579f, 12.990579f, 11.177658f),
                    PathNode.CurveTo(12.912145f, 11.612736f, 12.557332f, 11.944681f, 12.118f, 11.994f),
                    PathNode.LineTo(11.886f, 12.006f),
                    PathNode.CurveTo(11.357866f, 12.06411f, 10.967382f, 12.525083f, 10.996914f, 13.055582f),
                    PathNode.CurveTo(11.026445f, 13.586082f, 11.465679f, 14.000867f, 11.997f, 14.0f),
                    PathNode.CurveTo(13.385754f, 14.004174f, 14.595838f, 13.054639f, 14.92207f, 11.704739f),
                    PathNode.CurveTo(15.248301f, 10.354839f, 14.605392f, 8.957489f, 13.368f, 8.327f),
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
        return _helpHexagon!!
    }

private var _helpHexagon: ImageVector? = null
