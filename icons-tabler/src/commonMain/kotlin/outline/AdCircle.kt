package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdCircle: ImageVector
    get() {
        if (_adCircle != null) return _adCircle!!
        _adCircle = tablerOutlineIcon(
            name = "AdCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 17.522848f, 6.477153f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(17.522848f, 22.0f, 22.0f, 17.522848f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 6.477153f, 17.522848f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(6.477153f, 2.0f, 2.0f, 6.477153f, 2.0f, 12.0f)
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
                    PathNode.MoveTo(7.0f, 15.0f),
                    PathNode.LineTo(7.0f, 10.5f),
                    PathNode.CurveTo(7.0f, 9.671573f, 7.671573f, 9.0f, 8.5f, 9.0f),
                    PathNode.CurveTo(9.328427f, 9.0f, 10.0f, 9.671573f, 10.0f, 10.5f),
                    PathNode.LineTo(10.0f, 15.0f)
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
                    PathNode.MoveTo(7.0f, 13.0f),
                    PathNode.LineTo(10.0f, 13.0f)
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
                    PathNode.MoveTo(14.0f, 9.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.CurveTo(16.10457f, 15.0f, 17.0f, 14.104569f, 17.0f, 13.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.CurveTo(17.0f, 9.895431f, 16.10457f, 9.0f, 15.0f, 9.0f),
                    PathNode.LineTo(14.0f, 9.0f)
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
        return _adCircle!!
    }

private var _adCircle: ImageVector? = null
