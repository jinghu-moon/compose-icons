package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinMinus: ImageVector
    get() {
        if (_mapPinMinus != null) return _mapPinMinus!!
        _mapPinMinus = lucideOutlineIcon(
            name = "MapPinMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.977f, 14.0f),
                    PathNode.CurveTo(19.6f, 12.701f, 20.0f, 11.343f, 20.0f, 10.0f),
                    PathNode.CurveTo(20.0f, 5.581722f, 16.418278f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(7.581722f, 2.0f, 4.0f, 5.581722f, 4.0f, 10.0f),
                    PathNode.CurveTo(4.0f, 14.993f, 9.539f, 20.193f, 11.399f, 21.799f),
                    PathNode.CurveTo(11.754962f, 22.066668f, 12.245038f, 22.066668f, 12.601f, 21.799f),
                    PathNode.CurveTo(12.879898f, 21.557766f, 13.154606f, 21.31173f, 13.425f, 21.061f)
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
                    PathNode.MoveTo(16.0f, 18.0f),
                    PathNode.LineTo(22.0f, 18.0f)
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
        return _mapPinMinus!!
    }

private var _mapPinMinus: ImageVector? = null
