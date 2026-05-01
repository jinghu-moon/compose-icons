package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = lucideOutlineIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.LineTo(20.0f, 12.0f),
                    PathNode.CurveTo(20.552284f, 12.0f, 21.0f, 12.447715f, 21.0f, 13.0f),
                    PathNode.CurveTo(21.0f, 15.761424f, 18.761423f, 18.0f, 16.0f, 18.0f),
                    PathNode.LineTo(15.402f, 18.0f),
                    PathNode.CurveTo(15.220237f, 18.0f, 15.052791f, 18.098639f, 14.964678f, 18.257616f),
                    PathNode.CurveTo(14.876565f, 18.416594f, 14.881665f, 18.610865f, 14.978f, 18.765f),
                    PathNode.LineTo(16.522f, 21.235f),
                    PathNode.CurveTo(16.618334f, 21.389135f, 16.623436f, 21.583406f, 16.535322f, 21.742384f),
                    PathNode.CurveTo(16.447208f, 21.901361f, 16.279762f, 22.0f, 16.098f, 22.0f),
                    PathNode.LineTo(5.402f, 22.0f),
                    PathNode.CurveTo(5.220238f, 22.0f, 5.052791f, 21.901361f, 4.964678f, 21.742384f),
                    PathNode.CurveTo(4.876565f, 21.583406f, 4.881666f, 21.389135f, 4.978f, 21.235f),
                    PathNode.LineTo(7.0f, 18.0f)
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
                    PathNode.MoveTo(8.0f, 18.0f),
                    PathNode.CurveTo(5.238577f, 18.0f, 3.0f, 15.761424f, 3.0f, 13.0f),
                    PathNode.LineTo(3.0f, 4.0f),
                    PathNode.CurveTo(3.0f, 2.895431f, 3.895431f, 2.0f, 5.0f, 2.0f),
                    PathNode.LineTo(13.0f, 2.0f),
                    PathNode.CurveTo(14.104569f, 2.0f, 15.0f, 2.895431f, 15.0f, 4.0f),
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
        }
        return _toilet!!
    }

private var _toilet: ImageVector? = null
