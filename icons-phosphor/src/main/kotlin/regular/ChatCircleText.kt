package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCircleText: ImageVector
    get() {
        if (_chatCircleText != null) return _chatCircleText!!
        _chatCircleText = phosphorRegularIcon(
            name = "ChatCircleText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 112.0f),
                    PathNode.CurveTo(168.0f, 116.41828f, 164.41827f, 120.0f, 160.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(91.58172f, 120.0f, 88.0f, 116.41828f, 88.0f, 112.0f),
                    PathNode.CurveTo(88.0f, 107.58172f, 91.58172f, 104.0f, 96.0f, 104.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.CurveTo(164.41827f, 104.0f, 168.0f, 107.58172f, 168.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(91.58172f, 136.0f, 88.0f, 139.58173f, 88.0f, 144.0f),
                    PathNode.CurveTo(88.0f, 148.41827f, 91.58172f, 152.0f, 96.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(164.41827f, 152.0f, 168.0f, 148.41827f, 168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 139.58173f, 164.41827f, 136.0f, 160.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.00797f, 164.52303f, 212.85693f, 198.37349f, 181.54701f, 217.17828f),
                    PathNode.CurveTo(150.23709f, 235.98308f, 111.35765f, 236.98582f, 79.12f, 219.82f),
                    PathNode.LineTo(45.07f, 231.17f),
                    PathNode.CurveTo(39.320145f, 233.08752f, 32.980404f, 231.59138f, 28.694513f, 227.30548f),
                    PathNode.CurveTo(24.408623f, 223.0196f, 22.912483f, 216.67986f, 24.83f, 210.93f),
                    PathNode.LineTo(36.18f, 176.88f),
                    PathNode.CurveTo(15.858562f, 138.67328f, 21.319912f, 91.87539f, 49.892963f, 59.374695f),
                    PathNode.CurveTo(78.46601f, 26.873999f, 124.17886f, 15.463294f, 164.67383f, 30.723438f),
                    PathNode.CurveTo(205.1688f, 45.98358f, 231.98225f, 84.725136f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(215.9895f, 91.00305f, 192.83955f, 57.96352f, 158.06946f, 45.321724f),
                    PathNode.CurveTo(123.29937f, 32.679928f, 84.33522f, 43.135864f, 60.565414f, 71.4867f),
                    PathNode.CurveTo(36.7956f, 99.83755f, 33.296803f, 140.02821f, 51.81f, 172.06f),
                    PathNode.CurveTo(52.956802f, 174.04477f, 53.19712f, 176.42612f, 52.47f, 178.6f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.LineTo(77.4f, 203.53f),
                    PathNode.CurveTo(78.21461f, 203.25226f, 79.06934f, 203.11037f, 79.93f, 203.11f),
                    PathNode.CurveTo(81.33504f, 203.11247f, 82.71464f, 203.48499f, 83.93f, 204.19f),
                    PathNode.CurveTo(111.15847f, 219.94374f, 144.7254f, 219.96494f, 171.97374f, 204.2456f),
                    PathNode.CurveTo(199.22209f, 188.52629f, 216.00723f, 159.45743f, 216.0f, 128.0f),
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
        return _chatCircleText!!
    }

private var _chatCircleText: ImageVector? = null
