package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Satellite: ImageVector
    get() {
        if (_satellite != null) return _satellite!!
        _satellite = lucideOutlineIcon(
            name = "Satellite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.5f, 6.5f),
                    PathNode.LineTo(10.352f, 3.352f),
                    PathNode.CurveTo(9.881433f, 2.881503f, 9.118567f, 2.881503f, 8.648f, 3.352f),
                    PathNode.LineTo(6.352f, 5.648f),
                    PathNode.CurveTo(5.881503f, 6.118567f, 5.881503f, 6.881433f, 6.352f, 7.352f),
                    PathNode.LineTo(9.5f, 10.5f)
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
                    PathNode.MoveTo(16.5f, 7.5f),
                    PathNode.LineTo(19.0f, 5.0f)
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
                    PathNode.MoveTo(17.5f, 10.5f),
                    PathNode.LineTo(20.648f, 13.648f),
                    PathNode.CurveTo(21.118496f, 14.118567f, 21.118496f, 14.881433f, 20.648f, 15.352f),
                    PathNode.LineTo(18.352f, 17.648f),
                    PathNode.CurveTo(17.881433f, 18.118496f, 17.118567f, 18.118496f, 16.648f, 17.648f),
                    PathNode.LineTo(13.5f, 14.5f)
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
                    PathNode.MoveTo(9.0f, 21.0f),
                    PathNode.CurveTo(9.0f, 17.68629f, 6.313709f, 15.0f, 3.0f, 15.0f)
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
                    PathNode.MoveTo(9.352f, 10.648f),
                    PathNode.CurveTo(8.881503f, 11.118567f, 8.881503f, 11.881433f, 9.352f, 12.352f),
                    PathNode.LineTo(11.648f, 14.648f),
                    PathNode.CurveTo(12.118567f, 15.118497f, 12.881433f, 15.118497f, 13.352f, 14.648f),
                    PathNode.LineTo(17.648f, 10.352f),
                    PathNode.CurveTo(18.118496f, 9.881433f, 18.118496f, 9.118567f, 17.648f, 8.648f),
                    PathNode.LineTo(15.352f, 6.352f),
                    PathNode.CurveTo(14.881433f, 5.881503f, 14.118567f, 5.881503f, 13.648f, 6.352f),
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
        return _satellite!!
    }

private var _satellite: ImageVector? = null
