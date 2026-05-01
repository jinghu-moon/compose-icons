package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cloudy: ImageVector
    get() {
        if (_cloudy != null) return _cloudy!!
        _cloudy = lucideOutlineIcon(
            name = "Cloudy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.5f, 12.0f),
                    PathNode.CurveTo(19.98528f, 12.0f, 22.0f, 14.014719f, 22.0f, 16.5f),
                    PathNode.CurveTo(22.0f, 18.98528f, 19.98528f, 21.0f, 17.5f, 21.0f),
                    PathNode.LineTo(9.006f, 21.0f),
                    PathNode.CurveTo(5.400681f, 21.003195f, 2.382617f, 18.267467f, 2.032821f, 14.679156f),
                    PathNode.CurveTo(1.683026f, 11.090845f, 4.115924f, 7.823748f, 7.653985f, 7.130593f),
                    PathNode.CurveTo(11.192045f, 6.437438f, 14.677907f, 8.544968f, 15.708f, 12.0f),
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
                    PathNode.MoveTo(21.832f, 9.0f),
                    PathNode.CurveTo(21.40778f, 7.800123f, 20.27266f, 6.998485f, 19.0f, 7.0f),
                    PathNode.LineTo(16.793f, 7.0f),
                    PathNode.CurveTo(16.091152f, 4.520182f, 13.761476f, 2.860266f, 11.188413f, 3.006681f),
                    PathNode.CurveTo(8.615351f, 3.153096f, 6.489011f, 5.066573f, 6.073f, 7.61f)
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
        return _cloudy!!
    }

private var _cloudy: ImageVector? = null
