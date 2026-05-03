package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorThinIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 44.000 L 68.530 44.000 C 64.317 44.013 60.416 46.223 58.240 49.830 L 12.570 125.940 C 11.808 127.208 11.808 128.792 12.570 130.060 L 58.240 206.170 C 60.416 209.777 64.317 211.987 68.530 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 L 68.530 204.000 C 67.125 204.000 65.823 203.264 65.100 202.060 L 20.670 128.000 L 65.100 53.940 C 65.823 52.736 67.125 52.000 68.530 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 ZM 162.830 106.830 L 141.660 128.000 L 162.830 149.170 C 164.393 150.733 164.393 153.267 162.830 154.830 C 161.267 156.393 158.733 156.393 157.170 154.830 L 136.000 133.660 L 114.830 154.830 C 113.267 156.393 110.733 156.393 109.170 154.830 C 107.607 153.267 107.607 150.733 109.170 149.170 L 130.340 128.000 L 109.170 106.830 C 107.607 105.267 107.607 102.733 109.170 101.170 C 110.733 99.607 113.267 99.607 114.830 101.170 L 136.000 122.340 L 157.170 101.170 C 158.733 99.607 161.267 99.607 162.830 101.170 C 164.393 102.733 164.393 105.267 162.830 106.830 Z"),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
