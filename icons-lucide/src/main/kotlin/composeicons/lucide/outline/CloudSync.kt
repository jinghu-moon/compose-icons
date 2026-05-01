package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudSync: ImageVector
    get() {
        if (_cloudSync != null) return _cloudSync!!
        _cloudSync = lucideOutlineIcon(
            name = "CloudSync",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 18.0f),
                    PathNode.LineTo(15.465f, 19.605f),
                    PathNode.CurveTo(14.300311f, 20.724361f, 12.666585f, 21.212072f, 11.078867f, 20.914375f),
                    PathNode.CurveTo(9.491149f, 20.616678f, 8.145073f, 19.570255f, 7.465f, 18.105f)
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
                    PathNode.MoveTo(17.0f, 22.0f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.LineTo(13.0f, 18.0f)
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
                    PathNode.MoveTo(20.996f, 15.251f),
                    PathNode.CurveTo(22.038673f, 13.901567f, 22.228975f, 12.078687f, 21.487497f, 10.542996f),
                    PathNode.CurveTo(20.74602f, 9.007306f, 19.200174f, 8.022689f, 17.495f, 8.0f),
                    PathNode.LineTo(15.705f, 8.0f),
                    PathNode.CurveTo(14.928482f, 5.403284f, 12.722731f, 3.488188f, 10.042726f, 3.083852f),
                    PathNode.CurveTo(7.36272f, 2.679516f, 4.690144f, 3.858612f, 3.182087f, 6.110652f),
                    PathNode.CurveTo(1.67403f, 8.362691f, 1.60154f, 11.282909f, 2.996f, 13.607f)
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
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.LineTo(11.0f, 14.0f)
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
                    PathNode.MoveTo(7.0f, 14.0f),
                    PathNode.LineTo(8.535f, 12.395f),
                    PathNode.CurveTo(9.699689f, 11.275638f, 11.333415f, 10.787928f, 12.921133f, 11.085625f),
                    PathNode.CurveTo(14.508851f, 11.383322f, 15.854927f, 12.429745f, 16.535f, 13.895f)
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
        return _cloudSync!!
    }

private var _cloudSync: ImageVector? = null
