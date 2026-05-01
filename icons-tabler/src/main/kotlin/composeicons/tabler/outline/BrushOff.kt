package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrushOff: ImageVector
    get() {
        if (_brushOff != null) return _brushOff!!
        _brushOff = tablerOutlineIcon(
            name = "BrushOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 17.0f),
                    PathNode.CurveTo(3.0f, 14.790861f, 4.790861f, 13.0f, 7.0f, 13.0f),
                    PathNode.CurveTo(9.209139f, 13.0f, 11.0f, 14.790861f, 11.0f, 17.0f),
                    PathNode.CurveTo(11.0f, 19.209139f, 9.209139f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(3.0f, 21.0f),
                    PathNode.LineTo(3.0f, 17.0f)
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
                    PathNode.MoveTo(21.0f, 3.0f),
                    PathNode.CurveTo(17.458687f, 3.48421f, 14.181479f, 5.14024f, 11.691f, 7.704f),
                    PathNode.MoveTo(9.896f, 9.916f),
                    PathNode.CurveTo(9.205649f, 10.941442f, 8.636516f, 12.043467f, 8.2f, 13.2f)
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
                    PathNode.MoveTo(21.0f, 3.0f),
                    PathNode.CurveTo(20.516203f, 6.537929f, 18.862804f, 9.81234f, 16.303f, 12.302f),
                    PathNode.MoveTo(14.108f, 14.088f),
                    PathNode.CurveTo(13.075778f, 14.785563f, 11.965584f, 15.360125f, 10.8f, 15.8f)
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
        return _brushOff!!
    }

private var _brushOff: ImageVector? = null
