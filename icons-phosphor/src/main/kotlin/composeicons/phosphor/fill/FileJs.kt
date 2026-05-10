package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileJs: ImageVector
    get() {
        if (_fileJs != null) return _fileJs!!
        _fileJs = phosphorFillIcon(
            name = "FileJs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4h120c2.209 0 4 1.791 4 4v104c0 2.209 1.791 4 4 4h28c8.837 0 16-7.163 16-16v-128c.002-2.122-.84-4.158-2.34-5.66ZM152 88v-44l44 44ZM147.81 196.31c-.631 6.196-4.003 11.783-9.19 15.23C133.43 215 127 216 121.13 216c-5.127-.029-10.23-.701-15.19-2-4.255-1.19-6.74-5.605-5.55-9.86 1.19-4.255 5.605-6.74 9.86-5.55 4.38 1.2 15 2.7 19.55-.36 .88-.59 1.83-1.52 2.14-3.93 .34-2.67-.72-4.1-12.78-7.59-9.35-2.7-25-7.23-23-23.11 .634-6.072 3.931-11.548 9-14.95 11.85-8 30.72-3.31 32.84-2.76 4.275 1.124 6.829 5.5 5.705 9.775-1.124 4.275-5.5 6.829-9.775 5.705-4.49-1.17-15.23-2.56-19.83 .56-1.22 .829-1.965 2.196-2 3.67-.11 .9-.13 1.09 1.12 1.9 2.31 1.49 6.45 2.68 10.45 3.84 9.82 2.83 26.33 7.66 24.14 24.97ZM80 152v37.41c0 14.22-11.18 26.26-25.41 26.58-6.932 .158-13.64-2.459-18.633-7.27C30.964 203.909 28.1 197.303 28 190.37c-.128-4.273 3.059-7.922 7.31-8.37 2.277-.198 4.531 .587 6.191 2.158 1.661 1.571 2.57 3.777 2.499 6.062-.203 3.192 1.325 6.247 4 8 7.85 4.82 16-.75 16-8.2v-37.75c-.068-4.291 3.195-7.903 7.47-8.27 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853Z"),
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
