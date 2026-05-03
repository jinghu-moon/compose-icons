package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FilePlay: ImageVector
    get() {
        if (_filePlay != null) return _filePlay!!
        _filePlay = lucideOutlineIcon(
            name = "FilePlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 22.0f),
                    PathNode.CurveTo(4.895431f, 22.0f, 4.0f, 21.10457f, 4.0f, 20.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(4.0f, 2.895431f, 4.895431f, 2.0f, 6.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.CurveTo(14.639365f, 1.998964f, 15.252715f, 2.253087f, 15.704f, 2.706f),
                    PathNode.LineTo(19.292f, 6.294f),
                    PathNode.CurveTo(19.74614f, 6.745445f, 20.00104f, 7.359654f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.CurveTo(20.0f, 21.10457f, 19.10457f, 22.0f, 18.0f, 22.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 7.552285f, 14.447715f, 8.0f, 15.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f)
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
                    PathNode.MoveTo(15.033f, 13.44f),
                    PathNode.CurveTo(15.232872f, 13.555658f, 15.355949f, 13.769076f, 15.355949f, 14.0f),
                    PathNode.CurveTo(15.355949f, 14.230924f, 15.232872f, 14.444342f, 15.033f, 14.56f),
                    PathNode.LineTo(10.968f, 16.912f),
                    PathNode.CurveTo(10.768187f, 17.027601f, 10.521828f, 17.027605f, 10.322011f, 16.912008f),
                    PathNode.CurveTo(10.122195f, 16.796413f, 9.999391f, 16.582844f, 10.0f, 16.352f),
                    PathNode.LineTo(10.0f, 11.648f),
                    PathNode.CurveTo(9.999598f, 11.417466f, 10.122266f, 11.204245f, 10.321762f, 11.088714f),
                    PathNode.CurveTo(10.521259f, 10.973184f, 10.767248f, 10.972911f, 10.967f, 11.088f),
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
        return _filePlay!!
    }

private var _filePlay: ImageVector? = null
