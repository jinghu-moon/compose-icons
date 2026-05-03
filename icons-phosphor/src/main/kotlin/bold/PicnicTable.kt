package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorBoldIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 124.000 L 203.420 124.000 L 179.420 76.000 L 192.000 76.000 C 198.627 76.000 204.000 70.627 204.000 64.000 C 204.000 57.373 198.627 52.000 192.000 52.000 L 64.000 52.000 C 57.373 52.000 52.000 57.373 52.000 64.000 C 52.000 70.627 57.373 76.000 64.000 76.000 L 76.580 76.000 L 52.580 124.000 L 12.000 124.000 C 5.373 124.000 0.000 129.373 0.000 136.000 C 0.000 142.627 5.373 148.000 12.000 148.000 L 40.580 148.000 L 21.270 186.630 C 19.228 190.478 19.433 195.131 21.803 198.785 C 24.174 202.440 28.340 204.522 32.686 204.226 C 37.032 203.930 40.876 201.302 42.730 197.360 L 67.420 148.000 L 188.580 148.000 L 213.270 197.360 C 215.124 201.302 218.968 203.930 223.314 204.226 C 227.660 204.522 231.826 202.440 234.197 198.785 C 236.567 195.131 236.772 190.478 234.730 186.630 L 215.420 148.000 L 244.000 148.000 C 250.627 148.000 256.000 142.627 256.000 136.000 C 256.000 129.373 250.627 124.000 244.000 124.000 ZM 79.420 124.000 L 103.420 76.000 L 152.580 76.000 L 176.580 124.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
