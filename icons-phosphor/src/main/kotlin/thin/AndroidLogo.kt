package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorThinIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 148.0f),
                    PathNode.CurveTo(172.0f, 152.41827f, 168.41827f, 156.0f, 164.0f, 156.0f),
                    PathNode.CurveTo(159.58173f, 156.0f, 156.0f, 152.41827f, 156.0f, 148.0f),
                    PathNode.CurveTo(156.0f, 143.58173f, 159.58173f, 140.0f, 164.0f, 140.0f),
                    PathNode.CurveTo(168.41827f, 140.0f, 172.0f, 143.58173f, 172.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 140.0f),
                    PathNode.CurveTo(87.58172f, 140.0f, 84.0f, 143.58173f, 84.0f, 148.0f),
                    PathNode.CurveTo(84.0f, 152.41827f, 87.58172f, 156.0f, 92.0f, 156.0f),
                    PathNode.CurveTo(96.41828f, 156.0f, 100.0f, 152.41827f, 100.0f, 148.0f),
                    PathNode.CurveTo(100.0f, 143.58173f, 96.41828f, 140.0f, 92.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 160.0f),
                    PathNode.LineTo(236.0f, 184.0f),
                    PathNode.CurveTo(236.0f, 190.62741f, 230.62741f, 196.0f, 224.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(25.372583f, 196.0f, 20.0f, 190.62741f, 20.0f, 184.0f),
                    PathNode.LineTo(20.0f, 161.13f),
                    PathNode.CurveTo(19.97064f, 129.62698f, 33.519478f, 99.63953f, 57.18f, 78.84f),
                    PathNode.LineTo(29.18f, 50.84f),
                    PathNode.CurveTo(27.617035f, 49.277035f, 27.617035f, 46.742966f, 29.18f, 45.18f),
                    PathNode.CurveTo(30.742966f, 43.617035f, 33.277035f, 43.617035f, 34.84f, 45.18f),
                    PathNode.LineTo(63.41f, 73.75f),
                    PathNode.CurveTo(81.877335f, 59.707924f, 104.420494f, 52.071827f, 127.62f, 52.0f),
                    PathNode.LineTo(128.0f, 52.0f),
                    PathNode.CurveTo(151.36757f, 51.934612f, 174.11606f, 59.509247f, 192.78f, 73.57f),
                    PathNode.LineTo(221.17f, 45.17f),
                    PathNode.CurveTo(222.73297f, 43.607033f, 225.26703f, 43.607033f, 226.83f, 45.17f),
                    PathNode.CurveTo(228.39296f, 46.732967f, 228.39296f, 49.267033f, 226.83f, 50.83f),
                    PathNode.LineTo(199.0f, 78.64f),
                    PathNode.CurveTo(200.78f, 80.2f, 202.52f, 81.81f, 204.21f, 83.5f),
                    PathNode.CurveTo(224.62486f, 103.71307f, 236.07692f, 131.27147f, 236.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 160.0f),
                    PathNode.CurveTo(228.0f, 104.77152f, 183.22847f, 60.0f, 128.0f, 60.0f),
                    PathNode.LineTo(127.65f, 60.0f),
                    PathNode.CurveTo(72.7f, 60.19f, 28.0f, 105.56f, 28.0f, 161.13f),
                    PathNode.LineTo(28.0f, 184.0f),
                    PathNode.CurveTo(28.0f, 186.20914f, 29.790861f, 188.0f, 32.0f, 188.0f),
                    PathNode.LineTo(224.0f, 188.0f),
                    PathNode.CurveTo(226.20914f, 188.0f, 228.0f, 186.20914f, 228.0f, 184.0f),
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
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
