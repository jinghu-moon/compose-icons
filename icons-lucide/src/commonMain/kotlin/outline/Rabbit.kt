package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rabbit: ImageVector
    get() {
        if (_rabbit != null) return _rabbit!!
        _rabbit = lucideOutlineIcon(
            name = "Rabbit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 16.0f),
                    PathNode.CurveTo(14.183766f, 15.998447f, 15.257765f, 16.69315f, 15.741744f, 17.773458f),
                    PathNode.CurveTo(16.225723f, 18.85377f, 16.029179f, 20.117672f, 15.24f, 21.0f)
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
                    PathNode.MoveTo(18.0f, 12.0f),
                    PathNode.LineTo(18.01f, 12.0f)
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
                    PathNode.MoveTo(18.0f, 21.0f),
                    PathNode.LineTo(10.0f, 21.0f),
                    PathNode.CurveTo(7.790861f, 21.0f, 6.0f, 19.209139f, 6.0f, 17.0f),
                    PathNode.CurveTo(6.0f, 13.134007f, 9.134007f, 10.0f, 13.0f, 10.0f),
                    PathNode.LineTo(13.2f, 10.0f),
                    PathNode.LineTo(9.6f, 6.4f),
                    PathNode.CurveTo(8.826801f, 5.626802f, 8.826801f, 4.373199f, 9.6f, 3.6f),
                    PathNode.CurveTo(10.373199f, 2.826801f, 11.626801f, 2.826801f, 12.4f, 3.6f),
                    PathNode.LineTo(15.8f, 7.0f),
                    PathNode.LineTo(16.0f, 7.0f),
                    PathNode.CurveTo(19.3f, 7.0f, 22.0f, 9.7f, 22.0f, 13.0f),
                    PathNode.LineTo(22.0f, 14.0f),
                    PathNode.CurveTo(22.0f, 15.104569f, 21.10457f, 16.0f, 20.0f, 16.0f),
                    PathNode.LineTo(19.0f, 16.0f),
                    PathNode.CurveTo(17.343145f, 16.0f, 16.0f, 17.343145f, 16.0f, 19.0f)
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
                    PathNode.MoveTo(20.0f, 8.54f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.CurveTo(20.0f, 2.895431f, 19.10457f, 2.0f, 18.0f, 2.0f),
                    PathNode.CurveTo(16.89543f, 2.0f, 16.0f, 2.895431f, 16.0f, 4.0f),
                    PathNode.LineTo(16.0f, 7.0f)
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
                    PathNode.MoveTo(7.612f, 12.524f),
                    PathNode.CurveTo(6.829456f, 11.139047f, 5.101948f, 10.60568f, 3.674834f, 11.308402f),
                    PathNode.CurveTo(2.247721f, 12.011126f, 1.61722f, 13.705597f, 2.237859f, 15.170274f),
                    PathNode.CurveTo(2.858497f, 16.63495f, 4.514476f, 17.360556f, 6.012f, 16.824f)
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
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
