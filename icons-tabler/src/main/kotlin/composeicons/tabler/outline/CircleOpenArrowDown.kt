package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleOpenArrowDown: ImageVector
    get() {
        if (_circleOpenArrowDown != null) return _circleOpenArrowDown!!
        _circleOpenArrowDown = tablerOutlineIcon(
            name = "CircleOpenArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.998f, 3.934f),
                    PathNode.CurveTo(20.094467f, 5.961641f, 22.020508f, 10.737872f, 20.476568f, 15.040036f),
                    PathNode.CurveTo(18.932629f, 19.3422f, 14.409096f, 21.80384f, 9.958126f, 20.76402f),
                    PathNode.CurveTo(5.507156f, 19.724197f, 2.542467f, 15.513184f, 3.064421f, 10.972266f),
                    PathNode.CurveTo(3.586373f, 6.431349f, 7.429184f, 3.002818f, 12.0f, 3.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(12.0f, 16.0f),
                    PathNode.LineTo(8.0f, 12.0f)
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
        return _circleOpenArrowDown!!
    }

private var _circleOpenArrowDown: ImageVector? = null
