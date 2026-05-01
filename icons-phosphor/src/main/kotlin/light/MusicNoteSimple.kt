package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MusicNoteSimple: ImageVector
    get() {
        if (_musicNoteSimple != null) return _musicNoteSimple!!
        _musicNoteSimple = phosphorLightIcon(
            name = "MusicNoteSimple",
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
                    PathNode.LineTo(134.0f, 48.06f),
                    PathNode.LineTo(206.27f, 69.75f),
                    PathNode.CurveTo(209.44563f, 70.70269f, 212.79231f, 68.900635f, 213.745f, 65.725f),
                    PathNode.CurveTo(214.6977f, 62.549362f, 212.89563f, 59.20269f, 209.72f, 58.25f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 218.0f),
                    PathNode.CurveTo(69.22232f, 218.0f, 54.0f, 202.77768f, 54.0f, 184.0f),
                    PathNode.CurveTo(54.0f, 165.22232f, 69.22232f, 150.0f, 88.0f, 150.0f),
                    PathNode.CurveTo(106.77768f, 150.0f, 122.0f, 165.22232f, 122.0f, 184.0f),
                    PathNode.CurveTo(122.0f, 202.77768f, 106.77768f, 218.0f, 88.0f, 218.0f),
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
        return _musicNoteSimple!!
    }

private var _musicNoteSimple: ImageVector? = null
