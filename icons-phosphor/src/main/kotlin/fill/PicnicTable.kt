package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorFillIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 146.850 96.000 L 161.390 128.000 L 94.610 128.000 L 109.150 96.000 ZM 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 208.000 136.000 C 208.000 131.582 204.418 128.000 200.000 128.000 L 179.000 128.000 L 164.420 96.000 L 176.000 96.000 C 180.418 96.000 184.000 92.418 184.000 88.000 C 184.000 83.582 180.418 80.000 176.000 80.000 L 80.000 80.000 C 75.582 80.000 72.000 83.582 72.000 88.000 C 72.000 92.418 75.582 96.000 80.000 96.000 L 91.580 96.000 L 77.000 128.000 L 56.000 128.000 C 51.582 128.000 48.000 131.582 48.000 136.000 C 48.000 140.418 51.582 144.000 56.000 144.000 L 69.760 144.000 L 56.760 172.690 C 55.486 175.305 55.732 178.406 57.402 180.787 C 59.072 183.169 61.903 184.457 64.796 184.149 C 67.689 183.842 70.187 181.989 71.320 179.310 L 87.320 144.000 L 168.660 144.000 L 184.710 179.310 C 186.609 183.207 191.266 184.883 195.213 183.088 C 199.159 181.294 200.958 176.683 199.270 172.690 L 186.270 144.000 L 200.000 144.000 C 204.418 144.000 208.000 140.418 208.000 136.000 Z"),
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
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
