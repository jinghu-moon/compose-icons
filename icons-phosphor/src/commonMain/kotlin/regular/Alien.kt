package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorRegularIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 16.0f),
                    PathNode.CurveTo(75.00579f, 16.060617f, 32.06062f, 59.005795f, 32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 136.0f, 44.56f, 167.06f, 65.61f, 195.0f),
                    PathNode.CurveTo(86.79f, 223.15f, 110.11f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(145.89f, 240.0f, 169.21f, 223.19f, 190.39f, 195.0f),
                    PathNode.CurveTo(211.44f, 167.0f, 224.0f, 136.0f, 224.0f, 112.0f),
                    PathNode.CurveTo(223.93938f, 59.005795f, 180.9942f, 16.060617f, 128.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.61f, 185.42f),
                    PathNode.CurveTo(160.24f, 208.49f, 140.31f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(115.69f, 224.0f, 95.76f, 208.49f, 78.39f, 185.42f),
                    PathNode.CurveTo(59.65f, 160.5f, 48.0f, 132.37f, 48.0f, 112.0f),
                    PathNode.CurveTo(48.0f, 67.81722f, 83.81722f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(172.18279f, 32.0f, 208.0f, 67.81722f, 208.0f, 112.0f),
                    PathNode.CurveTo(208.0f, 132.37f, 196.35f, 160.5f, 177.61f, 185.42f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 136.0f),
                    PathNode.CurveTo(120.0f, 113.90861f, 102.09139f, 96.0f, 80.0f, 96.0f),
                    PathNode.CurveTo(71.163445f, 96.0f, 64.0f, 103.163445f, 64.0f, 112.0f),
                    PathNode.CurveTo(64.0f, 134.09138f, 81.90861f, 152.0f, 104.0f, 152.0f),
                    PathNode.CurveTo(112.836555f, 152.0f, 120.0f, 144.83656f, 120.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 112.0f),
                    PathNode.CurveTo(93.25484f, 112.0f, 104.0f, 122.74516f, 104.0f, 136.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.CurveTo(90.74516f, 136.0f, 80.0f, 125.25484f, 80.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 96.0f),
                    PathNode.CurveTo(153.90862f, 96.0f, 136.0f, 113.90861f, 136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 144.83656f, 143.16344f, 152.0f, 152.0f, 152.0f),
                    PathNode.CurveTo(174.09138f, 152.0f, 192.0f, 134.09138f, 192.0f, 112.0f),
                    PathNode.CurveTo(192.0f, 103.163445f, 184.83656f, 96.0f, 176.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 136.0f),
                    PathNode.CurveTo(152.0f, 122.74516f, 162.74516f, 112.0f, 176.0f, 112.0f),
                    PathNode.CurveTo(176.0f, 125.25484f, 165.25484f, 136.0f, 152.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 184.0f),
                    PathNode.CurveTo(152.0f, 188.41827f, 148.41827f, 192.0f, 144.0f, 192.0f),
                    PathNode.LineTo(112.0f, 192.0f),
                    PathNode.CurveTo(107.58172f, 192.0f, 104.0f, 188.41827f, 104.0f, 184.0f),
                    PathNode.CurveTo(104.0f, 179.58173f, 107.58172f, 176.0f, 112.0f, 176.0f),
                    PathNode.LineTo(144.0f, 176.0f),
                    PathNode.CurveTo(148.41827f, 176.0f, 152.0f, 179.58173f, 152.0f, 184.0f),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
