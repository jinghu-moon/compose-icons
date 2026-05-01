package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MusicNote: ImageVector
    get() {
        if (_musicNote != null) return _musicNote!!
        _musicNote = phosphorLightIcon(
            name = "MusicNote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(209.72f, 58.25f),
                    PathNode.LineTo(129.72f, 34.25f),
                    PathNode.CurveTo(127.90338f, 33.70642f, 125.936714f, 34.053562f, 124.41598f, 35.18624f),
                    PathNode.CurveTo(122.89524f, 36.318916f, 121.99943f, 38.103794f, 122.0f, 40.0f),
                    PathNode.LineTo(122.0f, 153.05f),
                    PathNode.CurveTo(107.08102f, 136.67873f, 82.61341f, 133.26402f, 63.78221f, 144.92508f),
                    PathNode.CurveTo(44.95101f, 156.58615f, 37.103893f, 180.01149f, 45.110916f, 200.66293f),
                    PathNode.CurveTo(53.11794f, 221.31438f, 74.70527f, 233.32733f, 96.47543f, 229.24635f),
                    PathNode.CurveTo(118.2456f, 225.16536f, 134.01631f, 206.14938f, 134.0f, 184.0f),
                    PathNode.LineTo(134.0f, 96.06f),
                    PathNode.LineTo(206.28f, 117.75f),
                    PathNode.CurveTo(208.09662f, 118.29358f, 210.0633f, 117.946434f, 211.58403f, 116.81376f),
                    PathNode.CurveTo(213.10477f, 115.68108f, 214.00058f, 113.8962f, 214.0f, 112.0f),
                    PathNode.LineTo(214.0f, 64.0f),
                    PathNode.CurveTo(214.00081f, 61.3481f, 212.2606f, 59.010212f, 209.72f, 58.25f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 218.0f),
                    PathNode.CurveTo(69.22232f, 218.0f, 54.0f, 202.77768f, 54.0f, 184.0f),
                    PathNode.CurveTo(54.0f, 165.22232f, 69.22232f, 150.0f, 88.0f, 150.0f),
                    PathNode.CurveTo(106.77768f, 150.0f, 122.0f, 165.22232f, 122.0f, 184.0f),
                    PathNode.CurveTo(122.0f, 202.77768f, 106.77768f, 218.0f, 88.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 103.94f),
                    PathNode.LineTo(134.0f, 83.54f),
                    PathNode.LineTo(134.0f, 48.06f),
                    PathNode.LineTo(202.0f, 68.46f),
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
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
