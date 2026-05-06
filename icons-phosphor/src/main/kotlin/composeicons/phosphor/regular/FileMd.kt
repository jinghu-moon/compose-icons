package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileMd: ImageVector
    get() {
        if (_fileMd != null) return _fileMd!!
        _fileMd = phosphorRegularIcon(
            name = "FileMd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-72h88v48c0 4.418 3.582 8 8 8h48v128c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-136c.002-2.122-.84-4.158-2.34-5.66ZM160 51.31 188.69 80h-28.69ZM144 144h-16c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8h16c19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36ZM144 200h-8v-40h8c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM104 152v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-30.62L74.55 196.59c-1.497 2.135-3.942 3.407-6.55 3.407-2.608 0-5.053-1.271-6.55-3.407L48 177.38v30.62c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-56c.001-3.49 2.265-6.576 5.593-7.626 3.328-1.05 6.953 .179 8.957 3.036L68 178.05 89.45 147.41c2.004-2.857 5.629-4.086 8.957-3.036 3.328 1.05 5.592 4.136 5.593 7.626Z"),
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
