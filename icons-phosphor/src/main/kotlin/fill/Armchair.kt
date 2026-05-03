package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = phosphorFillIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 132.000 C 239.999 145.918 229.775 157.722 216.000 159.710 L 216.000 200.000 C 216.000 208.837 208.837 216.000 200.000 216.000 L 56.000 216.000 C 47.163 216.000 40.000 208.837 40.000 200.000 L 40.000 159.710 C 25.209 157.575 14.701 144.201 16.128 129.325 C 17.554 114.448 30.412 103.314 45.339 104.029 C 60.267 104.744 72.002 117.056 72.000 132.000 L 72.000 168.000 C 72.000 172.418 75.582 176.000 80.000 176.000 C 84.418 176.000 88.000 172.418 88.000 168.000 L 88.000 144.000 L 168.000 144.000 L 168.000 168.000 C 168.000 172.418 171.582 176.000 176.000 176.000 C 180.418 176.000 184.000 172.418 184.000 168.000 L 184.000 132.000 C 184.000 116.536 196.536 104.000 212.000 104.000 C 227.464 104.000 240.000 116.536 240.000 132.000 ZM 44.000 88.000 C 66.737 88.032 85.715 105.360 87.810 128.000 L 168.190 128.000 C 170.285 105.360 189.263 88.032 212.000 88.000 C 214.209 88.000 216.000 86.209 216.000 84.000 L 216.000 72.000 C 216.000 49.909 198.091 32.000 176.000 32.000 L 80.000 32.000 C 57.909 32.000 40.000 49.909 40.000 72.000 L 40.000 84.000 C 40.000 86.209 41.791 88.000 44.000 88.000 Z"),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
