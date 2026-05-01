package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorFillIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 152.0f),
                    PathNode.LineTo(240.0f, 176.0f),
                    PathNode.CurveTo(240.0f, 184.83656f, 232.83656f, 192.0f, 224.0f, 192.0f),
                    PathNode.LineTo(115.93f, 192.0f),
                    PathNode.CurveTo(114.42554f, 192.00117f, 113.04766f, 191.15807f, 112.36389f, 189.81798f),
                    PathNode.CurveTo(111.68013f, 188.47787f, 111.80613f, 186.86745f, 112.69f, 185.65f),
                    PathNode.LineTo(174.27f, 101.0f),
                    PathNode.CurveTo(176.9224f, 97.47672f, 176.31749f, 92.48737f, 172.9f, 89.7f),
                    PathNode.CurveTo(171.19052f, 88.37368f, 169.01671f, 87.79635f, 166.8744f, 88.0997f),
                    PathNode.CurveTo(164.73212f, 88.40305f, 162.80405f, 89.56121f, 161.53f, 91.31f),
                    PathNode.LineTo(89.53f, 190.37f),
                    PathNode.CurveTo(88.76426f, 191.41139f, 87.54248f, 192.01855f, 86.25f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(23.163445f, 192.0f, 16.0f, 184.83656f, 16.0f, 176.0f),
                    PathNode.LineTo(16.0f, 153.13f),
                    PathNode.CurveTo(16.0f, 151.34f, 16.0f, 149.56f, 16.13f, 147.8f),
                    PathNode.CurveTo(16.236666f, 145.66933f, 17.996666f, 143.99733f, 20.13f, 144.0f),
                    PathNode.LineTo(48.0f, 144.0f),
                    PathNode.CurveTo(50.216835f, 144.00487f, 52.336304f, 143.08966f, 53.85281f, 141.47269f),
                    PathNode.CurveTo(55.369312f, 139.85571f, 56.14687f, 137.68199f, 56.0f, 135.47f),
                    PathNode.CurveTo(55.632877f, 131.19453f, 52.020653f, 127.93174f, 47.73f, 128.0f),
                    PathNode.LineTo(23.92f, 128.0f),
                    PathNode.CurveTo(22.683372f, 127.99908f, 21.516703f, 127.42623f, 20.759792f, 126.44831f),
                    PathNode.CurveTo(20.00288f, 125.47039f, 19.740843f, 124.19736f, 20.05f, 123.0f),
                    PathNode.CurveTo(32.05f, 79.16f, 69.71f, 45.87f, 115.57f, 40.72f),
                    PathNode.CurveTo(116.70316f, 40.597458f, 117.834785f, 40.96414f, 118.68073f, 41.72797f),
                    PathNode.CurveTo(119.52669f, 42.49181f, 120.00661f, 43.58025f, 120.0f, 44.72f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.CurveTo(119.99513f, 74.216835f, 120.91034f, 76.3363f, 122.52731f, 77.852806f),
                    PathNode.CurveTo(124.14429f, 79.36931f, 126.31803f, 80.14687f, 128.53f, 80.0f),
                    PathNode.CurveTo(132.80547f, 79.63287f, 136.06825f, 76.02065f, 136.0f, 71.73f),
                    PathNode.LineTo(136.0f, 44.67f),
                    PathNode.CurveTo(135.9934f, 43.53025f, 136.47331f, 42.441807f, 137.31926f, 41.67797f),
                    PathNode.CurveTo(138.1652f, 40.914135f, 139.29684f, 40.547455f, 140.43f, 40.67f),
                    PathNode.CurveTo(186.248f, 45.81861f, 224.24992f, 78.47726f, 236.23f, 123.0f),
                    PathNode.CurveTo(236.5396f, 124.19906f, 236.27635f, 125.47389f, 235.51715f, 126.45226f),
                    PathNode.CurveTo(234.75793f, 127.43063f, 233.58838f, 128.00217f, 232.35f, 128.0f),
                    PathNode.LineTo(208.27f, 128.0f),
                    PathNode.CurveTo(203.987f, 127.94234f, 200.38661f, 131.20233f, 200.02f, 135.47f),
                    PathNode.CurveTo(199.87312f, 137.68199f, 200.65068f, 139.85571f, 202.16719f, 141.47269f),
                    PathNode.CurveTo(203.6837f, 143.08966f, 205.80316f, 144.00487f, 208.02f, 144.0f),
                    PathNode.LineTo(235.94f, 144.0f),
                    PathNode.CurveTo(238.0956f, 143.99867f, 239.86455f, 145.70572f, 239.94f, 147.86f),
                    PathNode.CurveTo(240.0f, 149.23f, 240.0f, 150.61f, 240.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _gauge!!
    }

private var _gauge: ImageVector? = null
