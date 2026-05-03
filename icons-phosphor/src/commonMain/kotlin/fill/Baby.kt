package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorFillIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.16f, 24.1f),
                    PathNode.CurveTo(132.73549f, 24.025394f, 131.37904f, 24.71505f, 130.6f, 25.91f),
                    PathNode.CurveTo(120.3f, 41.48f, 120.0f, 55.79f, 120.0f, 56.0f),
                    PathNode.CurveTo(120.00952f, 58.411068f, 121.10596f, 60.689247f, 122.98434f, 62.20088f),
                    PathNode.CurveTo(124.862724f, 63.71251f, 127.32268f, 64.29635f, 129.68f, 63.79f),
                    PathNode.CurveTo(133.42174f, 62.89374f, 136.04514f, 59.527317f, 136.0f, 55.68f),
                    PathNode.CurveTo(136.0773f, 53.468197f, 137.0674f, 51.387234f, 138.73485f, 49.93201f),
                    PathNode.CurveTo(140.40228f, 48.476784f, 142.59807f, 47.777336f, 144.8f, 48.0f),
                    PathNode.CurveTo(148.95967f, 48.48292f, 152.07423f, 52.043053f, 152.0f, 56.23f),
                    PathNode.CurveTo(151.92545f, 69.48483f, 141.11983f, 80.169556f, 127.865f, 80.095f),
                    PathNode.CurveTo(114.61017f, 80.02044f, 103.92544f, 69.21484f, 104.0f, 55.96f),
                    PathNode.CurveTo(104.0f, 55.33f, 104.09f, 45.18f, 109.44f, 31.96f),
                    PathNode.CurveTo(109.992226f, 30.58128f, 109.735085f, 29.010096f, 108.77216f, 27.879345f),
                    PathNode.CurveTo(107.80924f, 26.748592f, 106.29908f, 26.244452f, 104.85f, 26.57f),
                    PathNode.CurveTo(56.23288f, 37.73754f, 22.358486f, 81.80612f, 24.07f, 131.66f),
                    PathNode.CurveTo(26.0f, 186.72f, 71.23f, 231.0f, 126.32f, 231.9f),
                    PathNode.CurveTo(182.84352f, 232.76578f, 229.70757f, 188.32315f, 231.83885f, 131.83318f),
                    PathNode.CurveTo(233.97014f, 75.343216f, 190.58807f, 27.495726f, 134.16f, 24.1f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 127.91f),
                    PathNode.CurveTo(80.0f, 121.282585f, 85.37258f, 115.91f, 92.0f, 115.91f),
                    PathNode.CurveTo(98.62742f, 115.91f, 104.0f, 121.282585f, 104.0f, 127.91f),
                    PathNode.CurveTo(104.0f, 134.53741f, 98.62742f, 139.91f, 92.0f, 139.91f),
                    PathNode.CurveTo(85.37258f, 139.91f, 80.0f, 134.53741f, 80.0f, 127.91f),
                    PathNode.Close,
                    PathNode.MoveTo(160.27f, 182.68f),
                    PathNode.CurveTo(140.51846f, 194.9929f, 115.481544f, 194.9929f, 95.73f, 182.68f),
                    PathNode.CurveTo(91.991035f, 180.32175f, 90.87174f, 175.37897f, 93.23f, 171.64f),
                    PathNode.CurveTo(95.58826f, 167.90103f, 100.53103f, 166.78174f, 104.27f, 169.14f),
                    PathNode.CurveTo(118.80414f, 178.16049f, 137.19586f, 178.16049f, 151.73f, 169.14f),
                    PathNode.CurveTo(155.46896f, 166.78174f, 160.41174f, 167.90103f, 162.77f, 171.64f),
                    PathNode.CurveTo(165.12825f, 175.37897f, 164.00897f, 180.32175f, 160.27f, 182.68f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 139.91f),
                    PathNode.CurveTo(157.37259f, 139.91f, 152.0f, 134.53741f, 152.0f, 127.91f),
                    PathNode.CurveTo(152.0f, 121.282585f, 157.37259f, 115.91f, 164.0f, 115.91f),
                    PathNode.CurveTo(170.62741f, 115.91f, 176.0f, 121.282585f, 176.0f, 127.91f),
                    PathNode.CurveTo(176.0f, 134.53741f, 170.62741f, 139.91f, 164.0f, 139.91f),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
