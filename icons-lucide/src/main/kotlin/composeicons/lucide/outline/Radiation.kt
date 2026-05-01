package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Radiation: ImageVector
    get() {
        if (_radiation != null) return _radiation!!
        _radiation = lucideOutlineIcon(
            name = "Radiation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.01f, 12.0f)
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
                    PathNode.MoveTo(14.0f, 15.4641f),
                    PathNode.CurveTo(12.762396f, 16.17863f, 11.237604f, 16.17863f, 10.0f, 15.4641f),
                    PathNode.LineTo(7.52786f, 19.74597f),
                    PathNode.CurveTo(7.385597f, 19.992378f, 7.355035f, 20.287724f, 7.443828f, 20.558043f),
                    PathNode.CurveTo(7.532622f, 20.82836f, 7.732362f, 21.048056f, 7.99303f, 21.16211f),
                    PathNode.CurveTo(10.547536f, 22.2793f, 13.452464f, 22.2793f, 16.00697f, 21.16211f),
                    PathNode.CurveTo(16.26764f, 21.048056f, 16.467379f, 20.82836f, 16.556171f, 20.558043f),
                    PathNode.CurveTo(16.644966f, 20.287724f, 16.614405f, 19.992378f, 16.47214f, 19.74597f),
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
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.CurveTo(15.999964f, 10.570974f, 15.237573f, 9.250513f, 14.0f, 8.536f),
                    PathNode.LineTo(16.472f, 4.254f),
                    PathNode.CurveTo(16.614283f, 4.00732f, 16.85499f, 3.833002f, 17.133745f, 3.774769f),
                    PathNode.CurveTo(17.4125f, 3.716536f, 17.70286f, 3.779912f, 17.932f, 3.949f),
                    PathNode.CurveTo(20.176338f, 5.602794f, 21.628428f, 8.118396f, 21.938f, 10.889f),
                    PathNode.CurveTo(21.968966f, 11.162378f, 21.885933f, 11.436438f, 21.708445f, 11.646659f),
                    PathNode.CurveTo(21.530958f, 11.85688f, 21.2747f, 11.984691f, 21.0f, 12.0f),
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
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.000036f, 10.570974f, 8.762427f, 9.250513f, 10.0f, 8.536f),
                    PathNode.LineTo(7.528f, 4.254f),
                    PathNode.CurveTo(7.385717f, 4.00732f, 7.145011f, 3.833002f, 6.866256f, 3.774769f),
                    PathNode.CurveTo(6.5875f, 3.716536f, 6.297139f, 3.779912f, 6.068f, 3.949f),
                    PathNode.CurveTo(3.823662f, 5.602794f, 2.371573f, 8.118396f, 2.062f, 10.889f),
                    PathNode.CurveTo(2.031035f, 11.162378f, 2.11407f, 11.436438f, 2.291556f, 11.646659f),
                    PathNode.CurveTo(2.469043f, 11.85688f, 2.7253f, 11.984691f, 3.0f, 12.0f),
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
        return _radiation!!
    }

private var _radiation: ImageVector? = null
