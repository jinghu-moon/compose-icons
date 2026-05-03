package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) return _musicNotesPlus!!
        _musicNotesPlus = phosphorBoldIcon(
            name = "MusicNotesPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 48.000 C 236.000 54.627 230.627 60.000 224.000 60.000 L 212.000 60.000 L 212.000 72.000 C 212.000 78.627 206.627 84.000 200.000 84.000 C 193.373 84.000 188.000 78.627 188.000 72.000 L 188.000 60.000 L 176.000 60.000 C 169.373 60.000 164.000 54.627 164.000 48.000 C 164.000 41.373 169.373 36.000 176.000 36.000 L 188.000 36.000 L 188.000 24.000 C 188.000 17.373 193.373 12.000 200.000 12.000 C 206.627 12.000 212.000 17.373 212.000 24.000 L 212.000 36.000 L 224.000 36.000 C 230.627 36.000 236.000 41.373 236.000 48.000 ZM 220.000 112.000 L 220.000 164.000 C 220.005 181.690 208.390 197.281 191.439 202.340 C 174.488 207.399 156.227 200.723 146.536 185.924 C 136.846 171.125 138.026 151.718 149.439 138.203 C 160.852 124.688 179.787 120.274 196.000 127.350 L 196.000 112.000 C 196.000 105.373 201.373 100.000 208.000 100.000 C 214.627 100.000 220.000 105.373 220.000 112.000 ZM 196.000 164.000 C 196.000 155.163 188.837 148.000 180.000 148.000 C 171.163 148.000 164.000 155.163 164.000 164.000 C 164.000 172.837 171.163 180.000 180.000 180.000 C 188.837 180.000 196.000 172.837 196.000 164.000 ZM 92.000 113.370 L 92.000 196.000 C 92.005 213.690 80.390 229.281 63.439 234.340 C 46.488 239.399 28.227 232.723 18.537 217.924 C 8.846 203.125 10.026 183.718 21.439 170.203 C 32.852 156.688 51.787 152.274 68.000 159.350 L 68.000 56.000 C 68.001 50.494 71.748 45.695 77.090 44.360 L 133.090 30.360 C 139.468 28.881 145.854 32.788 147.442 39.139 C 149.030 45.491 145.234 51.943 138.910 53.640 L 92.000 65.370 L 92.000 88.630 L 157.090 72.360 C 163.468 70.881 169.854 74.788 171.442 81.139 C 173.030 87.491 169.234 93.943 162.910 95.640 ZM 68.000 196.000 C 68.000 187.163 60.837 180.000 52.000 180.000 C 43.163 180.000 36.000 187.163 36.000 196.000 C 36.000 204.837 43.163 212.000 52.000 212.000 C 60.837 212.000 68.000 204.837 68.000 196.000 Z"),
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
