package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorThinIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 208c0 2.209-1.791 4-4 4h-80c-1.515 0-2.9-.856-3.578-2.211-.678-1.355-.531-2.977 .378-4.189l71.94-95.92c7.901-10.26 9.682-23.973 4.666-35.911C156.389 61.831 145.347 53.507 132.489 51.97 119.632 50.433 106.939 55.92 99.25 66.34 97.558 68.592 96.132 71.031 95 73.61c-.886 2.024-3.246 2.946-5.27 2.06-2.024-.886-2.946-3.246-2.06-5.27 1.384-3.148 3.129-6.125 5.2-8.87 14.636-19.407 42.233-23.276 61.64-8.64 19.407 14.636 23.276 42.233 8.64 61.64L96 204h72c2.209 0 4 1.791 4 4Z"),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
