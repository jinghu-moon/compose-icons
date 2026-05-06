package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorThinIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 136C251.961 98.461 221.539 68.039 184 68h-112C34.461 68.039 4.039 98.461 4 136c.007 9.633 6.879 17.892 16.35 19.65C23.91 174.84 54.81 188 72 188c18.332-.004 33.733-13.782 35.77-32h40.46c2.037 18.218 17.438 31.996 35.77 32 17.19 0 48.09-13.16 51.65-32.35C245.121 153.892 251.993 145.633 252 136ZM28 152c0-7.75 7.92-15.25 17.81-20.53l43 42.95C83.962 178.057 78.061 180.016 72 180 55.45 180 28 166.44 28 152ZM94.42 168.76 53.58 127.92C60 125.46 66.58 124 72 124c10.595 .004 20.28 5.987 25.025 15.46 4.745 9.473 3.737 20.813-2.605 29.3ZM156 152c0-8 3.43-15.617 9.42-20.92L208 173.65c-8 3.91-17 6.35-24 6.35-15.464 0-28-12.536-28-28ZM215.2 169.55l-42.95-43c3.684-1.695 7.694-2.565 11.75-2.55 16.55 0 44 13.56 44 28 0 6.39-5.38 12.6-12.8 17.55ZM235.46 147.49C231.15 128.77 200.93 116 184 116c-18.332 .004-33.733 13.782-35.77 32h-40.46C105.733 129.782 90.332 116.004 72 116c-16.93 0-47.15 12.77-51.46 31.49C15.47 145.963 12 141.295 12 136 12.039 102.879 38.879 76.039 72 76h112c33.121 .039 59.961 26.879 60 60-0 5.295-3.47 9.963-8.54 11.49Z"),
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
        return _goggles!!
    }

private var _goggles: ImageVector? = null
