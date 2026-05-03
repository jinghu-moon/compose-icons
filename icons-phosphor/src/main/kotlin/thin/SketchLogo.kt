package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = phosphorThinIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.000 101.370 L 187.000 37.370 C 186.244 36.503 185.150 36.004 184.000 36.000 L 72.000 36.000 C 70.850 36.004 69.756 36.503 69.000 37.370 L 13.000 101.370 C 11.651 102.915 11.690 105.231 13.090 106.730 L 125.090 226.730 C 125.846 227.538 126.903 227.996 128.010 227.996 C 129.117 227.996 130.174 227.538 130.930 226.730 L 242.930 106.730 C 244.324 105.226 244.354 102.910 243.000 101.370 ZM 77.290 108.000 L 116.360 205.660 L 25.200 108.000 ZM 170.090 108.000 L 128.000 213.230 L 85.910 108.000 ZM 88.000 100.000 L 128.000 46.670 L 168.000 100.000 ZM 178.710 108.000 L 230.800 108.000 L 139.640 205.660 ZM 231.180 100.000 L 178.000 100.000 L 136.000 44.000 L 182.180 44.000 ZM 73.820 44.000 L 120.000 44.000 L 78.000 100.000 L 24.820 100.000 Z"),
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
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
