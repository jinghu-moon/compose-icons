package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lollipop: ImageVector
    get() {
        if (_lollipop != null) return _lollipop!!
        _lollipop = lucideOutlineIcon(
            name = "Lollipop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 11.0f),
                    PathNode.CurveTo(19.0f, 15.418278f, 15.418278f, 19.0f, 11.0f, 19.0f),
                    PathNode.CurveTo(6.581722f, 19.0f, 3.0f, 15.418278f, 3.0f, 11.0f),
                    PathNode.CurveTo(3.0f, 6.581722f, 6.581722f, 3.0f, 11.0f, 3.0f),
                    PathNode.CurveTo(15.418278f, 3.0f, 19.0f, 6.581722f, 19.0f, 11.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(21.0f, 21.0f),
                    PathNode.LineTo(16.7f, 16.7f)
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
                    PathNode.MoveTo(11.0f, 11.0f),
                    PathNode.CurveTo(11.0f, 12.104569f, 11.895431f, 13.0f, 13.0f, 13.0f),
                    PathNode.CurveTo(14.104569f, 13.0f, 15.0f, 12.104569f, 15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 8.790861f, 13.209139f, 7.0f, 11.0f, 7.0f),
                    PathNode.CurveTo(8.790861f, 7.0f, 7.0f, 8.790861f, 7.0f, 11.0f),
                    PathNode.CurveTo(7.0f, 14.313708f, 9.686292f, 17.0f, 13.0f, 17.0f),
                    PathNode.CurveTo(16.31371f, 17.0f, 19.0f, 14.313708f, 19.0f, 11.0f)
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
