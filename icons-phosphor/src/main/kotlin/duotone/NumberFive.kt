package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorDuotoneIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 176.000 160.000 C 175.999 182.082 163.021 202.102 142.863 211.118 C 122.704 220.133 99.130 216.460 82.670 201.740 C 80.430 199.866 79.389 196.919 79.955 194.054 C 80.521 191.188 82.604 188.859 85.389 187.977 C 88.174 187.096 91.218 187.802 93.330 189.820 C 109.267 204.075 133.597 203.275 148.563 188.004 C 163.530 172.734 163.841 148.393 149.269 132.745 C 134.697 117.098 110.396 115.677 94.100 129.520 C 91.504 131.704 87.812 132.012 84.890 130.290 C 81.967 128.568 80.448 125.189 81.100 121.860 L 96.160 46.430 C 96.908 42.693 100.189 40.002 104.000 40.000 L 168.000 40.000 C 172.418 40.000 176.000 43.582 176.000 48.000 C 176.000 52.418 172.418 56.000 168.000 56.000 L 110.560 56.000 L 100.240 107.600 C 117.443 101.113 136.734 103.483 151.856 113.941 C 166.977 124.400 176.001 141.614 176.000 160.000 Z"),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
