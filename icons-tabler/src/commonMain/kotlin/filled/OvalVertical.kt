package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.OvalVertical: ImageVector
    get() {
        if (_ovalVertical != null) return _ovalVertical!!
        _ovalVertical = tablerFilledIcon(
            name = "OvalVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.CurveTo(6.543f, 5.0f, 2.0f, 8.028f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 15.972f, 6.543f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(17.457f, 19.0f, 22.0f, 15.972f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 8.028f, 17.457f, 5.0f, 12.0f, 5.0f),
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
        return _ovalVertical!!
    }

private var _ovalVertical: ImageVector? = null
