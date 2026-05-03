package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Numpad: ImageVector
    get() {
        if (_numpad != null) return _numpad!!
        _numpad = phosphorRegularIcon(
            name = "Numpad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 56.836555f, 72.836555f, 64.0f, 64.0f, 64.0f),
                    PathNode.CurveTo(55.163445f, 64.0f, 48.0f, 56.836555f, 48.0f, 48.0f),
                    PathNode.CurveTo(48.0f, 39.163445f, 55.163445f, 32.0f, 64.0f, 32.0f),
                    PathNode.CurveTo(72.836555f, 32.0f, 80.0f, 39.163445f, 80.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(119.163445f, 32.0f, 112.0f, 39.163445f, 112.0f, 48.0f),
                    PathNode.CurveTo(112.0f, 56.836555f, 119.163445f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(136.83656f, 64.0f, 144.0f, 56.836555f, 144.0f, 48.0f),
                    PathNode.CurveTo(144.0f, 39.163445f, 136.83656f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 64.0f),
                    PathNode.CurveTo(200.83656f, 64.0f, 208.0f, 56.836555f, 208.0f, 48.0f),
                    PathNode.CurveTo(208.0f, 39.163445f, 200.83656f, 32.0f, 192.0f, 32.0f),
                    PathNode.CurveTo(183.16344f, 32.0f, 176.0f, 39.163445f, 176.0f, 48.0f),
                    PathNode.CurveTo(176.0f, 56.836555f, 183.16344f, 64.0f, 192.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 88.0f),
                    PathNode.CurveTo(55.163445f, 88.0f, 48.0f, 95.163445f, 48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 112.836555f, 55.163445f, 120.0f, 64.0f, 120.0f),
                    PathNode.CurveTo(72.836555f, 120.0f, 80.0f, 112.836555f, 80.0f, 104.0f),
                    PathNode.CurveTo(80.0f, 95.163445f, 72.836555f, 88.0f, 64.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 88.0f),
                    PathNode.CurveTo(119.163445f, 88.0f, 112.0f, 95.163445f, 112.0f, 104.0f),
                    PathNode.CurveTo(112.0f, 112.836555f, 119.163445f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(136.83656f, 120.0f, 144.0f, 112.836555f, 144.0f, 104.0f),
                    PathNode.CurveTo(144.0f, 95.163445f, 136.83656f, 88.0f, 128.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 88.0f),
                    PathNode.CurveTo(183.16344f, 88.0f, 176.0f, 95.163445f, 176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 112.836555f, 183.16344f, 120.0f, 192.0f, 120.0f),
                    PathNode.CurveTo(200.83656f, 120.0f, 208.0f, 112.836555f, 208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 95.163445f, 200.83656f, 88.0f, 192.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 144.0f),
                    PathNode.CurveTo(55.163445f, 144.0f, 48.0f, 151.16344f, 48.0f, 160.0f),
                    PathNode.CurveTo(48.0f, 168.83656f, 55.163445f, 176.0f, 64.0f, 176.0f),
                    PathNode.CurveTo(72.836555f, 176.0f, 80.0f, 168.83656f, 80.0f, 160.0f),
                    PathNode.CurveTo(80.0f, 151.16344f, 72.836555f, 144.0f, 64.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 144.0f),
                    PathNode.CurveTo(119.163445f, 144.0f, 112.0f, 151.16344f, 112.0f, 160.0f),
                    PathNode.CurveTo(112.0f, 168.83656f, 119.163445f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(136.83656f, 176.0f, 144.0f, 168.83656f, 144.0f, 160.0f),
                    PathNode.CurveTo(144.0f, 151.16344f, 136.83656f, 144.0f, 128.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(119.163445f, 200.0f, 112.0f, 207.16344f, 112.0f, 216.0f),
                    PathNode.CurveTo(112.0f, 224.83656f, 119.163445f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(136.83656f, 232.0f, 144.0f, 224.83656f, 144.0f, 216.0f),
                    PathNode.CurveTo(144.0f, 207.16344f, 136.83656f, 200.0f, 128.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 144.0f),
                    PathNode.CurveTo(183.16344f, 144.0f, 176.0f, 151.16344f, 176.0f, 160.0f),
                    PathNode.CurveTo(176.0f, 168.83656f, 183.16344f, 176.0f, 192.0f, 176.0f),
                    PathNode.CurveTo(200.83656f, 176.0f, 208.0f, 168.83656f, 208.0f, 160.0f),
                    PathNode.CurveTo(208.0f, 151.16344f, 200.83656f, 144.0f, 192.0f, 144.0f),
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
        return _numpad!!
    }

private var _numpad: ImageVector? = null
