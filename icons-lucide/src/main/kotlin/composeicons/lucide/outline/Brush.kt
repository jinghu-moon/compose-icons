package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Brush: ImageVector
    get() {
        if (_brush != null) return _brush!!
        _brush = lucideOutlineIcon(
            name = "Brush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 10.0f),
                    PathNode.LineTo(14.0f, 13.0f)
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
                    PathNode.MoveTo(6.5f, 21.0f),
                    PathNode.CurveTo(8.432997f, 21.0f, 10.0f, 19.432997f, 10.0f, 17.5f),
                    PathNode.CurveTo(10.0f, 15.567003f, 8.432997f, 14.0f, 6.5f, 14.0f),
                    PathNode.CurveTo(4.567004f, 14.0f, 3.0f, 15.567003f, 3.0f, 17.5f),
                    PathNode.CurveTo(3.000185f, 18.165579f, 2.747051f, 18.80628f, 2.292f, 19.292f),
                    PathNode.CurveTo(2.005246f, 19.578028f, 1.91934f, 20.00878f, 2.074431f, 20.382927f),
                    PathNode.CurveTo(2.229523f, 20.757074f, 2.594982f, 21.000725f, 3.0f, 21.0f),
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
                    PathNode.MoveTo(9.969f, 17.031f),
                    PathNode.LineTo(21.378f, 5.624f),
                    PathNode.CurveTo(22.20698f, 4.795021f, 22.20698f, 3.45098f, 21.378f, 2.622f),
                    PathNode.CurveTo(20.54902f, 1.793021f, 19.204979f, 1.793021f, 18.376f, 2.622f),
                    PathNode.LineTo(6.967f, 14.031f)
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
        return _brush!!
    }

private var _brush: ImageVector? = null
