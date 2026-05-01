package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorBoldIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 160.0f),
                    PathNode.CurveTo(248.0053f, 139.56342f, 232.60445f, 122.40938f, 212.28548f, 120.219864f),
                    PathNode.CurveTo(191.9665f, 118.03035f, 173.26471f, 131.50958f, 168.91606f, 151.47813f),
                    PathNode.CurveTo(164.56741f, 171.4467f, 175.9706f, 191.48204f, 195.36f, 197.94f),
                    PathNode.CurveTo(192.56523f, 210.81412f, 181.17398f, 219.99873f, 168.0f, 220.0f),
                    PathNode.LineTo(144.0f, 220.0f),
                    PathNode.CurveTo(128.53603f, 220.0f, 116.0f, 207.46397f, 116.0f, 192.0f),
                    PathNode.LineTo(116.0f, 154.9f),
                    PathNode.CurveTo(147.73f, 149.12f, 172.0f, 120.81f, 172.0f, 87.17f),
                    PathNode.LineTo(172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 33.37258f, 166.62741f, 28.0f, 160.0f, 28.0f),
                    PathNode.LineTo(136.0f, 28.0f),
                    PathNode.CurveTo(129.37259f, 28.0f, 124.0f, 33.37258f, 124.0f, 40.0f),
                    PathNode.CurveTo(124.0f, 46.62742f, 129.37259f, 52.0f, 136.0f, 52.0f),
                    PathNode.LineTo(148.0f, 52.0f),
                    PathNode.LineTo(148.0f, 87.17f),
                    PathNode.CurveTo(148.0f, 111.57f, 128.53f, 131.69f, 104.59f, 132.0f),
                    PathNode.CurveTo(92.81859f, 132.15785f, 81.474846f, 127.59194f, 73.09519f, 119.323166f),
                    PathNode.CurveTo(64.715546f, 111.0544f, 59.998943f, 99.77248f, 60.0f, 88.0f),
                    PathNode.LineTo(60.0f, 52.0f),
                    PathNode.LineTo(72.0f, 52.0f),
                    PathNode.CurveTo(78.62742f, 52.0f, 84.0f, 46.62742f, 84.0f, 40.0f),
                    PathNode.CurveTo(84.0f, 33.37258f, 78.62742f, 28.0f, 72.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(41.37258f, 28.0f, 36.0f, 33.37258f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 88.0f),
                    PathNode.CurveTo(36.00136f, 120.92535f, 59.59139f, 149.11964f, 92.0f, 154.93f),
                    PathNode.LineTo(92.0f, 192.0f),
                    PathNode.CurveTo(92.033066f, 220.7051f, 115.2949f, 243.96693f, 144.0f, 244.0f),
                    PathNode.LineTo(168.0f, 244.0f),
                    PathNode.CurveTo(194.27626f, 243.96844f, 216.41002f, 224.3607f, 219.61f, 198.28f),
                    PathNode.CurveTo(236.45587f, 193.1433f, 247.9748f, 177.6116f, 248.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 176.0f),
                    PathNode.CurveTo(199.16344f, 176.0f, 192.0f, 168.83656f, 192.0f, 160.0f),
                    PathNode.CurveTo(192.0f, 151.16344f, 199.16344f, 144.0f, 208.0f, 144.0f),
                    PathNode.CurveTo(216.83656f, 144.0f, 224.0f, 151.16344f, 224.0f, 160.0f),
                    PathNode.CurveTo(224.0f, 168.83656f, 216.83656f, 176.0f, 208.0f, 176.0f),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
