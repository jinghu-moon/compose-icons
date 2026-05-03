package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Oval: ImageVector
    get() {
        if (_oval != null) return _oval!!
        _oval = tablerFilledIcon(
            name = "Oval",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(15.972f, 2.0f, 19.0f, 6.542f, 19.0f, 12.0f),
                    PathNode.CurveTo(19.0f, 17.458f, 15.972f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(8.100001f, 22.0f, 5.11f, 17.621f, 5.003f, 12.297f),
                    PathNode.LineTo(5.0f, 12.0f),
                    PathNode.LineTo(5.003f, 11.703f),
                    PathNode.CurveTo(5.11f, 6.38f, 8.100001f, 2.0f, 12.0f, 2.0f),
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
        return _oval!!
    }

private var _oval: ImageVector? = null
