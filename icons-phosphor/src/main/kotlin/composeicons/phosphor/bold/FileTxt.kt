package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileTxt: ImageVector
    get() {
        if (_fileTxt != null) return _fileTxt!!
        _fileTxt = phosphorBoldIcon(
            name = "FileTxt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 120c6.627 0 12-5.373 12-12v-64h76v48c0 6.627 5.373 12 12 12h48v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20c.003-3.184-1.26-6.238-3.51-8.49l-56-56C158.238 21.26 155.184 19.997 152 20h-96C44.954 20 36 28.954 36 40v68c0 6.627 5.373 12 12 12ZM183 80h-23v-23ZM157.73 159l-15 21 15 21c2.582 3.478 3.088 8.078 1.326 12.035-1.763 3.957-5.521 6.657-9.834 7.064-4.313 .407-8.51-1.542-10.982-5.099L128 200.65 117.76 215c-3.866 5.39-11.37 6.626-16.76 2.76C95.61 213.894 94.374 206.39 98.24 201l15-21-15-21C94.374 153.61 95.61 146.106 101 142.24c5.39-3.866 12.894-2.63 16.76 2.76L128 159.35 138.24 145c3.866-5.39 11.37-6.626 16.76-2.76 5.39 3.866 6.626 11.37 2.76 16.76ZM92 152c0 6.627-5.373 12-12 12h-8v44c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-44h-8c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12ZM228 152c0 6.627-5.373 12-12 12h-8v44c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-44h-8c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12Z"),
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
        return _fileTxt!!
    }

private var _fileTxt: ImageVector? = null
