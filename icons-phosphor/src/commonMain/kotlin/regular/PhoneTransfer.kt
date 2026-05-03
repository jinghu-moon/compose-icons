package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PhoneTransfer: ImageVector
    get() {
        if (_phoneTransfer != null) return _phoneTransfer!!
        _phoneTransfer = phosphorRegularIcon(
            name = "PhoneTransfer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 67.58172f, 139.58173f, 64.0f, 144.0f, 64.0f),
                    PathNode.LineTo(196.69f, 64.0f),
                    PathNode.LineTo(178.34f, 45.66f),
                    PathNode.CurveTo(175.21407f, 42.53407f, 175.21407f, 37.46593f, 178.34f, 34.34f),
                    PathNode.CurveTo(181.46593f, 31.21407f, 186.53407f, 31.214067f, 189.66f, 34.34f),
                    PathNode.LineTo(221.66f, 66.34f),
                    PathNode.CurveTo(223.16223f, 67.840546f, 224.00629f, 69.876724f, 224.00629f, 72.0f),
                    PathNode.CurveTo(224.00629f, 74.123276f, 223.16223f, 76.159454f, 221.66f, 77.66f),
                    PathNode.LineTo(189.66f, 109.66f),
                    PathNode.CurveTo(186.53407f, 112.785934f, 181.46593f, 112.785934f, 178.34f, 109.66f),
                    PathNode.CurveTo(175.21407f, 106.534065f, 175.21407f, 101.465935f, 178.34f, 98.34f),
                    PathNode.LineTo(196.69f, 80.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.CurveTo(139.58173f, 80.0f, 136.0f, 76.41828f, 136.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.87f, 183.08f),
                    PathNode.CurveTo(220.19023f, 211.11177f, 196.27222f, 232.05449f, 168.0f, 232.0f),
                    PathNode.CurveTo(88.6f, 232.0f, 24.0f, 167.4f, 24.0f, 88.0f),
                    PathNode.CurveTo(23.945507f, 59.727787f, 44.88823f, 35.809765f, 72.92f, 32.13f),
                    PathNode.CurveTo(79.95482f, 31.269175f, 86.71769f, 35.138905f, 89.54f, 41.64f),
                    PathNode.LineTo(110.66f, 88.79f),
                    PathNode.LineTo(110.66f, 88.91f),
                    PathNode.CurveTo(112.79448f, 93.834625f, 112.31756f, 99.5014f, 109.39f, 104.0f),
                    PathNode.CurveTo(109.21f, 104.27f, 109.02f, 104.52f, 108.82f, 104.77f),
                    PathNode.LineTo(88.0f, 129.45f),
                    PathNode.CurveTo(95.49f, 144.67f, 111.41f, 160.45f, 126.83f, 167.96f),
                    PathNode.LineTo(151.17f, 147.25f),
                    PathNode.CurveTo(151.40903f, 147.04907f, 151.65944f, 146.86209f, 151.92f, 146.69f),
                    PathNode.CurveTo(156.41823f, 143.6879f, 162.12857f, 143.16124f, 167.1f, 145.29f),
                    PathNode.LineTo(167.21f, 145.35f),
                    PathNode.LineTo(214.32f, 166.46f),
                    PathNode.CurveTo(220.83682f, 169.26912f, 224.72466f, 176.03517f, 223.87f, 183.08f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 181.08f),
                    PathNode.CurveTo(208.0f, 181.08f, 207.93f, 181.08f, 207.89f, 181.08f),
                    PathNode.LineTo(207.89f, 181.08f),
                    PathNode.LineTo(160.89f, 160.03f),
                    PathNode.LineTo(136.54f, 180.74f),
                    PathNode.CurveTo(136.30438f, 180.94083f, 136.0573f, 181.1278f, 135.8f, 181.3f),
                    PathNode.CurveTo(131.11627f, 184.42473f, 125.13489f, 184.85768f, 120.05f, 182.44f),
                    PathNode.CurveTo(101.32f, 173.44f, 82.65f, 154.86f, 73.59f, 136.33f),
                    PathNode.CurveTo(71.14984f, 131.28287f, 71.52921f, 125.32675f, 74.59f, 120.63f),
                    PathNode.CurveTo(74.76219f, 120.36062f, 74.95264f, 120.10335f, 75.16f, 119.86f),
                    PathNode.LineTo(96.0f, 95.15f),
                    PathNode.LineTo(75.0f, 48.15f),
                    PathNode.CurveTo(74.996056f, 48.110096f, 74.996056f, 48.069904f, 75.0f, 48.03f),
                    PathNode.CurveTo(54.937195f, 50.647102f, 39.945786f, 67.767296f, 40.0f, 88.0f),
                    PathNode.CurveTo(40.07716f, 158.66046f, 97.33954f, 215.92284f, 168.0f, 216.0f),
                    PathNode.CurveTo(188.21907f, 216.06946f, 205.34512f, 201.11412f, 208.0f, 181.07f),
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
        return _phoneTransfer!!
    }

private var _phoneTransfer: ImageVector? = null
