package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LoaderCircle: ImageVector
    get() {
        if (_loaderCircle != null) return _loaderCircle!!
        _loaderCircle = lucideOutlineIcon(
            name = "LoaderCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(20.99981f, 15.898981f, 18.489067f, 19.354425f, 14.780876f, 20.559156f),
                    PathNode.CurveTo(11.072686f, 21.763887f, 7.010479f, 20.44389f, 4.718765f, 17.289513f),
                    PathNode.CurveTo(2.42705f, 14.135135f, 2.427081f, 9.863844f, 4.718841f, 6.7095f),
                    PathNode.CurveTo(7.010601f, 3.555155f, 11.072827f, 2.235215f, 14.781f, 3.44f)
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
        return _loaderCircle!!
    }

private var _loaderCircle: ImageVector? = null
