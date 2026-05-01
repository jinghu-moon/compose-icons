package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RectangleVertical: ImageVector
    get() {
        if (_rectangleVertical != null) return _rectangleVertical!!
        _rectangleVertical = tablerFilledIcon(
            name = "RectangleVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.CurveTo(5.343146f, 2.0f, 4.0f, 3.343146f, 4.0f, 5.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(4.0f, 20.656855f, 5.343146f, 22.0f, 7.0f, 22.0f),
                    PathNode.LineTo(17.0f, 22.0f),
                    PathNode.CurveTo(18.656855f, 22.0f, 20.0f, 20.656855f, 20.0f, 19.0f),
                    PathNode.LineTo(20.0f, 5.0f),
                    PathNode.CurveTo(20.0f, 3.343146f, 18.656855f, 2.0f, 17.0f, 2.0f),
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
        return _rectangleVertical!!
    }

private var _rectangleVertical: ImageVector? = null
