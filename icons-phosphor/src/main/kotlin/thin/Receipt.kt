package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorThinIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 104.000 C 180.000 106.209 178.209 108.000 176.000 108.000 L 80.000 108.000 C 77.791 108.000 76.000 106.209 76.000 104.000 C 76.000 101.791 77.791 100.000 80.000 100.000 L 176.000 100.000 C 178.209 100.000 180.000 101.791 180.000 104.000 ZM 176.000 132.000 L 80.000 132.000 C 77.791 132.000 76.000 133.791 76.000 136.000 C 76.000 138.209 77.791 140.000 80.000 140.000 L 176.000 140.000 C 178.209 140.000 180.000 138.209 180.000 136.000 C 180.000 133.791 178.209 132.000 176.000 132.000 ZM 228.000 56.000 L 228.000 208.000 C 228.000 210.209 226.209 212.000 224.000 212.000 C 223.379 211.999 222.767 211.855 222.210 211.580 L 192.000 196.470 L 161.790 211.580 C 160.663 212.144 159.337 212.144 158.210 211.580 L 128.000 196.470 L 97.790 211.580 C 96.663 212.144 95.337 212.144 94.210 211.580 L 64.000 196.470 L 33.790 211.580 C 32.550 212.201 31.076 212.135 29.896 211.405 C 28.717 210.676 27.999 209.387 28.000 208.000 L 28.000 56.000 C 28.000 49.373 33.373 44.000 40.000 44.000 L 216.000 44.000 C 222.627 44.000 228.000 49.373 228.000 56.000 ZM 220.000 56.000 C 220.000 53.791 218.209 52.000 216.000 52.000 L 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 L 36.000 201.530 L 62.210 188.420 C 63.337 187.856 64.663 187.856 65.790 188.420 L 96.000 203.530 L 126.210 188.420 C 127.337 187.856 128.663 187.856 129.790 188.420 L 160.000 203.530 L 190.210 188.420 C 191.337 187.856 192.663 187.856 193.790 188.420 L 220.000 201.530 Z"),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
