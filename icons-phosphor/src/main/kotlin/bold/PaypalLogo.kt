package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaypalLogo: ImageVector
    get() {
        if (_paypalLogo != null) return _paypalLogo!!
        _paypalLogo = phosphorBoldIcon(
            name = "PaypalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.27f, 91.08f),
                    PathNode.CurveTo(218.0094f, 84.32351f, 211.35957f, 78.77516f, 203.77f, 74.81f),
                    PathNode.CurveTo(201.07782f, 43.80316f, 175.12349f, 20.002651f, 144.0f, 20.0f),
                    PathNode.LineTo(84.0f, 20.0f),
                    PathNode.CurveTo(74.8235f, 20.001389f, 66.8253f, 26.247408f, 64.6f, 35.15f),
                    PathNode.LineTo(28.6f, 179.15f),
                    PathNode.CurveTo(27.106674f, 185.12424f, 28.448755f, 191.45332f, 32.238213f, 196.30734f),
                    PathNode.CurveTo(36.02767f, 201.16136f, 41.841953f, 203.99907f, 48.0f, 204.0f),
                    PathNode.LineTo(70.39f, 204.0f),
                    PathNode.LineTo(68.6f, 211.15f),
                    PathNode.CurveTo(67.106674f, 217.12424f, 68.44875f, 223.45332f, 72.23821f, 228.30734f),
                    PathNode.CurveTo(76.02767f, 233.16136f, 81.84196f, 235.99907f, 88.0f, 236.0f),
                    PathNode.LineTo(119.5f, 236.0f),
                    PathNode.CurveTo(128.6765f, 235.99861f, 136.6747f, 229.7526f, 138.9f, 220.85f),
                    PathNode.LineTo(147.13f, 188.0f),
                    PathNode.LineTo(176.0f, 188.0f),
                    PathNode.CurveTo(198.93404f, 187.9977f, 219.86058f, 174.92218f, 229.91747f, 154.31079f),
                    PathNode.CurveTo(239.97435f, 133.6994f, 237.40208f, 109.15815f, 223.29f, 91.08f),
                    PathNode.Close,
                    PathNode.MoveTo(87.13f, 44.0f),
                    PathNode.LineTo(144.0f, 44.0f),
                    PathNode.CurveTo(155.09262f, 43.968002f, 165.57242f, 49.084145f, 172.37f, 57.85f),
                    PathNode.CurveTo(174.78632f, 60.926575f, 176.68767f, 64.37467f, 178.0f, 68.06f),
                    PathNode.CurveTo(177.34f, 68.06f, 176.69f, 68.0f, 176.0f, 68.0f),
                    PathNode.LineTo(120.0f, 68.0f),
                    PathNode.CurveTo(110.8235f, 68.00139f, 102.8253f, 74.247406f, 100.6f, 83.15f),
                    PathNode.LineTo(76.39f, 180.0f),
                    PathNode.LineTo(53.13f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.89f, 92.05f),
                    PathNode.CurveTo(172.81155f, 106.40954f, 159.23111f, 116.006805f, 144.0f, 116.0f),
                    PathNode.LineTo(117.13f, 116.0f),
                    PathNode.LineTo(123.13f, 92.0f),
                    PathNode.LineTo(176.0f, 92.0f),
                    PathNode.CurveTo(176.62f, 92.0f, 177.26f, 92.0f, 177.89f, 92.05f),
                    PathNode.Close,
                    PathNode.MoveTo(210.89f, 136.73f),
                    PathNode.CurveTo(206.90627f, 152.75621f, 192.51392f, 164.00525f, 176.0f, 164.0f),
                    PathNode.LineTo(144.0f, 164.0f),
                    PathNode.CurveTo(134.8235f, 164.00139f, 126.8253f, 170.2474f, 124.6f, 179.15f),
                    PathNode.LineTo(116.39f, 212.0f),
                    PathNode.LineTo(93.13f, 212.0f),
                    PathNode.LineTo(111.13f, 140.0f),
                    PathNode.LineTo(144.0f, 140.0f),
                    PathNode.CurveTo(168.94514f, 140.0271f, 191.29486f, 124.58947f, 200.1f, 101.25f),
                    PathNode.CurveTo(209.96764f, 110.18019f, 214.12514f, 123.813126f, 210.92f, 136.73f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paypalLogo!!
    }

private var _paypalLogo: ImageVector? = null
