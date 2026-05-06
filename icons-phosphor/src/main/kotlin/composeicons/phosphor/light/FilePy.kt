package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilePy: ImageVector
    get() {
        if (_filePy != null) return _filePy!!
        _filePy = phosphorLightIcon(
            name = "FilePy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 83.76l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v72c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-72c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v122c0 1.105-.895 2-2 2h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c7.732 0 14-6.268 14-14v-128c-.001-1.591-.634-3.116-1.76-4.24ZM158 46.48 193.52 82h-35.52ZM64 146h-16c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h10c14.359 0 26-11.641 26-26C90 157.641 78.359 146 64 146ZM64 186h-10v-28h10c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM153.09 155.18 134 185.72v22.28c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-22.28L102.91 155.18c-1.756-2.811-.901-6.514 1.91-8.27 2.811-1.756 6.514-.901 8.27 1.91L128 172.68l14.91-23.86c1.756-2.811 5.459-3.666 8.27-1.91 2.811 1.756 3.666 5.459 1.91 8.27Z"),
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
        return _filePy!!
    }

private var _filePy: ImageVector? = null
