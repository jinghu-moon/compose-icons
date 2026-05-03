package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorDuotoneIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 160.000 L 128.000 216.000 L 24.000 160.000 L 128.000 104.000 Z"),
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
                pathData = parseSvgPathData("M 235.790 89.000 L 131.790 33.000 C 129.424 31.727 126.576 31.727 124.210 33.000 L 20.210 89.000 C 17.631 90.387 16.017 93.072 16.000 96.000 L 16.000 160.000 C 15.998 162.946 17.616 165.654 20.210 167.050 L 124.210 223.050 C 126.576 224.323 129.424 224.323 131.790 223.050 L 235.790 167.050 C 238.384 165.654 240.002 162.946 240.000 160.000 L 240.000 96.000 C 239.983 93.072 238.369 90.387 235.790 89.000 ZM 224.000 146.610 L 189.450 128.000 L 224.000 109.390 ZM 172.570 118.910 L 136.000 99.220 L 136.000 53.390 L 215.130 96.000 ZM 128.000 142.910 L 100.300 128.000 L 128.000 113.090 L 155.700 128.000 ZM 120.000 53.390 L 120.000 99.220 L 83.430 118.910 L 40.870 96.000 ZM 32.000 109.390 L 66.550 128.000 L 32.000 146.610 ZM 83.430 137.090 L 120.000 156.780 L 120.000 202.610 L 40.870 160.000 ZM 136.000 202.610 L 136.000 156.780 L 172.570 137.090 L 215.130 160.000 Z"),
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
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
