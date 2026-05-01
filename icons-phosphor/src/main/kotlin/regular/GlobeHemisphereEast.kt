package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) return _globeHemisphereEast!!
        _globeHemisphereEast = phosphorRegularIcon(
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
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(145.04953f, 39.981895f, 161.73296f, 44.94521f, 176.0f, 54.28f),
                    PathNode.LineTo(176.0f, 74.0f),
                    PathNode.LineTo(153.83f, 99.74f),
                    PathNode.LineTo(122.36f, 104.0f),
                    PathNode.LineTo(122.05f, 103.78f),
                    PathNode.LineTo(102.38f, 90.92f),
                    PathNode.CurveTo(98.85691f, 88.438286f, 94.48169f, 87.482666f, 90.244705f, 88.269455f),
                    PathNode.CurveTo(86.00772f, 89.05624f, 82.26726f, 91.518906f, 79.87f, 95.1f),
                    PathNode.LineTo(58.93f, 126.4f),
                    PathNode.CurveTo(57.18556f, 129.00836f, 56.246616f, 132.07211f, 56.23f, 135.21f),
                    PathNode.LineTo(56.0f, 171.44f),
                    PathNode.LineTo(52.73f, 173.59f),
                    PathNode.CurveTo(36.27117f, 146.4162f, 35.73686f, 112.48075f, 51.33204f, 84.80225f),
                    PathNode.CurveTo(66.92722f, 57.12376f, 96.230385f, 39.99995f, 128.0f, 40.0f),
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
                    PathNode.Close,
                    PathNode.MoveTo(185.0f, 195.0f),
                    PathNode.LineTo(180.7f, 190.69f),
                    PathNode.CurveTo(178.69418f, 188.67662f, 176.1883f, 187.23383f, 173.44f, 186.51f),
                    PathNode.LineTo(152.0f, 180.85f),
                    PathNode.LineTo(154.39f, 164.66f),
                    PathNode.LineTo(184.84f, 152.0f),
                    PathNode.LineTo(205.0f, 170.48f),
                    PathNode.CurveTo(199.86174f, 179.7893f, 193.08664f, 188.09558f, 185.0f, 195.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
