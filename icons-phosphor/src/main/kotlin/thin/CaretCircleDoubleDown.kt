package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) return _caretCircleDoubleDown!!
        _caretCircleDoubleDown = phosphorThinIcon(
            name = "CaretCircleDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.710 57.290 C 173.485 31.843 136.573 21.837 101.949 31.060 C 67.326 40.283 40.283 67.326 31.060 101.949 C 21.837 136.573 31.843 173.485 57.290 198.710 C 82.515 224.157 119.427 234.163 154.051 224.940 C 188.674 215.717 215.717 188.674 224.940 154.051 C 234.163 119.427 224.157 82.515 198.710 57.290 ZM 193.050 193.050 C 162.013 224.084 113.375 228.871 76.883 204.484 C 40.390 180.097 26.206 133.328 43.006 92.779 C 59.805 52.231 102.908 29.195 145.955 37.761 C 189.002 46.328 220.004 84.109 220.000 128.000 C 220.068 152.413 210.363 175.838 193.050 193.050 ZM 162.830 85.170 C 163.581 85.920 164.003 86.938 164.003 88.000 C 164.003 89.062 163.581 90.080 162.830 90.830 L 130.830 122.830 C 130.080 123.581 129.062 124.003 128.000 124.003 C 126.938 124.003 125.920 123.581 125.170 122.830 L 93.170 90.830 C 91.607 89.267 91.607 86.733 93.170 85.170 C 94.733 83.607 97.267 83.607 98.830 85.170 L 128.000 114.340 L 157.170 85.170 C 157.920 84.419 158.938 83.997 160.000 83.997 C 161.062 83.997 162.080 84.419 162.830 85.170 ZM 162.830 141.170 C 163.581 141.920 164.003 142.938 164.003 144.000 C 164.003 145.062 163.581 146.080 162.830 146.830 L 130.830 178.830 C 130.080 179.581 129.062 180.003 128.000 180.003 C 126.938 180.003 125.920 179.581 125.170 178.830 L 93.170 146.830 C 91.607 145.267 91.607 142.733 93.170 141.170 C 94.733 139.607 97.267 139.607 98.830 141.170 L 128.000 170.340 L 157.170 141.170 C 157.920 140.419 158.938 139.997 160.000 139.997 C 161.062 139.997 162.080 140.419 162.830 141.170 Z"),
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
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
