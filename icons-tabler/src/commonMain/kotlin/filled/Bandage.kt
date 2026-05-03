package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bandage: ImageVector
    get() {
        if (_bandage != null) return _bandage!!
        _bandage = tablerFilledIcon(
            name = "Bandage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.207f, 3.793f),
                    PathNode.CurveTo(22.459705f, 6.045504f, 22.538612f, 9.672658f, 20.386f, 12.021f),
                    PathNode.LineTo(20.207f, 12.207f),
                    PathNode.LineTo(12.207f, 20.207f),
                    PathNode.CurveTo(9.918559f, 22.492708f, 6.223359f, 22.53169f, 3.887207f, 20.29477f),
                    PathNode.CurveTo(1.551055f, 18.057848f, 1.429711f, 14.364436f, 3.614f, 11.979f),
                    PathNode.LineTo(3.793f, 11.793f),
                    PathNode.LineTo(11.793f, 3.793f),
                    PathNode.CurveTo(14.116554f, 1.469761f, 17.883446f, 1.469761f, 20.207f, 3.793f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.CurveTo(11.447715f, 13.0f, 11.0f, 13.447715f, 11.0f, 14.0f),
                    PathNode.LineTo(11.007f, 14.127f),
                    PathNode.CurveTo(11.06949f, 14.65239f, 11.530421f, 15.038179f, 12.058605f, 15.007172f),
                    PathNode.CurveTo(12.586789f, 14.976165f, 12.999413f, 14.539093f, 13.0f, 14.01f),
                    PathNode.LineTo(12.993f, 13.883f),
                    PathNode.CurveTo(12.933684f, 13.379507f, 12.506975f, 13.000067f, 12.0f, 13.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 11.0f),
                    PathNode.CurveTo(13.447715f, 11.0f, 13.0f, 11.447715f, 13.0f, 12.0f),
                    PathNode.LineTo(13.007f, 12.127f),
                    PathNode.CurveTo(13.06949f, 12.65239f, 13.530421f, 13.038179f, 14.058605f, 13.007172f),
                    PathNode.CurveTo(14.586789f, 12.976165f, 14.999413f, 12.539093f, 15.0f, 12.01f),
                    PathNode.LineTo(14.993f, 11.883f),
                    PathNode.CurveTo(14.933684f, 11.379507f, 14.506975f, 11.000067f, 14.0f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.0f, 11.0f),
                    PathNode.CurveTo(9.447715f, 11.0f, 9.0f, 11.447715f, 9.0f, 12.0f),
                    PathNode.LineTo(9.007f, 12.127f),
                    PathNode.CurveTo(9.06949f, 12.65239f, 9.530421f, 13.038179f, 10.058605f, 13.007172f),
                    PathNode.CurveTo(10.586789f, 12.976165f, 10.999413f, 12.539093f, 11.0f, 12.01f),
                    PathNode.LineTo(10.993f, 11.883f),
                    PathNode.CurveTo(10.933684f, 11.379507f, 10.506975f, 11.000067f, 10.0f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.CurveTo(11.447715f, 9.0f, 11.0f, 9.447715f, 11.0f, 10.0f),
                    PathNode.LineTo(11.007f, 10.127f),
                    PathNode.CurveTo(11.06949f, 10.65239f, 11.530421f, 11.038179f, 12.058605f, 11.007172f),
                    PathNode.CurveTo(12.586789f, 10.976165f, 12.999413f, 10.539093f, 13.0f, 10.01f),
                    PathNode.LineTo(12.993f, 9.883f),
                    PathNode.CurveTo(12.933684f, 9.379507f, 12.506975f, 9.000067f, 12.0f, 9.0f),
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
        return _bandage!!
    }

private var _bandage: ImageVector? = null
