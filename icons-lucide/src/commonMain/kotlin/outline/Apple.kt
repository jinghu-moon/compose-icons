package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Apple: ImageVector
    get() {
        if (_apple != null) return _apple!!
        _apple = lucideOutlineIcon(
            name = "Apple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 6.528f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.CurveTo(12.0f, 2.447715f, 12.447715f, 2.0f, 13.0f, 2.0f),
                    PathNode.LineTo(13.0f, 2.0f)
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
                    PathNode.MoveTo(18.237f, 21.0f),
                    PathNode.CurveTo(20.676231f, 18.241535f, 22.015602f, 14.682219f, 22.0f, 11.0f),
                    PathNode.CurveTo(21.999947f, 8.633918f, 20.609367f, 6.488807f, 18.449429f, 5.522883f),
                    PathNode.CurveTo(16.289488f, 4.556958f, 13.763574f, 4.950612f, 12.0f, 6.528f),
                    PathNode.CurveTo(10.236426f, 4.950612f, 7.710511f, 4.556958f, 5.550573f, 5.522883f),
                    PathNode.CurveTo(3.390633f, 6.488807f, 2.000054f, 8.633918f, 2.0f, 11.0f),
                    PathNode.CurveTo(1.99369f, 14.680543f, 3.331861f, 18.23667f, 5.763f, 21.0f),
                    PathNode.CurveTo(6.684403f, 22.030807f, 8.190958f, 22.298418f, 9.411f, 21.648f),
                    PathNode.CurveTo(11.029053f, 20.784712f, 12.970947f, 20.784712f, 14.589f, 21.648f),
                    PathNode.CurveTo(15.809042f, 22.298418f, 17.315598f, 22.030807f, 18.237f, 21.0f)
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
        return _apple!!
    }

private var _apple: ImageVector? = null
