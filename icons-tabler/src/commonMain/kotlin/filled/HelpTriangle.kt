package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpTriangle: ImageVector
    get() {
        if (_helpTriangle != null) return _helpTriangle!!
        _helpTriangle = tablerFilledIcon(
            name = "HelpTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.67f),
                    PathNode.CurveTo(12.955f, 1.67f, 13.845f, 2.137f, 14.39f, 2.917f),
                    PathNode.LineTo(14.495f, 3.077f),
                    PathNode.LineTo(22.609f, 16.625f),
                    PathNode.CurveTo(23.110249f, 17.493143f, 23.130072f, 18.557983f, 22.661482f, 19.444181f),
                    PathNode.CurveTo(22.192894f, 20.330378f, 21.301685f, 20.913498f, 20.302f, 20.988f),
                    PathNode.LineTo(20.107f, 20.996f),
                    PathNode.LineTo(3.882f, 20.996f),
                    PathNode.CurveTo(2.881341f, 20.98474f, 1.956459f, 20.460794f, 1.432368f, 19.608282f),
                    PathNode.CurveTo(0.908277f, 18.755772f, 0.8583f, 17.693968f, 1.3f, 16.796f),
                    PathNode.LineTo(1.399f, 16.611f),
                    PathNode.LineTo(9.509f, 3.073f),
                    PathNode.CurveTo(10.037102f, 2.202159f, 10.981543f, 1.670224f, 12.0f, 1.67f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _helpTriangle!!
    }

private var _helpTriangle: ImageVector? = null
