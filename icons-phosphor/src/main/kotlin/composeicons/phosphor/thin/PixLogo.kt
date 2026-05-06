package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorThinIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.5 119.55 136.45 23.55c-4.678-4.639-12.222-4.639-16.9 0L23.55 119.6c-4.639 4.678-4.639 12.222 0 16.9l96.05 96.05c4.678 4.639 12.222 4.639 16.9 0l96.05-96.05c4.639-4.678 4.639-12.222 0-16.9ZM125.21 29.16c.739-.741 1.743-1.158 2.79-1.158 1.047 0 2.051 .417 2.79 1.158L193.64 92h-33.64c-1.061-.001-2.079 .42-2.83 1.17L128 122.34 98.83 93.17C98.079 92.42 97.061 91.999 96 92h-33.64ZM28 128c-.004-1.048 .414-2.054 1.16-2.79L54.36 100h40l28 28-28 28h-40L29.16 130.79C28.414 130.054 27.996 129.048 28 128ZM130.79 226.84c-1.553 1.512-4.027 1.512-5.58 0L62.36 164h33.64c1.061 .001 2.079-.42 2.83-1.17L128 133.66l29.17 29.17c.751 .75 1.769 1.171 2.83 1.17h33.64ZM226.84 130.79 201.64 156h-40l-28-28 28-28h40l25.2 25.21c.741 .739 1.158 1.743 1.158 2.79 0 1.047-.417 2.051-1.158 2.79Z"),
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
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
