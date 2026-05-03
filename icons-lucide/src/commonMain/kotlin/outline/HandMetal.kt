package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandMetal: ImageVector
    get() {
        if (_handMetal != null) return _handMetal!!
        _handMetal = lucideOutlineIcon(
            name = "HandMetal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 12.5f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.CurveTo(18.0f, 8.895431f, 17.10457f, 8.0f, 16.0f, 8.0f),
                    PathNode.CurveTo(14.895431f, 8.0f, 14.0f, 8.895431f, 14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 11.4f)
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
                    PathNode.MoveTo(14.0f, 11.0f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.CurveTo(14.0f, 7.895431f, 13.104569f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(10.895431f, 7.0f, 10.0f, 7.895431f, 10.0f, 9.0f),
                    PathNode.LineTo(10.0f, 11.0f)
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
                    PathNode.MoveTo(10.0f, 10.5f),
                    PathNode.LineTo(10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 3.895431f, 9.104569f, 3.0f, 8.0f, 3.0f),
                    PathNode.CurveTo(6.895431f, 3.0f, 6.0f, 3.895431f, 6.0f, 5.0f),
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
                    PathNode.MoveTo(7.0f, 15.0f),
                    PathNode.LineTo(5.24f, 13.24f),
                    PathNode.CurveTo(4.451086f, 12.522586f, 3.238066f, 12.550284f, 2.482721f, 13.30296f),
                    PathNode.CurveTo(1.727375f, 14.055637f, 1.695383f, 15.268551f, 2.41f, 16.06f),
                    PathNode.LineTo(6.01f, 19.66f),
                    PathNode.CurveTo(7.5f, 21.14f, 9.2f, 22.0f, 12.0f, 22.0f),
                    PathNode.LineTo(14.0f, 22.0f),
                    PathNode.CurveTo(18.418278f, 22.0f, 22.0f, 18.418278f, 22.0f, 14.0f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.CurveTo(22.0f, 5.895431f, 21.10457f, 5.0f, 20.0f, 5.0f),
                    PathNode.CurveTo(18.89543f, 5.0f, 18.0f, 5.895431f, 18.0f, 7.0f),
                    PathNode.LineTo(18.0f, 12.0f)
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
        return _handMetal!!
    }

private var _handMetal: ImageVector? = null
