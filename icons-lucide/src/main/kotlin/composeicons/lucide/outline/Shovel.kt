package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = lucideOutlineIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.56f, 4.56f),
                    PathNode.CurveTo(21.841513f, 4.841332f, 21.99968f, 5.223009f, 21.99968f, 5.621f),
                    PathNode.CurveTo(21.99968f, 6.018992f, 21.841513f, 6.400668f, 21.56f, 6.682f),
                    PathNode.LineTo(21.09f, 7.152f),
                    PathNode.CurveTo(19.913834f, 8.295015f, 18.037766f, 8.281653f, 16.878f, 7.122f),
                    PathNode.CurveTo(16.31528f, 6.559376f, 15.999141f, 5.796238f, 15.999141f, 5.0005f),
                    PathNode.CurveTo(15.999141f, 4.204763f, 16.31528f, 3.441624f, 16.878f, 2.879f),
                    PathNode.LineTo(17.318f, 2.439f),
                    PathNode.CurveTo(17.90375f, 1.853427f, 18.85325f, 1.853427f, 19.439f, 2.439f),
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
                    PathNode.MoveTo(3.0f, 22.0f),
                    PathNode.CurveTo(2.447715f, 22.0f, 2.0f, 21.552284f, 2.0f, 21.0f),
                    PathNode.LineTo(2.0f, 17.414f),
                    PathNode.CurveTo(2.000057f, 17.148806f, 2.105451f, 16.894493f, 2.293f, 16.707f),
                    PathNode.LineTo(5.648f, 13.352f),
                    PathNode.CurveTo(6.118567f, 12.881503f, 6.881433f, 12.881503f, 7.352f, 13.352f),
                    PathNode.LineTo(10.648f, 16.648f),
                    PathNode.CurveTo(11.118497f, 17.118567f, 11.118497f, 17.881433f, 10.648f, 18.352f),
                    PathNode.LineTo(7.293f, 21.707f),
                    PathNode.CurveTo(7.105508f, 21.89455f, 6.851195f, 21.999943f, 6.586f, 22.0f),
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
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.LineTo(16.879f, 7.122f)
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
        return _shovel!!
    }

private var _shovel: ImageVector? = null
