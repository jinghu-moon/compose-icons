package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileVue: ImageVector
    get() {
        if (_fileVue != null) return _fileVue!!
        _fileVue = phosphorBoldIcon(
            name = "FileVue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M87.3 156l-20 56c-1.706 4.775-6.23 7.961-11.3 7.961-5.07 0-9.594-3.187-11.3-7.961l-20-56c-1.857-6.136 1.438-12.648 7.481-14.787 6.043-2.139 12.701 .85 15.119 6.787L56 172.32 64.7 148c2.417-5.938 9.075-8.927 15.119-6.787 6.043 2.139 9.338 8.651 7.481 14.787ZM212 196h-20v-4h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-4h20c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM144 140c-6.627 0-12 5.373-12 12v38c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-38c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v38c0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30v-38c0-6.627-5.373-12-12-12ZM36 108v-68C36 28.954 44.954 20 56 20h96c3.185 0 6.239 1.266 8.49 3.52l56 56c2.247 2.25 3.51 5.3 3.51 8.48v20c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-48c-6.627 0-12-5.373-12-12v-48h-76v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM160 80h23L160 57Z"),
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
