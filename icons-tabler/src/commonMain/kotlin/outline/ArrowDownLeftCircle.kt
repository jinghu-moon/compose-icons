package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownLeftCircle: ImageVector
    get() {
        if (_arrowDownLeftCircle != null) return _arrowDownLeftCircle!!
        _arrowDownLeftCircle = tablerOutlineIcon(
            name = "ArrowDownLeftCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.536f, 8.464f),
                    PathNode.LineTo(6.0f, 18.0f)
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
                    PathNode.MoveTo(6.0f, 14.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.LineTo(10.0f, 18.0f)
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
                    PathNode.MoveTo(15.586f, 8.414f),
                    PathNode.CurveTo(16.088148f, 8.933913f, 16.831757f, 9.142426f, 17.531015f, 8.959394f),
                    PathNode.CurveTo(18.230274f, 8.776363f, 18.776363f, 8.230273f, 18.959394f, 7.531015f),
                    PathNode.CurveTo(19.142426f, 6.831756f, 18.933912f, 6.088149f, 18.414f, 5.586f),
                    PathNode.CurveTo(17.629242f, 4.828056f, 16.38183f, 4.838896f, 15.610363f, 5.610363f),
                    PathNode.CurveTo(14.838895f, 6.38183f, 14.828055f, 7.629243f, 15.586f, 8.414f)
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
        return _arrowDownLeftCircle!!
    }

private var _arrowDownLeftCircle: ImageVector? = null
