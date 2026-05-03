package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpSquareRounded: ImageVector
    get() {
        if (_helpSquareRounded != null) return _helpSquareRounded!!
        _helpSquareRounded = tablerFilledIcon(
            name = "HelpSquareRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.642f, 2.005f),
                    PathNode.LineTo(13.258f, 2.022f),
                    PathNode.LineTo(13.557f, 2.035f),
                    PathNode.LineTo(14.136f, 2.069f),
                    PathNode.LineTo(14.689f, 2.115f),
                    PathNode.CurveTo(19.376f, 2.57f, 21.339f, 4.448f, 21.855f, 9.021f),
                    PathNode.LineTo(21.885f, 9.311f),
                    PathNode.LineTo(21.931f, 9.864f),
                    PathNode.LineTo(21.972f, 10.591f),
                    PathNode.LineTo(21.978f, 10.741f),
                    PathNode.LineTo(21.995f, 11.358f),
                    PathNode.LineTo(22.0f, 12.0f),
                    PathNode.LineTo(21.995f, 12.642f),
                    PathNode.LineTo(21.978f, 13.258f),
                    PathNode.LineTo(21.965f, 13.557f),
                    PathNode.LineTo(21.931f, 14.136f),
                    PathNode.LineTo(21.885f, 14.689f),
                    PathNode.CurveTo(21.43f, 19.376f, 19.552f, 21.339f, 14.979f, 21.855f),
                    PathNode.LineTo(14.689f, 21.885f),
                    PathNode.LineTo(14.136f, 21.931f),
                    PathNode.LineTo(13.409f, 21.972f),
                    PathNode.LineTo(13.259f, 21.978f),
                    PathNode.LineTo(12.642f, 21.995f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(11.358f, 21.995f),
                    PathNode.LineTo(10.742f, 21.978f),
                    PathNode.LineTo(10.443f, 21.965f),
                    PathNode.LineTo(9.864f, 21.931f),
                    PathNode.LineTo(9.311f, 21.885f),
                    PathNode.CurveTo(4.624f, 21.43f, 2.661f, 19.552f, 2.145f, 14.979f),
                    PathNode.LineTo(2.115f, 14.689f),
                    PathNode.LineTo(2.069f, 14.136f),
                    PathNode.LineTo(2.028f, 13.409f),
                    PathNode.LineTo(2.022f, 13.259f),
                    PathNode.LineTo(2.005f, 12.642f),
                    PathNode.LineTo(2.001f, 12.324f),
                    PathNode.LineTo(2.001f, 11.676f),
                    PathNode.LineTo(2.005f, 11.358f),
                    PathNode.LineTo(2.022f, 10.742f),
                    PathNode.LineTo(2.035f, 10.443f),
                    PathNode.LineTo(2.069f, 9.864f),
                    PathNode.LineTo(2.115f, 9.311f),
                    PathNode.CurveTo(2.57f, 4.624f, 4.448f, 2.661f, 9.021f, 2.145f),
                    PathNode.LineTo(9.311f, 2.115f),
                    PathNode.LineTo(9.864f, 2.069f),
                    PathNode.LineTo(10.591f, 2.028f),
                    PathNode.LineTo(10.741f, 2.022f),
                    PathNode.LineTo(11.358f, 2.005f),
                    PathNode.CurveTo(11.568f, 2.002f, 11.782f, 2.0f, 12.0f, 2.0f),
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
        return _helpSquareRounded!!
    }

private var _helpSquareRounded: ImageVector? = null
