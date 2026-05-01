package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinHouse: ImageVector
    get() {
        if (_mapPinHouse != null) return _mapPinHouse!!
        _mapPinHouse = lucideOutlineIcon(
            name = "MapPinHouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 22.0f),
                    PathNode.CurveTo(14.447715f, 22.0f, 14.0f, 21.552284f, 14.0f, 21.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.CurveTo(13.99995f, 16.665722f, 14.16693f, 16.353525f, 14.445f, 16.168f),
                    PathNode.LineTo(17.445f, 14.168f),
                    PathNode.CurveTo(17.781036f, 13.943801f, 18.218964f, 13.943801f, 18.555f, 14.168f),
                    PathNode.LineTo(21.555f, 16.168f),
                    PathNode.CurveTo(21.833069f, 16.353525f, 22.00005f, 16.665722f, 22.0f, 17.0f),
                    PathNode.LineTo(22.0f, 21.0f),
                    PathNode.CurveTo(22.0f, 21.552284f, 21.552284f, 22.0f, 21.0f, 22.0f),
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
                    PathNode.MoveTo(18.0f, 10.0f),
                    PathNode.CurveTo(18.0f, 5.581722f, 14.418278f, 2.0f, 10.0f, 2.0f),
                    PathNode.CurveTo(5.581722f, 2.0f, 2.0f, 5.581722f, 2.0f, 10.0f),
                    PathNode.CurveTo(2.0f, 14.993f, 7.539f, 20.193f, 9.399f, 21.799f),
                    PathNode.CurveTo(9.57237f, 21.929028f, 9.783288f, 21.999216f, 10.0f, 21.999f)
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
                    PathNode.MoveTo(18.0f, 22.0f),
                    PathNode.LineTo(18.0f, 19.0f)
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
                    PathNode.MoveTo(13.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 11.656855f, 11.656855f, 13.0f, 10.0f, 13.0f),
                    PathNode.CurveTo(8.343146f, 13.0f, 7.0f, 11.656855f, 7.0f, 10.0f),
                    PathNode.CurveTo(7.0f, 8.343146f, 8.343146f, 7.0f, 10.0f, 7.0f),
                    PathNode.CurveTo(11.656855f, 7.0f, 13.0f, 8.343146f, 13.0f, 10.0f),
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
        }
        return _mapPinHouse!!
    }

private var _mapPinHouse: ImageVector? = null
