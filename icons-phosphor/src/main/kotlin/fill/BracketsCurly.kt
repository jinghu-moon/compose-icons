package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorFillIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 88.000 155.840 C 88.290 170.100 88.410 176.000 104.000 176.000 C 108.418 176.000 112.000 179.582 112.000 184.000 C 112.000 188.418 108.418 192.000 104.000 192.000 C 72.730 192.000 72.280 169.570 72.000 156.160 C 71.710 141.900 71.590 136.000 56.000 136.000 C 51.582 136.000 48.000 132.418 48.000 128.000 C 48.000 123.582 51.582 120.000 56.000 120.000 C 71.590 120.000 71.710 114.100 72.000 99.840 C 72.280 86.430 72.730 64.000 104.000 64.000 C 108.418 64.000 112.000 67.582 112.000 72.000 C 112.000 76.418 108.418 80.000 104.000 80.000 C 88.410 80.000 88.290 85.900 88.000 100.160 C 87.830 108.470 87.590 120.250 80.000 128.000 C 87.590 135.750 87.830 147.530 88.000 155.840 ZM 200.000 136.000 C 184.410 136.000 184.290 141.900 184.000 156.160 C 183.720 169.570 183.270 192.000 152.000 192.000 C 147.582 192.000 144.000 188.418 144.000 184.000 C 144.000 179.582 147.582 176.000 152.000 176.000 C 167.590 176.000 167.710 170.100 168.000 155.840 C 168.170 147.530 168.410 135.750 176.000 128.000 C 168.400 120.250 168.160 108.470 168.000 100.160 C 167.710 85.900 167.590 80.000 152.000 80.000 C 147.582 80.000 144.000 76.418 144.000 72.000 C 144.000 67.582 147.582 64.000 152.000 64.000 C 183.270 64.000 183.720 86.430 184.000 99.840 C 184.290 114.100 184.410 120.000 200.000 120.000 C 204.418 120.000 208.000 123.582 208.000 128.000 C 208.000 132.418 204.418 136.000 200.000 136.000 Z"),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
