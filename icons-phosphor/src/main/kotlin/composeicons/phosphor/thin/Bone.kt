package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = phosphorThinIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.6 63.46C222.543 56.188 213.564 51.988 204.1 52h-.1C203.96 38.43 195.365 26.361 182.554 21.885c-12.811-4.475-27.052-.384-35.533 10.209C138.539 42.687 137.661 57.478 144.83 69c1.029 1.579 .817 3.662-.51 5L74 144.36c-1.338 1.327-3.421 1.539-5 .51-11.509-7.199-26.308-6.352-36.921 2.112-10.613 8.464-14.731 22.703-10.274 35.526 4.457 12.822 16.52 21.437 30.095 21.492h.1c.033 13.574 8.628 25.651 21.442 30.129 12.814 4.479 27.06 .385 35.542-10.213 8.482-10.598 9.354-25.395 2.176-36.916-1.029-1.579-.817-3.662 .51-5L182 111.64c1.338-1.327 3.421-1.539 5-.51 13.343 8.482 30.881 5.947 41.277-5.965 10.396-11.913 10.533-29.632 .323-41.705ZM222.1 99.8c-7.757 8.874-20.809 10.802-30.8 4.55-4.748-3.018-10.955-2.332-14.93 1.65L106 176.37c-3.975 3.98-4.653 10.186-1.63 14.93 5.624 9.034 4.628 20.693-2.448 28.641-7.075 7.949-18.54 10.289-28.165 5.749C64.133 221.151 58.647 210.815 60.28 200.3c.2-1.263-.217-2.545-1.12-3.45-.751-.75-1.769-1.171-2.83-1.17-.208 .002-.415 .018-.62 .05C45.195 197.363 34.859 191.877 30.319 182.253c-4.54-9.625-2.199-21.089 5.749-28.165 7.949-7.075 19.607-8.072 28.641-2.448 4.744 3.015 10.945 2.333 14.92-1.64L150 79.63c3.975-3.98 4.653-10.186 1.63-14.93-5.624-9.034-4.628-20.693 2.448-28.641 7.075-7.949 18.54-10.289 28.165-5.749 9.625 4.54 15.111 14.875 13.477 25.391-.197 1.262 .22 2.543 1.124 3.446 .903 .903 2.184 1.321 3.446 1.124 9.987-1.588 19.898 3.254 24.783 12.108 4.885 8.854 3.696 19.82-2.973 27.422Z"),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
