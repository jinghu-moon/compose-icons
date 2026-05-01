package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wheat: ImageVector
    get() {
        if (_wheat != null) return _wheat!!
        _wheat = tablerOutlineIcon(
            name = "Wheat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.014f, 21.514f),
                    PathNode.LineTo(12.014f, 17.764f)
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
                    PathNode.MoveTo(5.93f, 9.504f),
                    PathNode.LineTo(5.5f, 11.108f),
                    PathNode.CurveTo(4.788f, 13.767f, 6.366f, 16.499f, 9.024f, 17.213f),
                    PathNode.CurveTo(10.021f, 17.481f, 11.017f, 17.748f, 12.014f, 18.014f),
                    PathNode.LineTo(12.014f, 14.574f),
                    PathNode.CurveTo(11.85f, 12.469f, 10.377f, 10.695f, 8.338001f, 10.148f),
                    PathNode.LineTo(5.93f, 9.504f)
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
                    PathNode.MoveTo(13.744f, 11.164f),
                    PathNode.CurveTo(14.198f, 10.71f, 14.559f, 10.17f, 14.805f, 9.577f),
                    PathNode.CurveTo(15.051f, 8.983f, 15.177f, 8.347f, 15.177f, 7.704f),
                    PathNode.CurveTo(15.177f, 7.061f, 15.051f, 6.425f, 14.805f, 5.832f),
                    PathNode.CurveTo(14.559f, 5.238f, 14.199f, 4.699f, 13.744f, 4.244f),
                    PathNode.LineTo(12.014f, 2.514f),
                    PathNode.LineTo(10.284f, 4.244f),
                    PathNode.CurveTo(9.83f, 4.698f, 9.469f, 5.238f, 9.224f, 5.832f),
                    PathNode.CurveTo(8.978f, 6.426f, 8.852f, 7.062f, 8.851f, 7.704f),
                    PathNode.CurveTo(8.851f, 8.347f, 8.978f, 8.983f, 9.224f, 9.577f),
                    PathNode.CurveTo(9.47f, 10.171f, 9.83f, 10.71f, 10.284f, 11.164f)
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
                    PathNode.MoveTo(18.099f, 9.504f),
                    PathNode.LineTo(18.529f, 11.108f),
                    PathNode.CurveTo(19.241f, 13.767f, 17.663f, 16.499f, 15.004f, 17.213f),
                    PathNode.CurveTo(14.007f, 17.481f, 13.01f, 17.748f, 12.014f, 18.014f),
                    PathNode.LineTo(12.014f, 14.574f),
                    PathNode.CurveTo(12.178f, 12.469f, 13.651f, 10.695f, 15.691f, 10.148f),
                    PathNode.LineTo(18.099f, 9.504f)
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
        return _wheat!!
    }

private var _wheat: ImageVector? = null
