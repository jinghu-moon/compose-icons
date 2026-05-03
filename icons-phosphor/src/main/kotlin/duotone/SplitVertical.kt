package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorDuotoneIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 160.000 56.000 L 96.000 56.000 L 128.000 24.000 ZM 128.000 232.000 L 160.000 200.000 L 96.000 200.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 208.000 144.000 L 48.000 144.000 C 43.582 144.000 40.000 147.582 40.000 152.000 C 40.000 156.418 43.582 160.000 48.000 160.000 L 120.000 160.000 L 120.000 192.000 L 96.000 192.000 C 92.762 191.997 89.842 193.947 88.603 196.938 C 87.364 199.929 88.049 203.372 90.340 205.660 L 122.340 237.660 C 123.841 239.162 125.877 240.006 128.000 240.006 C 130.123 240.006 132.159 239.162 133.660 237.660 L 165.660 205.660 C 167.951 203.372 168.636 199.929 167.397 196.938 C 166.158 193.947 163.238 191.997 160.000 192.000 L 136.000 192.000 L 136.000 160.000 L 208.000 160.000 C 212.418 160.000 216.000 156.418 216.000 152.000 C 216.000 147.582 212.418 144.000 208.000 144.000 ZM 128.000 220.690 L 115.310 208.000 L 140.690 208.000 ZM 48.000 112.000 L 208.000 112.000 C 212.418 112.000 216.000 108.418 216.000 104.000 C 216.000 99.582 212.418 96.000 208.000 96.000 L 136.000 96.000 L 136.000 64.000 L 160.000 64.000 C 163.238 64.003 166.158 62.053 167.397 59.062 C 168.636 56.071 167.951 52.628 165.660 50.340 L 133.660 18.340 C 132.159 16.838 130.123 15.994 128.000 15.994 C 125.877 15.994 123.841 16.838 122.340 18.340 L 90.340 50.340 C 88.049 52.628 87.364 56.071 88.603 59.062 C 89.842 62.053 92.762 64.003 96.000 64.000 L 120.000 64.000 L 120.000 96.000 L 48.000 96.000 C 43.582 96.000 40.000 99.582 40.000 104.000 C 40.000 108.418 43.582 112.000 48.000 112.000 ZM 128.000 35.310 L 140.690 48.000 L 115.310 48.000 Z"),
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
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
