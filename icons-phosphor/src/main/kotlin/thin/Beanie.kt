package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Beanie: ImageVector
    get() {
        if (_beanie != null) return _beanie!!
        _beanie = phosphorThinIcon(
            name = "Beanie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 164.700 L 220.000 144.000 C 219.944 99.546 188.159 61.468 144.430 53.470 C 151.606 46.731 153.939 36.293 150.314 27.140 C 146.690 17.987 137.844 11.976 128.000 11.976 C 118.156 11.976 109.310 17.987 105.686 27.140 C 102.061 36.293 104.394 46.731 111.570 53.470 C 67.841 61.468 36.056 99.546 36.000 144.000 L 36.000 164.700 C 31.210 166.393 28.006 170.920 28.000 176.000 L 28.000 208.000 C 28.000 214.627 33.373 220.000 40.000 220.000 L 216.000 220.000 C 222.627 220.000 228.000 214.627 228.000 208.000 L 228.000 176.000 C 227.994 170.920 224.790 166.393 220.000 164.700 ZM 112.000 36.000 C 112.000 27.163 119.163 20.000 128.000 20.000 C 136.837 20.000 144.000 27.163 144.000 36.000 C 144.000 44.837 136.837 52.000 128.000 52.000 C 119.163 52.000 112.000 44.837 112.000 36.000 ZM 128.000 60.000 C 174.371 60.050 211.950 97.629 212.000 144.000 L 212.000 164.000 L 44.000 164.000 L 44.000 144.000 C 44.050 97.629 81.629 60.050 128.000 60.000 ZM 124.000 172.000 L 124.000 212.000 L 76.000 212.000 L 76.000 172.000 ZM 132.000 172.000 L 180.000 172.000 L 180.000 212.000 L 132.000 212.000 ZM 36.000 208.000 L 36.000 176.000 C 36.000 173.791 37.791 172.000 40.000 172.000 L 68.000 172.000 L 68.000 212.000 L 40.000 212.000 C 37.791 212.000 36.000 210.209 36.000 208.000 ZM 220.000 208.000 C 220.000 210.209 218.209 212.000 216.000 212.000 L 188.000 212.000 L 188.000 172.000 L 216.000 172.000 C 218.209 172.000 220.000 173.791 220.000 176.000 Z"),
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
        return _beanie!!
    }

private var _beanie: ImageVector? = null
