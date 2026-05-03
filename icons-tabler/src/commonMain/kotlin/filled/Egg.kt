package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = tablerFilledIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.002f, 2.0f),
                    PathNode.CurveTo(7.829f, 1.992f, 4.0f, 8.058f, 4.0f, 14.083f),
                    PathNode.CurveTo(4.0f, 18.791f, 7.25f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(16.727f, 21.794f, 20.0f, 18.672f, 20.0f, 14.083f),
                    PathNode.CurveTo(20.0f, 8.063f, 16.175f, 2.008f, 12.002f, 2.0f),
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
        return _egg!!
    }

private var _egg: ImageVector? = null
