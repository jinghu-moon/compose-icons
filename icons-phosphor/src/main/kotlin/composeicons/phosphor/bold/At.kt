package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorBoldIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 22.27 0 45.69-6.73 62.64-18 5.523-3.67 7.025-11.122 3.355-16.645-3.67-5.523-11.122-7.025-16.645-3.355-13 8.63-31.89 14-49.35 14C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84 0 9.29-1.67 17.08-4.69 21.95-2.64 4.24-6 6.05-11.31 6.05-5.31 0-8.67-1.81-11.31-6.05C181.69 145.08 180 137.29 180 128v-40c-.001-5.952-4.363-11.003-10.251-11.871-5.888-.867-11.522 2.712-13.239 8.411C133.556 69.458 102.831 74.827 86.353 96.8c-16.478 21.973-13.026 52.972 7.882 70.783 20.908 17.81 52.062 16.289 71.135-3.473C172.3 174.3 182.81 180 196 180c24.67 0 40-19.92 40-52C235.934 68.381 187.619 20.066 128 20ZM128 156c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _at!!
    }

private var _at: ImageVector? = null
