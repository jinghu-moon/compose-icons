package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretCircleDoubleLeft: ImageVector
    get() {
        if (_caretCircleDoubleLeft != null) return _caretCircleDoubleLeft!!
        _caretCircleDoubleLeft = phosphorThinIcon(
            name = "CaretCircleDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.710 57.290 C 173.485 31.843 136.573 21.837 101.949 31.060 C 67.326 40.283 40.283 67.326 31.060 101.949 C 21.837 136.573 31.843 173.485 57.290 198.710 C 82.515 224.157 119.427 234.163 154.051 224.940 C 188.674 215.717 215.717 188.674 224.940 154.051 C 234.163 119.427 224.157 82.515 198.710 57.290 ZM 193.050 193.050 C 162.013 224.084 113.375 228.871 76.883 204.484 C 40.390 180.097 26.206 133.328 43.006 92.779 C 59.805 52.231 102.908 29.195 145.955 37.761 C 189.002 46.328 220.004 84.109 220.000 128.000 C 220.068 152.413 210.363 175.838 193.050 193.050 ZM 170.830 98.830 L 141.660 128.000 L 170.830 157.170 C 172.393 158.733 172.393 161.267 170.830 162.830 C 169.267 164.393 166.733 164.393 165.170 162.830 L 133.170 130.830 C 132.419 130.080 131.997 129.062 131.997 128.000 C 131.997 126.938 132.419 125.920 133.170 125.170 L 165.170 93.170 C 166.733 91.607 169.267 91.607 170.830 93.170 C 172.393 94.733 172.393 97.267 170.830 98.830 ZM 114.830 98.830 L 85.660 128.000 L 114.830 157.170 C 116.393 158.733 116.393 161.267 114.830 162.830 C 113.267 164.393 110.733 164.393 109.170 162.830 L 77.170 130.830 C 76.419 130.080 75.997 129.062 75.997 128.000 C 75.997 126.938 76.419 125.920 77.170 125.170 L 109.170 93.170 C 110.733 91.607 113.267 91.607 114.830 93.170 C 116.393 94.733 116.393 97.267 114.830 98.830 Z"),
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
        return _caretCircleDoubleLeft!!
    }

private var _caretCircleDoubleLeft: ImageVector? = null
