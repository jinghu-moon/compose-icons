package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CarProfile: ImageVector
    get() {
        if (_carProfile != null) return _carProfile!!
        _carProfile = phosphorDuotoneIcon(
            name = "CarProfile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 88.000 176.000 C 88.000 189.255 77.255 200.000 64.000 200.000 C 50.745 200.000 40.000 189.255 40.000 176.000 C 40.000 162.745 50.745 152.000 64.000 152.000 C 77.255 152.000 88.000 162.745 88.000 176.000 ZM 192.000 152.000 C 178.745 152.000 168.000 162.745 168.000 176.000 C 168.000 189.255 178.745 200.000 192.000 200.000 C 205.255 200.000 216.000 189.255 216.000 176.000 C 216.000 162.745 205.255 152.000 192.000 152.000 ZM 162.340 74.340 C 160.841 72.843 158.809 72.001 156.690 72.000 L 44.280 72.000 C 41.604 71.998 39.105 73.334 37.620 75.560 L 8.000 120.000 L 208.000 120.000 Z"),
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
        pathData = parseSvgPathData("M 240.000 112.000 L 211.310 112.000 L 168.000 68.690 C 165.010 65.676 160.936 63.986 156.690 64.000 L 44.280 64.000 C 38.943 64.010 33.962 66.680 31.000 71.120 L 1.340 115.560 C 0.469 116.877 0.003 118.421 0.000 120.000 L 0.000 168.000 C 0.000 176.837 7.163 184.000 16.000 184.000 L 33.000 184.000 C 36.625 198.159 49.384 208.063 64.000 208.063 C 78.616 208.063 91.375 198.159 95.000 184.000 L 161.000 184.000 C 164.625 198.159 177.384 208.063 192.000 208.063 C 206.616 208.063 219.375 198.159 223.000 184.000 L 240.000 184.000 C 248.837 184.000 256.000 176.837 256.000 168.000 L 256.000 128.000 C 256.000 119.163 248.837 112.000 240.000 112.000 ZM 44.280 80.000 L 156.690 80.000 L 188.690 112.000 L 23.000 112.000 ZM 64.000 192.000 C 55.163 192.000 48.000 184.837 48.000 176.000 C 48.000 167.163 55.163 160.000 64.000 160.000 C 72.837 160.000 80.000 167.163 80.000 176.000 C 80.000 184.837 72.837 192.000 64.000 192.000 ZM 192.000 192.000 C 183.163 192.000 176.000 184.837 176.000 176.000 C 176.000 167.163 183.163 160.000 192.000 160.000 C 200.837 160.000 208.000 167.163 208.000 176.000 C 208.000 184.837 200.837 192.000 192.000 192.000 ZM 240.000 168.000 L 223.000 168.000 C 219.375 153.841 206.616 143.937 192.000 143.937 C 177.384 143.937 164.625 153.841 161.000 168.000 L 95.000 168.000 C 91.375 153.841 78.616 143.937 64.000 143.937 C 49.384 143.937 36.625 153.841 33.000 168.000 L 16.000 168.000 L 16.000 128.000 L 240.000 128.000 Z"),
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
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
