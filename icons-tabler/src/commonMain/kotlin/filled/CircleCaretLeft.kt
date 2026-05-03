package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleCaretLeft: ImageVector
    get() {
        if (_circleCaretLeft != null) return _circleCaretLeft!!
        _circleCaretLeft = tablerFilledIcon(
            name = "CircleCaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477153f, 6.477153f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(14.0f, 15.0f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.CurveTo(14.000319f, 8.595422f, 13.756825f, 8.230514f, 13.383117f, 8.075513f),
                    PathNode.CurveTo(13.009408f, 7.920513f, 12.579123f, 8.005964f, 12.293f, 8.292f),
                    PathNode.LineTo(9.293f, 11.292f),
                    PathNode.CurveTo(9.105223f, 11.479568f, 8.999713f, 11.734091f, 8.999713f, 11.9995f),
                    PathNode.CurveTo(8.999713f, 12.264909f, 9.105223f, 12.519432f, 9.293f, 12.707f),
                    PathNode.LineTo(12.293f, 15.707f),
                    PathNode.CurveTo(12.6835f, 16.097382f, 13.3165f, 16.097382f, 13.707f, 15.707f),
                    PathNode.LineTo(13.79f, 15.613f),
                    PathNode.CurveTo(13.93f, 15.433f, 14.0f, 15.217f, 14.0f, 15.0f)
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
        return _circleCaretLeft!!
    }

private var _circleCaretLeft: ImageVector? = null
