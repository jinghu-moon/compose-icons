package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) return _twitchLogo!!
        _twitchLogo = phosphorRegularIcon(
            name = "TwitchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 200.83656f, 39.163445f, 208.0f, 48.0f, 208.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.LineTo(64.0f, 240.0f),
                    PathNode.CurveTo(63.998837f, 243.10434f, 65.79368f, 245.9291f, 68.60453f, 247.24667f),
                    PathNode.CurveTo(71.415375f, 248.56425f, 74.7347f, 248.13678f, 77.12f, 246.15f),
                    PathNode.LineTo(122.9f, 208.0f),
                    PathNode.LineTo(165.1f, 208.0f),
                    PathNode.CurveTo(168.8456f, 208.00122f, 172.47292f, 206.68831f, 175.35f, 204.29f),
                    PathNode.LineTo(218.24f, 168.54f),
                    PathNode.CurveTo(221.8965f, 165.50714f, 224.00859f, 161.0006f, 224.0f, 156.25f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 156.25f),
                    PathNode.LineTo(165.1f, 192.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.CurveTo(118.12954f, 191.99916f, 116.31792f, 192.65375f, 114.88f, 193.85f),
                    PathNode.LineTo(80.0f, 222.92f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.CurveTo(80.0f, 195.58173f, 76.41828f, 192.0f, 72.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 136.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.CurveTo(160.0f, 83.58172f, 163.58173f, 80.0f, 168.0f, 80.0f),
                    PathNode.CurveTo(172.41827f, 80.0f, 176.0f, 83.58172f, 176.0f, 88.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(176.0f, 140.41827f, 172.41827f, 144.0f, 168.0f, 144.0f),
                    PathNode.CurveTo(163.58173f, 144.0f, 160.0f, 140.41827f, 160.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 136.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.CurveTo(112.0f, 83.58172f, 115.58172f, 80.0f, 120.0f, 80.0f),
                    PathNode.CurveTo(124.41828f, 80.0f, 128.0f, 83.58172f, 128.0f, 88.0f),
                    PathNode.LineTo(128.0f, 136.0f),
                    PathNode.CurveTo(128.0f, 140.41827f, 124.41828f, 144.0f, 120.0f, 144.0f),
                    PathNode.CurveTo(115.58172f, 144.0f, 112.0f, 140.41827f, 112.0f, 136.0f),
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
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
