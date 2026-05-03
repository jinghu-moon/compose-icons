package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleOpenArrowLeft: ImageVector
    get() {
        if (_circleOpenArrowLeft != null) return _circleOpenArrowLeft!!
        _circleOpenArrowLeft = tablerOutlineIcon(
            name = "CircleOpenArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.066f, 8.002f),
                    PathNode.CurveTo(18.038359f, 3.905533f, 13.262128f, 1.979493f, 8.959964f, 3.523433f),
                    PathNode.CurveTo(4.6578f, 5.067372f, 2.196159f, 9.590904f, 3.235981f, 14.041874f),
                    PathNode.CurveTo(4.275803f, 18.492846f, 8.486816f, 21.457533f, 13.027734f, 20.93558f),
                    PathNode.CurveTo(17.568651f, 20.413626f, 20.997183f, 16.570816f, 21.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(12.0f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circleOpenArrowLeft!!
    }

private var _circleOpenArrowLeft: ImageVector? = null
