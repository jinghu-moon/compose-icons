package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GasCan: ImageVector
    get() {
        if (_gasCan != null) return _gasCan!!
        _gasCan = phosphorBoldIcon(
            name = "GasCan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 20.000 L 131.310 20.000 C 126.003 19.986 120.911 22.096 117.170 25.860 L 105.660 37.370 L 90.140 21.860 C 82.330 14.052 69.670 14.052 61.860 21.860 L 37.860 45.860 C 30.052 53.670 30.052 66.330 37.860 74.140 L 53.370 89.660 L 41.860 101.170 C 38.096 104.911 35.986 110.003 36.000 115.310 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 40.000 C 220.000 28.954 211.046 20.000 200.000 20.000 ZM 57.660 60.000 L 76.000 41.660 L 88.690 54.340 L 70.340 72.690 ZM 196.000 212.000 L 60.000 212.000 L 60.000 117.000 L 78.830 98.140 L 78.830 98.140 L 133.000 44.000 L 196.000 44.000 ZM 136.000 68.000 C 136.000 61.373 141.373 56.000 148.000 56.000 L 168.000 56.000 C 174.627 56.000 180.000 61.373 180.000 68.000 C 180.000 74.627 174.627 80.000 168.000 80.000 L 148.000 80.000 C 141.373 80.000 136.000 74.627 136.000 68.000 ZM 175.500 133.370 L 147.210 156.000 L 175.500 178.630 C 180.675 182.772 181.512 190.325 177.370 195.500 C 173.228 200.675 165.675 201.512 160.500 197.370 L 128.000 171.370 L 95.500 197.370 C 90.325 201.512 82.772 200.675 78.630 195.500 C 74.488 190.325 75.325 182.772 80.500 178.630 L 108.790 156.000 L 80.500 133.370 C 75.325 129.228 74.488 121.675 78.630 116.500 C 82.772 111.325 90.325 110.488 95.500 114.630 L 128.000 140.630 L 160.500 114.630 C 165.675 110.488 173.228 111.325 177.370 116.500 C 181.512 121.675 180.675 129.228 175.500 133.370 Z"),
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
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
