package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = phosphorLightIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.520 100.050 L 188.520 36.050 C 187.380 34.746 185.732 33.999 184.000 34.000 L 72.000 34.000 C 70.276 33.986 68.629 34.715 67.480 36.000 L 11.480 100.000 C 9.479 102.311 9.535 105.756 11.610 108.000 L 123.610 228.000 C 124.745 229.218 126.335 229.910 128.000 229.910 C 129.665 229.910 131.255 229.218 132.390 228.000 L 244.390 108.000 C 246.435 105.763 246.491 102.353 244.520 100.050 ZM 75.940 110.000 L 110.540 196.490 L 29.810 110.000 ZM 167.140 110.000 L 128.000 207.840 L 88.860 110.000 ZM 92.000 98.000 L 128.000 50.000 L 164.000 98.000 ZM 180.060 110.000 L 226.190 110.000 L 145.460 196.490 ZM 226.780 98.000 L 179.000 98.000 L 140.000 46.000 L 181.280 46.000 ZM 74.720 46.000 L 116.000 46.000 L 77.000 98.000 L 29.220 98.000 Z"),
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
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
