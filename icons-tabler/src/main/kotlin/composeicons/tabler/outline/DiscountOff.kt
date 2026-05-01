package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DiscountOff: ImageVector
    get() {
        if (_discountOff != null) return _discountOff!!
        _discountOff = tablerOutlineIcon(
            name = "DiscountOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(15.0f, 9.0f)
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
                    PathNode.MoveTo(9.148f, 9.145f),
                    PathNode.CurveTo(9.002061f, 9.286919f, 8.957189f, 9.503372f, 9.034685f, 9.691609f),
                    PathNode.CurveTo(9.112183f, 9.879848f, 9.296443f, 10.001967f, 9.5f, 10.0f),
                    PathNode.CurveTo(9.630745f, 10.000248f, 9.756387f, 9.949274f, 9.85f, 9.858f)
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
                    PathNode.MoveTo(14.148f, 14.145f),
                    PathNode.CurveTo(14.002061f, 14.286919f, 13.957189f, 14.503372f, 14.034685f, 14.691609f),
                    PathNode.CurveTo(14.112183f, 14.879848f, 14.296443f, 15.001967f, 14.5f, 15.0f),
                    PathNode.CurveTo(14.630745f, 15.000248f, 14.756387f, 14.949274f, 14.85f, 14.858f)
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
                    PathNode.MoveTo(5.641f, 5.631f),
                    PathNode.CurveTo(2.123499f, 9.143255f, 2.119245f, 14.841998f, 5.6315f, 18.3595f),
                    PathNode.CurveTo(9.143755f, 21.877f, 14.842499f, 21.881254f, 18.36f, 18.369f),
                    PathNode.MoveTo(20.04f, 16.051f),
                    PathNode.CurveTo(21.78978f, 12.584411f, 21.118856f, 8.38644f, 18.375772f, 5.637903f),
                    PathNode.CurveTo(15.632688f, 2.889365f, 11.436057f, 2.210108f, 7.966f, 3.953f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _discountOff!!
    }

private var _discountOff: ImageVector? = null
