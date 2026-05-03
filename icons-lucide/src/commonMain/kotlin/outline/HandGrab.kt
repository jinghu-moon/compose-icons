package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandGrab: ImageVector
    get() {
        if (_handGrab != null) return _handGrab!!
        _handGrab = lucideOutlineIcon(
            name = "HandGrab",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 11.5f),
                    PathNode.LineTo(18.0f, 9.0f),
                    PathNode.CurveTo(18.0f, 7.895431f, 17.10457f, 7.0f, 16.0f, 7.0f),
                    PathNode.CurveTo(14.895431f, 7.0f, 14.0f, 7.895431f, 14.0f, 9.0f),
                    PathNode.LineTo(14.0f, 10.4f)
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
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(14.0f, 6.895431f, 13.104569f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(10.895431f, 6.0f, 10.0f, 6.895431f, 10.0f, 8.0f),
                    PathNode.LineTo(10.0f, 10.0f)
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
                    PathNode.MoveTo(10.0f, 9.9f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 7.895431f, 9.104569f, 7.0f, 8.0f, 7.0f),
                    PathNode.CurveTo(6.895431f, 7.0f, 6.0f, 7.895431f, 6.0f, 9.0f),
                    PathNode.LineTo(6.0f, 14.0f)
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
                    PathNode.CurveTo(6.0f, 12.895431f, 5.10457f, 12.0f, 4.0f, 12.0f),
                    PathNode.CurveTo(2.895431f, 12.0f, 2.0f, 12.895431f, 2.0f, 14.0f)
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
                    PathNode.MoveTo(18.0f, 11.0f),
                    PathNode.CurveTo(18.0f, 9.895431f, 18.89543f, 9.0f, 20.0f, 9.0f),
                    PathNode.CurveTo(21.10457f, 9.0f, 22.0f, 9.895431f, 22.0f, 11.0f),
                    PathNode.LineTo(22.0f, 14.0f),
                    PathNode.CurveTo(22.0f, 18.418278f, 18.418278f, 22.0f, 14.0f, 22.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.CurveTo(5.581722f, 22.0f, 2.0f, 18.418278f, 2.0f, 14.0f),
                    PathNode.CurveTo(2.0f, 12.895431f, 2.895431f, 12.0f, 4.0f, 12.0f),
                    PathNode.CurveTo(5.10457f, 12.0f, 6.0f, 12.895431f, 6.0f, 14.0f)
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
        return _handGrab!!
    }

private var _handGrab: ImageVector? = null
