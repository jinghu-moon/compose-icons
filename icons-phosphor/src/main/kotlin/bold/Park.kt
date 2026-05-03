package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Park: ImageVector
    get() {
        if (_park != null) return _park!!
        _park = phosphorBoldIcon(
            name = "Park",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 188.000 L 204.000 188.000 L 204.000 172.000 L 224.000 172.000 C 227.695 171.999 231.183 170.297 233.457 167.384 C 235.731 164.472 236.536 160.675 235.640 157.090 L 203.640 29.090 C 202.302 23.751 197.504 20.007 192.000 20.007 C 186.496 20.007 181.698 23.751 180.360 29.090 L 148.360 157.090 C 147.464 160.675 148.269 164.472 150.543 167.384 C 152.817 170.297 156.305 171.999 160.000 172.000 L 180.000 172.000 L 180.000 188.000 L 116.000 188.000 L 116.000 176.000 C 122.627 176.000 128.000 170.627 128.000 164.000 C 128.000 157.373 122.627 152.000 116.000 152.000 L 116.000 140.000 C 122.627 140.000 128.000 134.627 128.000 128.000 C 128.000 121.373 122.627 116.000 116.000 116.000 L 32.000 116.000 C 25.373 116.000 20.000 121.373 20.000 128.000 C 20.000 134.627 25.373 140.000 32.000 140.000 L 32.000 152.000 C 25.373 152.000 20.000 157.373 20.000 164.000 C 20.000 170.627 25.373 176.000 32.000 176.000 L 32.000 188.000 L 24.000 188.000 C 17.373 188.000 12.000 193.373 12.000 200.000 C 12.000 206.627 17.373 212.000 24.000 212.000 L 232.000 212.000 C 238.627 212.000 244.000 206.627 244.000 200.000 C 244.000 193.373 238.627 188.000 232.000 188.000 ZM 192.000 81.480 L 208.630 148.000 L 175.370 148.000 ZM 56.000 140.000 L 92.000 140.000 L 92.000 152.000 L 56.000 152.000 ZM 56.000 176.000 L 92.000 176.000 L 92.000 188.000 L 56.000 188.000 ZM 116.000 100.000 C 133.673 100.000 148.000 85.673 148.000 68.000 C 148.000 50.327 133.673 36.000 116.000 36.000 C 98.327 36.000 84.000 50.327 84.000 68.000 C 84.000 85.673 98.327 100.000 116.000 100.000 ZM 116.000 60.000 C 120.418 60.000 124.000 63.582 124.000 68.000 C 124.000 72.418 120.418 76.000 116.000 76.000 C 111.582 76.000 108.000 72.418 108.000 68.000 C 108.000 63.582 111.582 60.000 116.000 60.000 Z"),
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
        return _park!!
    }

private var _park: ImageVector? = null
