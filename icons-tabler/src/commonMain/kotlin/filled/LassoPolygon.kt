package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LassoPolygon: ImageVector
    get() {
        if (_lassoPolygon != null) return _lassoPolygon!!
        _lassoPolygon = tablerFilledIcon(
            name = "LassoPolygon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.581f, 2.186f),
                    PathNode.LineTo(12.147f, 6.876f),
                    PathNode.LineTo(19.649f, 4.064f),
                    PathNode.CurveTo(19.919226f, 3.962695f, 20.220041f, 3.98307f, 20.474136f, 4.119891f),
                    PathNode.CurveTo(20.728231f, 4.256712f, 20.910828f, 4.496635f, 20.975f, 4.778f),
                    PathNode.LineTo(20.994f, 4.89f),
                    PathNode.LineTo(21.994f, 13.89f),
                    PathNode.CurveTo(22.045973f, 14.358707f, 21.763432f, 14.800024f, 21.316f, 14.949f),
                    PathNode.LineTo(12.316f, 17.949f),
                    PathNode.CurveTo(12.137502f, 18.008545f, 11.945826f, 18.016514f, 11.763f, 17.972f),
                    PathNode.LineTo(7.329f, 16.89f),
                    PathNode.CurveTo(6.990423f, 17.307396f, 6.545933f, 17.626171f, 6.042f, 17.813f),
                    PathNode.CurveTo(6.137f, 18.799f, 6.416f, 19.713f, 6.868f, 20.503f),
                    PathNode.CurveTo(7.136857f, 20.981855f, 6.969246f, 21.587923f, 6.492552f, 21.860598f),
                    PathNode.CurveTo(6.015857f, 22.133268f, 5.408469f, 21.9705f, 5.132f, 21.496f),
                    PathNode.CurveTo(4.508f, 20.406f, 4.142f, 19.161f, 4.034f, 17.84f),
                    PathNode.CurveTo(2.817924f, 17.426395f, 2.000094f, 16.284489f, 2.0f, 15.0f),
                    PathNode.LineTo(2.005f, 14.824f),
                    PathNode.CurveTo(2.047654f, 14.096961f, 2.353327f, 13.410263f, 2.865f, 12.892f),
                    PathNode.LineTo(2.047f, 10.302f),
                    PathNode.CurveTo(1.987365f, 10.11473f, 1.984234f, 9.914039f, 2.038f, 9.725f),
                    PathNode.LineTo(4.038f, 2.725f),
                    PathNode.CurveTo(4.127263f, 2.41242f, 4.362893f, 2.162735f, 4.669783f, 2.055532f),
                    PathNode.CurveTo(4.976674f, 1.948329f, 5.316522f, 1.996989f, 5.581f, 2.186f),
                    PathNode.MoveTo(5.572f, 4.637f),
                    PathNode.LineTo(4.044f, 9.985f),
                    PathNode.LineTo(4.686f, 12.016f),
                    PathNode.QuadTo(4.841f, 12.0f, 5.0f, 12.0f),
                    PathNode.CurveTo(6.654904f, 11.999998f, 7.997242f, 13.340098f, 8.0f, 14.995f),
                    PathNode.LineTo(11.957f, 15.96f),
                    PathNode.LineTo(19.917f, 13.306f),
                    PathNode.LineTo(19.148f, 6.387f),
                    PathNode.LineTo(12.351f, 8.937f),
                    PathNode.CurveTo(12.079926f, 9.038227f, 11.778292f, 9.017073f, 11.524f, 8.879f),
                    PathNode.LineTo(11.419f, 8.814f),
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
        return _lassoPolygon!!
    }

private var _lassoPolygon: ImageVector? = null
