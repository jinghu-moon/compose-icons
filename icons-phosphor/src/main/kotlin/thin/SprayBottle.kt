package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) return _sprayBottle!!
        _sprayBottle = phosphorThinIcon(
            name = "SprayBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 76.0f),
                    PathNode.CurveTo(202.20914f, 76.0f, 204.0f, 74.20914f, 204.0f, 72.0f),
                    PathNode.CurveTo(203.96693f, 43.2949f, 180.7051f, 20.033064f, 152.0f, 20.0f),
                    PathNode.LineTo(80.0f, 20.0f),
                    PathNode.CurveTo(73.37258f, 20.0f, 68.0f, 25.372583f, 68.0f, 32.0f),
                    PathNode.LineTo(68.0f, 80.0f),
                    PathNode.CurveTo(68.0f, 95.463974f, 55.46397f, 108.0f, 40.0f, 108.0f),
                    PathNode.CurveTo(37.79086f, 108.0f, 36.0f, 109.79086f, 36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 114.20914f, 37.79086f, 116.0f, 40.0f, 116.0f),
                    PathNode.CurveTo(59.88225f, 116.0f, 76.0f, 99.88225f, 76.0f, 80.0f),
                    PathNode.LineTo(76.0f, 76.0f),
                    PathNode.LineTo(116.0f, 76.0f),
                    PathNode.LineTo(116.0f, 104.62f),
                    PathNode.CurveTo(116.02037f, 113.129684f, 112.14906f, 121.1817f, 105.49f, 126.48f),
                    PathNode.LineTo(89.49f, 139.27f),
                    PathNode.CurveTo(80.93488f, 146.08693f, 75.965904f, 156.44112f, 76.0f, 167.38f),
                    PathNode.LineTo(76.0f, 224.0f),
                    PathNode.CurveTo(76.0f, 230.62741f, 81.37258f, 236.0f, 88.0f, 236.0f),
                    PathNode.LineTo(192.0f, 236.0f),
                    PathNode.CurveTo(198.62741f, 236.0f, 204.0f, 230.62741f, 204.0f, 224.0f),
                    PathNode.LineTo(204.0f, 211.47f),
                    PathNode.CurveTo(204.0098f, 163.82819f, 191.2653f, 117.052376f, 167.09f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 32.0f),
                    PathNode.CurveTo(76.0f, 29.790861f, 77.79086f, 28.0f, 80.0f, 28.0f),
                    PathNode.LineTo(152.0f, 28.0f),
                    PathNode.CurveTo(174.7405f, 28.02712f, 193.72455f, 45.356243f, 195.82f, 68.0f),
                    PathNode.LineTo(76.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 211.47f),
                    PathNode.LineTo(196.0f, 224.0f),
                    PathNode.CurveTo(196.0f, 226.20914f, 194.20914f, 228.0f, 192.0f, 228.0f),
                    PathNode.LineTo(88.0f, 228.0f),
                    PathNode.CurveTo(85.79086f, 228.0f, 84.0f, 226.20914f, 84.0f, 224.0f),
                    PathNode.LineTo(84.0f, 167.38f),
                    PathNode.CurveTo(83.97963f, 158.87032f, 87.85094f, 150.8183f, 94.51f, 145.52f),
                    PathNode.LineTo(110.51f, 132.73f),
                    PathNode.CurveTo(119.06512f, 125.91308f, 124.034096f, 115.55889f, 124.0f, 104.62f),
                    PathNode.LineTo(124.0f, 76.0f),
                    PathNode.LineTo(157.76f, 76.0f),
                    PathNode.CurveTo(182.77682f, 116.75688f, 196.01303f, 163.64778f, 196.0f, 211.47f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
