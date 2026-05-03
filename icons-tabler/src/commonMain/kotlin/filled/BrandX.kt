package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandX: ImageVector
    get() {
        if (_brandX != null) return _brandX!!
        _brandX = tablerFilledIcon(
            name = "BrandX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.267f, 3.0f),
                    PathNode.CurveTo(8.543712f, 3.000116f, 8.808006f, 3.114885f, 8.997f, 3.317f),
                    PathNode.LineTo(9.073f, 3.409f),
                    PathNode.LineTo(13.347f, 9.237f),
                    PathNode.LineTo(19.293f, 3.293f),
                    PathNode.CurveTo(19.666477f, 2.920789f, 20.264788f, 2.902519f, 20.660278f, 3.251249f),
                    PathNode.CurveTo(21.055767f, 3.599978f, 21.112535f, 4.195871f, 20.79f, 4.613f),
                    PathNode.LineTo(20.707f, 4.707f),
                    PathNode.LineTo(14.544f, 10.869f),
                    PathNode.LineTo(20.806f, 19.409f),
                    PathNode.CurveTo(21.017035f, 19.697025f, 21.058487f, 20.07572f, 20.914751f, 20.402575f),
                    PathNode.CurveTo(20.771017f, 20.729431f, 20.46391f, 20.954847f, 20.109f, 20.994f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.LineTo(15.733f, 21.0f),
                    PathNode.CurveTo(15.456288f, 20.999884f, 15.191994f, 20.885115f, 15.003f, 20.683f),
                    PathNode.LineTo(14.927f, 20.591f),
                    PathNode.LineTo(10.651f, 14.762f),
                    PathNode.LineTo(4.707f, 20.707f),
                    PathNode.CurveTo(4.333524f, 21.07921f, 3.735212f, 21.09748f, 3.339722f, 20.74875f),
                    PathNode.CurveTo(2.944231f, 20.400023f, 2.887465f, 19.804129f, 3.21f, 19.387f),
                    PathNode.LineTo(3.293f, 19.293f),
                    PathNode.LineTo(9.454f, 13.13f),
                    PathNode.LineTo(3.194f, 4.591f),
                    PathNode.CurveTo(2.982965f, 4.302975f, 2.941516f, 3.924281f, 3.08525f, 3.597425f),
                    PathNode.CurveTo(3.228984f, 3.27057f, 3.53609f, 3.045152f, 3.891f, 3.006f),
                    PathNode.LineTo(4.0f, 3.0f),
                    PathNode.LineTo(8.267f, 3.0f),
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
        return _brandX!!
    }

private var _brandX: ImageVector? = null
