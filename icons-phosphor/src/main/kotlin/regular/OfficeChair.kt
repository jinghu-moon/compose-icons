package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.OfficeChair: ImageVector
    get() {
        if (_officeChair != null) return _officeChair!!
        _officeChair = phosphorRegularIcon(
            name = "OfficeChair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 128.000 C 248.000 132.418 244.418 136.000 240.000 136.000 L 223.330 136.000 C 219.396 159.078 199.411 175.968 176.000 176.000 L 136.000 176.000 L 136.000 200.000 L 160.000 200.000 C 177.673 200.000 192.000 214.327 192.000 232.000 C 192.000 236.418 188.418 240.000 184.000 240.000 C 179.582 240.000 176.000 236.418 176.000 232.000 C 176.000 223.163 168.837 216.000 160.000 216.000 L 136.000 216.000 L 136.000 232.000 C 136.000 236.418 132.418 240.000 128.000 240.000 C 123.582 240.000 120.000 236.418 120.000 232.000 L 120.000 216.000 L 96.000 216.000 C 87.163 216.000 80.000 223.163 80.000 232.000 C 80.000 236.418 76.418 240.000 72.000 240.000 C 67.582 240.000 64.000 236.418 64.000 232.000 C 64.000 214.327 78.327 200.000 96.000 200.000 L 120.000 200.000 L 120.000 176.000 L 80.000 176.000 C 56.589 175.968 36.604 159.078 32.670 136.000 L 16.000 136.000 C 11.582 136.000 8.000 132.418 8.000 128.000 C 8.000 123.582 11.582 120.000 16.000 120.000 L 40.000 120.000 C 44.418 120.000 48.000 123.582 48.000 128.000 C 48.000 145.673 62.327 160.000 80.000 160.000 L 176.000 160.000 C 193.673 160.000 208.000 145.673 208.000 128.000 C 208.000 123.582 211.582 120.000 216.000 120.000 L 240.000 120.000 C 244.418 120.000 248.000 123.582 248.000 128.000 ZM 67.910 138.480 C 64.873 134.977 63.505 130.329 64.160 125.740 L 77.880 29.740 C 79.037 21.874 85.769 16.034 93.720 16.000 L 162.280 16.000 C 170.231 16.034 176.963 21.874 178.120 29.740 L 191.840 125.740 C 192.495 130.331 191.126 134.981 188.087 138.484 C 185.048 141.988 180.638 144.000 176.000 144.000 L 80.000 144.000 C 75.360 144.000 70.949 141.986 67.910 138.480 ZM 80.000 128.000 L 176.000 128.000 L 162.280 32.000 L 93.710 32.000 Z"),
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
        return _officeChair!!
    }

private var _officeChair: ImageVector? = null
