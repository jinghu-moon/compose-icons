package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MathOperations: ImageVector
    get() {
        if (_mathOperations != null) return _mathOperations!!
        _mathOperations = phosphorDuotoneIcon(
            name = "MathOperations",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 56.000 L 216.000 200.000 C 216.000 208.837 208.837 216.000 200.000 216.000 L 56.000 216.000 C 47.163 216.000 40.000 208.837 40.000 200.000 L 40.000 56.000 C 40.000 47.163 47.163 40.000 56.000 40.000 L 200.000 40.000 C 208.837 40.000 216.000 47.163 216.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 112.000 72.000 C 112.000 76.418 108.418 80.000 104.000 80.000 L 40.000 80.000 C 35.582 80.000 32.000 76.418 32.000 72.000 C 32.000 67.582 35.582 64.000 40.000 64.000 L 104.000 64.000 C 108.418 64.000 112.000 67.582 112.000 72.000 ZM 104.000 176.000 L 80.000 176.000 L 80.000 152.000 C 80.000 147.582 76.418 144.000 72.000 144.000 C 67.582 144.000 64.000 147.582 64.000 152.000 L 64.000 176.000 L 40.000 176.000 C 35.582 176.000 32.000 179.582 32.000 184.000 C 32.000 188.418 35.582 192.000 40.000 192.000 L 64.000 192.000 L 64.000 216.000 C 64.000 220.418 67.582 224.000 72.000 224.000 C 76.418 224.000 80.000 220.418 80.000 216.000 L 80.000 192.000 L 104.000 192.000 C 108.418 192.000 112.000 188.418 112.000 184.000 C 112.000 179.582 108.418 176.000 104.000 176.000 ZM 152.000 176.000 L 216.000 176.000 C 220.418 176.000 224.000 172.418 224.000 168.000 C 224.000 163.582 220.418 160.000 216.000 160.000 L 152.000 160.000 C 147.582 160.000 144.000 163.582 144.000 168.000 C 144.000 172.418 147.582 176.000 152.000 176.000 ZM 216.000 192.000 L 152.000 192.000 C 147.582 192.000 144.000 195.582 144.000 200.000 C 144.000 204.418 147.582 208.000 152.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 204.418 224.000 200.000 C 224.000 195.582 220.418 192.000 216.000 192.000 ZM 154.340 101.660 C 155.841 103.162 157.877 104.006 160.000 104.006 C 162.123 104.006 164.159 103.162 165.660 101.660 L 184.000 83.310 L 202.340 101.660 C 205.466 104.786 210.534 104.786 213.660 101.660 C 216.786 98.534 216.786 93.466 213.660 90.340 L 195.310 72.000 L 213.660 53.660 C 216.786 50.534 216.786 45.466 213.660 42.340 C 210.534 39.214 205.466 39.214 202.340 42.340 L 184.000 60.690 L 165.660 42.340 C 162.534 39.214 157.466 39.214 154.340 42.340 C 151.214 45.466 151.214 50.534 154.340 53.660 L 172.690 72.000 L 154.340 90.340 C 152.838 91.841 151.994 93.877 151.994 96.000 C 151.994 98.123 152.838 100.159 154.340 101.660 Z"),
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
        return _mathOperations!!
    }

private var _mathOperations: ImageVector? = null
