package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorDuotoneIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 216h-48L48 40h48Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M214.75 211.71 152.15 113.33 213.92 45.38c2.907-3.277 2.638-8.283-.604-11.229-3.242-2.946-8.251-2.737-11.236 .469L143.24 99.34 102.75 35.71C101.283 33.4 98.736 32.001 96 32h-48c-2.922-.001-5.612 1.59-7.017 4.151-1.406 2.561-1.303 5.685 .267 8.149l62.6 98.37-61.77 68c-1.963 2.109-2.641 5.11-1.774 7.858 .867 2.748 3.144 4.817 5.961 5.418 2.818 .601 5.741-.36 7.653-2.515l58.84-64.72 40.49 63.63c1.479 2.291 4.023 3.67 6.75 3.66h48c2.918-.001 5.605-1.591 7.01-4.149 1.405-2.558 1.305-5.678-.26-8.141ZM164.39 208 62.57 48h29L193.43 208Z"),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
