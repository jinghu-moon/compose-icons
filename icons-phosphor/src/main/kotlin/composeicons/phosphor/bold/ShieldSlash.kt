package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorBoldIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C53.545 28.261 48.298 27.021 43.674 28.808 39.05 30.595 36.001 35.042 36 40c-5.036 3.777-8 9.705-8 16v56c0 54.29 26.32 87.22 48.4 105.29 23.71 19.39 47.44 26 48.44 26.29 2.069 .56 4.251 .56 6.32 0 1.35-.37 30-8.42 55.86-32.82l12.1 13.31c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM128 219.38C114.521 214.46 101.979 207.281 90.91 198.15 65.09 176.69 52 147.71 52 112v-49.76L170.87 193C158.5 204.587 143.919 213.56 128 219.38ZM228 56v56c.135 16.74-2.65 33.376-8.23 49.16-1.718 4.751-6.228 7.918-11.28 7.92-1.392 .001-2.773-.242-4.08-.72-2.993-1.083-5.434-3.311-6.784-6.194-1.35-2.883-1.5-6.184-.416-9.176C201.833 139.824 204.131 125.954 204 112v-52h-94.67c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h98.67c11.046 0 20 8.954 20 20Z"),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
