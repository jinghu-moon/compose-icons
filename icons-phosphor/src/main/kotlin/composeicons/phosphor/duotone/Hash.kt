package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorDuotoneIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M165.82 96l-11.64 64h-64L101.82 96Z"),
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
                pathData = parseSvgPathData("M224 88h-48.6l8.47-46.57c.708-4.308-2.169-8.388-6.464-9.168-4.295-.78-8.423 2.027-9.276 6.308l-9 49.43h-47.73l8.47-46.57c.708-4.308-2.169-8.388-6.464-9.168-4.295-.78-8.423 2.027-9.276 6.308L95.14 88h-47.14c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h44.23l-8.73 48h-51.5c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48.6l-8.47 46.57c-.789 4.346 2.094 8.51 6.44 9.3 .472 .087 .95 .131 1.43 .13 3.862-.005 7.17-2.77 7.86-6.57l9-49.43h47.74l-8.47 46.57c-.789 4.346 2.094 8.51 6.44 9.3 .472 .087 .95 .131 1.43 .13 3.863-.005 7.17-2.77 7.86-6.57l9-49.43h47.14c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-44.23l8.73-48h51.5c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM147.5 152h-47.73l8.73-48h47.73Z"),
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
        return _hash!!
    }

private var _hash: ImageVector? = null
