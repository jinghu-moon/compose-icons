package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorDuotoneIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 80c0 13.255-10.745 24-24 24C90.745 104 80 93.255 80 80 80 66.745 90.745 56 104 56c13.255 0 24 10.745 24 24ZM168 152c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24Z"),
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
                pathData = parseSvgPathData("M40 88h33c3.625 14.159 16.384 24.063 31 24.063 14.616 0 27.375-9.903 31-24.063h81c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-81C131.375 57.841 118.616 47.937 104 47.937 89.384 47.937 76.625 57.841 73 72h-33c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM104 64c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C95.163 96 88 88.837 88 80c0-8.837 7.163-16 16-16ZM216 168h-17c-3.625-14.159-16.384-24.063-31-24.063-14.616 0-27.375 9.903-31 24.063h-97c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h97c3.625 14.159 16.384 24.063 31 24.063 14.616 0 27.375-9.903 31-24.063h17c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM168 192c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
