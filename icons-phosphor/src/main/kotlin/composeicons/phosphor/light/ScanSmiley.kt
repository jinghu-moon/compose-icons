package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ScanSmiley: ImageVector
    get() {
        if (_scanSmiley != null) return _scanSmiley!!
        _scanSmiley = phosphorLightIcon(
            name = "ScanSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 40v36c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-30h-30c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h36c3.314 0 6 2.686 6 6ZM216 174c-3.314 0-6 2.686-6 6v30h-30c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h36c3.314 0 6-2.686 6-6v-36c0-3.314-2.686-6-6-6ZM76 210h-30v-30c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v36c0 3.314 2.686 6 6 6h36c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM40 82c3.314 0 6-2.686 6-6v-30h30c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-36c-3.314 0-6 2.686-6 6v36c0 3.314 2.686 6 6 6ZM128 198C89.34 198 58 166.66 58 128 58 89.34 89.34 58 128 58c38.66 0 70 31.34 70 70-.044 38.642-31.358 69.956-70 70ZM186 128C186 95.967 160.033 70 128 70 95.967 70 70 95.967 70 128c0 32.033 25.967 58 58 58 32.017-.039 57.961-25.983 58-58ZM114 116c0-5.523-4.477-10-10-10-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10ZM152 106c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM148 147.5c-4.2 3.71-12.81 6.5-20 6.5-7.19 0-15.83-2.79-20-6.5-2.485-2.193-6.277-1.955-8.47 .53-2.193 2.485-1.955 6.277 .53 8.47 7.44 6.56 19.41 9.5 28 9.5 8.59 0 20.53-2.94 28-9.5 2.485-2.193 2.723-5.985 .53-8.47-2.193-2.485-5.985-2.723-8.47-.53Z"),
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
        return _scanSmiley!!
    }

private var _scanSmiley: ImageVector? = null
