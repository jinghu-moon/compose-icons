package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = tablerFilledIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 19.002f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.CurveTo(18.999933f, 21.506975f, 18.620493f, 21.933683f, 18.117f, 21.993f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(5.447716f, 22.0f, 5.0f, 21.552284f, 5.0f, 21.0f),
                    PathNode.LineTo(5.0f, 19.006f),
                    PathNode.CurveTo(5.0f, 18.453714f, 5.447716f, 18.006f, 6.0f, 18.006f),
                    PathNode.LineTo(18.0f, 18.002f),
                    PathNode.CurveTo(18.552284f, 18.002f, 19.0f, 18.449715f, 19.0f, 19.002f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(13.943936f, 1.99963f, 15.711882f, 3.125998f, 16.533f, 4.888f),
                    PathNode.LineTo(16.593f, 5.025f),
                    PathNode.LineTo(16.729f, 5.016f),
                    PathNode.CurveTo(18.987047f, 4.913847f, 21.032804f, 6.339318f, 21.719f, 8.493f),
                    PathNode.LineTo(21.782f, 8.706f),
                    PathNode.CurveTo(22.415989f, 11.046249f, 21.279587f, 13.504097f, 19.086f, 14.537f),
                    PathNode.LineTo(18.999f, 14.574f),
                    PathNode.LineTo(18.999f, 16.002f),
                    PathNode.CurveTo(18.999f, 16.554285f, 18.551285f, 17.002f, 17.999f, 17.002f),
                    PathNode.LineTo(5.999f, 17.006f),
                    PathNode.CurveTo(5.492026f, 17.005934f, 5.065316f, 16.626493f, 5.006f, 16.123f),
                    PathNode.LineTo(4.999f, 16.006f),
                    PathNode.LineTo(4.999f, 14.573f),
                    PathNode.LineTo(4.876f, 14.518f),
                    PathNode.CurveTo(3.632261f, 13.919421f, 2.691293f, 12.833326f, 2.276f, 11.517f),
                    PathNode.LineTo(2.212f, 11.294f),
                    PathNode.CurveTo(1.797346f, 9.732158f, 2.163081f, 8.066209f, 3.193833f, 6.821685f),
                    PathNode.CurveTo(4.224584f, 5.577161f, 5.793256f, 4.907518f, 7.405f, 5.024f),
                    PathNode.LineTo(7.471f, 4.882f),
                    PathNode.CurveTo(8.258538f, 3.197721f, 9.915619f, 2.089534f, 11.773f, 2.005f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
