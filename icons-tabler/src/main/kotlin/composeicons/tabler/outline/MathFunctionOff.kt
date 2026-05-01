package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathFunctionOff: ImageVector
    get() {
        if (_mathFunctionOff != null) return _mathFunctionOff!!
        _mathFunctionOff = tablerOutlineIcon(
            name = "MathFunctionOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.CurveTo(15.882f, 10.0f, 15.986f, 10.777f, 16.694f, 12.692f)
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
                    PathNode.MoveTo(13.0f, 17.0f),
                    PathNode.CurveTo(13.864f, 17.0f, 14.727f, 16.337f, 15.495f, 15.488f),
                    PathNode.MoveTo(17.212f, 13.186f),
                    PathNode.CurveTo(18.205f, 11.736f, 19.602f, 10.0f, 21.0f, 10.0f)
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
                    PathNode.MoveTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.5f, 3.5f, 21.0f, 5.0f, 21.0f),
                    PathNode.CurveTo(6.5f, 21.0f, 7.0f, 17.0f, 8.0f, 12.0f),
                    PathNode.CurveTo(8.237001f, 10.814f, 8.446f, 9.683f, 8.647f, 8.65f),
                    PathNode.MoveTo(9.374f, 5.402f),
                    PathNode.CurveTo(9.797f, 3.91f, 10.284f, 3.0f, 11.0f, 3.0f),
                    PathNode.CurveTo(12.5f, 3.0f, 13.0f, 3.5f, 13.0f, 5.0f)
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
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f)
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
        return _mathFunctionOff!!
    }

private var _mathFunctionOff: ImageVector? = null
