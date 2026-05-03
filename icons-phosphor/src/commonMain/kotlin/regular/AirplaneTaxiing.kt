package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AirplaneTaxiing: ImageVector
    get() {
        if (_airplaneTaxiing != null) return _airplaneTaxiing!!
        _airplaneTaxiing = phosphorRegularIcon(
            name = "AirplaneTaxiing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.LineTo(147.32f, 96.0f),
                    PathNode.LineTo(101.66f, 50.34f),
                    PathNode.CurveTo(100.158424f, 48.84009f, 98.12237f, 47.998333f, 96.0f, 48.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.CurveTo(82.85839f, 48.00283f, 78.0314f, 50.476406f, 75.02625f, 54.64836f),
                    PathNode.CurveTo(72.0211f, 58.820312f, 71.203964f, 64.18228f, 72.83f, 69.06f),
                    PathNode.LineTo(81.83f, 96.0f),
                    PathNode.LineTo(59.32f, 96.0f),
                    PathNode.LineTo(37.66f, 74.34f),
                    PathNode.CurveTo(36.158424f, 72.84009f, 34.12237f, 71.99833f, 32.0f, 72.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(18.94441f, 72.00458f, 14.188396f, 74.39827f, 11.172718f, 78.45594f),
                    PathNode.CurveTo(8.157041f, 82.51361f, 7.236515f, 87.75785f, 8.69f, 92.6f),
                    PathNode.LineTo(22.76f, 139.49f),
                    PathNode.CurveTo(27.762486f, 156.45985f, 43.378353f, 168.08107f, 61.07f, 168.0f),
                    PathNode.LineTo(240.0f, 168.0f),
                    PathNode.CurveTo(244.41827f, 168.0f, 248.0f, 164.41827f, 248.0f, 160.0f),
                    PathNode.LineTo(248.0f, 136.0f),
                    PathNode.CurveTo(248.0f, 113.90861f, 230.09138f, 96.0f, 208.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 152.0f),
                    PathNode.LineTo(61.07f, 152.0f),
                    PathNode.CurveTo(50.4515f, 152.05566f, 41.07513f, 145.08453f, 38.07f, 134.9f),
                    PathNode.LineTo(24.0f, 88.0f),
                    PathNode.LineTo(28.68f, 88.0f),
                    PathNode.LineTo(50.34f, 109.66f),
                    PathNode.CurveTo(51.841576f, 111.15991f, 53.87763f, 112.00167f, 56.0f, 112.0f),
                    PathNode.LineTo(92.9f, 112.0f),
                    PathNode.CurveTo(95.47169f, 112.00019f, 97.886665f, 110.76407f, 99.39041f, 108.67785f),
                    PathNode.CurveTo(100.89416f, 106.59163f, 101.3033f, 103.9097f, 100.49f, 101.47f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.LineTo(92.68f, 64.0f),
                    PathNode.LineTo(138.34f, 109.66f),
                    PathNode.CurveTo(139.84158f, 111.15991f, 141.87762f, 112.00167f, 144.0f, 112.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.CurveTo(221.25484f, 112.0f, 232.0f, 122.74516f, 232.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 200.0f),
                    PathNode.CurveTo(224.0f, 208.83656f, 216.83656f, 216.0f, 208.0f, 216.0f),
                    PathNode.CurveTo(199.16344f, 216.0f, 192.0f, 208.83656f, 192.0f, 200.0f),
                    PathNode.CurveTo(192.0f, 191.16344f, 199.16344f, 184.0f, 208.0f, 184.0f),
                    PathNode.CurveTo(216.83656f, 184.0f, 224.0f, 191.16344f, 224.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(128.0f, 208.83656f, 120.836555f, 216.0f, 112.0f, 216.0f),
                    PathNode.CurveTo(103.163445f, 216.0f, 96.0f, 208.83656f, 96.0f, 200.0f),
                    PathNode.CurveTo(96.0f, 191.16344f, 103.163445f, 184.0f, 112.0f, 184.0f),
                    PathNode.CurveTo(120.836555f, 184.0f, 128.0f, 191.16344f, 128.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _airplaneTaxiing!!
    }

private var _airplaneTaxiing: ImageVector? = null
