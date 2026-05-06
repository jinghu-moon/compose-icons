package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BellSimpleZ: ImageVector
    get() {
        if (_bellSimpleZ != null) return _bellSimpleZ!!
        _bellSimpleZ = phosphorDuotoneIcon(
            name = "BellSimpleZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 192h-160c-2.85-.017-5.475-1.549-6.892-4.021-1.417-2.472-1.413-5.511 .012-7.979C47.71 168.6 56 139.81 56 104 56 64.235 88.235 32 128 32c39.764 0 72 32.235 72 72 0 35.82 8.3 64.6 14.9 76 1.427 2.471 1.429 5.514 .007 7.988-1.422 2.473-4.054 4.002-6.907 4.012Z"),
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
                pathData = parseSvgPathData("M168 224c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM144 136h-17l23.7-35.56c1.642-2.461 1.792-5.628 .389-8.234C149.686 89.601 146.959 87.983 144 88h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h17.05l-23.7 35.56c-1.637 2.454-1.791 5.61-.4 8.211 1.391 2.602 4.1 4.227 7.05 4.229h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM221.84 192c-2.825 4.976-8.118 8.036-13.84 8h-160c-5.725-.008-11.009-3.073-13.858-8.039-2.848-4.966-2.826-11.075 .058-16.021C39.75 166.38 48 139.34 48 104 48 59.817 83.817 24 128 24c44.183 0 80 35.817 80 80 0 35.33 8.26 62.38 13.81 71.94 2.914 4.954 2.925 11.095 .03 16.06ZM208 184c-7.73-13.27-16-43.95-16-80C192 68.654 163.346 40 128 40 92.654 40 64 68.654 64 104c0 36.06-8.28 66.74-16 80Z"),
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
        return _bellSimpleZ!!
    }

private var _bellSimpleZ: ImageVector? = null
