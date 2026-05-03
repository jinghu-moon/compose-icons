package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
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
        pathData = parseSvgPathData("M 210.460 20.850 C 209.490 20.092 208.225 19.822 207.030 20.120 L 79.030 52.120 C 77.249 52.565 76.000 54.165 76.000 56.000 L 76.000 174.870 C 65.775 163.276 48.724 160.649 35.484 168.628 C 22.243 176.607 16.600 192.910 22.073 207.367 C 27.547 221.824 42.573 230.301 57.777 227.510 C 72.982 224.719 84.017 211.459 84.000 196.000 L 84.000 59.120 L 204.000 29.120 L 204.000 142.870 C 193.775 131.276 176.724 128.649 163.484 136.628 C 150.243 144.607 144.600 160.910 150.073 175.367 C 155.547 189.824 170.573 198.301 185.777 195.510 C 200.982 192.719 212.017 179.459 212.000 164.000 L 212.000 24.000 C 211.999 22.769 211.431 21.607 210.460 20.850 ZM 52.000 220.000 C 38.745 220.000 28.000 209.255 28.000 196.000 C 28.000 182.745 38.745 172.000 52.000 172.000 C 65.255 172.000 76.000 182.745 76.000 196.000 C 76.000 209.255 65.255 220.000 52.000 220.000 ZM 180.000 188.000 C 166.745 188.000 156.000 177.255 156.000 164.000 C 156.000 150.745 166.745 140.000 180.000 140.000 C 193.255 140.000 204.000 150.745 204.000 164.000 C 204.000 177.255 193.255 188.000 180.000 188.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _musicNotesSimple!!
    }

private var _musicNotesSimple: ImageVector? = null
