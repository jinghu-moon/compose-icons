package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) return _globeHemisphereEast!!
        _globeHemisphereEast = phosphorFillIcon(
            name = "GlobeHemisphereEast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.29f, 186.47f),
                    PathNode.LineTo(64.81f, 184.82f),
                    PathNode.CurveTo(69.2793f, 181.872f, 71.97787f, 176.88396f, 72.0f, 171.53f),
                    PathNode.LineTo(72.21f, 135.3f),
                    PathNode.LineTo(93.17f, 104.0f),
                    PathNode.CurveTo(93.27265f, 104.079f, 93.37947f, 104.15244f, 93.49f, 104.22f),
                    PathNode.LineTo(113.16f, 117.09f),
                    PathNode.CurveTo(116.45641f, 119.41651f, 120.51244f, 120.406395f, 124.51f, 119.86f),
                    PathNode.LineTo(156.0f, 115.59f),
                    PathNode.CurveTo(159.88326f, 115.071754f, 163.4414f, 113.14679f, 166.0f, 110.18f),
                    PathNode.LineTo(188.17f, 84.42f),
                    PathNode.CurveTo(190.64935f, 81.51508f, 192.00786f, 77.81912f, 192.0f, 74.0f),
                    PathNode.LineTo(192.0f, 67.67f),
                    PathNode.CurveTo(214.0397f, 90.9874f, 221.61816f, 124.463745f, 211.77f, 155.0f),
                    PathNode.LineTo(195.63f, 140.24f),
                    PathNode.CurveTo(191.04907f, 136.03516f, 184.44684f, 134.86525f, 178.7f, 137.24f),
                    PathNode.LineTo(148.24f, 149.89f),
                    PathNode.CurveTo(143.06012f, 152.0642f, 139.39038f, 156.78401f, 138.56f, 162.34f),
                    PathNode.LineTo(136.17f, 178.53f),
                    PathNode.CurveTo(134.98055f, 186.59883f, 140.05078f, 194.27095f, 147.94f, 196.34f),
                    PathNode.LineTo(169.4f, 202.0f),
                    PathNode.LineTo(171.76f, 204.37f),
                    PathNode.CurveTo(135.63814f, 225.09529f, 89.929276f, 217.6212f, 62.29f, 186.47f),
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
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
