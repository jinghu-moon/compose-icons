package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) return _googleCardboardLogo!!
        _googleCardboardLogo = phosphorRegularIcon(
            name = "GoogleCardboardLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(98.12237f, 208.00166f, 100.158424f, 207.15993f, 101.66f, 205.66f),
                    PathNode.LineTo(128.0f, 179.31f),
                    PathNode.LineTo(154.34f, 205.66f),
                    PathNode.CurveTo(155.84158f, 207.15993f, 157.87762f, 208.00166f, 160.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.LineTo(163.31f, 192.0f),
                    PathNode.LineTo(139.31f, 168.0f),
                    PathNode.CurveTo(133.06245f, 161.75656f, 122.93754f, 161.75656f, 116.69f, 168.0f),
                    PathNode.LineTo(92.69f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 160.0f),
                    PathNode.CurveTo(97.67311f, 160.0f, 112.0f, 145.67311f, 112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 110.32689f, 97.67311f, 96.0f, 80.0f, 96.0f),
                    PathNode.CurveTo(62.32689f, 96.0f, 48.0f, 110.32689f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 145.67311f, 62.32689f, 160.0f, 80.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 112.0f),
                    PathNode.CurveTo(88.836555f, 112.0f, 96.0f, 119.163445f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 136.83656f, 88.836555f, 144.0f, 80.0f, 144.0f),
                    PathNode.CurveTo(71.163445f, 144.0f, 64.0f, 136.83656f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 119.163445f, 71.163445f, 112.0f, 80.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 160.0f),
                    PathNode.CurveTo(193.67311f, 160.0f, 208.0f, 145.67311f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 110.32689f, 193.67311f, 96.0f, 176.0f, 96.0f),
                    PathNode.CurveTo(158.32689f, 96.0f, 144.0f, 110.32689f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 145.67311f, 158.32689f, 160.0f, 176.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 112.0f),
                    PathNode.CurveTo(184.83656f, 112.0f, 192.0f, 119.163445f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 136.83656f, 184.83656f, 144.0f, 176.0f, 144.0f),
                    PathNode.CurveTo(167.16344f, 144.0f, 160.0f, 136.83656f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 119.163445f, 167.16344f, 112.0f, 176.0f, 112.0f),
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
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
