package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = phosphorBoldIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 56h-68L133.33 36c-3.466-2.589-7.674-3.991-12-4h-45.33C64.954 32 56 40.954 56 52v20h-20C24.954 72 16 80.954 16 92v112c0 11.046 8.954 20 20 20h152.89c10.55-.011 19.099-8.56 19.11-19.11v-20.89h20.89c10.55-.011 19.099-8.56 19.11-19.11v-88.89C248 64.954 239.046 56 228 56ZM184 200h-144v-104h40l28.8 21.6c2.077 1.558 4.604 2.4 7.2 2.4h68ZM224 160h-16v-44c0-11.046-8.954-20-20-20h-68L93.33 76c-3.466-2.589-7.674-3.991-12-4h-1.33v-16h40l28.8 21.6C150.877 79.158 153.404 80 156 80h68Z"),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
