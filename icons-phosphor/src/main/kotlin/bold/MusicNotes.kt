package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MusicNotes: ImageVector
    get() {
        if (_musicNotes != null) return _musicNotes!!
        _musicNotes = phosphorBoldIcon(
            name = "MusicNotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 215.380 14.540 C 212.468 12.269 208.673 11.465 205.090 12.360 L 77.090 44.360 C 71.748 45.695 68.001 50.494 68.000 56.000 L 68.000 159.350 C 51.787 152.274 32.852 156.688 21.439 170.203 C 10.026 183.718 8.846 203.125 18.537 217.924 C 28.227 232.723 46.488 239.399 63.439 234.340 C 80.390 229.281 92.005 213.690 92.000 196.000 L 92.000 113.370 L 196.000 87.370 L 196.000 127.370 C 179.786 120.293 160.848 124.709 149.436 138.227 C 138.023 151.745 136.846 171.154 146.542 185.952 C 156.238 200.750 174.503 207.421 191.453 202.356 C 208.404 197.290 220.014 181.691 220.000 164.000 L 220.000 24.000 C 219.999 20.303 218.295 16.813 215.380 14.540 ZM 52.000 212.000 C 43.163 212.000 36.000 204.837 36.000 196.000 C 36.000 187.163 43.163 180.000 52.000 180.000 C 60.837 180.000 68.000 187.163 68.000 196.000 C 68.000 204.837 60.837 212.000 52.000 212.000 ZM 92.000 88.630 L 92.000 65.370 L 196.000 39.370 L 196.000 62.630 ZM 180.000 180.000 C 171.163 180.000 164.000 172.837 164.000 164.000 C 164.000 155.163 171.163 148.000 180.000 148.000 C 188.837 148.000 196.000 155.163 196.000 164.000 C 196.000 172.837 188.837 180.000 180.000 180.000 Z"),
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
        return _musicNotes!!
    }

private var _musicNotes: ImageVector? = null
