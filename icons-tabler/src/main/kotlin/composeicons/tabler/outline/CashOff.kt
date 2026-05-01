package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CashOff: ImageVector
    get() {
        if (_cashOff != null) return _cashOff!!
        _cashOff = tablerOutlineIcon(
            name = "CashOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.CurveTo(20.10457f, 9.0f, 21.0f, 9.895431f, 21.0f, 11.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.MoveTo(19.0f, 19.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.CurveTo(7.895431f, 19.0f, 7.0f, 18.10457f, 7.0f, 17.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.CurveTo(7.0f, 9.895431f, 7.895431f, 9.0f, 9.0f, 9.0f)
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
                    PathNode.MoveTo(12.582f, 12.59f),
                    PathNode.CurveTo(11.824592f, 13.375291f, 11.836305f, 14.62271f, 12.608326f, 15.39364f),
                    PathNode.CurveTo(13.380346f, 16.16457f, 14.627781f, 16.174519f, 15.412f, 15.416f)
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
                    PathNode.MoveTo(17.0f, 9.0f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.CurveTo(17.0f, 5.895431f, 16.10457f, 5.0f, 15.0f, 5.0f),
                    PathNode.LineTo(9.0f, 5.0f),
                    PathNode.MoveTo(5.0f, 5.0f),
                    PathNode.CurveTo(3.895431f, 5.0f, 3.0f, 5.895431f, 3.0f, 7.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.CurveTo(3.0f, 14.104569f, 3.895431f, 15.0f, 5.0f, 15.0f),
                    PathNode.LineTo(7.0f, 15.0f)
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
        return _cashOff!!
    }

private var _cashOff: ImageVector? = null
