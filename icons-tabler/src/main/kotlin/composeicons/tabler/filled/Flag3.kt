package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flag3: ImageVector
    get() {
        if (_flag3 != null) return _flag3!!
        _flag3 = tablerFilledIcon(
            name = "Flag3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(19.852f, 4.0f, 20.297f, 4.986f, 19.783f, 5.623f),
                    PathNode.LineTo(19.707f, 5.707f),
                    PathNode.LineTo(15.915f, 9.5f),
                    PathNode.LineTo(19.707f, 13.293f),
                    PathNode.CurveTo(20.31f, 13.895f, 19.927f, 14.907f, 19.114f, 14.994f),
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _flag3!!
    }

private var _flag3: ImageVector? = null
