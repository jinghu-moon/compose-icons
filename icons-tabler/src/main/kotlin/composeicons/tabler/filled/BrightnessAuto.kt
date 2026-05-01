package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrightnessAuto: ImageVector
    get() {
        if (_brightnessAuto != null) return _brightnessAuto!!
        _brightnessAuto = tablerFilledIcon(
            name = "BrightnessAuto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.707f, 2.793f),
                    PathNode.LineTo(14.915f, 5.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.CurveTo(18.506975f, 5.000067f, 18.933683f, 5.379507f, 18.993f, 5.883f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.LineTo(19.0f, 9.085f),
                    PathNode.LineTo(21.207f, 11.293f),
                    PathNode.CurveTo(21.563234f, 11.649268f, 21.598803f, 12.214914f, 21.29f, 12.613f),
                    PathNode.LineTo(21.207f, 12.707f),
                    PathNode.LineTo(19.0f, 14.914f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(18.999933f, 18.506975f, 18.620493f, 18.933683f, 18.117f, 18.993f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.LineTo(14.914f, 19.0f),
                    PathNode.LineTo(12.707f, 21.207f),
                    PathNode.CurveTo(12.350732f, 21.563234f, 11.785086f, 21.598803f, 11.387f, 21.29f),
                    PathNode.LineTo(11.293f, 21.207f),
                    PathNode.LineTo(9.085f, 19.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(5.493026f, 18.999933f, 5.066316f, 18.620493f, 5.007f, 18.117f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.LineTo(5.0f, 14.915f),
                    PathNode.LineTo(2.793f, 12.707f),
                    PathNode.CurveTo(2.436765f, 12.350732f, 2.401198f, 11.785086f, 2.71f, 11.387f),
                    PathNode.LineTo(2.793f, 11.293f),
                    PathNode.LineTo(5.0f, 9.084f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.CurveTo(5.000067f, 5.493026f, 5.379507f, 5.066316f, 5.883f, 5.007f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.LineTo(9.084f, 5.0f),
                    PathNode.LineTo(11.293f, 2.793f),
                    PathNode.CurveTo(11.6835f, 2.402618f, 12.3165f, 2.402618f, 12.707f, 2.793f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(10.343145f, 8.0f, 9.0f, 9.343145f, 9.0f, 11.0f),
                    PathNode.LineTo(9.0f, 14.5f),
                    PathNode.CurveTo(9.0f, 15.052285f, 9.447715f, 15.5f, 10.0f, 15.5f),
                    PathNode.CurveTo(10.552285f, 15.5f, 11.0f, 15.052285f, 11.0f, 14.5f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(13.0f, 14.5f),
                    PathNode.CurveTo(13.000067f, 15.006975f, 13.379507f, 15.433684f, 13.883f, 15.493f),
                    PathNode.LineTo(14.0f, 15.5f),
                    PathNode.CurveTo(14.552285f, 15.5f, 15.0f, 15.052285f, 15.0f, 14.5f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 9.343145f, 13.656855f, 8.0f, 12.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(12.552285f, 10.0f, 13.0f, 10.447715f, 13.0f, 11.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.CurveTo(11.000067f, 10.493025f, 11.379507f, 10.066316f, 11.883f, 10.007f),
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
        return _brightnessAuto!!
    }

private var _brightnessAuto: ImageVector? = null
