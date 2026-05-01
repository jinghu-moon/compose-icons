package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Blob: ImageVector
    get() {
        if (_blob != null) return _blob!!
        _blob = tablerFilledIcon(
            name = "Blob",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(14.779f, 3.0f, 17.349f, 4.556f, 19.243f, 7.082f),
                    PathNode.CurveTo(20.971f, 9.388f, 22.0f, 12.341f, 22.0f, 15.098f),
                    PathNode.CurveTo(22.0f, 16.568f, 21.707f, 17.816f, 21.097f, 18.843f),
                    PathNode.CurveTo(20.494f, 19.857f, 19.618f, 20.601f, 18.515f, 21.1f),
                    PathNode.CurveTo(16.922f, 21.818f, 15.18f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(8.825f, 22.0f, 7.08f, 21.817f, 5.486f, 21.1f),
                    PathNode.CurveTo(4.474f, 20.643f, 3.653f, 19.98f, 3.06f, 19.09f),
                    PathNode.LineTo(2.903f, 18.843f),
                    PathNode.CurveTo(2.293f, 17.815f, 2.0f, 16.569f, 2.0f, 15.098f),
                    PathNode.CurveTo(2.0f, 12.341f, 3.03f, 9.388f, 4.757f, 7.082f),
                    PathNode.CurveTo(6.65f, 4.556f, 9.22f, 3.0f, 12.0f, 3.0f)
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
        return _blob!!
    }

private var _blob: ImageVector? = null
