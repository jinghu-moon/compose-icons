package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) return _googleCardboardLogo!!
        _googleCardboardLogo = phosphorRegularIcon(
            name = "GoogleCardboardLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 96.000 208.000 C 98.122 208.002 100.158 207.160 101.660 205.660 L 128.000 179.310 L 154.340 205.660 C 155.842 207.160 157.878 208.002 160.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 224.000 192.000 L 163.310 192.000 L 139.310 168.000 C 133.062 161.757 122.938 161.757 116.690 168.000 L 92.690 192.000 L 32.000 192.000 L 32.000 64.000 L 224.000 64.000 ZM 80.000 160.000 C 97.673 160.000 112.000 145.673 112.000 128.000 C 112.000 110.327 97.673 96.000 80.000 96.000 C 62.327 96.000 48.000 110.327 48.000 128.000 C 48.000 145.673 62.327 160.000 80.000 160.000 ZM 80.000 112.000 C 88.837 112.000 96.000 119.163 96.000 128.000 C 96.000 136.837 88.837 144.000 80.000 144.000 C 71.163 144.000 64.000 136.837 64.000 128.000 C 64.000 119.163 71.163 112.000 80.000 112.000 ZM 176.000 160.000 C 193.673 160.000 208.000 145.673 208.000 128.000 C 208.000 110.327 193.673 96.000 176.000 96.000 C 158.327 96.000 144.000 110.327 144.000 128.000 C 144.000 145.673 158.327 160.000 176.000 160.000 ZM 176.000 112.000 C 184.837 112.000 192.000 119.163 192.000 128.000 C 192.000 136.837 184.837 144.000 176.000 144.000 C 167.163 144.000 160.000 136.837 160.000 128.000 C 160.000 119.163 167.163 112.000 176.000 112.000 Z"),
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
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
