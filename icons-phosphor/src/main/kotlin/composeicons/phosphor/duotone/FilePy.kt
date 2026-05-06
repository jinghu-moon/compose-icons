package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FilePy: ImageVector
    get() {
        if (_filePy != null) return _filePy!!
        _filePy = phosphorDuotoneIcon(
            name = "FilePy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 88h-56v-56Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-72h88v48c0 4.418 3.582 8 8 8h48v120h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c8.837 0 16-7.163 16-16v-128c.002-2.122-.84-4.158-2.34-5.66ZM160 51.31 188.69 80h-28.69ZM64 144h-16c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h8c15.464 0 28-12.536 28-28C92 156.536 79.464 144 64 144ZM64 184h-8v-24h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM154.78 156.24l-18.78 30v21.76c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-21.71l-18.78-30c-1.616-2.424-1.786-5.536-.444-8.122 1.342-2.586 3.984-4.238 6.896-4.313 2.913-.075 5.635 1.44 7.108 3.954L128 168.91l13.22-21.15c1.472-2.514 4.195-4.029 7.108-3.954 2.913 .075 5.554 1.727 6.896 4.313 1.342 2.586 1.172 5.697-.444 8.122Z"),
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
