package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlaneTilt: ImageVector
    get() {
        if (_planeTilt != null) return _planeTilt!!
        _planeTilt = tablerFilledIcon(
            name = "PlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.107f, 2.893f),
                    PathNode.CurveTo(22.295519f, 4.078801f, 22.300886f, 6.002587f, 21.119f, 7.195f),
                    PathNode.LineTo(18.64f, 9.759f),
                    PathNode.LineTo(20.949f, 16.684f),
                    PathNode.CurveTo(21.067429f, 17.039936f, 20.976694f, 17.432217f, 20.714f, 17.7f),
                    PathNode.LineTo(18.214f, 20.25f),
                    PathNode.CurveTo(17.991058f, 20.47733f, 17.673183f, 20.584904f, 17.358007f, 20.53968f),
                    PathNode.CurveTo(17.04283f, 20.494457f, 16.768026f, 20.301846f, 16.618f, 20.021f),
                    PathNode.LineTo(13.754f, 14.661f),
                    PathNode.LineTo(12.0f, 16.414f),
                    PathNode.LineTo(12.0f, 19.0f),
                    PathNode.CurveTo(11.999944f, 19.265194f, 11.894549f, 19.519506f, 11.707f, 19.707f),
                    PathNode.LineTo(9.707f, 21.707f),
                    PathNode.CurveTo(9.462063f, 21.952198f, 9.10763f, 22.05309f, 8.77028f, 21.973642f),
                    PathNode.CurveTo(8.432931f, 21.894194f, 8.160772f, 21.645735f, 8.051f, 21.317f),
                    PathNode.LineTo(6.71f, 17.29f),
                    PathNode.LineTo(2.685f, 15.948f),
                    PathNode.CurveTo(2.356104f, 15.838464f, 2.107399f, 15.566406f, 2.02774f, 15.229027f),
                    PathNode.CurveTo(1.948081f, 14.891647f, 2.048833f, 14.537079f, 2.294f, 14.292f),
                    PathNode.LineTo(4.294f, 12.292f),
                    PathNode.CurveTo(4.481411f, 12.105062f, 4.735296f, 12.000056f, 5.0f, 12.0f),
                    PathNode.LineTo(7.586f, 12.0f),
                    PathNode.LineTo(9.343f, 10.243f),
                    PathNode.LineTo(4.026f, 7.38f),
                    PathNode.CurveTo(3.747891f, 7.230095f, 3.55698f, 6.95758f, 3.511087f, 6.644995f),
                    PathNode.CurveTo(3.465193f, 6.332409f, 3.569717f, 6.016519f, 3.793f, 5.793f),
                    PathNode.LineTo(6.293f, 3.293f),
                    PathNode.CurveTo(6.560675f, 3.025148f, 6.956685f, 2.931468f, 7.316f, 3.051f),
                    PathNode.LineTo(14.241f, 5.36f),
                    PathNode.LineTo(16.793f, 2.893f),
                    PathNode.CurveTo(17.365013f, 2.320816f, 18.14093f, 1.999351f, 18.95f, 1.999351f),
                    PathNode.CurveTo(19.75907f, 1.999351f, 20.534988f, 2.320816f, 21.107f, 2.893f)
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
        return _planeTilt!!
    }

private var _planeTilt: ImageVector? = null
