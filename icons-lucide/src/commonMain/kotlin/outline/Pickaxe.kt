package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pickaxe: ImageVector
    get() {
        if (_pickaxe != null) return _pickaxe!!
        _pickaxe = lucideOutlineIcon(
            name = "Pickaxe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 13.0f),
                    PathNode.LineTo(5.619f, 21.38f),
                    PathNode.CurveTo(4.790573f, 22.208704f, 3.447204f, 22.208927f, 2.6185f, 21.3805f),
                    PathNode.CurveTo(1.789797f, 20.552073f, 1.789573f, 19.208704f, 2.618f, 18.38f),
                    PathNode.LineTo(11.0f, 9.999f)
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
                    PathNode.MoveTo(15.973f, 4.027f),
                    PathNode.CurveTo(12.98182f, 2.125883f, 9.344112f, 1.528448f, 5.902f, 2.373f),
                    PathNode.CurveTo(4.504f, 2.715f, 4.81f, 4.531f, 6.179f, 4.974f),
                    PathNode.CurveTo(8.273602f, 5.652962f, 10.240998f, 6.674845f, 12.001f, 7.998f)
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
                    PathNode.MoveTo(16.001f, 11.999f),
                    PathNode.CurveTo(17.32435f, 13.759611f, 18.34624f, 15.727697f, 19.025f, 17.823f),
                    PathNode.CurveTo(19.469f, 19.192f, 21.285f, 19.499f, 21.628f, 18.101f),
                    PathNode.CurveTo(22.46912f, 14.674629f, 21.881489f, 11.053544f, 20.0f, 8.069f)
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
                    PathNode.MoveTo(18.352f, 3.352f),
                    PathNode.CurveTo(17.881433f, 2.881503f, 17.118567f, 2.881503f, 16.648f, 3.352f),
                    PathNode.LineTo(11.352f, 8.648f),
                    PathNode.CurveTo(10.881503f, 9.118567f, 10.881503f, 9.881433f, 11.352f, 10.352f),
                    PathNode.LineTo(13.648f, 12.648f),
                    PathNode.CurveTo(14.118567f, 13.118497f, 14.881433f, 13.118497f, 15.352f, 12.648f),
                    PathNode.LineTo(20.648f, 7.352f),
                    PathNode.CurveTo(21.118496f, 6.881433f, 21.118496f, 6.118567f, 20.648f, 5.648f),
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
        return _pickaxe!!
    }

private var _pickaxe: ImageVector? = null
