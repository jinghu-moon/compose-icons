package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorFillIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 200.000 C 232.000 204.418 228.418 208.000 224.000 208.000 L 32.000 208.000 C 27.582 208.000 24.000 204.418 24.000 200.000 C 24.000 195.582 27.582 192.000 32.000 192.000 L 224.000 192.000 C 228.418 192.000 232.000 195.582 232.000 200.000 ZM 40.090 160.000 L 215.910 160.000 C 222.110 159.987 227.751 156.415 230.415 150.817 C 233.078 145.219 232.291 138.589 228.390 133.770 L 146.740 32.940 C 142.162 27.285 135.276 23.999 128.000 23.999 C 120.724 23.999 113.838 27.285 109.260 32.940 L 27.610 133.770 C 23.709 138.589 22.922 145.219 25.585 150.817 C 28.249 156.415 33.890 159.987 40.090 160.000 Z"),
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
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
