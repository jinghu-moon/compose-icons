package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Rectangle: ImageVector
    get() {
        if (_rectangle != null) return _rectangle!!
        _rectangle = tablerFilledIcon(
            name = "Rectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(3.343146f, 4.0f, 2.0f, 5.343146f, 2.0f, 7.0f),
                    PathNode.LineTo(2.0f, 17.0f),
                    PathNode.CurveTo(2.0f, 18.656855f, 3.343146f, 20.0f, 5.0f, 20.0f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.CurveTo(20.656855f, 20.0f, 22.0f, 18.656855f, 22.0f, 17.0f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.CurveTo(22.0f, 5.343146f, 20.656855f, 4.0f, 19.0f, 4.0f),
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
        return _rectangle!!
    }

private var _rectangle: ImageVector? = null
