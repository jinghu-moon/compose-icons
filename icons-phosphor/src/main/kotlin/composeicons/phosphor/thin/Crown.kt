package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = phosphorThinIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 80c.02-10.682-7.023-20.091-17.277-23.084-10.254-2.992-21.252 1.153-26.98 10.169-5.728 9.016-4.808 20.733 2.257 28.745l-33 40.54L141.1 72.09c8.901-5.798 12.931-16.759 9.907-26.942C147.982 34.964 138.623 27.981 128 27.981c-10.623 0-19.982 6.984-23.007 17.167-3.024 10.184 1.006 21.144 9.907 26.942L87 136.37 54 95.83c7.454-8.494 7.972-21.038 1.244-30.118C48.516 56.632 36.365 53.475 26.069 58.133 15.772 62.791 10.12 74.001 12.498 85.05 14.876 96.098 24.639 103.99 35.94 104l15 90c.976 5.777 5.981 10.004 11.84 10h130.44c5.859 .004 10.864-4.223 11.84-10l15-90C233.291 103.967 244 93.231 244 80ZM128 36c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM20 80C20 71.163 27.163 64 36 64c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C27.163 96 20 88.837 20 80ZM197.17 192.66c-.323 1.929-1.994 3.342-3.95 3.34h-130.44c-1.975 .027-3.674-1.392-4-3.34l-15-90c1.387-.473 2.726-1.076 4-1.8l37.12 45.66c.758 .935 1.897 1.478 3.1 1.48 .18 .015 .36 .015 .54 0 1.386-.188 2.573-1.087 3.13-2.37L122.23 75.33c3.788 .947 7.752 .947 11.54 0l30.56 70.3c.557 1.283 1.744 2.182 3.13 2.37 .18 .015 .36 .015 .54 0 1.203-.002 2.342-.545 3.1-1.48l37.09-45.64c1.274 .724 2.613 1.327 4 1.8ZM220 96c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _crown!!
    }

private var _crown: ImageVector? = null
