package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleKey: ImageVector
    get() {
        if (_circleKey != null) return _circleKey!!
        _circleKey = tablerOutlineIcon(
            name = "CircleKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(12.0f, 11.104569f, 12.895431f, 12.0f, 14.0f, 12.0f),
                    PathNode.CurveTo(15.104569f, 12.0f, 16.0f, 11.104569f, 16.0f, 10.0f),
                    PathNode.CurveTo(16.0f, 8.895431f, 15.104569f, 8.0f, 14.0f, 8.0f),
                    PathNode.CurveTo(12.895431f, 8.0f, 12.0f, 8.895431f, 12.0f, 10.0f)
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
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 16.970562f, 16.970562f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(7.029437f, 21.0f, 3.0f, 16.970562f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 7.029437f, 7.029437f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(16.970562f, 3.0f, 21.0f, 7.029437f, 21.0f, 12.0f)
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
                    PathNode.MoveTo(12.5f, 11.5f),
                    PathNode.LineTo(8.5f, 15.5f),
                    PathNode.LineTo(10.0f, 17.0f)
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
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(10.5f, 13.5f)
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
        return _circleKey!!
    }

private var _circleKey: ImageVector? = null
