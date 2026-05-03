package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorThinIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 132.000 L 198.470 132.000 L 166.470 68.000 L 192.000 68.000 C 194.209 68.000 196.000 66.209 196.000 64.000 C 196.000 61.791 194.209 60.000 192.000 60.000 L 64.000 60.000 C 61.791 60.000 60.000 61.791 60.000 64.000 C 60.000 66.209 61.791 68.000 64.000 68.000 L 89.530 68.000 L 57.530 132.000 L 8.000 132.000 C 5.791 132.000 4.000 133.791 4.000 136.000 C 4.000 138.209 5.791 140.000 8.000 140.000 L 53.530 140.000 L 28.420 190.210 C 27.945 191.159 27.866 192.259 28.202 193.266 C 28.538 194.273 29.260 195.106 30.210 195.580 C 30.767 195.853 31.379 195.997 32.000 196.000 C 33.516 196.001 34.902 195.145 35.580 193.790 L 62.470 140.000 L 193.530 140.000 L 220.420 193.790 C 221.098 195.145 222.484 196.001 224.000 196.000 C 224.621 195.997 225.233 195.853 225.790 195.580 C 226.740 195.106 227.462 194.273 227.798 193.266 C 228.134 192.259 228.055 191.159 227.580 190.210 L 202.470 140.000 L 248.000 140.000 C 250.209 140.000 252.000 138.209 252.000 136.000 C 252.000 133.791 250.209 132.000 248.000 132.000 ZM 66.470 132.000 L 98.470 68.000 L 157.530 68.000 L 189.530 132.000 Z"),
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
