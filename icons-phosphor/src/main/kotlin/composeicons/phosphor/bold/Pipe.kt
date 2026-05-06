package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pipe: ImageVector
    get() {
        if (_pipe != null) return _pipe!!
        _pipe = phosphorBoldIcon(
            name = "Pipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 100h-16v-40h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-20c-3.777-5.036-9.705-8-16-8h-24c-6.295 0-12.223 2.964-16 8h-12C84.381 36.066 36.066 84.381 36 144v12c-5.036 3.777-8 9.705-8 16v24c0 6.295 2.964 12.223 8 16v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-16h40v16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20c5.036-3.777 8-9.705 8-16v-24c0-6.295-2.964-12.223-8-16v-12c0-11.046 8.954-20 20-20h12c3.777 5.036 9.705 8 16 8h24c6.295 0 12.223-2.964 16-8h20c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM108 176v16h-56v-16ZM100 144v8h-40v-8C60.05 97.629 97.629 60.05 144 60h8v40h-8c-24.289 .028-43.972 19.711-44 44ZM176 52h16v56h-16Z"),
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
        return _pipe!!
    }

private var _pipe: ImageVector? = null
