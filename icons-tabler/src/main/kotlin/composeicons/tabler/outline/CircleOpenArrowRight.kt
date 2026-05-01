package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleOpenArrowRight: ImageVector
    get() {
        if (_circleOpenArrowRight != null) return _circleOpenArrowRight!!
        _circleOpenArrowRight = tablerOutlineIcon(
            name = "CircleOpenArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.934f, 8.002f),
                    PathNode.CurveTo(5.961641f, 3.905533f, 10.737872f, 1.979493f, 15.040036f, 3.523433f),
                    PathNode.CurveTo(19.3422f, 5.067372f, 21.80384f, 9.590904f, 20.76402f, 14.041874f),
                    PathNode.CurveTo(19.724197f, 18.492846f, 15.513184f, 21.457533f, 10.972266f, 20.93558f),
                    PathNode.CurveTo(6.431349f, 20.413626f, 3.002818f, 16.570816f, 3.0f, 12.0f),
                    PathNode.LineTo(16.0f, 12.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.LineTo(12.0f, 16.0f)
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
        return _circleOpenArrowRight!!
    }

private var _circleOpenArrowRight: ImageVector? = null
