package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorDuotoneIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 221.660 85.660 L 101.660 205.660 C 100.159 207.162 98.123 208.006 96.000 208.006 C 93.877 208.006 91.841 207.162 90.340 205.660 L 52.690 168.000 L 184.000 36.690 L 221.660 74.340 C 223.162 75.841 224.006 77.877 224.006 80.000 C 224.006 82.123 223.162 84.159 221.660 85.660 Z"),
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
        pathData = parseSvgPathData("M 248.000 136.000 C 243.582 136.000 240.000 139.582 240.000 144.000 L 240.000 160.000 L 195.310 160.000 L 177.000 141.660 L 227.340 91.310 C 233.583 85.062 233.583 74.938 227.340 68.690 L 171.340 12.690 C 168.339 9.689 164.269 8.002 160.025 8.002 C 155.781 8.002 151.711 9.689 148.710 12.690 L 2.920 158.940 C 0.067 161.802 -0.783 166.100 0.766 169.833 C 2.315 173.566 5.959 175.999 10.000 176.000 L 49.370 176.000 L 84.690 211.310 C 90.938 217.553 101.062 217.553 107.310 211.310 L 165.660 153.000 L 184.000 171.310 C 186.990 174.324 191.064 176.014 195.310 176.000 L 240.000 176.000 L 240.000 192.000 C 240.000 196.418 243.582 200.000 248.000 200.000 C 252.418 200.000 256.000 196.418 256.000 192.000 L 256.000 144.000 C 256.000 139.582 252.418 136.000 248.000 136.000 ZM 160.000 24.000 L 172.690 36.690 L 49.370 160.000 L 24.460 160.000 ZM 96.000 200.000 L 64.000 168.000 L 184.000 48.000 L 216.000 80.000 Z"),
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
        return _securityCamera!!
    }

private var _securityCamera: ImageVector? = null
