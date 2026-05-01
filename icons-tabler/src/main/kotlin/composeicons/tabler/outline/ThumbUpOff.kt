package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ThumbUpOff: ImageVector
    get() {
        if (_thumbUpOff != null) return _thumbUpOff!!
        _thumbUpOff = tablerOutlineIcon(
            name = "ThumbUpOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 11.0f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.CurveTo(7.0f, 19.552284f, 6.552285f, 20.0f, 6.0f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(3.447715f, 20.0f, 3.0f, 19.552284f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 11.447715f, 3.447715f, 11.0f, 4.0f, 11.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.CurveTo(8.061064f, 11.001206f, 9.078841f, 10.579412f, 9.828f, 9.828f),
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 6.0f),
                    PathNode.CurveTo(11.0f, 4.895431f, 11.895431f, 4.0f, 13.0f, 4.0f),
                    PathNode.CurveTo(14.104569f, 4.0f, 15.0f, 4.895431f, 15.0f, 6.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(19.10457f, 11.0f, 20.0f, 11.895431f, 20.0f, 13.0f),
                    PathNode.CurveTo(19.778f, 14.112f, 19.61f, 14.947f, 19.5f, 15.503f),
                    PathNode.MoveTo(18.742f, 18.747f),
                    PathNode.CurveTo(18.35f, 19.57f, 17.698f, 20.059f, 17.0f, 20.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.CurveTo(8.343146f, 20.0f, 7.0f, 18.656855f, 7.0f, 17.0f)
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
        return _thumbUpOff!!
    }

private var _thumbUpOff: ImageVector? = null
