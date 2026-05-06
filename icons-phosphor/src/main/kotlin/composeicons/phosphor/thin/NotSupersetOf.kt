package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorThinIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 196h-136.41l29.09-32h51.32c24.337-.021 46.251-14.74 55.474-37.262 9.223-22.522 3.928-48.384-13.404-65.468L211 42.69c1.486-1.657 1.347-4.204-.31-5.69-1.657-1.486-4.204-1.347-5.69 .31L188 56C177.623 48.193 164.985 43.98 152 44h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h96c11.004-.005 21.723 3.498 30.6 10L97.14 156h-41.14c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h33.87L45 213.31c-1.486 1.657-1.347 4.204 .31 5.69 1.657 1.486 4.204 1.347 5.69-.31L64.31 204h143.69c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM188.69 67.19c14.891 14.858 19.363 37.223 11.331 56.665C191.989 143.297 173.035 155.984 152 156h-44Z"),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
