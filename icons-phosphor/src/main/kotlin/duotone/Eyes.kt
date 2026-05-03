package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Eyes: ImageVector
    get() {
        if (_eyes != null) return _eyes!!
        _eyes = phosphorDuotoneIcon(
            name = "Eyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 80.000 128.000 C 80.000 141.255 69.255 152.000 56.000 152.000 C 42.745 152.000 32.000 141.255 32.000 128.000 C 32.000 114.745 42.745 104.000 56.000 104.000 C 69.255 104.000 80.000 114.745 80.000 128.000 ZM 152.000 104.000 C 138.745 104.000 128.000 114.745 128.000 128.000 C 128.000 141.255 138.745 152.000 152.000 152.000 C 165.255 152.000 176.000 141.255 176.000 128.000 C 176.000 114.745 165.255 104.000 152.000 104.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 176.000 32.000 C 155.390 32.000 137.720 50.160 128.000 77.850 C 118.280 50.160 100.610 32.000 80.000 32.000 C 48.600 32.000 24.000 74.170 24.000 128.000 C 24.000 181.830 48.600 224.000 80.000 224.000 C 100.610 224.000 118.280 205.840 128.000 178.150 C 137.720 205.840 155.390 224.000 176.000 224.000 C 207.400 224.000 232.000 181.830 232.000 128.000 C 232.000 74.170 207.400 32.000 176.000 32.000 ZM 106.920 186.390 C 99.430 200.120 89.620 208.000 80.000 208.000 C 70.380 208.000 60.570 200.120 53.080 186.390 C 48.238 177.208 44.787 167.357 42.840 157.160 C 56.268 163.229 72.105 159.343 81.199 147.748 C 90.293 136.153 90.293 119.847 81.199 108.252 C 72.105 96.657 56.268 92.771 42.840 98.840 C 44.787 88.643 48.238 78.792 53.080 69.610 C 60.570 55.880 70.380 48.000 80.000 48.000 C 89.620 48.000 99.430 55.880 106.920 69.610 C 115.350 85.070 120.000 105.810 120.000 128.000 C 120.000 150.190 115.350 170.930 106.920 186.390 ZM 40.000 128.000 C 40.000 119.163 47.163 112.000 56.000 112.000 C 64.837 112.000 72.000 119.163 72.000 128.000 C 72.000 136.837 64.837 144.000 56.000 144.000 C 47.163 144.000 40.000 136.837 40.000 128.000 ZM 202.920 186.390 C 195.430 200.120 185.620 208.000 176.000 208.000 C 166.380 208.000 156.570 200.120 149.080 186.390 C 144.238 177.208 140.787 167.357 138.840 157.160 C 152.268 163.229 168.105 159.343 177.199 147.748 C 186.293 136.153 186.293 119.847 177.199 108.252 C 168.105 96.657 152.268 92.771 138.840 98.840 C 140.787 88.643 144.238 78.792 149.080 69.610 C 156.570 55.880 166.380 48.000 176.000 48.000 C 185.620 48.000 195.430 55.880 202.920 69.610 C 211.350 85.070 216.000 105.810 216.000 128.000 C 216.000 150.190 211.350 170.930 202.920 186.390 ZM 136.000 128.000 C 136.000 119.163 143.163 112.000 152.000 112.000 C 160.837 112.000 168.000 119.163 168.000 128.000 C 168.000 136.837 160.837 144.000 152.000 144.000 C 143.163 144.000 136.000 136.837 136.000 128.000 Z"),
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
        return _eyes!!
    }

private var _eyes: ImageVector? = null
