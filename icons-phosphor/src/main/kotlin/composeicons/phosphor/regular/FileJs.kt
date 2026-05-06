package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileJs: ImageVector
    get() {
        if (_fileJs != null) return _fileJs!!
        _fileJs = phosphorRegularIcon(
            name = "FileJs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-72h88v48c0 4.418 3.582 8 8 8h48v120h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c8.837 0 16-7.163 16-16v-128c.002-2.122-.84-4.158-2.34-5.66ZM160 51.31 188.69 80h-28.69ZM147.81 196.31c-.631 6.196-4.003 11.783-9.19 15.23C133.43 215 127 216 121.13 216c-5.127-.029-10.23-.701-15.19-2-4.255-1.19-6.74-5.605-5.55-9.86 1.19-4.255 5.605-6.74 9.86-5.55 4.38 1.2 15 2.7 19.55-.36 .88-.59 1.83-1.52 2.14-3.93 .34-2.67-.71-4.1-12.78-7.59-9.35-2.7-25-7.23-23-23.11 .632-6.072 3.929-11.55 9-14.95 11.84-8 30.71-3.31 32.83-2.76 4.275 1.124 6.829 5.5 5.705 9.775-1.124 4.275-5.5 6.829-9.775 5.705-4.49-1.17-15.23-2.56-19.83 .56-1.224 .825-1.97 2.194-2 3.67-.12 .9-.14 1.09 1.11 1.9 2.31 1.49 6.45 2.68 10.45 3.84 9.84 2.83 26.4 7.66 24.16 24.97ZM80 152v38c0 14.359-11.641 26-26 26C39.641 216 28 204.359 28 190c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10v-38c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _fileJs!!
    }

private var _fileJs: ImageVector? = null
