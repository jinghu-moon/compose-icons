package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileVue: ImageVector
    get() {
        if (_fileVue != null) return _fileVue!!
        _fileVue = phosphorDuotoneIcon(
            name = "FileVue",
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
                pathData = parseSvgPathData("M87.54 154.69l-20 56c-1.136 3.185-4.153 5.312-7.535 5.312-3.382 0-6.399-2.127-7.535-5.312l-20-56c-1.486-4.161 .684-8.739 4.845-10.225 4.161-1.486 8.739 .684 10.225 4.845L60 184.21 72.47 149.31c1.486-4.161 6.064-6.331 10.225-4.845 4.161 1.486 6.331 6.064 4.845 10.225ZM208 160c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-32c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24v-12h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-12ZM144 144c-4.418 0-8 3.582-8 8v38c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10v-38c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v38c0 14.359 11.641 26 26 26 14.359 0 26-11.641 26-26v-38c0-4.418-3.582-8-8-8ZM216 88v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-48c-4.418 0-8-3.582-8-8v-48h-88v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-72C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM188.69 80 160 51.31v28.69Z"),
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
        return _fileVue!!
    }

private var _fileVue: ImageVector? = null
