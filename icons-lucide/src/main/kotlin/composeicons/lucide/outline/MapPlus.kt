package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPlus: ImageVector
    get() {
        if (_mapPlus != null) return _mapPlus!!
        _mapPlus = lucideOutlineIcon(
            name = "MapPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 19.0f),
                    PathNode.LineTo(9.894f, 18.448f),
                    PathNode.CurveTo(9.331179f, 18.166758f, 8.668821f, 18.166758f, 8.106f, 18.448f),
                    PathNode.LineTo(4.447f, 20.278f),
                    PathNode.CurveTo(4.13662f, 20.433098f, 3.768024f, 20.416222f, 3.473117f, 20.233408f),
                    PathNode.CurveTo(3.178209f, 20.050592f, 2.999144f, 19.727974f, 3.0f, 19.381f),
                    PathNode.LineTo(3.0f, 6.618f),
                    PathNode.CurveTo(3.000202f, 6.239334f, 3.214271f, 5.893264f, 3.553f, 5.724f),
                    PathNode.LineTo(8.106f, 3.447f),
                    PathNode.CurveTo(8.668821f, 3.165757f, 9.331179f, 3.165757f, 9.894f, 3.447f),
                    PathNode.LineTo(14.106f, 5.553f),
                    PathNode.CurveTo(14.668821f, 5.834243f, 15.331179f, 5.834243f, 15.894f, 5.553f),
                    PathNode.LineTo(19.553f, 3.723f),
                    PathNode.CurveTo(19.86322f, 3.567982f, 20.23161f, 3.584758f, 20.526457f, 3.767331f),
                    PathNode.CurveTo(20.821304f, 3.949904f, 21.00051f, 4.272204f, 21.0f, 4.619f),
                    PathNode.LineTo(21.0f, 12.0f)
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
                    PathNode.MoveTo(15.0f, 5.764f),
                    PathNode.LineTo(15.0f, 12.0f)
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
                    PathNode.MoveTo(18.0f, 15.0f),
                    PathNode.LineTo(18.0f, 21.0f)
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
                    PathNode.MoveTo(21.0f, 18.0f),
                    PathNode.LineTo(15.0f, 18.0f)
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
                    PathNode.MoveTo(9.0f, 3.236f),
                    PathNode.LineTo(9.0f, 18.236f)
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
        return _mapPlus!!
    }

private var _mapPlus: ImageVector? = null
