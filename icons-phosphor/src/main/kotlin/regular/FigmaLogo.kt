package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = phosphorRegularIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 96.000 C 205.774 85.670 211.392 67.685 205.947 51.351 C 200.503 35.017 185.217 24.000 168.000 24.000 L 96.000 24.000 C 78.783 24.000 63.497 35.017 58.053 51.351 C 52.608 67.685 58.226 85.670 72.000 96.000 C 61.683 103.732 55.725 115.962 55.997 128.852 C 56.269 141.741 62.737 153.710 73.370 161.000 C 56.925 173.503 51.392 195.764 60.071 214.511 C 68.750 233.258 89.303 243.443 109.477 238.994 C 129.651 234.544 144.012 216.659 144.000 196.000 L 144.000 160.000 C 161.673 173.255 186.745 169.673 200.000 152.000 C 213.255 134.327 209.673 109.255 192.000 96.000 ZM 192.000 64.000 C 192.000 77.255 181.255 88.000 168.000 88.000 L 144.000 88.000 L 144.000 40.000 L 168.000 40.000 C 181.255 40.000 192.000 50.745 192.000 64.000 ZM 72.000 64.000 C 72.000 50.745 82.745 40.000 96.000 40.000 L 128.000 40.000 L 128.000 88.000 L 96.000 88.000 C 82.745 88.000 72.000 77.255 72.000 64.000 ZM 96.000 152.000 C 82.745 152.000 72.000 141.255 72.000 128.000 C 72.000 114.745 82.745 104.000 96.000 104.000 L 128.000 104.000 L 128.000 152.000 L 96.000 152.000 ZM 128.000 196.000 C 128.000 211.464 115.464 224.000 100.000 224.000 C 84.536 224.000 72.000 211.464 72.000 196.000 C 72.000 180.536 84.536 168.000 100.000 168.000 L 128.000 168.000 ZM 168.000 152.000 C 154.745 152.000 144.000 141.255 144.000 128.000 C 144.000 114.745 154.745 104.000 168.000 104.000 C 181.255 104.000 192.000 114.745 192.000 128.000 C 192.000 141.255 181.255 152.000 168.000 152.000 Z"),
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
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
