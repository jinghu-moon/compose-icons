package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileMd: ImageVector
    get() {
        if (_fileMd != null) return _fileMd!!
        _fileMd = phosphorLightIcon(
            name = "FileMd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 83.76l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v72c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-72c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v130c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-136c-.001-1.591-.634-3.116-1.76-4.24ZM158 46.48 193.52 82h-35.52ZM144 146h-16c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6h16c18.778 0 34-15.222 34-34 0-18.778-15.222-34-34-34ZM144 202h-10v-44h10c12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22ZM102 152v56c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-37L72.92 195.44c-1.122 1.608-2.959 2.566-4.92 2.566-1.961 0-3.798-.958-4.92-2.566L46 171v37c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-56c-.003-2.621 1.697-4.941 4.197-5.729 2.5-.788 5.222 .139 6.723 2.289l23.08 33 23.08-33c1.5-2.15 4.223-3.076 6.723-2.289 2.5 .788 4.2 3.107 4.197 5.729Z"),
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
        return _fileMd!!
    }

private var _fileMd: ImageVector? = null
