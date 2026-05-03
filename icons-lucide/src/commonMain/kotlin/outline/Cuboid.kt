package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cuboid: ImageVector
    get() {
        if (_cuboid != null) return _cuboid!!
        _cuboid = lucideOutlineIcon(
            name = "Cuboid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 22.0f),
                    PathNode.LineTo(10.0f, 14.0f)
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
                    PathNode.MoveTo(2.336f, 8.89f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.LineTo(21.715f, 6.971f)
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
                    PathNode.MoveTo(22.0f, 14.0f),
                    PathNode.CurveTo(22.000008f, 14.702529f, 21.631413f, 15.353549f, 21.029f, 15.715f),
                    PathNode.LineTo(11.029f, 21.715f),
                    PathNode.CurveTo(10.366514f, 22.112753f, 9.534168f, 22.093285f, 8.891f, 21.665f),
                    PathNode.LineTo(2.891f, 17.665f),
                    PathNode.CurveTo(2.334185f, 17.293983f, 1.999788f, 16.669102f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 10.0f),
                    PathNode.CurveTo(1.999993f, 9.297471f, 2.368588f, 8.646451f, 2.971f, 8.285f),
                    PathNode.LineTo(12.971f, 2.285f),
                    PathNode.CurveTo(13.633486f, 1.88725f, 14.465832f, 1.906715f, 15.109f, 2.335f),
                    PathNode.LineTo(21.109f, 6.335f),
                    PathNode.CurveTo(21.665815f, 6.706017f, 22.000212f, 7.330899f, 22.0f, 8.0f),
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
        return _cuboid!!
    }

private var _cuboid: ImageVector? = null
