package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Guitar: ImageVector
    get() {
        if (_guitar != null) return _guitar!!
        _guitar = phosphorFillIcon(
            name = "Guitar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249.66 46.34l-40-40c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L200.69 20 140.52 80.16C117.73 68.3 92.21 69.29 76.75 84.74c-4.08 4.097-7.276 8.988-9.39 14.37-1.327 2.981-4.287 4.899-7.55 4.89-14.59 .49-27.26 5.72-36.65 15.11C11.08 131.22 6 148.6 8.74 168.07 11.4 186.7 21.07 205.15 36 220c14.93 14.85 33.34 24.56 52 27.22 3.344 .5 6.719 .76 10.1 .78 15.32 0 28.83-5.23 38.76-15.16 9.39-9.39 14.62-22.06 15.11-36.65-.003-3.27 1.927-6.232 4.92-7.55 5.382-2.113 10.274-5.309 14.37-9.39 15.45-15.46 16.44-41 4.58-63.77L236 55.31l2.34 2.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM93.66 205.65c-3.124 3.122-8.186 3.122-11.31 0l-32-32c-3.123-3.126-3.121-8.192 .005-11.315 3.126-3.123 8.192-3.121 11.315 .005l32 32c3.119 3.127 3.114 8.189-.01 11.31ZM135.8 159.79c-8.007 8.01-20.051 10.408-30.516 6.075C94.82 161.531 87.997 151.321 87.997 139.995c0-11.326 6.823-21.536 17.287-25.87 10.464-4.333 22.508-1.936 30.516 6.075 10.929 10.934 10.929 28.656 0 39.59ZM166.86 101.79c-1.884-2.329-3.886-4.558-6-6.68-2.123-2.116-4.356-4.119-6.69-6L176 67.31 188.69 80ZM200 68.68 187.32 56 212 31.31 224.69 44Z"),
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
        return _guitar!!
    }

private var _guitar: ImageVector? = null
