package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinX: ImageVector
    get() {
        if (_mapPinX != null) return _mapPinX!!
        _mapPinX = lucideOutlineIcon(
            name = "MapPinX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.752f, 11.901f),
                    PathNode.CurveTo(19.912722f, 11.279981f, 19.996021f, 10.641467f, 20.0f, 10.0f),
                    PathNode.CurveTo(20.0f, 5.581722f, 16.418278f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(7.581722f, 2.0f, 4.0f, 5.581722f, 4.0f, 10.0f),
                    PathNode.CurveTo(4.0f, 14.993f, 9.539f, 20.193f, 11.399f, 21.799f),
                    PathNode.CurveTo(11.754962f, 22.066668f, 12.245038f, 22.066668f, 12.601f, 21.799f),
                    PathNode.CurveTo(12.63108f, 21.773426f, 12.66108f, 21.74776f, 12.691f, 21.722f)
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
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 11.656855f, 13.656855f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(10.343145f, 13.0f, 9.0f, 11.656855f, 9.0f, 10.0f),
                    PathNode.CurveTo(9.0f, 8.343146f, 10.343145f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(13.656855f, 7.0f, 15.0f, 8.343146f, 15.0f, 10.0f),
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
                    PathNode.MoveTo(21.5f, 15.5f),
                    PathNode.LineTo(16.5f, 20.5f)
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
                    PathNode.MoveTo(21.5f, 20.5f),
                    PathNode.LineTo(16.5f, 15.5f)
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
        return _mapPinX!!
    }

private var _mapPinX: ImageVector? = null
