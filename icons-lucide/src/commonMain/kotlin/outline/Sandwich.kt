package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sandwich: ImageVector
    get() {
        if (_sandwich != null) return _sandwich!!
        _sandwich = lucideOutlineIcon(
            name = "Sandwich",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.37f, 11.223f),
                    PathNode.LineTo(10.742f, 4.446f),
                    PathNode.CurveTo(11.475636f, 3.852414f, 12.524364f, 3.852414f, 13.258f, 4.446f),
                    PathNode.LineTo(21.629f, 11.223f)
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
                    PathNode.MoveTo(21.0f, 15.0f),
                    PathNode.CurveTo(21.552284f, 15.0f, 22.0f, 15.447715f, 22.0f, 16.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 18.552284f, 21.552284f, 19.0f, 21.0f, 19.0f),
                    PathNode.LineTo(15.75f, 19.0f)
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
                    PathNode.MoveTo(3.0f, 15.0f),
                    PathNode.CurveTo(2.447715f, 15.0f, 2.0f, 15.447715f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.CurveTo(2.0f, 18.552284f, 2.447715f, 19.0f, 3.0f, 19.0f),
                    PathNode.LineTo(12.0f, 19.0f)
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
                    PathNode.MoveTo(6.67f, 15.0f),
                    PathNode.LineTo(12.8f, 19.6f),
                    PathNode.CurveTo(13.683656f, 20.262741f, 14.937259f, 20.083656f, 15.6f, 19.2f),
                    PathNode.LineTo(18.75f, 15.0f)
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
                    PathNode.MoveTo(3.0f, 11.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.CurveTo(21.552284f, 11.0f, 22.0f, 11.447715f, 22.0f, 12.0f),
                    PathNode.LineTo(22.0f, 14.0f),
                    PathNode.CurveTo(22.0f, 14.552285f, 21.552284f, 15.0f, 21.0f, 15.0f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.CurveTo(2.447715f, 15.0f, 2.0f, 14.552285f, 2.0f, 14.0f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 11.447715f, 2.447715f, 11.0f, 3.0f, 11.0f),
                    PathNode.Close
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
        return _sandwich!!
    }

private var _sandwich: ImageVector? = null
