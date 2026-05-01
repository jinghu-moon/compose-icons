package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TvMinimalPlay: ImageVector
    get() {
        if (_tvMinimalPlay != null) return _tvMinimalPlay!!
        _tvMinimalPlay = lucideOutlineIcon(
            name = "TvMinimalPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.033f, 9.44f),
                    PathNode.CurveTo(15.232872f, 9.555658f, 15.355949f, 9.769076f, 15.355949f, 10.0f),
                    PathNode.CurveTo(15.355949f, 10.230924f, 15.232872f, 10.444342f, 15.033f, 10.56f),
                    PathNode.LineTo(10.968f, 12.912f),
                    PathNode.CurveTo(10.768187f, 13.027602f, 10.521828f, 13.027605f, 10.322011f, 12.912009f),
                    PathNode.CurveTo(10.122195f, 12.796412f, 9.999391f, 12.582844f, 10.0f, 12.352f),
                    PathNode.LineTo(10.0f, 7.648f),
                    PathNode.CurveTo(9.999598f, 7.417466f, 10.122266f, 7.204244f, 10.321762f, 7.088714f),
                    PathNode.CurveTo(10.521259f, 6.973183f, 10.767248f, 6.972911f, 10.967f, 7.088f),
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
                    PathNode.MoveTo(7.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f)
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
                    PathNode.MoveTo(4.0f, 3.0f),
                    PathNode.LineTo(20.0f, 3.0f),
                    PathNode.CurveTo(21.10457f, 3.0f, 22.0f, 3.895431f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 15.0f),
                    PathNode.CurveTo(22.0f, 16.10457f, 21.10457f, 17.0f, 20.0f, 17.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(2.895431f, 17.0f, 2.0f, 16.10457f, 2.0f, 15.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.895431f, 2.895431f, 3.0f, 4.0f, 3.0f),
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
        }
        return _tvMinimalPlay!!
    }

private var _tvMinimalPlay: ImageVector? = null
