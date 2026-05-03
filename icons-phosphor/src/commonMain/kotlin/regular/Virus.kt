package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Virus: ImageVector
    get() {
        if (_virus != null) return _virus!!
        _virus = phosphorRegularIcon(
            name = "Virus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 108.0f),
                    PathNode.CurveTo(136.0f, 92.536026f, 123.463974f, 80.0f, 108.0f, 80.0f),
                    PathNode.CurveTo(92.536026f, 80.0f, 80.0f, 92.536026f, 80.0f, 108.0f),
                    PathNode.CurveTo(80.0f, 123.463974f, 92.536026f, 136.0f, 108.0f, 136.0f),
                    PathNode.CurveTo(123.463974f, 136.0f, 136.0f, 123.463974f, 136.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 120.0f),
                    PathNode.CurveTo(101.37258f, 120.0f, 96.0f, 114.62742f, 96.0f, 108.0f),
                    PathNode.CurveTo(96.0f, 101.37258f, 101.37258f, 96.0f, 108.0f, 96.0f),
                    PathNode.CurveTo(114.62742f, 96.0f, 120.0f, 101.37258f, 120.0f, 108.0f),
                    PathNode.CurveTo(120.0f, 114.62742f, 114.62742f, 120.0f, 108.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 112.0f),
                    PathNode.CurveTo(184.83656f, 112.0f, 192.0f, 119.163445f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 136.83656f, 184.83656f, 144.0f, 176.0f, 144.0f),
                    PathNode.CurveTo(167.16344f, 144.0f, 160.0f, 136.83656f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 119.163445f, 167.16344f, 112.0f, 176.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 184.83656f, 136.83656f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(119.163445f, 192.0f, 112.0f, 184.83656f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 167.16344f, 119.163445f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(136.83656f, 160.0f, 144.0f, 167.16344f, 144.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 120.0f),
                    PathNode.LineTo(223.66f, 120.0f),
                    PathNode.CurveTo(222.01317f, 100.1199f, 214.18364f, 81.25422f, 201.27f, 66.05f),
                    PathNode.LineTo(213.66f, 53.66f),
                    PathNode.CurveTo(216.78593f, 50.53407f, 216.78593f, 45.46593f, 213.66f, 42.34f),
                    PathNode.CurveTo(210.53407f, 39.21407f, 205.46593f, 39.21407f, 202.34f, 42.34f),
                    PathNode.LineTo(190.0f, 54.73f),
                    PathNode.CurveTo(174.7822f, 41.80676f, 155.89757f, 33.97663f, 136.0f, 32.34f),
                    PathNode.LineTo(136.0f, 16.0f),
                    PathNode.CurveTo(136.0f, 11.581722f, 132.41827f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(123.58172f, 8.0f, 120.0f, 11.581722f, 120.0f, 16.0f),
                    PathNode.LineTo(120.0f, 32.34f),
                    PathNode.CurveTo(100.1199f, 33.98684f, 81.25422f, 41.81636f, 66.05f, 54.73f),
                    PathNode.LineTo(53.66f, 42.34f),
                    PathNode.CurveTo(50.53407f, 39.21407f, 45.46593f, 39.21407f, 42.34f, 42.34f),
                    PathNode.CurveTo(39.21407f, 45.46593f, 39.21407f, 50.53407f, 42.34f, 53.66f),
                    PathNode.LineTo(54.73f, 66.05f),
                    PathNode.CurveTo(41.80676f, 81.2678f, 33.97663f, 100.152435f, 32.34f, 120.05f),
                    PathNode.LineTo(16.0f, 120.05f),
                    PathNode.CurveTo(11.581722f, 120.05f, 8.0f, 123.63172f, 8.0f, 128.05f),
                    PathNode.CurveTo(8.0f, 132.46828f, 11.581722f, 136.05f, 16.0f, 136.05f),
                    PathNode.LineTo(32.34f, 136.05f),
                    PathNode.CurveTo(33.98684f, 155.9301f, 41.81636f, 174.79578f, 54.73f, 190.0f),
                    PathNode.LineTo(42.34f, 202.34f),
                    PathNode.CurveTo(39.21407f, 205.46593f, 39.21407f, 210.53407f, 42.34f, 213.66f),
                    PathNode.CurveTo(45.46593f, 216.78593f, 50.53407f, 216.78593f, 53.66f, 213.66f),
                    PathNode.LineTo(66.05f, 201.27f),
                    PathNode.CurveTo(81.2678f, 214.19324f, 100.152435f, 222.02338f, 120.05f, 223.66f),
                    PathNode.LineTo(120.05f, 240.0f),
                    PathNode.CurveTo(120.05f, 244.41827f, 123.63172f, 248.0f, 128.05f, 248.0f),
                    PathNode.CurveTo(132.46828f, 248.0f, 136.05f, 244.41827f, 136.05f, 240.0f),
                    PathNode.LineTo(136.05f, 223.66f),
                    PathNode.CurveTo(155.9301f, 222.01317f, 174.79578f, 214.18364f, 190.0f, 201.27f),
                    PathNode.LineTo(202.39f, 213.66f),
                    PathNode.CurveTo(205.51593f, 216.78593f, 210.58406f, 216.78593f, 213.71f, 213.66f),
                    PathNode.CurveTo(216.83594f, 210.53407f, 216.83594f, 205.46593f, 213.71f, 202.34f),
                    PathNode.LineTo(201.27f, 190.0f),
                    PathNode.CurveTo(214.19324f, 174.7822f, 222.02338f, 155.89757f, 223.66f, 136.0f),
                    PathNode.LineTo(240.0f, 136.0f),
                    PathNode.CurveTo(244.41827f, 136.0f, 248.0f, 132.41827f, 248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 123.58172f, 244.41827f, 120.0f, 240.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(83.81722f, 208.0f, 48.0f, 172.18279f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 83.81722f, 83.81722f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(172.18279f, 48.0f, 208.0f, 83.81722f, 208.0f, 128.0f),
                    PathNode.CurveTo(207.9504f, 172.16223f, 172.16223f, 207.9504f, 128.0f, 208.0f),
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
        return _virus!!
    }

private var _virus: ImageVector? = null
