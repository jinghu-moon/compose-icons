package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LeafOff: ImageVector
    get() {
        if (_leafOff != null) return _leafOff!!
        _leafOff = tablerOutlineIcon(
            name = "LeafOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 21.0f),
                    PathNode.CurveTo(5.475f, 16.73f, 7.3f, 13.36f, 11.331f, 11.317f)
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
                    PathNode.MoveTo(6.618f, 6.623f),
                    PathNode.CurveTo(4.744f, 8.248f, 3.993f, 10.5f, 3.986f, 13.0f),
                    PathNode.CurveTo(3.986f, 14.0f, 3.986f, 16.0f, 5.986f, 18.0f),
                    PathNode.LineTo(9.0f, 18.0f),
                    PathNode.CurveTo(11.733f, 18.0f, 14.092f, 17.365f, 15.92f, 15.913f),
                    PathNode.MoveTo(17.819f, 13.814f),
                    PathNode.CurveTo(19.043f, 11.942f, 19.806f, 9.38f, 20.0f, 6.0f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.LineTo(15.986f, 4.0f),
                    PathNode.CurveTo(13.123f, 4.0f, 10.868f, 4.405f, 9.125f, 5.118f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _leafOff!!
    }

private var _leafOff: ImageVector? = null
