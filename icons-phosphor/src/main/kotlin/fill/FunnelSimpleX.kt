package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FunnelSimpleX: ImageVector
    get() {
        if (_funnelSimpleX != null) return _funnelSimpleX!!
        _funnelSimpleX = phosphorFillIcon(
            name = "FunnelSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 72.000 128.000 C 72.000 123.582 75.582 120.000 80.000 120.000 L 176.000 120.000 C 180.418 120.000 184.000 123.582 184.000 128.000 C 184.000 132.418 180.418 136.000 176.000 136.000 L 80.000 136.000 C 75.582 136.000 72.000 132.418 72.000 128.000 ZM 128.000 176.000 L 112.000 176.000 C 107.582 176.000 104.000 172.418 104.000 168.000 C 104.000 163.582 107.582 160.000 112.000 160.000 L 128.000 160.000 C 132.418 160.000 136.000 163.582 136.000 168.000 C 136.000 172.418 132.418 176.000 128.000 176.000 ZM 197.660 186.340 C 200.786 189.466 200.786 194.534 197.660 197.660 C 194.534 200.786 189.466 200.786 186.340 197.660 L 176.000 187.310 L 165.660 197.660 C 162.534 200.786 157.466 200.786 154.340 197.660 C 151.214 194.534 151.214 189.466 154.340 186.340 L 164.690 176.000 L 154.340 165.660 C 151.214 162.534 151.214 157.466 154.340 154.340 C 157.466 151.214 162.534 151.214 165.660 154.340 L 176.000 164.690 L 186.340 154.340 C 189.466 151.214 194.534 151.214 197.660 154.340 C 200.786 157.466 200.786 162.534 197.660 165.660 L 187.310 176.000 ZM 208.000 96.000 L 48.000 96.000 C 43.582 96.000 40.000 92.418 40.000 88.000 C 40.000 83.582 43.582 80.000 48.000 80.000 L 208.000 80.000 C 212.418 80.000 216.000 83.582 216.000 88.000 C 216.000 92.418 212.418 96.000 208.000 96.000 Z"),
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
