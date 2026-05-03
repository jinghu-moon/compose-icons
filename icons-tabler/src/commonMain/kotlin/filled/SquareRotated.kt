package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRotated: ImageVector
    get() {
        if (_squareRotated != null) return _squareRotated!!
        _squareRotated = tablerFilledIcon(
            name = "SquareRotated",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.793f, 2.893f),
                    PathNode.LineTo(2.893f, 9.793f),
                    PathNode.CurveTo(1.721f, 10.964f, 1.721f, 13.036f, 2.893f, 14.207f),
                    PathNode.LineTo(9.793f, 21.107f),
                    PathNode.CurveTo(10.964f, 22.279f, 13.036f, 22.279f, 14.207f, 21.107f),
                    PathNode.LineTo(21.107f, 14.207f),
                    PathNode.CurveTo(22.279f, 13.036f, 22.279f, 10.964f, 21.107f, 9.793f),
                    PathNode.LineTo(14.207f, 2.893f),
                    PathNode.CurveTo(13.036f, 1.721f, 10.964f, 1.721f, 9.793f, 2.893f),
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
        return _squareRotated!!
    }

private var _squareRotated: ImageVector? = null
