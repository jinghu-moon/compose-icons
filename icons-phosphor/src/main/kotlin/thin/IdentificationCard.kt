package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) return _identificationCard!!
        _identificationCard = phosphorThinIcon(
            name = "IdentificationCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 112.0f),
                    PathNode.CurveTo(196.0f, 114.20914f, 194.20914f, 116.0f, 192.0f, 116.0f),
                    PathNode.LineTo(152.0f, 116.0f),
                    PathNode.CurveTo(149.79086f, 116.0f, 148.0f, 114.20914f, 148.0f, 112.0f),
                    PathNode.CurveTo(148.0f, 109.79086f, 149.79086f, 108.0f, 152.0f, 108.0f),
                    PathNode.LineTo(192.0f, 108.0f),
                    PathNode.CurveTo(194.20914f, 108.0f, 196.0f, 109.79086f, 196.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 140.0f),
                    PathNode.LineTo(152.0f, 140.0f),
                    PathNode.CurveTo(149.79086f, 140.0f, 148.0f, 141.79086f, 148.0f, 144.0f),
                    PathNode.CurveTo(148.0f, 146.20914f, 149.79086f, 148.0f, 152.0f, 148.0f),
                    PathNode.LineTo(192.0f, 148.0f),
                    PathNode.CurveTo(194.20914f, 148.0f, 196.0f, 146.20914f, 196.0f, 144.0f),
                    PathNode.CurveTo(196.0f, 141.79086f, 194.20914f, 140.0f, 192.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(228.0f, 200.0f),
                    PathNode.CurveTo(228.0f, 206.62741f, 222.62741f, 212.0f, 216.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(33.37258f, 212.0f, 28.0f, 206.62741f, 28.0f, 200.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 49.37258f, 33.37258f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(222.62741f, 44.0f, 228.0f, 49.37258f, 228.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 218.20914f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 202.20914f, 37.79086f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(218.20914f, 204.0f, 220.0f, 202.20914f, 220.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(131.87f, 167.0f),
                    PathNode.CurveTo(132.29024f, 168.40378f, 131.90927f, 169.92499f, 130.877f, 170.965f),
                    PathNode.CurveTo(129.84473f, 172.005f, 128.32642f, 172.39734f, 126.91953f, 171.9876f),
                    PathNode.CurveTo(125.51266f, 171.57785f, 124.44243f, 170.43164f, 124.13f, 169.0f),
                    PathNode.CurveTo(121.06f, 157.0f, 109.0f, 148.0f, 96.0f, 148.0f),
                    PathNode.CurveTo(83.0f, 148.0f, 71.0f, 157.0f, 67.87f, 169.0f),
                    PathNode.CurveTo(67.41428f, 170.765f, 65.82288f, 171.99864f, 64.0f, 172.0f),
                    PathNode.CurveTo(63.662422f, 172.00047f, 63.326237f, 171.95676f, 63.0f, 171.87f),
                    PathNode.CurveTo(60.863697f, 171.31635f, 59.57942f, 169.1371f, 60.13f, 167.0f),
                    PathNode.CurveTo(63.01885f, 156.43347f, 70.5273f, 147.73793f, 80.56f, 143.34f),
                    PathNode.CurveTo(70.24984f, 136.52489f, 65.62733f, 123.75618f, 69.18555f, 111.920456f),
                    PathNode.CurveTo(72.74376f, 100.08474f, 83.64099f, 91.98178f, 96.0f, 91.98178f),
                    PathNode.CurveTo(108.35901f, 91.98178f, 119.25624f, 100.08474f, 122.81445f, 111.920456f),
                    PathNode.CurveTo(126.37267f, 123.75618f, 121.75016f, 136.52489f, 111.44f, 143.34f),
                    PathNode.CurveTo(121.47974f, 147.7284f, 128.99161f, 156.4279f, 131.87f, 167.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 140.0f),
                    PathNode.CurveTo(107.04569f, 140.0f, 116.0f, 131.0457f, 116.0f, 120.0f),
                    PathNode.CurveTo(116.0f, 108.95431f, 107.04569f, 100.0f, 96.0f, 100.0f),
                    PathNode.CurveTo(84.95431f, 100.0f, 76.0f, 108.95431f, 76.0f, 120.0f),
                    PathNode.CurveTo(76.0f, 131.0457f, 84.95431f, 140.0f, 96.0f, 140.0f),
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
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null
