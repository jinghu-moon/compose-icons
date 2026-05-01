package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lollipop: ImageVector
    get() {
        if (_lollipop != null) return _lollipop!!
        _lollipop = tablerOutlineIcon(
            name = "Lollipop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.CurveTo(7.0f, 13.865993f, 10.134007f, 17.0f, 14.0f, 17.0f),
                    PathNode.CurveTo(17.865993f, 17.0f, 21.0f, 13.865993f, 21.0f, 10.0f),
                    PathNode.CurveTo(21.0f, 6.134007f, 17.865993f, 3.0f, 14.0f, 3.0f),
                    PathNode.CurveTo(10.134007f, 3.0f, 7.0f, 6.134007f, 7.0f, 10.0f)
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
                    PathNode.MoveTo(21.0f, 10.0f),
                    PathNode.CurveTo(21.0f, 8.067004f, 19.432997f, 6.5f, 17.5f, 6.5f),
                    PathNode.CurveTo(15.567003f, 6.5f, 14.0f, 8.067004f, 14.0f, 10.0f)
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
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.CurveTo(14.0f, 11.932997f, 12.432997f, 13.5f, 10.5f, 13.5f),
                    PathNode.CurveTo(8.567003f, 13.5f, 7.0f, 11.932997f, 7.0f, 10.0f)
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
                    PathNode.MoveTo(14.0f, 17.0f),
                    PathNode.CurveTo(15.932997f, 17.0f, 17.5f, 15.432997f, 17.5f, 13.5f),
                    PathNode.CurveTo(17.5f, 11.567003f, 15.932997f, 10.0f, 14.0f, 10.0f)
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
                    PathNode.MoveTo(14.0f, 3.0f),
                    PathNode.CurveTo(12.067003f, 3.0f, 10.5f, 4.567004f, 10.5f, 6.5f),
                    PathNode.CurveTo(10.5f, 8.432997f, 12.067003f, 10.0f, 14.0f, 10.0f)
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
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.LineTo(9.0f, 15.0f)
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
        return _lollipop!!
    }

private var _lollipop: ImageVector? = null
