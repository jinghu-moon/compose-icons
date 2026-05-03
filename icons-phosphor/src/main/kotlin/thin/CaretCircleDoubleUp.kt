package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) return _caretCircleDoubleUp!!
        _caretCircleDoubleUp = phosphorThinIcon(
            name = "CaretCircleDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.710 57.290 C 173.485 31.843 136.573 21.837 101.949 31.060 C 67.326 40.283 40.283 67.326 31.060 101.949 C 21.837 136.573 31.843 173.485 57.290 198.710 C 82.515 224.157 119.427 234.163 154.051 224.940 C 188.674 215.717 215.717 188.674 224.940 154.051 C 234.163 119.427 224.157 82.515 198.710 57.290 ZM 193.050 193.050 C 162.013 224.084 113.375 228.871 76.883 204.484 C 40.390 180.097 26.206 133.328 43.006 92.779 C 59.805 52.231 102.908 29.195 145.955 37.761 C 189.002 46.328 220.004 84.109 220.000 128.000 C 220.068 152.413 210.363 175.838 193.050 193.050 ZM 162.830 165.170 C 164.393 166.733 164.393 169.267 162.830 170.830 C 161.267 172.393 158.733 172.393 157.170 170.830 L 128.000 141.660 L 98.830 170.830 C 97.267 172.393 94.733 172.393 93.170 170.830 C 91.607 169.267 91.607 166.733 93.170 165.170 L 125.170 133.170 C 125.920 132.419 126.938 131.997 128.000 131.997 C 129.062 131.997 130.080 132.419 130.830 133.170 ZM 162.830 109.170 C 164.393 110.733 164.393 113.267 162.830 114.830 C 161.267 116.393 158.733 116.393 157.170 114.830 L 128.000 85.660 L 98.830 114.830 C 97.267 116.393 94.733 116.393 93.170 114.830 C 91.607 113.267 91.607 110.733 93.170 109.170 L 125.170 77.170 C 125.920 76.419 126.938 75.997 128.000 75.997 C 129.062 75.997 130.080 76.419 130.830 77.170 Z"),
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
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null
