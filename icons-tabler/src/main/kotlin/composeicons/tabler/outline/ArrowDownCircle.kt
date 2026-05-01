package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) return _arrowDownCircle!!
        _arrowDownCircle = tablerOutlineIcon(
            name = "ArrowDownCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(9.0f, 18.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.LineTo(15.0f, 18.0f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(13.104569f, 7.0f, 14.0f, 6.10457f, 14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 3.895431f, 13.104569f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.895431f, 3.0f, 10.0f, 3.895431f, 10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 6.10457f, 10.895431f, 7.0f, 12.0f, 7.0f)
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
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null
