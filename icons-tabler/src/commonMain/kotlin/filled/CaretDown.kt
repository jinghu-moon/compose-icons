package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = tablerFilledIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 9.0f),
                    PathNode.CurveTo(18.852f, 9.0f, 19.297f, 9.986f, 18.783f, 10.623f),
                    PathNode.LineTo(18.707f, 10.707f),
                    PathNode.LineTo(12.707f, 16.707f),
                    PathNode.CurveTo(12.350732f, 17.063234f, 11.785086f, 17.098803f, 11.387f, 16.79f),
                    PathNode.LineTo(11.293f, 16.707f),
                    PathNode.LineTo(5.293f, 10.707f),
                    PathNode.LineTo(5.21f, 10.613f),
                    PathNode.LineTo(5.156f, 10.536f),
                    PathNode.LineTo(5.102f, 10.44f),
                    PathNode.LineTo(5.085f, 10.404f),
                    PathNode.LineTo(5.058f, 10.337f),
                    PathNode.LineTo(5.026f, 10.229f),
                    PathNode.LineTo(5.016f, 10.176f),
                    PathNode.LineTo(5.006f, 10.116f),
                    PathNode.LineTo(5.002f, 10.059f),
                    PathNode.LineTo(5.002f, 9.941f),
                    PathNode.LineTo(5.007f, 9.883f),
                    PathNode.LineTo(5.016f, 9.823f),
                    PathNode.LineTo(5.026f, 9.771f),
                    PathNode.LineTo(5.058f, 9.663f),
                    PathNode.LineTo(5.085f, 9.596f),
                    PathNode.LineTo(5.155f, 9.464f),
                    PathNode.LineTo(5.22f, 9.374f),
                    PathNode.LineTo(5.293f, 9.293f),
                    PathNode.LineTo(5.387f, 9.21f),
                    PathNode.LineTo(5.464f, 9.156f),
                    PathNode.LineTo(5.56f, 9.102f),
                    PathNode.LineTo(5.596f, 9.085f),
                    PathNode.LineTo(5.663f, 9.058f),
                    PathNode.LineTo(5.771f, 9.026f),
                    PathNode.LineTo(5.824f, 9.016f),
                    PathNode.LineTo(5.884f, 9.006f),
                    PathNode.LineTo(5.941f, 9.002f),
                    PathNode.LineTo(18.0f, 9.0f),
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
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
