package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorDuotoneIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 144c0 32-48 56-48 56 0 0-48-24-48-56 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24Z"),
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
                pathData = parseSvgPathData("M32 64c0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8ZM40 136h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM120 184h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h80c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM248 144c0 36.52-50.28 62.08-52.42 63.16-2.253 1.128-4.907 1.128-7.16 0C186.28 206.08 136 180.52 136 144c.011-13.304 8.252-25.213 20.698-29.912 12.447-4.699 26.502-1.206 35.302 8.772 8.8-9.978 22.855-13.47 35.302-8.772 12.447 4.699 20.688 16.608 20.698 29.912ZM232 144c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 20.18 26.21 39.14 40 46.93 13.79-7.78 40-26.74 40-46.93Z"),
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
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
