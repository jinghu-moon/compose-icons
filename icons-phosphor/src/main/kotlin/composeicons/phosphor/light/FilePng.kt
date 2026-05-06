package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilePng: ImageVector
    get() {
        if (_filePng != null) return _filePng!!
        _filePng = phosphorLightIcon(
            name = "FilePng",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60 146h-16c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h10c14.359 0 26-11.641 26-26C86 157.641 74.359 146 60 146ZM60 186h-10v-28h10c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM222 200.87c-.001 1.547-.599 3.034-1.67 4.15-5.252 5.664-12.606 8.912-20.33 8.98-16.54 0-30-15.25-30-34 0-18.75 13.46-34 30-34 5.482 .02 10.832 1.681 15.36 4.77 2.748 1.856 3.471 5.587 1.615 8.335-1.856 2.748-5.587 3.471-8.335 1.615C206.102 158.959 203.089 158.011 200 158c-9.93 0-18 9.87-18 22 0 12.13 8.07 22 18 22 3.666-.042 7.202-1.361 10-3.73v-8.27h-2c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h8c3.314 0 6 2.686 6 6ZM154 152v56c-.002 2.607-1.687 4.915-4.17 5.71-.59 .194-1.208 .292-1.83 .29-1.936-0-3.754-.935-4.88-2.51L114 170.72v37.28c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-56c0-2.607 1.685-4.916 4.167-5.712 2.483-.796 5.196 .102 6.713 2.222L142 189.28v-37.28c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM48 118c3.314 0 6-2.686 6-6v-72c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c-.001-1.591-.634-3.116-1.76-4.24l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v72c0 3.314 2.686 6 6 6ZM158 46.48 193.52 82h-35.52Z"),
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
        return _filePng!!
    }

private var _filePng: ImageVector? = null
