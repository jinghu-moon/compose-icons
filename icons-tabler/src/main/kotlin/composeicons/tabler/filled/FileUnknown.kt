package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileUnknown: ImageVector
    get() {
        if (_fileUnknown != null) return _fileUnknown!!
        _fileUnknown = tablerFilledIcon(
            name = "FileUnknown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.117f, 2.007f),
                    PathNode.CurveTo(12.576491f, 2.061188f, 12.938812f, 2.423509f, 12.993f, 2.883f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(13.005f, 7.15f),
                    PathNode.CurveTo(13.078939f, 8.133892f, 13.859354f, 8.916854f, 14.843f, 8.994f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.LineTo(19.117f, 9.007f),
                    PathNode.CurveTo(19.57649f, 9.061188f, 19.938812f, 9.423509f, 19.993f, 9.883f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.000088f, 20.588558f, 18.761822f, 21.901804f, 17.176f, 21.995f),
                    PathNode.LineTo(17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.411443f, 22.000088f, 4.098196f, 20.761822f, 4.005f, 19.176f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(3.999912f, 3.411442f, 5.238179f, 2.098195f, 6.824f, 2.005f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.CurveTo(11.493025f, 17.000067f, 11.066316f, 17.379507f, 11.007f, 17.883f),
                    PathNode.LineTo(11.0f, 18.01f),
                    PathNode.CurveTo(11.000587f, 18.539095f, 11.413211f, 18.976164f, 11.941395f, 19.007172f),
                    PathNode.CurveTo(12.469579f, 19.03818f, 12.93051f, 18.65239f, 12.993f, 18.127f),
                    PathNode.LineTo(13.0f, 18.0f),
                    PathNode.CurveTo(13.0f, 17.447716f, 12.552285f, 17.0f, 12.0f, 17.0f),
                    PathNode.MoveTo(13.136f, 11.273f),
                    PathNode.CurveTo(12.105809f, 10.747718f, 10.84981f, 10.997512f, 10.099f, 11.877f),
                    PathNode.CurveTo(9.754318f, 12.278351f, 9.78188f, 12.878724f, 10.161886f, 13.246805f),
                    PathNode.CurveTo(10.541892f, 13.614886f, 11.142839f, 13.623299f, 11.533f, 13.266f),
                    PathNode.LineTo(11.621f, 13.176f),
                    PathNode.CurveTo(11.771029f, 12.999663f, 12.022495f, 12.949389f, 12.22879f, 13.054488f),
                    PathNode.CurveTo(12.435084f, 13.159588f, 12.542244f, 13.392568f, 12.487792f, 13.617597f),
                    PathNode.CurveTo(12.433341f, 13.842627f, 12.231523f, 14.000841f, 12.0f, 14.0f),
                    PathNode.CurveTo(11.447715f, 13.999448f, 10.999553f, 14.446715f, 10.999f, 14.999f),
                    PathNode.CurveTo(10.998447f, 15.551285f, 11.445715f, 15.999448f, 11.998f, 16.0f),
                    PathNode.CurveTo(13.153876f, 16.000467f, 14.159369f, 15.208481f, 14.429686f, 14.084658f),
                    PathNode.CurveTo(14.700002f, 12.960835f, 14.164655f, 11.798224f, 13.135f, 11.273f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 7.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.LineTo(14.999f, 2.999f),
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
        return _fileUnknown!!
    }

private var _fileUnknown: ImageVector? = null
