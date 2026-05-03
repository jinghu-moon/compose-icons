package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FunnelSimpleX: ImageVector
    get() {
        if (_funnelSimpleX != null) return _funnelSimpleX!!
        _funnelSimpleX = phosphorDuotoneIcon(
            name = "FunnelSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 208.000 216.000 L 192.000 200.000 L 176.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 192.000 144.000 L 64.000 144.000 C 59.582 144.000 56.000 140.418 56.000 136.000 C 56.000 131.582 59.582 128.000 64.000 128.000 L 192.000 128.000 C 196.418 128.000 200.000 131.582 200.000 136.000 C 200.000 140.418 196.418 144.000 192.000 144.000 ZM 232.000 80.000 L 24.000 80.000 C 19.582 80.000 16.000 83.582 16.000 88.000 C 16.000 92.418 19.582 96.000 24.000 96.000 L 232.000 96.000 C 236.418 96.000 240.000 92.418 240.000 88.000 C 240.000 83.582 236.418 80.000 232.000 80.000 ZM 128.000 176.000 L 104.000 176.000 C 99.582 176.000 96.000 179.582 96.000 184.000 C 96.000 188.418 99.582 192.000 104.000 192.000 L 128.000 192.000 C 132.418 192.000 136.000 188.418 136.000 184.000 C 136.000 179.582 132.418 176.000 128.000 176.000 ZM 221.660 170.340 C 220.159 168.838 218.123 167.994 216.000 167.994 C 213.877 167.994 211.841 168.838 210.340 170.340 L 192.000 188.690 L 173.660 170.340 C 170.534 167.214 165.466 167.214 162.340 170.340 C 159.214 173.466 159.214 178.534 162.340 181.660 L 180.690 200.000 L 162.340 218.340 C 159.214 221.466 159.214 226.534 162.340 229.660 C 165.466 232.786 170.534 232.786 173.660 229.660 L 192.000 211.310 L 210.340 229.660 C 213.466 232.786 218.534 232.786 221.660 229.660 C 224.786 226.534 224.786 221.466 221.660 218.340 L 203.310 200.000 L 221.660 181.660 C 223.162 180.159 224.006 178.123 224.006 176.000 C 224.006 173.877 223.162 171.841 221.660 170.340 Z"),
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
        return _funnelSimpleX!!
    }

private var _funnelSimpleX: ImageVector? = null
