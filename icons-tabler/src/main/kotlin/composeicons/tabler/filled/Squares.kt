package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Squares: ImageVector
    get() {
        if (_squares != null) return _squares!!
        _squares = tablerFilledIcon(
            name = "Squares",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 7.0f),
                    PathNode.CurveTo(20.656855f, 7.0f, 22.0f, 8.343146f, 22.0f, 10.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.656855f, 20.656855f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.CurveTo(8.343146f, 22.0f, 7.0f, 20.656855f, 7.0f, 19.0f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.CurveTo(7.0f, 8.343146f, 8.343146f, 7.0f, 10.0f, 7.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(15.656464f, 2.0f, 16.999449f, 3.342536f, 17.0f, 4.999f),
                    PathNode.LineTo(10.0f, 5.0f),
                    PathNode.CurveTo(7.238577f, 5.0f, 5.0f, 7.238577f, 5.0f, 10.0f),
                    PathNode.LineTo(4.999f, 17.0f),
                    PathNode.LineTo(4.824f, 16.995f),
                    PathNode.CurveTo(3.238179f, 16.901804f, 1.999912f, 15.588557f, 2.0f, 14.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.343146f, 3.343146f, 2.0f, 5.0f, 2.0f),
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
        return _squares!!
    }

private var _squares: ImageVector? = null
