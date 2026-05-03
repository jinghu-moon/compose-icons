package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = phosphorLightIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 74.000 120.000 C 74.000 125.523 69.523 130.000 64.000 130.000 C 58.477 130.000 54.000 125.523 54.000 120.000 C 54.000 114.477 58.477 110.000 64.000 110.000 C 69.523 110.000 74.000 114.477 74.000 120.000 ZM 238.000 120.000 L 238.000 208.000 C 238.000 215.732 231.732 222.000 224.000 222.000 L 112.000 222.000 C 104.268 222.000 98.000 215.732 98.000 208.000 L 98.000 178.480 C 89.650 195.490 77.600 206.000 64.000 206.000 C 38.210 206.000 18.000 168.220 18.000 120.000 C 18.000 71.780 38.210 34.000 64.000 34.000 L 192.000 34.000 C 217.790 34.000 238.000 71.780 238.000 120.000 ZM 98.000 120.000 C 98.000 75.740 80.420 46.000 64.000 46.000 C 47.580 46.000 30.000 75.740 30.000 120.000 C 30.000 164.260 47.580 194.000 64.000 194.000 C 80.420 194.000 98.000 164.270 98.000 120.000 ZM 226.000 208.000 L 226.000 126.000 L 208.000 126.000 C 204.686 126.000 202.000 123.314 202.000 120.000 C 202.000 116.686 204.686 114.000 208.000 114.000 L 225.880 114.000 C 224.370 73.080 207.670 46.000 192.000 46.000 L 87.760 46.000 C 100.330 59.920 108.850 84.740 109.880 114.000 L 128.000 114.000 C 131.314 114.000 134.000 116.686 134.000 120.000 C 134.000 123.314 131.314 126.000 128.000 126.000 L 110.000 126.000 L 110.000 208.000 C 110.000 209.105 110.895 210.000 112.000 210.000 L 224.000 210.000 C 225.105 210.000 226.000 209.105 226.000 208.000 ZM 176.000 114.000 L 160.000 114.000 C 156.686 114.000 154.000 116.686 154.000 120.000 C 154.000 123.314 156.686 126.000 160.000 126.000 L 176.000 126.000 C 179.314 126.000 182.000 123.314 182.000 120.000 C 182.000 116.686 179.314 114.000 176.000 114.000 Z"),
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
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
