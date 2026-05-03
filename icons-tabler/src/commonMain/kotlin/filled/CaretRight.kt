package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CaretRight: ImageVector
    get() {
        if (_caretRight != null) return _caretRight!!
        _caretRight = tablerFilledIcon(
            name = "CaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 6.0f),
                    PathNode.CurveTo(9.0f, 5.148f, 9.986f, 4.703f, 10.623f, 5.217f),
                    PathNode.LineTo(10.707f, 5.293f),
                    PathNode.LineTo(16.707f, 11.293f),
                    PathNode.CurveTo(17.063234f, 11.649268f, 17.098803f, 12.214914f, 16.79f, 12.613f),
                    PathNode.LineTo(16.707f, 12.707f),
                    PathNode.LineTo(10.707f, 18.707f),
                    PathNode.LineTo(10.613f, 18.79f),
                    PathNode.LineTo(10.536f, 18.844f),
                    PathNode.LineTo(10.44f, 18.898f),
                    PathNode.LineTo(10.404f, 18.915f),
                    PathNode.LineTo(10.337f, 18.942f),
                    PathNode.LineTo(10.229f, 18.974f),
                    PathNode.LineTo(10.176f, 18.984f),
                    PathNode.LineTo(10.116f, 18.994f),
                    PathNode.LineTo(10.059f, 18.998f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.LineTo(9.941f, 18.998f),
                    PathNode.LineTo(9.883f, 18.993f),
                    PathNode.LineTo(9.823f, 18.984f),
                    PathNode.LineTo(9.771f, 18.974f),
                    PathNode.LineTo(9.663f, 18.942f),
                    PathNode.LineTo(9.596f, 18.915f),
                    PathNode.LineTo(9.464f, 18.845f),
                    PathNode.LineTo(9.374f, 18.78f),
                    PathNode.LineTo(9.293f, 18.707f),
                    PathNode.LineTo(9.21f, 18.613f),
                    PathNode.LineTo(9.156f, 18.536f),
                    PathNode.LineTo(9.102f, 18.44f),
                    PathNode.LineTo(9.085f, 18.404f),
                    PathNode.LineTo(9.058f, 18.337f),
                    PathNode.LineTo(9.026f, 18.229f),
                    PathNode.LineTo(9.016f, 18.176f),
                    PathNode.LineTo(9.006f, 18.116f),
                    PathNode.LineTo(9.002f, 18.059f),
                    PathNode.LineTo(9.0f, 6.0f),
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
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
