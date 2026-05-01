package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = tablerFilledIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.883f, 5.007f),
                    PathNode.LineTo(13.941f, 5.002f),
                    PathNode.LineTo(14.059f, 5.002f),
                    PathNode.LineTo(14.117f, 5.007f),
                    PathNode.LineTo(14.177f, 5.016f),
                    PathNode.LineTo(14.229f, 5.026f),
                    PathNode.LineTo(14.337f, 5.058f),
                    PathNode.LineTo(14.404f, 5.085f),
                    PathNode.LineTo(14.536f, 5.155f),
                    PathNode.LineTo(14.626f, 5.22f),
                    PathNode.LineTo(14.707f, 5.293f),
                    PathNode.LineTo(14.79f, 5.387f),
                    PathNode.LineTo(14.844f, 5.464f),
                    PathNode.LineTo(14.898f, 5.56f),
                    PathNode.LineTo(14.915f, 5.596f),
                    PathNode.LineTo(14.942f, 5.663f),
                    PathNode.LineTo(14.974f, 5.771f),
                    PathNode.LineTo(14.984f, 5.824f),
                    PathNode.LineTo(14.994f, 5.884f),
                    PathNode.LineTo(14.998f, 5.941f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.LineTo(15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 18.852f, 14.014f, 19.297f, 13.377f, 18.783f),
                    PathNode.LineTo(13.293f, 18.707f),
                    PathNode.LineTo(7.293f, 12.707f),
                    PathNode.CurveTo(6.936765f, 12.350732f, 6.901198f, 11.785086f, 7.21f, 11.387f),
                    PathNode.LineTo(7.293f, 11.293f),
                    PathNode.LineTo(13.293f, 5.293f),
                    PathNode.LineTo(13.387f, 5.21f),
                    PathNode.LineTo(13.464f, 5.156f),
                    PathNode.LineTo(13.56f, 5.102f),
                    PathNode.LineTo(13.596f, 5.085f),
                    PathNode.LineTo(13.663f, 5.058f),
                    PathNode.LineTo(13.771f, 5.026f),
                    PathNode.LineTo(13.824f, 5.016f),
                    PathNode.LineTo(13.884f, 5.006f),
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
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
