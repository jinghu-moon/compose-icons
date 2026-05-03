package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) return _appleLogo!!
        _appleLogo = phosphorBoldIcon(
            name = "AppleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.0f, 168.0f),
                    PathNode.CurveTo(226.10046f, 165.9429f, 224.64186f, 164.17941f, 222.79f, 162.91f),
                    PathNode.CurveTo(207.25f, 152.22f, 204.0f, 133.68f, 204.0f, 120.0f),
                    PathNode.CurveTo(204.0f, 103.83f, 216.68f, 89.4f, 224.25f, 82.24f),
                    PathNode.CurveTo(226.64438f, 79.9736f, 228.00084f, 76.821915f, 228.00084f, 73.525f),
                    PathNode.CurveTo(228.00084f, 70.22809f, 226.64438f, 67.0764f, 224.25f, 64.81f),
                    PathNode.CurveTo(210.89f, 52.17f, 188.81f, 44.0f, 168.0f, 44.0f),
                    PathNode.CurveTo(153.87103f, 44.012863f, 140.02321f, 47.94911f, 128.0f, 55.37f),
                    PathNode.CurveTo(98.05755f, 36.76844f, 59.232788f, 41.332153f, 34.42f, 66.37f),
                    PathNode.CurveTo(19.51505f, 81.59331f, 11.42463f, 102.21269f, 12.0f, 123.51f),
                    PathNode.CurveTo(12.842319f, 158.64969f, 27.770855f, 191.97676f, 53.43f, 216.0f),
                    PathNode.CurveTo(61.5785f, 223.71655f, 72.37756f, 228.01184f, 83.6f, 228.0f),
                    PathNode.LineTo(171.29f, 228.0f),
                    PathNode.CurveTo(183.42944f, 228.01653f, 195.03305f, 223.00217f, 203.34f, 214.15f),
                    PathNode.CurveTo(210.4936f, 206.47514f, 216.67357f, 197.94745f, 221.74f, 188.76f),
                    PathNode.CurveTo(223.31f, 185.88f, 224.74f, 183.05f, 225.88f, 180.35f),
                    PathNode.CurveTo(227.47f, 176.67f, 229.12f, 172.87f, 227.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(185.77f, 197.82f),
                    PathNode.CurveTo(182.0064f, 201.79488f, 176.76387f, 204.03236f, 171.29f, 204.0f),
                    PathNode.LineTo(83.6f, 204.0f),
                    PathNode.CurveTo(78.507126f, 204.01773f, 73.602264f, 202.07727f, 69.9f, 198.58f),
                    PathNode.CurveTo(48.898533f, 178.91885f, 36.682655f, 151.64034f, 36.0f, 122.88f),
                    PathNode.CurveTo(35.590015f, 108.1255f, 41.183174f, 93.83588f, 51.5f, 83.28f),
                    PathNode.CurveTo(61.10534f, 73.46859f, 74.26958f, 67.95764f, 88.0f, 68.0f),
                    PathNode.LineTo(88.72f, 68.0f),
                    PathNode.CurveTo(100.2865f, 68.125435f, 111.474f, 72.1411f, 120.48f, 79.4f),
                    PathNode.CurveTo(124.86399f, 82.91f, 131.09601f, 82.91f, 135.48f, 79.4f),
                    PathNode.CurveTo(144.6857f, 71.97193f, 156.17131f, 67.94561f, 168.0f, 68.0f),
                    PathNode.CurveTo(178.39822f, 68.12295f, 188.62622f, 70.65598f, 197.88f, 75.4f),
                    PathNode.CurveTo(186.26f, 89.66f, 180.0f, 105.13f, 180.0f, 120.0f),
                    PathNode.CurveTo(180.0f, 143.33f, 187.47f, 162.89f, 201.25f, 176.19f),
                    PathNode.CurveTo(197.03986f, 184.03403f, 191.83337f, 191.30092f, 185.76f, 197.81f),
                    PathNode.Close,
                    PathNode.MoveTo(128.75f, 13.0f),
                    PathNode.CurveTo(132.39706f, 8.29881f, 136.96315f, 4.389406f, 142.17f, 1.51f),
                    PathNode.CurveTo(147.969f, -1.704297f, 155.2757f, 0.39101f, 158.49f, 6.19f),
                    PathNode.CurveTo(161.7043f, 11.98899f, 159.609f, 19.295702f, 153.81f, 22.51f),
                    PathNode.CurveTo(151.43669f, 23.820835f, 149.35724f, 25.604198f, 147.7f, 27.75f),
                    PathNode.CurveTo(143.6269f, 32.9829f, 136.0829f, 33.9231f, 130.85f, 29.85f),
                    PathNode.CurveTo(125.6171f, 25.7769f, 124.6769f, 18.232899f, 128.75f, 13.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
