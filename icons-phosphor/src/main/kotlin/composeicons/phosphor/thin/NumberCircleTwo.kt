package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) return _numberCircleTwo!!
        _numberCircleTwo = phosphorThinIcon(
            name = "NumberCircleTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM150.36 120.85 112 172h40c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-48c-1.515 0-2.9-.856-3.578-2.211-.678-1.355-.531-2.977 .378-4.189L144 116c6.627-8.837 4.837-21.373-4-28-8.837-6.627-21.373-4.837-28 4-1.231 1.632-2.206 3.443-2.89 5.37-.735 2.085-3.02 3.18-5.105 2.445-2.085-.735-3.18-3.02-2.445-5.105 .945-2.695 2.293-5.23 4-7.52 5.973-8.122 15.85-12.406 25.862-11.217 10.011 1.19 18.61 7.67 22.513 16.965 3.903 9.296 2.507 19.972-3.655 27.952Z"),
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
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
