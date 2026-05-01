package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeDiscount: ImageVector
    get() {
        if (_eyeDiscount != null) return _eyeDiscount!!
        _eyeDiscount = tablerOutlineIcon(
            name = "EyeDiscount",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 13.104569f, 10.895431f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(13.104569f, 14.0f, 14.0f, 13.104569f, 14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 10.895431f, 13.104569f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(10.895431f, 10.0f, 10.0f, 10.895431f, 10.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.CurveTo(8.4f, 18.0f, 5.4f, 16.0f, 3.0f, 12.0f),
                    PathNode.CurveTo(5.4f, 8.0f, 8.4f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(15.6f, 6.0f, 18.6f, 8.0f, 21.0f, 12.0f)
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
                    PathNode.MoveTo(16.0f, 21.0f),
                    PathNode.LineTo(21.0f, 16.0f)
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
                    PathNode.LineTo(21.0f, 21.01f)
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
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.LineTo(16.0f, 16.01f)
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
        return _eyeDiscount!!
    }

private var _eyeDiscount: ImageVector? = null
