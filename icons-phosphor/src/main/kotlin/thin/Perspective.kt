package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorThinIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 124.000 L 220.000 124.000 L 220.000 48.000 C 220.001 44.440 218.422 41.064 215.689 38.783 C 212.956 36.502 209.352 35.552 205.850 36.190 L 45.850 65.290 C 40.148 66.328 36.003 71.294 36.000 77.090 L 36.000 124.000 L 16.000 124.000 C 13.791 124.000 12.000 125.791 12.000 128.000 C 12.000 130.209 13.791 132.000 16.000 132.000 L 36.000 132.000 L 36.000 178.910 C 36.003 184.706 40.148 189.672 45.850 190.710 L 205.850 219.800 C 206.562 219.936 207.285 220.003 208.010 220.000 C 214.637 220.000 220.010 214.627 220.010 208.000 L 220.010 132.000 L 240.010 132.000 C 242.219 132.000 244.010 130.209 244.010 128.000 C 244.010 125.791 242.219 124.000 240.010 124.000 ZM 44.000 77.090 C 44.002 75.160 45.382 73.507 47.280 73.160 L 207.280 44.070 C 208.447 43.857 209.648 44.172 210.559 44.931 C 211.471 45.690 211.999 46.814 212.000 48.000 L 212.000 124.000 L 44.000 124.000 ZM 212.000 208.000 C 211.999 209.186 211.471 210.310 210.559 211.069 C 209.648 211.828 208.447 212.143 207.280 211.930 L 47.280 182.840 C 45.382 182.493 44.002 180.840 44.000 178.910 L 44.000 132.000 L 212.000 132.000 Z"),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
