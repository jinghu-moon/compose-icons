package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorFillIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 72.000 168.000 C 69.878 168.002 67.842 167.160 66.340 165.660 L 42.340 141.660 C 39.214 138.534 39.214 133.466 42.340 130.340 C 45.466 127.214 50.534 127.214 53.660 130.340 L 72.000 148.690 L 130.340 90.340 C 133.466 87.214 138.534 87.214 141.660 90.340 C 144.786 93.466 144.786 98.534 141.660 101.660 L 77.660 165.660 C 76.158 167.160 74.122 168.002 72.000 168.000 ZM 213.660 101.660 L 149.660 165.660 C 148.159 167.162 146.123 168.006 144.000 168.006 C 141.877 168.006 139.841 167.162 138.340 165.660 L 122.340 149.660 C 119.214 146.534 119.214 141.466 122.340 138.340 C 125.466 135.214 130.534 135.214 133.660 138.340 L 144.000 148.690 L 202.340 90.340 C 205.466 87.214 210.534 87.214 213.660 90.340 C 216.786 93.466 216.786 98.534 213.660 101.660 Z"),
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
        return _checks!!
    }

private var _checks: ImageVector? = null
