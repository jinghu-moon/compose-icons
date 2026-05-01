package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BeanOff: ImageVector
    get() {
        if (_beanOff != null) return _beanOff!!
        _beanOff = lucideOutlineIcon(
            name = "BeanOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.CurveTo(8.36f, 9.64f, 7.479f, 9.954f, 6.598f, 10.165f),
                    PathNode.CurveTo(3.639238f, 10.873587f, 1.679162f, 13.684537f, 2.037072f, 16.70584f),
                    PathNode.CurveTo(2.394982f, 19.727142f, 4.957573f, 22.002325f, 8.0f, 22.0f),
                    PathNode.CurveTo(11.714008f, 22.004677f, 15.276783f, 20.529184f, 17.9f, 17.9f)
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
                    PathNode.MoveTo(10.75f, 5.093f),
                    PathNode.CurveTo(12.074759f, 2.69864f, 14.851706f, 1.503942f, 17.501095f, 2.188545f),
                    PathNode.CurveTo(20.150486f, 2.873147f, 22.001032f, 5.263589f, 22.0f, 8.0f),
                    PathNode.CurveTo(22.0f, 10.411f, 21.39f, 12.68f, 20.317f, 14.66f)
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
                    PathNode.MoveTo(5.341f, 10.62f),
                    PathNode.CurveTo(5.875042f, 11.826181f, 6.969426f, 12.691515f, 8.266251f, 12.933008f),
                    PathNode.CurveTo(9.563076f, 13.1745f, 10.895584f, 12.7611f, 11.828f, 11.828f),
                    PathNode.MoveTo(10.62f, 5.341f),
                    PathNode.CurveTo(11.528885f, 5.744971f, 12.255475f, 6.471917f, 12.659f, 7.381f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _beanOff!!
    }

private var _beanOff: ImageVector? = null
