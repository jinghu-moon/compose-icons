package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileJpg: ImageVector
    get() {
        if (_fileJpg != null) return _fileJpg!!
        _fileJpg = phosphorLightIcon(
            name = "FileJpg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 146h-16c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h10c14.359 0 26-11.641 26-26 0-14.359-11.641-26-26-26ZM120 186h-10v-28h10c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM214 184v16.87c-.001 1.547-.599 3.034-1.67 4.15-5.252 5.664-12.606 8.912-20.33 8.98-16.54 0-30-15.25-30-34 0-18.75 13.46-34 30-34 5.482 .02 10.832 1.681 15.36 4.77 2.748 1.856 3.471 5.587 1.615 8.335-1.856 2.748-5.587 3.471-8.335 1.615C198.102 158.959 195.089 158.011 192 158c-9.93 0-18 9.87-18 22 0 12.13 8.07 22 18 22 3.666-.042 7.202-1.361 10-3.73v-8.27h-2c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h8c3.314 0 6 2.686 6 6ZM78 152v38c0 13.255-10.745 24-24 24C40.745 214 30 203.255 30 190c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-38c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM212.24 83.76l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v72c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-72c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c-.001-1.591-.634-3.116-1.76-4.24ZM158 82v-35.52L193.52 82Z"),
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
        return _fileJpg!!
    }

private var _fileJpg: ImageVector? = null
