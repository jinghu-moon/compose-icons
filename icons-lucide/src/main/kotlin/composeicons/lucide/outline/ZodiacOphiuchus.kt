package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacOphiuchus: ImageVector
    get() {
        if (_zodiacOphiuchus != null) return _zodiacOphiuchus!!
        _zodiacOphiuchus = lucideOutlineIcon(
            name = "ZodiacOphiuchus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 10.0f),
                    PathNode.CurveTo(4.149086f, 8.725997f, 5.784343f, 7.998769f, 7.5f, 7.998769f),
                    PathNode.CurveTo(9.215657f, 7.998769f, 10.850915f, 8.725997f, 12.0f, 10.0f),
                    PathNode.CurveTo(13.149085f, 11.274003f, 14.784343f, 12.001232f, 16.5f, 12.001232f),
                    PathNode.CurveTo(18.215658f, 12.001232f, 19.850914f, 11.274003f, 21.0f, 10.0f)
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
                    PathNode.MoveTo(6.0f, 3.0f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.CurveTo(6.0f, 18.31371f, 8.686292f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(15.313708f, 21.0f, 18.0f, 18.31371f, 18.0f, 15.0f),
                    PathNode.LineTo(18.0f, 3.0f)
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
        return _zodiacOphiuchus!!
    }

private var _zodiacOphiuchus: ImageVector? = null
