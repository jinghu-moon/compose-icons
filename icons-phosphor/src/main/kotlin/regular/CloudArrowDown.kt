package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) return _cloudArrowDown!!
        _cloudArrowDown = phosphorRegularIcon(
            name = "CloudArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 128.0f),
                    PathNode.CurveTo(248.05019f, 147.05176f, 241.86948f, 165.5974f, 230.4f, 180.81f),
                    PathNode.CurveTo(227.74352f, 184.34462f, 222.72462f, 185.0565f, 219.19f, 182.4f),
                    PathNode.CurveTo(215.65538f, 179.74352f, 214.9435f, 174.72462f, 217.6f, 171.19f),
                    PathNode.CurveTo(226.98825f, 158.75244f, 232.0459f, 143.58301f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 88.2355f, 199.7645f, 56.0f, 160.0f, 56.0f),
                    PathNode.CurveTo(120.2355f, 56.0f, 88.0f, 88.2355f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 132.41827f, 84.41828f, 136.0f, 80.0f, 136.0f),
                    PathNode.CurveTo(75.58172f, 136.0f, 72.0f, 132.41827f, 72.0f, 128.0f),
                    PathNode.CurveTo(71.996086f, 119.92677f, 73.103134f, 111.8914f, 75.29f, 104.12f),
                    PathNode.CurveTo(74.2f, 104.0f, 73.1f, 104.0f, 72.0f, 104.0f),
                    PathNode.CurveTo(45.490334f, 104.0f, 24.0f, 125.49033f, 24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 178.50967f, 45.490334f, 200.0f, 72.0f, 200.0f),
                    PathNode.LineTo(96.0f, 200.0f),
                    PathNode.CurveTo(100.41828f, 200.0f, 104.0f, 203.58173f, 104.0f, 208.0f),
                    PathNode.CurveTo(104.0f, 212.41827f, 100.41828f, 216.0f, 96.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.CurveTo(48.01753f, 216.00551f, 26.044622f, 202.60251f, 15.07401f, 181.27635f),
                    PathNode.CurveTo(4.103396f, 159.9502f, 5.976415f, 134.28036f, 19.926508f, 114.77257f),
                    PathNode.CurveTo(33.876602f, 95.26478f, 57.56234f, 85.19328f, 81.29f, 88.68f),
                    PathNode.CurveTo(99.53873f, 52.18159f, 140.48479f, 33.01657f, 180.20128f, 42.384052f),
                    PathNode.CurveTo(219.91779f, 51.751534f, 247.98425f, 87.19376f, 248.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.34f, 170.34f),
                    PathNode.LineTo(160.0f, 188.69f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 123.58172f, 156.41827f, 120.0f, 152.0f, 120.0f),
                    PathNode.CurveTo(147.58173f, 120.0f, 144.0f, 123.58172f, 144.0f, 128.0f),
                    PathNode.LineTo(144.0f, 188.69f),
                    PathNode.LineTo(125.66f, 170.34f),
                    PathNode.CurveTo(122.534065f, 167.21407f, 117.465935f, 167.21407f, 114.34f, 170.34f),
                    PathNode.CurveTo(111.214066f, 173.46593f, 111.214066f, 178.53407f, 114.34f, 181.66f),
                    PathNode.LineTo(146.34f, 213.66f),
                    PathNode.CurveTo(147.84055f, 215.16223f, 149.87672f, 216.00629f, 152.0f, 216.00629f),
                    PathNode.CurveTo(154.12328f, 216.00629f, 156.15945f, 215.16223f, 157.66f, 213.66f),
                    PathNode.LineTo(189.66f, 181.66f),
                    PathNode.CurveTo(192.78593f, 178.53407f, 192.78593f, 173.46593f, 189.66f, 170.34f),
                    PathNode.CurveTo(186.53407f, 167.21407f, 181.46593f, 167.21407f, 178.34f, 170.34f),
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
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
