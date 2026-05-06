package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorBoldIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.09 41.5C239.88 38.071 236.08 35.999 232 36h-80c-4.696-.004-8.963 2.731-10.92 7l-7.72 17h-105.36c-4.749 0-9.051 2.802-10.973 7.145-1.922 4.343-1.101 9.411 2.093 12.925L51.78 116 19.12 151.93c-3.194 3.515-4.014 8.582-2.093 12.925 1.922 4.343 6.224 7.144 10.973 7.145h73.09c4.693 .001 8.955-2.734 10.91-7l7.71-17h53.63l-32.28 71c-2.761 6.036-.106 13.169 5.93 15.93 6.036 2.761 13.169 .106 15.93-5.93l80-176c1.704-3.724 1.391-8.059-.83-11.5ZM55.13 148 76.88 124.07c4.158-4.576 4.158-11.564 0-16.14L55.13 84h67.32L93.36 148ZM184.27 124h-53.63L159.73 60h53.63Z"),
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
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
