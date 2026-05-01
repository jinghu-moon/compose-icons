package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Waveform: ImageVector
    get() {
        if (_waveform != null) return _waveform!!
        _waveform = phosphorLightIcon(
            name = "Waveform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(54.0f, 96.0f),
                    PathNode.LineTo(54.0f, 160.0f),
                    PathNode.CurveTo(54.0f, 163.3137f, 51.31371f, 166.0f, 48.0f, 166.0f),
                    PathNode.CurveTo(44.68629f, 166.0f, 42.0f, 163.3137f, 42.0f, 160.0f),
                    PathNode.LineTo(42.0f, 96.0f),
                    PathNode.CurveTo(42.0f, 92.686295f, 44.68629f, 90.0f, 48.0f, 90.0f),
                    PathNode.CurveTo(51.31371f, 90.0f, 54.0f, 92.686295f, 54.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 26.0f),
                    PathNode.CurveTo(84.686295f, 26.0f, 82.0f, 28.68629f, 82.0f, 32.0f),
                    PathNode.LineTo(82.0f, 224.0f),
                    PathNode.CurveTo(82.0f, 227.3137f, 84.686295f, 230.0f, 88.0f, 230.0f),
                    PathNode.CurveTo(91.313705f, 230.0f, 94.0f, 227.3137f, 94.0f, 224.0f),
                    PathNode.LineTo(94.0f, 32.0f),
                    PathNode.CurveTo(94.0f, 28.68629f, 91.313705f, 26.0f, 88.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 58.0f),
                    PathNode.CurveTo(124.686295f, 58.0f, 122.0f, 60.68629f, 122.0f, 64.0f),
                    PathNode.LineTo(122.0f, 192.0f),
                    PathNode.CurveTo(122.0f, 195.3137f, 124.686295f, 198.0f, 128.0f, 198.0f),
                    PathNode.CurveTo(131.3137f, 198.0f, 134.0f, 195.3137f, 134.0f, 192.0f),
                    PathNode.LineTo(134.0f, 64.0f),
                    PathNode.CurveTo(134.0f, 60.68629f, 131.3137f, 58.0f, 128.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 90.0f),
                    PathNode.CurveTo(164.6863f, 90.0f, 162.0f, 92.686295f, 162.0f, 96.0f),
                    PathNode.LineTo(162.0f, 160.0f),
                    PathNode.CurveTo(162.0f, 163.3137f, 164.6863f, 166.0f, 168.0f, 166.0f),
                    PathNode.CurveTo(171.3137f, 166.0f, 174.0f, 163.3137f, 174.0f, 160.0f),
                    PathNode.LineTo(174.0f, 96.0f),
                    PathNode.CurveTo(174.0f, 92.686295f, 171.3137f, 90.0f, 168.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 74.0f),
                    PathNode.CurveTo(204.6863f, 74.0f, 202.0f, 76.686295f, 202.0f, 80.0f),
                    PathNode.LineTo(202.0f, 176.0f),
                    PathNode.CurveTo(202.0f, 179.3137f, 204.6863f, 182.0f, 208.0f, 182.0f),
                    PathNode.CurveTo(211.3137f, 182.0f, 214.0f, 179.3137f, 214.0f, 176.0f),
                    PathNode.LineTo(214.0f, 80.0f),
                    PathNode.CurveTo(214.0f, 76.686295f, 211.3137f, 74.0f, 208.0f, 74.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waveform!!
    }

private var _waveform: ImageVector? = null
