package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRotatedForbid: ImageVector
    get() {
        if (_squareRotatedForbid != null) return _squareRotatedForbid!!
        _squareRotatedForbid = tablerOutlineIcon(
            name = "SquareRotatedForbid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.446f, 2.6f),
                    PathNode.LineTo(21.401f, 10.554f),
                    PathNode.CurveTo(22.199577f, 11.352614f, 22.199577f, 12.647386f, 21.401f, 13.446f),
                    PathNode.LineTo(13.446f, 21.401f),
                    PathNode.CurveTo(12.647386f, 22.199577f, 11.352614f, 22.199577f, 10.554f, 21.401f),
                    PathNode.LineTo(2.599f, 13.446f),
                    PathNode.CurveTo(1.800422f, 12.647386f, 1.800422f, 11.352614f, 2.599f, 10.554f),
                    PathNode.LineTo(10.554f, 2.599f),
                    PathNode.CurveTo(11.352614f, 1.800422f, 12.647386f, 1.800422f, 13.446f, 2.599f)
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
                    PathNode.MoveTo(9.5f, 14.5f),
                    PathNode.LineTo(14.5f, 9.5f)
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
        return _squareRotatedForbid!!
    }

private var _squareRotatedForbid: ImageVector? = null
