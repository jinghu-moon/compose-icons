package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = tablerFilledIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.0f),
                    PathNode.CurveTo(12.331024f, 1.001258f, 12.639654f, 1.167386f, 12.823f, 1.443f),
                    PathNode.LineTo(12.89f, 1.559f),
                    PathNode.LineTo(15.742f, 7.34f),
                    PathNode.LineTo(22.122f, 8.265001f),
                    PathNode.CurveTo(22.863f, 8.373f, 23.202f, 9.205f, 22.825f, 9.791f),
                    PathNode.LineTo(22.755f, 9.886f),
                    PathNode.LineTo(22.677f, 9.972f),
                    PathNode.LineTo(18.053f, 14.471f),
                    PathNode.LineTo(19.143f, 20.826f),
                    PathNode.CurveTo(19.200705f, 21.162893f, 19.082523f, 21.505941f, 18.829565f, 21.73581f),
                    PathNode.CurveTo(18.57661f, 21.96568f, 18.223848f, 22.050589f, 17.894f, 21.961f),
                    PathNode.LineTo(17.793f, 21.926f),
                    PathNode.LineTo(17.692f, 21.88f),
                    PathNode.LineTo(11.999f, 18.88f),
                    PathNode.LineTo(6.293f, 21.88f),
                    PathNode.CurveTo(6.188f, 21.935f, 6.081f, 21.97f, 5.973f, 21.986f),
                    PathNode.LineTo(5.867f, 21.996f),
                    PathNode.CurveTo(5.584787f, 22.00632f, 5.311299f, 21.897194f, 5.113715f, 21.695423f),
                    PathNode.CurveTo(4.916132f, 21.493652f, 4.812763f, 21.217934f, 4.829f, 20.936f),
                    PathNode.LineTo(4.842f, 20.826f),
                    PathNode.LineTo(5.932f, 14.471f),
                    PathNode.LineTo(1.309f, 9.971f),
                    PathNode.CurveTo(1.066109f, 9.734419f, 0.959492f, 9.390962f, 1.025717f, 9.058424f),
                    PathNode.CurveTo(1.091942f, 8.725886f, 1.322004f, 8.449478f, 1.637f, 8.324001f),
                    PathNode.LineTo(1.75f, 8.288f),
                    PathNode.LineTo(1.864f, 8.265001f),
                    PathNode.LineTo(8.243f, 7.34f),
                    PathNode.LineTo(11.096f, 1.56f),
                    PathNode.CurveTo(11.25864f, 1.209712f, 11.613935f, 0.989618f, 12.0f, 1.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 4.274f),
                    PathNode.LineTo(12.0f, 16.75f),
                    PathNode.CurveTo(12.080544f, 16.750006f, 12.160792f, 16.759743f, 12.239f, 16.779f),
                    PathNode.LineTo(12.354f, 16.815f),
                    PathNode.LineTo(12.466f, 16.865f),
                    PathNode.LineTo(16.829f, 19.164f),
                    PathNode.LineTo(15.993f, 14.291f),
                    PathNode.CurveTo(15.951786f, 14.050176f, 16.000164f, 13.802596f, 16.129f, 13.595f),
                    PathNode.LineTo(16.199f, 13.496f),
                    PathNode.LineTo(16.281f, 13.406f),
                    PathNode.LineTo(19.827f, 9.953f),
                    PathNode.LineTo(14.936f, 9.245f),
                    PathNode.CurveTo(14.694254f, 9.209908f, 14.473714f, 9.087544f, 14.316f, 8.901f),
                    PathNode.LineTo(14.243f, 8.804f),
                    PathNode.LineTo(14.183f, 8.698f),
                    PathNode.LineTo(12.0f, 4.274f),
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
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
