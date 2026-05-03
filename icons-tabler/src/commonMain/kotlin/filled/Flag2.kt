package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flag2: ImageVector
    get() {
        if (_flag2 != null) return _flag2!!
        _flag2 = tablerFilledIcon(
            name = "Flag2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(19.506975f, 4.000067f, 19.933683f, 4.379507f, 19.993f, 4.883f),
                    PathNode.LineTo(20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 14.0f),
                    PathNode.CurveTo(19.999933f, 14.506975f, 19.620493f, 14.933684f, 19.117f, 14.993f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(5.999933f, 21.506975f, 5.620493f, 21.933683f, 5.117f, 21.993f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(4.493026f, 21.999933f, 4.066316f, 21.620493f, 4.007f, 21.117f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.000067f, 4.493026f, 4.379507f, 4.066316f, 4.883f, 4.007f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.LineTo(19.0f, 4.0f),
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
        return _flag2!!
    }

private var _flag2: ImageVector? = null
