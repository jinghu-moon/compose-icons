package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = phosphorLightIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.510 121.740 L 204.510 41.740 C 202.155 36.987 197.304 33.986 192.000 34.000 L 64.000 34.000 C 58.692 33.982 53.836 36.984 51.480 41.740 L 11.480 121.740 C 9.311 126.079 9.543 131.233 12.093 135.360 C 14.643 139.487 19.149 141.999 24.000 142.000 L 122.000 142.000 L 122.000 210.000 L 96.000 210.000 C 92.686 210.000 90.000 212.686 90.000 216.000 C 90.000 219.314 92.686 222.000 96.000 222.000 L 160.000 222.000 C 163.314 222.000 166.000 219.314 166.000 216.000 C 166.000 212.686 163.314 210.000 160.000 210.000 L 134.000 210.000 L 134.000 142.000 L 232.000 142.000 C 236.851 141.999 241.357 139.487 243.907 135.360 C 246.457 131.233 246.689 126.079 244.520 121.740 ZM 233.690 129.050 C 233.336 129.650 232.687 130.013 231.990 130.000 L 24.000 130.000 C 23.308 130.000 22.665 129.641 22.301 129.053 C 21.936 128.465 21.902 127.730 22.210 127.110 L 62.210 47.110 C 62.548 46.430 63.241 46.000 64.000 46.000 L 192.000 46.000 C 192.759 46.000 193.452 46.430 193.790 47.110 L 233.790 127.110 C 234.094 127.731 234.056 128.464 233.690 129.050 ZM 190.000 104.000 C 190.000 107.314 187.314 110.000 184.000 110.000 L 72.000 110.000 C 68.686 110.000 66.000 107.314 66.000 104.000 C 66.000 100.686 68.686 98.000 72.000 98.000 L 184.000 98.000 C 187.314 98.000 190.000 100.686 190.000 104.000 Z"),
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
        return _lectern!!
    }

private var _lectern: ImageVector? = null
