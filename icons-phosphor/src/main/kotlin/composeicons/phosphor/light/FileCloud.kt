package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorLightIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 83.76l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v88c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-88c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v122c0 1.105-.895 2-2 2h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c7.732 0 14-6.268 14-14v-128c-.001-1.591-.634-3.116-1.76-4.24ZM158 46.48 193.52 82h-35.52ZM108 130c-20.673-.005-39.218 12.713-46.66 32h-1.34c-18.778 0-34 15.222-34 34 0 18.778 15.222 34 34 34h48c27.614 0 50-22.386 50-50 0-27.614-22.386-50-50-50ZM108 218h-48c-11.839 .014-21.567-9.343-22.011-21.174-.444-11.831 8.554-21.892 20.361-22.766-.06 .47-.1 .93-.15 1.4-.298 3.314 2.146 6.242 5.46 6.54 3.314 .298 6.242-2.146 6.54-5.46 .178-2.208 .546-4.396 1.1-6.54 .102-.28 .183-.568 .24-.86 5.59-18.745 24.498-30.184 43.697-26.436 19.199 3.749 32.415 21.46 30.544 40.931C143.909 203.107 127.561 217.977 108 218Z"),
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
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
