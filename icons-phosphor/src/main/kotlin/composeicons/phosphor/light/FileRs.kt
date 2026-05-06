package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileRs: ImageVector
    get() {
        if (_fileRs != null) return _fileRs!!
        _fileRs = phosphorLightIcon(
            name = "FileRs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 83.76l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v72c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-72c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v122c0 1.105-.895 2-2 2h-16c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16c7.732 0 14-6.268 14-14v-128c-.001-1.591-.634-3.116-1.76-4.24ZM158 46.48 193.52 82h-35.52ZM90 172C90 157.641 78.359 146 64 146h-16c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h10c2.265 0 4.521-.296 6.71-.88L78.82 211c1.069 1.851 3.042 2.994 5.18 3 1.055-.001 2.091-.284 3-.82 2.859-1.669 3.826-5.339 2.16-8.2L81.25 191.41C86.811 186.491 89.997 179.424 90 172ZM54 186v-28h10c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM153.83 196.06c-.569 5.613-3.617 10.679-8.31 13.81-4.82 3.19-10.87 4.14-16.36 4.14-4.958-.046-9.89-.718-14.68-2-3.192-.892-5.057-4.203-4.165-7.395 .892-3.192 4.203-5.057 7.395-4.165 3.71 1 15.58 3.11 21.19-.62 1.784-1.209 2.896-3.187 3-5.34 .58-4.43-2.08-6.26-14.2-9.76-9.31-2.69-23.37-6.75-21.57-20.94 .554-5.488 3.513-10.447 8.08-13.54 11.11-7.49 29.18-3 31.21-2.48 3.132 .904 4.969 4.143 4.138 7.295-.831 3.152-4.028 5.064-7.198 4.305-3.78-1-15.85-3-21.45 .84-1.699 1.152-2.764 3.031-2.88 5.08-.41 3.22 2.14 4.78 13 7.91 9.89 2.89 24.81 7.2 22.8 22.86Z"),
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
        return _fileRs!!
    }

private var _fileRs: ImageVector? = null
