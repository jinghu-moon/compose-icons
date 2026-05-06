package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileMagnifyingGlass: ImageVector
    get() {
        if (_fileMagnifyingGlass != null) return _fileMagnifyingGlass!!
        _fileMagnifyingGlass = phosphorLightIcon(
            name = "FileMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 83.76l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v176c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-128c-.001-1.591-.634-3.116-1.76-4.24ZM158 46.48 193.52 82h-35.52ZM200 218h-144c-1.105 0-2-.895-2-2v-176c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v122c0 1.105-.895 2-2 2ZM151.89 167.41c10.081-14.474 7.44-34.251-6.086-45.572-13.526-11.321-33.459-10.438-45.931 2.034-12.473 12.473-13.355 32.405-2.034 45.931 11.321 13.526 31.098 16.167 45.572 6.086l12.35 12.35c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333ZM102 148c0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22-12.15 0-22-9.85-22-22Z"),
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
        return _fileMagnifyingGlass!!
    }

private var _fileMagnifyingGlass: ImageVector? = null
