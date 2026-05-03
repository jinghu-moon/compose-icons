package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleOpenArrowUp: ImageVector
    get() {
        if (_circleOpenArrowUp != null) return _circleOpenArrowUp!!
        _circleOpenArrowUp = tablerOutlineIcon(
            name = "CircleOpenArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.998f, 20.066f),
                    PathNode.CurveTo(20.094467f, 18.038359f, 22.020508f, 13.262128f, 20.476568f, 8.959964f),
                    PathNode.CurveTo(18.932629f, 4.6578f, 14.409096f, 2.196159f, 9.958126f, 3.235981f),
                    PathNode.CurveTo(5.507156f, 4.275803f, 2.542467f, 8.486816f, 3.064421f, 13.027734f),
                    PathNode.CurveTo(3.586373f, 17.568651f, 7.429184f, 20.997183f, 12.0f, 21.0f),
                    PathNode.LineTo(12.0f, 8.0f)
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
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(12.0f, 8.0f),
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
        }
        return _circleOpenArrowUp!!
    }

private var _circleOpenArrowUp: ImageVector? = null
