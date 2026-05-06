package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileIni: ImageVector
    get() {
        if (_fileIni != null) return _fileIni!!
        _fileIni = phosphorRegularIcon(
            name = "FileIni",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 152v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM120 144c-4.418 0-8 3.582-8 8v31L86.51 147.35c-2.021-2.83-5.64-4.03-8.951-2.969C74.247 145.443 72 148.522 72 152v56c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-31l25.49 35.69c1.51 2.087 3.934 3.319 6.51 3.31 .828 .002 1.652-.126 2.44-.38 3.313-1.061 5.561-4.141 5.56-7.62v-56c0-4.418-3.582-8-8-8ZM160 144c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-56c0-4.418-3.582-8-8-8ZM216 88v136c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-128h-48c-4.418 0-8-3.582-8-8v-48h-88v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-72C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM160 80h28.69L160 51.31Z"),
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
        return _fileIni!!
    }

private var _fileIni: ImageVector? = null
