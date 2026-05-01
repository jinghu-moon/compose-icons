package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pointer: ImageVector
    get() {
        if (_pointer != null) return _pointer!!
        _pointer = tablerOutlineIcon(
            name = "Pointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.904f, 17.563f),
                    PathNode.CurveTo(8.012911f, 18.052284f, 8.414471f, 18.422323f, 8.911007f, 18.490965f),
                    PathNode.CurveTo(9.407543f, 18.559607f, 9.894433f, 18.312386f, 10.132f, 17.871f),
                    PathNode.LineTo(12.222f, 14.778f),
                    PathNode.LineTo(17.129f, 19.685f),
                    PathNode.CurveTo(17.329103f, 19.88511f, 17.600506f, 19.997534f, 17.8835f, 19.997534f),
                    PathNode.CurveTo(18.166494f, 19.997534f, 18.437897f, 19.88511f, 18.638f, 19.685f),
                    PathNode.LineTo(19.685f, 18.638f),
                    PathNode.CurveTo(19.88511f, 18.437897f, 19.997534f, 18.166494f, 19.997534f, 17.8835f),
                    PathNode.CurveTo(19.997534f, 17.600506f, 19.88511f, 17.329103f, 19.685f, 17.129f),
                    PathNode.LineTo(14.778f, 12.222f),
                    PathNode.LineTo(17.891f, 10.132f),
                    PathNode.CurveTo(18.332384f, 9.894277f, 18.579472f, 9.407218f, 18.510603f, 8.910641f),
                    PathNode.CurveTo(18.44173f, 8.414063f, 18.071419f, 8.012631f, 17.582f, 7.904f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.LineTo(7.904f, 17.563f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pointer!!
    }

private var _pointer: ImageVector? = null
