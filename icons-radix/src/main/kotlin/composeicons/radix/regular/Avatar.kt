package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Avatar: ImageVector
    get() {
        if (_avatar != null) return _avatar!!
        _avatar = radixIcon(
            name = "Avatar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.499 .877c3.657 0 6.623 2.965 6.623 6.622 0 3.658-2.965 6.623-6.623 6.623C3.842 14.122 .877 11.156 .877 7.499 .877 3.842 3.842 .877 7.499 .877ZM7.5 9.975c-1.485 0-2.782 .805-3.479 2.004 .961 .747 2.167 1.193 3.479 1.193 1.312 0 2.519-.447 3.48-1.194C10.28 10.78 8.985 9.975 7.5 9.975ZM7.499 1.826C4.367 1.827 1.827 4.367 1.826 7.499c0 1.472 .562 2.813 1.481 3.821C4.191 9.941 5.738 9.026 7.5 9.026c1.761 0 3.308 .915 4.191 2.294 .919-1.008 1.48-2.348 1.48-3.82C13.172 4.366 10.632 1.826 7.499 1.826ZM7.5 4.155c1.298 0 2.35 1.052 2.35 2.35C9.85 7.803 8.798 8.855 7.5 8.855 6.202 8.855 5.151 7.803 5.15 6.505 5.15 5.207 6.202 4.155 7.5 4.155ZM7.5 5.105c-.773 0-1.4 .627-1.4 1.4 0 .773 .627 1.4 1.4 1.4C8.273 7.905 8.9 7.278 8.9 6.505 8.9 5.732 8.273 5.105 7.5 5.105Z"),
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
        return _avatar!!
    }

private var _avatar: ImageVector? = null
