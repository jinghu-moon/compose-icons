package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorDuotoneIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 128l-48 40h-128L16 128 64 88h128Z"),
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
                pathData = parseSvgPathData("M69.12 94.15 28.5 128l40.62 33.85c2.26 1.81 3.367 4.699 2.892 7.556-.474 2.856-2.455 5.234-5.179 6.216-2.724 .982-5.766 .415-7.954-1.481l-48-40C9.057 132.62 8.002 130.369 8.002 127.995c0-2.374 1.054-4.625 2.878-6.145l48-40c3.397-2.828 8.442-2.367 11.27 1.03 2.828 3.397 2.367 8.442-1.03 11.27ZM245.12 121.85l-48-40c-3.397-2.828-8.442-2.367-11.27 1.03-2.828 3.397-2.367 8.442 1.03 11.27L227.5 128l-40.62 33.85c-2.26 1.81-3.367 4.699-2.892 7.556 .474 2.856 2.455 5.234 5.179 6.216 2.724 .982 5.766 .415 7.954-1.481l48-40c1.823-1.52 2.878-3.771 2.878-6.145 0-2.374-1.054-4.625-2.878-6.145ZM162.73 32.48c-1.994-.724-4.195-.626-6.117 .272-1.922 .898-3.409 2.523-4.133 4.518L88.48 213.27c-.727 1.996-.631 4.199 .268 6.123 .899 1.925 2.526 3.413 4.522 4.137 .876 .311 1.8 .47 2.73 .47 3.366 0 6.371-2.106 7.52-5.27L167.52 42.73c.724-1.994 .626-4.195-.272-6.117-.898-1.922-2.523-3.409-4.518-4.133Z"),
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
        return _code!!
    }

private var _code: ImageVector? = null
