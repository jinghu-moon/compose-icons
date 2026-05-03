package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorLightIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 86.000 152.000 L 86.000 200.000 C 86.000 203.314 83.314 206.000 80.000 206.000 C 76.686 206.000 74.000 203.314 74.000 200.000 L 74.000 152.000 C 74.000 148.686 76.686 146.000 80.000 146.000 C 83.314 146.000 86.000 148.686 86.000 152.000 ZM 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 L 34.000 200.000 C 34.000 203.314 36.686 206.000 40.000 206.000 C 43.314 206.000 46.000 203.314 46.000 200.000 L 46.000 192.000 C 46.000 188.686 43.314 186.000 40.000 186.000 ZM 212.440 212.000 L 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 114.000 121.520 L 114.000 200.000 C 114.000 203.314 116.686 206.000 120.000 206.000 C 123.314 206.000 126.000 203.314 126.000 200.000 L 126.000 134.720 L 154.000 165.520 L 154.000 200.000 C 154.000 203.314 156.686 206.000 160.000 206.000 C 163.314 206.000 166.000 203.314 166.000 200.000 L 166.000 178.720 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 ZM 160.000 121.630 C 163.314 121.630 166.000 118.944 166.000 115.630 L 166.000 72.000 C 166.000 68.686 163.314 66.000 160.000 66.000 C 156.686 66.000 154.000 68.686 154.000 72.000 L 154.000 115.630 C 154.000 118.944 156.686 121.630 160.000 121.630 ZM 200.000 165.630 C 203.314 165.630 206.000 162.944 206.000 159.630 L 206.000 32.000 C 206.000 28.686 203.314 26.000 200.000 26.000 C 196.686 26.000 194.000 28.686 194.000 32.000 L 194.000 159.630 C 194.000 162.944 196.686 165.630 200.000 165.630 Z"),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
