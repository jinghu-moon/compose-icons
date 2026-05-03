package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) return _musicNotesPlus!!
        _musicNotesPlus = phosphorRegularIcon(
            name = "MusicNotesPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 48.000 C 232.000 52.418 228.418 56.000 224.000 56.000 L 208.000 56.000 L 208.000 72.000 C 208.000 76.418 204.418 80.000 200.000 80.000 C 195.582 80.000 192.000 76.418 192.000 72.000 L 192.000 56.000 L 176.000 56.000 C 171.582 56.000 168.000 52.418 168.000 48.000 C 168.000 43.582 171.582 40.000 176.000 40.000 L 192.000 40.000 L 192.000 24.000 C 192.000 19.582 195.582 16.000 200.000 16.000 C 204.418 16.000 208.000 19.582 208.000 24.000 L 208.000 40.000 L 224.000 40.000 C 228.418 40.000 232.000 43.582 232.000 48.000 ZM 216.000 112.000 L 216.000 164.000 C 216.006 180.514 204.775 194.915 188.757 198.932 C 172.739 202.949 156.042 195.552 148.254 180.990 C 140.467 166.427 143.586 148.433 155.821 137.342 C 168.056 126.250 186.269 124.905 200.000 134.080 L 200.000 112.000 C 200.000 107.582 203.582 104.000 208.000 104.000 C 212.418 104.000 216.000 107.582 216.000 112.000 ZM 200.000 164.000 C 200.000 152.954 191.046 144.000 180.000 144.000 C 168.954 144.000 160.000 152.954 160.000 164.000 C 160.000 175.046 168.954 184.000 180.000 184.000 C 191.046 184.000 200.000 175.046 200.000 164.000 ZM 88.000 110.250 L 88.000 196.000 C 88.006 212.514 76.775 226.915 60.757 230.932 C 44.739 234.949 28.042 227.552 20.254 212.990 C 12.467 198.427 15.586 180.433 27.821 169.342 C 40.056 158.250 58.269 156.905 72.000 166.080 L 72.000 56.000 C 72.001 52.329 74.499 49.130 78.060 48.240 L 134.060 34.240 C 138.312 33.254 142.569 35.858 143.628 40.093 C 144.687 44.327 142.156 48.629 137.940 49.760 L 88.000 62.250 L 88.000 93.750 L 158.060 76.240 C 162.312 75.254 166.569 77.858 167.628 82.093 C 168.687 86.327 166.156 90.629 161.940 91.760 ZM 72.000 196.000 C 72.000 184.954 63.046 176.000 52.000 176.000 C 40.954 176.000 32.000 184.954 32.000 196.000 C 32.000 207.046 40.954 216.000 52.000 216.000 C 63.046 216.000 72.000 207.046 72.000 196.000 Z"),
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
        return _musicNotesPlus!!
    }

private var _musicNotesPlus: ImageVector? = null
