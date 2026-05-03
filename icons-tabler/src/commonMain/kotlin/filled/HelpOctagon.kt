package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpOctagon: ImageVector
    get() {
        if (_helpOctagon != null) return _helpOctagon!!
        _helpOctagon = tablerFilledIcon(
            name = "HelpOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.897f, 1.0f),
                    PathNode.CurveTo(15.879652f, 0.999947f, 16.827942f, 1.361607f, 17.561f, 2.016f),
                    PathNode.LineTo(17.726f, 2.172f),
                    PathNode.LineTo(21.826f, 6.272f),
                    PathNode.CurveTo(22.5225f, 6.967108f, 22.938341f, 7.89456f, 22.994f, 8.877f),
                    PathNode.LineTo(23.0f, 9.104f),
                    PathNode.LineTo(23.0f, 14.898f),
                    PathNode.CurveTo(23.000053f, 15.880651f, 22.638393f, 16.828941f, 21.984f, 17.562f),
                    PathNode.LineTo(21.828f, 17.727f),
                    PathNode.LineTo(17.728f, 21.827f),
                    PathNode.CurveTo(17.033398f, 22.523052f, 16.106739f, 22.938856f, 15.125f, 22.995f),
                    PathNode.LineTo(14.898f, 23.001f),
                    PathNode.LineTo(9.103f, 23.001f),
                    PathNode.CurveTo(8.120199f, 23.000872f, 7.171861f, 22.638838f, 6.439f, 21.984f),
                    PathNode.LineTo(6.274f, 21.828f),
                    PathNode.LineTo(2.174f, 17.728f),
                    PathNode.CurveTo(1.477724f, 17.033144f, 1.061902f, 16.106089f, 1.006f, 15.124f),
                    PathNode.LineTo(1.0f, 14.897f),
                    PathNode.LineTo(1.0f, 9.103f),
                    PathNode.CurveTo(0.999947f, 8.120348f, 1.361607f, 7.172058f, 2.016f, 6.439f),
                    PathNode.LineTo(2.172f, 6.274f),
                    PathNode.LineTo(6.272f, 2.174f),
                    PathNode.CurveTo(6.967108f, 1.4775f, 7.89456f, 1.06166f, 8.877f, 1.006f),
                    PathNode.LineTo(9.104f, 1.0f),
                    PathNode.LineTo(14.897f, 1.0f),
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
        return _helpOctagon!!
    }

private var _helpOctagon: ImageVector? = null
