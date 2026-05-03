package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LassoOff: ImageVector
    get() {
        if (_lassoOff != null) return _lassoOff!!
        _lassoOff = tablerOutlineIcon(
            name = "LassoOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.028f, 13.252f),
                    PathNode.CurveTo(3.371f, 12.28f, 3.0f, 11.174f, 3.0f, 10.0f),
                    PathNode.CurveTo(3.0f, 8.196f, 3.878f, 6.551f, 5.319f, 5.31f),
                    PathNode.MoveTo(7.809f, 3.804f),
                    PathNode.CurveTo(9.140604f, 3.266622f, 10.564067f, 2.993545f, 12.0f, 3.0f),
                    PathNode.CurveTo(16.97f, 3.0f, 21.0f, 6.134f, 21.0f, 10.0f),
                    PathNode.CurveTo(21.0f, 11.799f, 20.127f, 13.44f, 18.693f, 14.68f),
                    PathNode.MoveTo(16.19f, 16.197f),
                    PathNode.CurveTo(14.85864f, 16.733908f, 13.435531f, 17.006643f, 12.0f, 17.0f),
                    PathNode.CurveTo(10.087f, 17.0f, 8.314f, 16.536f, 6.856f, 15.745f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 15.0f),
                    PathNode.CurveTo(3.0f, 16.10457f, 3.895431f, 17.0f, 5.0f, 17.0f),
                    PathNode.CurveTo(6.10457f, 17.0f, 7.0f, 16.10457f, 7.0f, 15.0f),
                    PathNode.CurveTo(7.0f, 13.895431f, 6.10457f, 13.0f, 5.0f, 13.0f),
                    PathNode.CurveTo(3.895431f, 13.0f, 3.0f, 13.895431f, 3.0f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 18.42f, 5.316f, 19.805f, 6.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
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
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lassoOff!!
    }

private var _lassoOff: ImageVector? = null
