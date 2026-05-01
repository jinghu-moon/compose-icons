package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LockOpenOff: ImageVector
    get() {
        if (_lockOpenOff != null) return _lockOpenOff!!
        _lockOpenOff = tablerOutlineIcon(
            name = "LockOpenOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.CurveTo(18.10457f, 11.0f, 19.0f, 11.895431f, 19.0f, 13.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.MoveTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 20.10457f, 18.10457f, 21.0f, 17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(5.895431f, 21.0f, 5.0f, 20.10457f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 13.0f),
                    PathNode.CurveTo(5.0f, 11.895431f, 5.895431f, 11.0f, 7.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f)
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
                    PathNode.MoveTo(11.0f, 16.0f),
                    PathNode.CurveTo(11.0f, 16.552284f, 11.447715f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(12.552285f, 17.0f, 13.0f, 16.552284f, 13.0f, 16.0f),
                    PathNode.CurveTo(13.0f, 15.447715f, 12.552285f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(11.447715f, 15.0f, 11.0f, 15.447715f, 11.0f, 16.0f)
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
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.MoveTo(8.347f, 4.369f),
                    PathNode.CurveTo(9.116313f, 2.644463f, 10.986877f, 1.692851f, 12.833753f, 2.086456f),
                    PathNode.CurveTo(14.680627f, 2.48006f, 16.000662f, 4.111649f, 16.0f, 6.0f)
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
        return _lockOpenOff!!
    }

private var _lockOpenOff: ImageVector? = null
