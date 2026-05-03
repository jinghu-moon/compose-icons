package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TrendDown: ImageVector
    get() {
        if (_trendDown != null) return _trendDown!!
        _trendDown = phosphorDuotoneIcon(
            name = "TrendDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 128.000 L 232.000 192.000 L 168.000 192.000 Z"),
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
                pathData = parseSvgPathData("M 235.060 120.610 C 232.071 119.370 228.629 120.053 226.340 122.340 L 200.000 148.690 L 141.660 90.340 C 140.159 88.838 138.123 87.994 136.000 87.994 C 133.877 87.994 131.841 88.838 130.340 90.340 L 96.000 124.690 L 29.660 58.340 C 26.534 55.214 21.466 55.214 18.340 58.340 C 15.214 61.466 15.214 66.534 18.340 69.660 L 90.340 141.660 C 91.841 143.162 93.877 144.006 96.000 144.006 C 98.123 144.006 100.159 143.162 101.660 141.660 L 136.000 107.310 L 188.690 160.000 L 162.340 186.340 C 160.049 188.628 159.364 192.071 160.603 195.062 C 161.842 198.053 164.762 200.003 168.000 200.000 L 232.000 200.000 C 236.418 200.000 240.000 196.418 240.000 192.000 L 240.000 128.000 C 239.999 124.764 238.050 121.848 235.060 120.610 ZM 224.000 184.000 L 187.310 184.000 L 224.000 147.310 Z"),
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
        return _trendDown!!
    }

private var _trendDown: ImageVector? = null
