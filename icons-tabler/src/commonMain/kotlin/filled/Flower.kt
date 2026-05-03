package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flower: ImageVector
    get() {
        if (_flower != null) return _flower!!
        _flower = tablerFilledIcon(
            name = "Flower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.0f),
                    PathNode.CurveTo(14.209139f, 1.0f, 16.0f, 2.790861f, 16.0f, 5.0f),
                    PathNode.LineTo(15.998f, 5.055f),
                    PathNode.LineTo(16.028f, 5.037f),
                    PathNode.CurveTo(16.870672f, 4.54815f, 17.863674f, 4.386209f, 18.818f, 4.582f),
                    PathNode.LineTo(19.055f, 4.638f),
                    PathNode.CurveTo(20.075186f, 4.913848f, 20.943281f, 5.585075f, 21.467f, 6.503f),
                    PathNode.CurveTo(22.565111f, 8.413874f, 21.915295f, 10.852805f, 20.012f, 11.964f),
                    PathNode.LineTo(19.944f, 12.0f),
                    PathNode.LineTo(20.015f, 12.039f),
                    PathNode.CurveTo(21.844507f, 13.108752f, 22.525719f, 15.417421f, 21.57f, 17.309f),
                    PathNode.LineTo(21.469f, 17.495f),
                    PathNode.CurveTo(20.945f, 18.414234f, 20.075724f, 19.086258f, 19.054155f, 19.361881f),
                    PathNode.CurveTo(18.032587f, 19.637505f, 16.943258f, 19.493917f, 16.028f, 18.963f),
                    PathNode.LineTo(15.998f, 18.943f),
                    PathNode.LineTo(16.0f, 19.0f),
                    PathNode.CurveTo(16.000002f, 21.131401f, 14.328735f, 22.88843f, 12.2f, 22.995f),
                    PathNode.LineTo(12.0f, 23.0f),
                    PathNode.CurveTo(9.790861f, 23.0f, 8.0f, 21.209139f, 8.0f, 19.0f),
                    PathNode.LineTo(8.001001f, 18.944f),
                    PathNode.LineTo(7.972f, 18.963f),
                    PathNode.CurveTo(7.129458f, 19.452192f, 6.136448f, 19.61449f, 5.182f, 19.419f),
                    PathNode.LineTo(4.946f, 19.363f),
                    PathNode.CurveTo(3.925443f, 19.087387f, 3.056951f, 18.416136f, 2.533f, 17.498f),
                    PathNode.CurveTo(1.435226f, 15.587872f, 2.084027f, 13.149844f, 3.986f, 12.038f),
                    PathNode.LineTo(4.056f, 12.0f),
                    PathNode.LineTo(3.985f, 11.962f),
                    PathNode.CurveTo(2.155493f, 10.892248f, 1.474282f, 8.583578f, 2.43f, 6.692f),
                    PathNode.LineTo(2.53f, 6.505f),
                    PathNode.CurveTo(3.054005f, 5.584947f, 3.923827f, 4.912333f, 4.946122f, 4.636667f),
                    PathNode.CurveTo(5.968417f, 4.361f, 7.058475f, 4.505123f, 7.974f, 5.037f),
                    PathNode.LineTo(8.0f, 5.055f),
                    PathNode.LineTo(8.0f, 5.0f),
                    PathNode.CurveTo(7.999999f, 2.868599f, 9.671265f, 1.11157f, 11.8f, 1.005f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.CurveTo(10.343145f, 9.0f, 9.0f, 10.343145f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 13.656855f, 10.343145f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.656855f, 15.0f, 15.0f, 13.656855f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.343145f, 13.656855f, 9.0f, 12.0f, 9.0f)
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
        return _flower!!
    }

private var _flower: ImageVector? = null
