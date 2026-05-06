package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareTwo: ImageVector
    get() {
        if (_numberSquareTwo != null) return _numberSquareTwo!!
        _numberSquareTwo = phosphorThinIcon(
            name = "NumberSquareTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM156 176c0 2.209-1.791 4-4 4h-48c-1.515 0-2.9-.856-3.578-2.211-.678-1.355-.531-2.977 .378-4.189L144 116c6.627-8.837 4.837-21.373-4-28-8.837-6.627-21.373-4.837-28 4-1.229 1.634-2.204 3.444-2.89 5.37-.735 2.085-3.02 3.18-5.105 2.445-2.085-.735-3.18-3.02-2.445-5.105 .947-2.694 2.295-5.229 4-7.52 5.973-8.122 15.85-12.406 25.862-11.217 10.011 1.19 18.61 7.67 22.513 16.965 3.903 9.296 2.507 19.972-3.655 27.952L112 172h40c2.209 0 4 1.791 4 4Z"),
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
        return _numberSquareTwo!!
    }

private var _numberSquareTwo: ImageVector? = null
