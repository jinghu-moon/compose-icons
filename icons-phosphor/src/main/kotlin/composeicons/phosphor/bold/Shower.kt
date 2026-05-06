package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shower: ImageVector
    get() {
        if (_shower != null) return _shower!!
        _shower = phosphorBoldIcon(
            name = "Shower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M68 236c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM84 188c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM20 188c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM52 188c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16ZM256 40c0 6.627-5.373 12-12 12h-23L195.19 77.79 173.74 203.33c-1.251 7.376-6.513 13.438-13.641 15.711-7.128 2.273-14.928 .379-20.219-4.911L41.88 116.13C36.577 110.835 34.679 103.02 36.963 95.883 39.246 88.745 45.328 83.483 52.72 82.25L178.22 60.81 207.51 31.51C209.762 29.26 212.816 27.997 216 28h28c6.627 0 12 5.373 12 12ZM169.32 86.68 64.32 104.62l87.07 87.07Z"),
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
        return _shower!!
    }

private var _shower: ImageVector? = null
