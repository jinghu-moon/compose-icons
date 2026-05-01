package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = tablerOutlineIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(3.895431f, 4.0f, 3.0f, 4.895431f, 3.0f, 6.0f),
                    PathNode.LineTo(3.0f, 9.5f),
                    PathNode.CurveTo(3.0f, 12.537566f, 5.462434f, 15.0f, 8.5f, 15.0f),
                    PathNode.CurveTo(11.537566f, 15.0f, 14.0f, 12.537566f, 14.0f, 9.5f),
                    PathNode.LineTo(14.0f, 6.0f),
                    PathNode.CurveTo(14.0f, 4.895431f, 13.104569f, 4.0f, 12.0f, 4.0f),
                    PathNode.LineTo(11.0f, 4.0f)
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
                    PathNode.MoveTo(8.0f, 15.0f),
                    PathNode.CurveTo(8.0f, 18.31371f, 10.686292f, 21.0f, 14.0f, 21.0f),
                    PathNode.CurveTo(17.31371f, 21.0f, 20.0f, 18.31371f, 20.0f, 15.0f),
                    PathNode.LineTo(20.0f, 12.0f)
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
                    PathNode.MoveTo(11.0f, 3.0f),
                    PathNode.LineTo(11.0f, 5.0f)
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
                    PathNode.MoveTo(6.0f, 3.0f),
                    PathNode.LineTo(6.0f, 5.0f)
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
                    PathNode.MoveTo(18.0f, 10.0f),
                    PathNode.CurveTo(18.0f, 11.104569f, 18.89543f, 12.0f, 20.0f, 12.0f),
                    PathNode.CurveTo(21.10457f, 12.0f, 22.0f, 11.104569f, 22.0f, 10.0f),
                    PathNode.CurveTo(22.0f, 8.895431f, 21.10457f, 8.0f, 20.0f, 8.0f),
                    PathNode.CurveTo(18.89543f, 8.0f, 18.0f, 8.895431f, 18.0f, 10.0f)
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
