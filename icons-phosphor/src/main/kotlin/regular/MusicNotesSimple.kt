package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MusicNotesSimple: ImageVector
    get() {
        if (_musicNotesSimple != null) return _musicNotesSimple!!
        _musicNotesSimple = phosphorRegularIcon(
            name = "MusicNotesSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.920 17.690 C 210.978 16.177 208.448 15.642 206.060 16.240 L 78.060 48.240 C 74.499 49.130 72.001 52.329 72.000 56.000 L 72.000 166.080 C 58.269 156.905 40.056 158.250 27.821 169.342 C 15.586 180.433 12.467 198.427 20.254 212.990 C 28.042 227.552 44.739 234.949 60.757 230.932 C 76.775 226.915 88.006 212.514 88.000 196.000 L 88.000 62.250 L 200.000 34.250 L 200.000 134.080 C 186.269 124.905 168.056 126.250 155.821 137.342 C 143.586 148.433 140.467 166.427 148.254 180.990 C 156.042 195.552 172.739 202.949 188.757 198.932 C 204.775 194.915 216.006 180.514 216.000 164.000 L 216.000 24.000 C 216.001 21.534 214.864 19.206 212.920 17.690 ZM 52.000 216.000 C 40.954 216.000 32.000 207.046 32.000 196.000 C 32.000 184.954 40.954 176.000 52.000 176.000 C 63.046 176.000 72.000 184.954 72.000 196.000 C 72.000 207.046 63.046 216.000 52.000 216.000 ZM 180.000 184.000 C 168.954 184.000 160.000 175.046 160.000 164.000 C 160.000 152.954 168.954 144.000 180.000 144.000 C 191.046 144.000 200.000 152.954 200.000 164.000 C 200.000 175.046 191.046 184.000 180.000 184.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _musicNotesSimple!!
    }

private var _musicNotesSimple: ImageVector? = null
