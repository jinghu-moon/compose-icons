package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = tablerFilledIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(4.5f, 19.0f, 4.1f, 18.7f, 4.0f, 18.2f),
                    PathNode.LineTo(2.0f, 8.2f),
                    PathNode.CurveTo(2.0f, 7.8f, 2.1f, 7.4f, 2.5f, 7.1f),
                    PathNode.CurveTo(2.9f, 6.9f, 3.3f, 6.9f, 3.6f, 7.1f),
                    PathNode.LineTo(7.7f, 10.4f),
                    PathNode.LineTo(11.1f, 5.3f),
                    PathNode.CurveTo(11.5f, 4.7f, 12.4f, 4.7f, 12.8f, 5.3f),
                    PathNode.LineTo(16.2f, 10.4f),
                    PathNode.LineTo(20.3f, 7.1f),
                    PathNode.CurveTo(20.6f, 6.8f, 21.1f, 6.8f, 21.4f, 7.1f),
                    PathNode.CurveTo(21.8f, 7.3f, 21.9f, 7.7f, 21.9f, 8.2f),
                    PathNode.LineTo(19.9f, 18.2f),
                    PathNode.CurveTo(19.9f, 18.7f, 19.4f, 19.0f, 18.9f, 19.0f),
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
        return _crown!!
    }

private var _crown: ImageVector? = null
