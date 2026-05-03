package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacCancer: ImageVector
    get() {
        if (_zodiacCancer != null) return _zodiacCancer!!
        _zodiacCancer = lucideOutlineIcon(
            name = "ZodiacCancer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 14.5f),
                    PathNode.CurveTo(21.002378f, 17.15536f, 18.768148f, 19.544777f, 15.356804f, 20.535166f),
                    PathNode.CurveTo(11.945458f, 21.525557f, 8.042997f, 20.91776f, 5.5f, 19.0f)
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
                    PathNode.MoveTo(3.0f, 9.5f),
                    PathNode.CurveTo(2.997622f, 6.844641f, 5.231852f, 4.455225f, 8.643196f, 3.464834f),
                    PathNode.CurveTo(12.054542f, 2.474444f, 15.957004f, 3.08224f, 18.5f, 5.0f)
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
                    PathNode.MoveTo(21.0f, 14.5f),
                    PathNode.CurveTo(21.0f, 16.432997f, 19.432997f, 18.0f, 17.5f, 18.0f),
                    PathNode.CurveTo(15.567003f, 18.0f, 14.0f, 16.432997f, 14.0f, 14.5f),
                    PathNode.CurveTo(14.0f, 12.567003f, 15.567003f, 11.0f, 17.5f, 11.0f),
                    PathNode.CurveTo(19.432997f, 11.0f, 21.0f, 12.567003f, 21.0f, 14.5f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 9.5f),
                    PathNode.CurveTo(10.0f, 11.432997f, 8.432997f, 13.0f, 6.5f, 13.0f),
                    PathNode.CurveTo(4.567004f, 13.0f, 3.0f, 11.432997f, 3.0f, 9.5f),
                    PathNode.CurveTo(3.0f, 7.567004f, 4.567004f, 6.0f, 6.5f, 6.0f),
                    PathNode.CurveTo(8.432997f, 6.0f, 10.0f, 7.567004f, 10.0f, 9.5f),
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
        return _zodiacCancer!!
    }

private var _zodiacCancer: ImageVector? = null
