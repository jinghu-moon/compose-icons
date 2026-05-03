package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bathtub: ImageVector
    get() {
        if (_bathtub != null) return _bathtub!!
        _bathtub = phosphorThinIcon(
            name = "Bathtub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 100.000 L 204.000 100.000 L 204.000 96.000 C 204.000 93.791 202.209 92.000 200.000 92.000 L 136.000 92.000 C 133.791 92.000 132.000 93.791 132.000 96.000 L 132.000 100.000 L 60.000 100.000 L 60.000 52.000 C 60.000 43.163 67.163 36.000 76.000 36.000 C 83.689 35.996 90.360 41.306 92.080 48.800 C 92.522 50.965 94.635 52.362 96.800 51.920 C 98.965 51.478 100.362 49.365 99.920 47.200 C 97.496 35.945 87.513 27.931 76.000 28.000 C 62.745 28.000 52.000 38.745 52.000 52.000 L 52.000 100.000 L 16.000 100.000 C 13.791 100.000 12.000 101.791 12.000 104.000 L 12.000 144.000 C 12.033 172.705 35.295 195.967 64.000 196.000 L 68.000 196.000 L 68.000 216.000 C 68.000 218.209 69.791 220.000 72.000 220.000 C 74.209 220.000 76.000 218.209 76.000 216.000 L 76.000 196.000 L 180.000 196.000 L 180.000 216.000 C 180.000 218.209 181.791 220.000 184.000 220.000 C 186.209 220.000 188.000 218.209 188.000 216.000 L 188.000 196.000 L 192.000 196.000 C 220.705 195.967 243.967 172.705 244.000 144.000 L 244.000 104.000 C 244.000 101.791 242.209 100.000 240.000 100.000 ZM 140.000 100.000 L 196.000 100.000 L 196.000 140.000 L 140.000 140.000 ZM 236.000 144.000 C 235.972 168.289 216.289 187.972 192.000 188.000 L 64.000 188.000 C 39.711 187.972 20.028 168.289 20.000 144.000 L 20.000 108.000 L 132.000 108.000 L 132.000 144.000 C 132.000 146.209 133.791 148.000 136.000 148.000 L 200.000 148.000 C 202.209 148.000 204.000 146.209 204.000 144.000 L 204.000 108.000 L 236.000 108.000 Z"),
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
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
