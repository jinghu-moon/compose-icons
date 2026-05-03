package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorRegularIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 59.581722f, 35.581722f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(220.41827f, 56.0f, 224.0f, 59.581722f, 224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 68.41828f, 220.41827f, 72.0f, 216.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(35.581722f, 72.0f, 32.0f, 68.41828f, 32.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 136.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.CurveTo(164.41827f, 136.0f, 168.0f, 132.41827f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 123.58172f, 164.41827f, 120.0f, 160.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(35.581722f, 120.0f, 32.0f, 123.58172f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 132.41827f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 187.58173f, 32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(112.0f, 200.0f),
                    PathNode.CurveTo(116.41828f, 200.0f, 120.0f, 196.41827f, 120.0f, 192.0f),
                    PathNode.CurveTo(120.0f, 187.58173f, 116.41828f, 184.0f, 112.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(247.66f, 126.3f),
                    PathNode.CurveTo(247.04997f, 128.3404f, 245.65158f, 130.05334f, 243.77457f, 131.05942f),
                    PathNode.CurveTo(241.89757f, 132.06549f, 239.69688f, 132.28165f, 237.66f, 131.66f),
                    PathNode.LineTo(208.0f, 122.75f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.CurveTo(208.0234f, 206.51347f, 198.29092f, 219.23126f, 184.27568f, 223.00143f),
                    PathNode.CurveTo(170.26042f, 226.7716f, 155.46088f, 220.65306f, 148.19965f, 208.0866f),
                    PathNode.CurveTo(140.93842f, 195.52013f, 143.02805f, 179.64258f, 153.29343f, 169.38277f),
                    PathNode.CurveTo(163.5588f, 159.12296f, 179.43747f, 157.04195f, 192.0f, 164.31f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.CurveTo(192.00072f, 109.47132f, 193.1969f, 107.09185f, 195.22597f, 105.582855f),
                    PathNode.CurveTo(197.25504f, 104.07385f, 199.87808f, 103.61301f, 202.3f, 104.34f),
                    PathNode.LineTo(242.3f, 116.34f),
                    PathNode.CurveTo(246.5297f, 117.611244f, 248.92897f, 122.069626f, 247.66f, 126.3f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 192.0f),
                    PathNode.CurveTo(192.0f, 183.16344f, 184.83656f, 176.0f, 176.0f, 176.0f),
                    PathNode.CurveTo(167.16344f, 176.0f, 160.0f, 183.16344f, 160.0f, 192.0f),
                    PathNode.CurveTo(160.0f, 200.83656f, 167.16344f, 208.0f, 176.0f, 208.0f),
                    PathNode.CurveTo(184.83656f, 208.0f, 192.0f, 200.83656f, 192.0f, 192.0f),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
