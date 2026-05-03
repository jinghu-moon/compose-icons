package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilmReel: ImageVector
    get() {
        if (_filmReel != null) return _filmReel!!
        _filmReel = phosphorBoldIcon(
            name = "FilmReel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 212.000 L 195.800 212.000 C 236.685 178.947 247.808 121.245 222.141 75.362 C 196.473 29.479 141.481 8.763 91.920 26.307 C 42.359 43.851 12.647 94.550 21.562 146.363 C 30.477 198.176 75.426 236.030 128.000 236.000 L 232.000 236.000 C 238.627 236.000 244.000 230.627 244.000 224.000 C 244.000 217.373 238.627 212.000 232.000 212.000 ZM 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 212.000 174.392 174.392 212.000 128.000 212.000 C 81.629 211.950 44.050 174.371 44.000 128.000 ZM 108.000 84.000 C 108.000 72.954 116.954 64.000 128.000 64.000 C 139.046 64.000 148.000 72.954 148.000 84.000 C 148.000 95.046 139.046 104.000 128.000 104.000 C 116.954 104.000 108.000 95.046 108.000 84.000 ZM 128.000 192.000 C 116.954 192.000 108.000 183.046 108.000 172.000 C 108.000 160.954 116.954 152.000 128.000 152.000 C 139.046 152.000 148.000 160.954 148.000 172.000 C 148.000 183.046 139.046 192.000 128.000 192.000 ZM 152.000 128.000 C 152.000 116.954 160.954 108.000 172.000 108.000 C 183.046 108.000 192.000 116.954 192.000 128.000 C 192.000 139.046 183.046 148.000 172.000 148.000 C 160.954 148.000 152.000 139.046 152.000 128.000 ZM 104.000 128.000 C 104.000 139.046 95.046 148.000 84.000 148.000 C 72.954 148.000 64.000 139.046 64.000 128.000 C 64.000 116.954 72.954 108.000 84.000 108.000 C 95.046 108.000 104.000 116.954 104.000 128.000 Z"),
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
        return _filmReel!!
    }

private var _filmReel: ImageVector? = null
