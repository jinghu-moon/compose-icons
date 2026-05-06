package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FilePdf: ImageVector
    get() {
        if (_filePdf != null) return _filePdf!!
        _filePdf = phosphorRegularIcon(
            name = "FilePdf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 152c0 4.418-3.582 8-8 8h-24v16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-56c0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM92 172c0 15.464-12.536 28-28 28h-8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-56c0-4.418 3.582-8 8-8h16c15.464 0 28 12.536 28 28ZM76 172c0-6.627-5.373-12-12-12h-8v24h8c6.627 0 12-5.373 12-12ZM164 180c0 19.882-16.118 36-36 36h-16c-4.418 0-8-3.582-8-8v-56c0-4.418 3.582-8 8-8h16c19.882 0 36 16.118 36 36ZM148 180c0-11.046-8.954-20-20-20h-8v40h8c11.046 0 20-8.954 20-20ZM40 112v-72C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-48c-4.418 0-8-3.582-8-8v-48h-88v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM160 80h28.69L160 51.31Z"),
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
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
