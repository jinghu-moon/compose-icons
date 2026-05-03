package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = phosphorFillIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.000 98.730 L 190.000 34.730 C 188.485 33.000 186.299 32.005 184.000 32.000 L 72.000 32.000 C 69.701 32.005 67.515 33.000 66.000 34.730 L 10.000 98.730 C 7.294 101.820 7.367 106.457 10.170 109.460 L 122.170 229.460 C 123.683 231.082 125.802 232.003 128.020 232.003 C 130.238 232.003 132.357 231.082 133.870 229.460 L 245.870 109.460 C 248.661 106.447 248.718 101.810 246.000 98.730 ZM 222.370 96.000 L 180.000 96.000 L 144.000 48.000 L 180.370 48.000 ZM 74.580 112.000 L 104.710 187.330 L 34.410 112.000 ZM 181.420 112.000 L 221.590 112.000 L 151.290 187.330 ZM 75.630 48.000 L 112.000 48.000 L 76.000 96.000 L 33.630 96.000 Z"),
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
