package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorLightIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M34 64c0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6ZM40 134h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM120 186h-80c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h80c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM246 144c0 35.3-49.22 60.32-51.32 61.37-1.687 .842-3.673 .842-5.36 0C187.22 204.32 138 179.3 138 144c0-12.913 8.263-24.377 20.513-28.461 12.25-4.083 25.739 .13 33.487 10.461 7.748-10.33 21.237-14.544 33.487-10.461C237.737 119.623 246 131.087 246 144ZM234 144c0-9.941-8.059-18-18-18-9.941 0-18 8.059-18 18 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-9.941-8.059-18-18-18-9.941 0-18 8.059-18 18 0 14.15 11.78 27 21.67 35.25 6.35 5.24 13.153 9.905 20.33 13.94 7.179-4.031 13.983-8.696 20.33-13.94C222.22 171 234 158.15 234 144Z"),
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
