package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileIni: ImageVector
    get() {
        if (_fileIni != null) return _fileIni!!
        _fileIni = phosphorBoldIcon(
            name = "FileIni",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 152v56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM120 140c-6.627 0-12 5.373-12 12v18.55L89.76 145c-3.036-4.244-8.467-6.04-13.435-4.442C71.357 142.156 67.992 146.782 68 152v56c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-18.55L110.24 215c2.257 3.143 5.891 5.004 9.76 5 1.242-.002 2.476-.194 3.66-.57 4.969-1.591 8.341-6.212 8.34-11.43v-56c0-6.627-5.373-12-12-12ZM164 140c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-56c0-6.627-5.373-12-12-12ZM220 88v136c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-120h-48c-6.627 0-12-5.373-12-12v-48h-76v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-68C36 28.954 44.954 20 56 20h96c3.185 0 6.239 1.266 8.49 3.52l56 56c2.247 2.25 3.51 5.3 3.51 8.48ZM160 80h23L160 57Z"),
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
