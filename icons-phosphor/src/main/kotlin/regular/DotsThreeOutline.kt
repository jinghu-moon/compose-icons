package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DotsThreeOutline: ImageVector
    get() {
        if (_dotsThreeOutline != null) return _dotsThreeOutline!!
        _dotsThreeOutline = phosphorRegularIcon(
            name = "DotsThreeOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.CurveTo(110.32689f, 96.0f, 96.0f, 110.32689f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 145.67311f, 110.32689f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(145.67311f, 160.0f, 160.0f, 145.67311f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 110.32689f, 145.67311f, 96.0f, 128.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 144.0f),
                    PathNode.CurveTo(119.163445f, 144.0f, 112.0f, 136.83656f, 112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 119.163445f, 119.163445f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(136.83656f, 112.0f, 144.0f, 119.163445f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 136.83656f, 136.83656f, 144.0f, 128.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 96.0f),
                    PathNode.CurveTo(30.326887f, 96.0f, 16.0f, 110.32689f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 145.67311f, 30.326887f, 160.0f, 48.0f, 160.0f),
                    PathNode.CurveTo(65.67311f, 160.0f, 80.0f, 145.67311f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 110.32689f, 65.67311f, 96.0f, 48.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 144.0f),
                    PathNode.CurveTo(39.163445f, 144.0f, 32.0f, 136.83656f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 119.163445f, 39.163445f, 112.0f, 48.0f, 112.0f),
                    PathNode.CurveTo(56.836555f, 112.0f, 64.0f, 119.163445f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 136.83656f, 56.836555f, 144.0f, 48.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.CurveTo(190.32689f, 96.0f, 176.0f, 110.32689f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 145.67311f, 190.32689f, 160.0f, 208.0f, 160.0f),
                    PathNode.CurveTo(225.67311f, 160.0f, 240.0f, 145.67311f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 110.32689f, 225.67311f, 96.0f, 208.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.CurveTo(199.16344f, 144.0f, 192.0f, 136.83656f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 119.163445f, 199.16344f, 112.0f, 208.0f, 112.0f),
                    PathNode.CurveTo(216.83656f, 112.0f, 224.0f, 119.163445f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 136.83656f, 216.83656f, 144.0f, 208.0f, 144.0f),
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
        return _dotsThreeOutline!!
    }

private var _dotsThreeOutline: ImageVector? = null
