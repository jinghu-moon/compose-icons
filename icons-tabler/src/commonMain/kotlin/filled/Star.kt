package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = tablerFilledIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.243f, 7.34f),
                    PathNode.LineTo(1.863f, 8.265001f),
                    PathNode.LineTo(1.75f, 8.288f),
                    PathNode.CurveTo(1.401742f, 8.380451f, 1.13015f, 8.65311f, 1.039062f, 9.001726f),
                    PathNode.CurveTo(0.947975f, 9.350344f, 1.051478f, 9.721007f, 1.31f, 9.972f),
                    PathNode.LineTo(5.932f, 14.471f),
                    PathNode.LineTo(4.842f, 20.826f),
                    PathNode.LineTo(4.829f, 20.936f),
                    PathNode.CurveTo(4.807681f, 21.29621f, 4.982075f, 21.639969f, 5.285336f, 21.835514f),
                    PathNode.CurveTo(5.588597f, 22.03106f, 5.973686f, 22.04806f, 6.293f, 21.88f),
                    PathNode.LineTo(11.999f, 18.88f),
                    PathNode.LineTo(17.692f, 21.88f),
                    PathNode.LineTo(17.792f, 21.926f),
                    PathNode.CurveTo(18.128073f, 22.058374f, 18.50941f, 21.999228f, 18.789593f, 21.771267f),
                    PathNode.CurveTo(19.069777f, 21.543308f, 19.205252f, 21.181973f, 19.144f, 20.826f),
                    PathNode.LineTo(18.053f, 14.471f),
                    PathNode.LineTo(22.677f, 9.971f),
                    PathNode.LineTo(22.755f, 9.886f),
                    PathNode.CurveTo(22.981833f, 9.606626f, 23.041061f, 9.226917f, 22.91009f, 8.89173f),
                    PathNode.CurveTo(22.77912f, 8.556544f, 22.47815f, 8.31758f, 22.122f, 8.266f),
                    PathNode.LineTo(15.742f, 7.34f),
                    PathNode.LineTo(12.89f, 1.56f),
                    PathNode.CurveTo(12.721649f, 1.218371f, 12.373857f, 1.002031f, 11.993f, 1.002031f),
                    PathNode.CurveTo(11.612143f, 1.002031f, 11.264351f, 1.218371f, 11.096f, 1.56f),
                    PathNode.LineTo(8.243f, 7.34f),
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
        return _star!!
    }

private var _star: ImageVector? = null
