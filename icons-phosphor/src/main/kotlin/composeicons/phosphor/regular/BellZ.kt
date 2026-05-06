package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BellZ: ImageVector
    get() {
        if (_bellZ != null) return _bellZ!!
        _bellZ = phosphorRegularIcon(
            name = "BellZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 144c0 4.418-3.582 8-8 8h-32c-2.95-.002-5.66-1.627-7.05-4.229-1.391-2.602-1.237-5.757 .4-8.211L129.05 104h-17.05c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c2.95 .002 5.66 1.627 7.05 4.229 1.391 2.602 1.237 5.757-.4 8.211L127 136h17c4.418 0 8 3.582 8 8ZM221.84 192c-2.825 4.976-8.118 8.036-13.84 8h-40.81c-3.805 18.619-20.186 31.991-39.19 31.991C108.996 231.991 92.615 218.619 88.81 200h-40.81c-5.725-.008-11.009-3.073-13.858-8.039-2.848-4.966-2.826-11.075 .058-16.021C39.75 166.38 48 139.34 48 104 48 59.817 83.817 24 128 24c44.183 0 80 35.817 80 80 0 35.33 8.26 62.38 13.81 71.94 2.914 4.954 2.925 11.095 .03 16.06ZM150.62 200h-45.24c3.396 9.578 12.457 15.979 22.62 15.979 10.163 0 19.224-6.401 22.62-15.979ZM208 184c-7.73-13.27-16-43.95-16-80C192 68.654 163.346 40 128 40 92.654 40 64 68.654 64 104c0 36.06-8.28 66.74-16 80Z"),
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
        return _bellZ!!
    }

private var _bellZ: ImageVector? = null
