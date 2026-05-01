package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MusicNotesSimple: ImageVector
    get() {
        if (_musicNotesSimple != null) return _musicNotesSimple!!
        _musicNotesSimple = phosphorThinIcon(
            name = "MusicNotesSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.46f, 20.85f),
                    PathNode.CurveTo(209.48994f, 20.091742f, 208.22475f, 19.822472f, 207.03f, 20.12f),
                    PathNode.LineTo(79.03f, 52.12f),
                    PathNode.CurveTo(77.24948f, 52.56506f, 76.000275f, 54.1647f, 76.0f, 56.0f),
                    PathNode.LineTo(76.0f, 174.87f),
                    PathNode.CurveTo(65.77513f, 163.27611f, 48.724026f, 160.64911f, 35.48368f, 168.6278f),
                    PathNode.CurveTo(22.243341f, 176.6065f, 16.599577f, 192.90956f, 22.073141f, 207.36661f),
                    PathNode.CurveTo(27.546705f, 221.82365f, 42.572544f, 230.30101f, 57.777077f, 227.51024f),
                    PathNode.CurveTo(72.98161f, 224.71947f, 84.01741f, 211.45853f, 84.0f, 196.0f),
                    PathNode.LineTo(84.0f, 59.12f),
                    PathNode.LineTo(204.0f, 29.12f),
                    PathNode.LineTo(204.0f, 142.87f),
                    PathNode.CurveTo(193.77513f, 131.27611f, 176.72403f, 128.64911f, 163.4837f, 136.6278f),
                    PathNode.CurveTo(150.24335f, 144.6065f, 144.59958f, 160.90956f, 150.07314f, 175.36661f),
                    PathNode.CurveTo(155.5467f, 189.82365f, 170.57254f, 198.30101f, 185.77707f, 195.51024f),
                    PathNode.CurveTo(200.98161f, 192.71947f, 212.01741f, 179.45853f, 212.0f, 164.0f),
                    PathNode.LineTo(212.0f, 24.0f),
                    PathNode.CurveTo(211.99873f, 22.768967f, 211.43071f, 21.607084f, 210.46f, 20.85f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 220.0f),
                    PathNode.CurveTo(38.745167f, 220.0f, 28.0f, 209.25484f, 28.0f, 196.0f),
                    PathNode.CurveTo(28.0f, 182.74516f, 38.745167f, 172.0f, 52.0f, 172.0f),
                    PathNode.CurveTo(65.25484f, 172.0f, 76.0f, 182.74516f, 76.0f, 196.0f),
                    PathNode.CurveTo(76.0f, 209.25484f, 65.25484f, 220.0f, 52.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 188.0f),
                    PathNode.CurveTo(166.74516f, 188.0f, 156.0f, 177.25484f, 156.0f, 164.0f),
                    PathNode.CurveTo(156.0f, 150.74516f, 166.74516f, 140.0f, 180.0f, 140.0f),
                    PathNode.CurveTo(193.25484f, 140.0f, 204.0f, 150.74516f, 204.0f, 164.0f),
                    PathNode.CurveTo(204.0f, 177.25484f, 193.25484f, 188.0f, 180.0f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _musicNotesSimple!!
    }

private var _musicNotesSimple: ImageVector? = null
