package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) return _caretCircleDoubleRight!!
        _caretCircleDoubleRight = phosphorThinIcon(
            name = "CaretCircleDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.710 57.290 C 173.485 31.843 136.573 21.837 101.949 31.060 C 67.326 40.283 40.283 67.326 31.060 101.949 C 21.837 136.573 31.843 173.485 57.290 198.710 C 82.515 224.157 119.427 234.163 154.051 224.940 C 188.674 215.717 215.717 188.674 224.940 154.051 C 234.163 119.427 224.157 82.515 198.710 57.290 ZM 193.050 193.050 C 162.013 224.084 113.375 228.871 76.883 204.484 C 40.390 180.097 26.206 133.328 43.006 92.779 C 59.805 52.231 102.908 29.195 145.955 37.761 C 189.002 46.328 220.004 84.109 220.000 128.000 C 220.068 152.413 210.363 175.838 193.050 193.050 ZM 122.830 125.170 C 123.581 125.920 124.003 126.938 124.003 128.000 C 124.003 129.062 123.581 130.080 122.830 130.830 L 90.830 162.830 C 89.267 164.393 86.733 164.393 85.170 162.830 C 83.607 161.267 83.607 158.733 85.170 157.170 L 114.340 128.000 L 85.170 98.830 C 83.607 97.267 83.607 94.733 85.170 93.170 C 86.733 91.607 89.267 91.607 90.830 93.170 ZM 178.830 125.170 C 179.581 125.920 180.003 126.938 180.003 128.000 C 180.003 129.062 179.581 130.080 178.830 130.830 L 146.830 162.830 C 145.267 164.393 142.733 164.393 141.170 162.830 C 139.607 161.267 139.607 158.733 141.170 157.170 L 170.340 128.000 L 141.170 98.830 C 139.607 97.267 139.607 94.733 141.170 93.170 C 142.733 91.607 145.267 91.607 146.830 93.170 Z"),
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
        return _caretCircleDoubleRight!!
    }

private var _caretCircleDoubleRight: ImageVector? = null
