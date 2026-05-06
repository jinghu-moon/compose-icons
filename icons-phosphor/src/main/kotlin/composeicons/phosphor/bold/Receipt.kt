package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorBoldIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M68 100C68 93.373 73.373 88 80 88h96c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12ZM80 152h96c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-96c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM236 56v152c-0 4.159-2.155 8.022-5.693 10.208-3.539 2.186-7.957 2.384-11.677 .522L192 205.42l-26.63 13.31c-3.38 1.691-7.36 1.691-10.74 0L128 205.42l-26.63 13.31c-3.38 1.691-7.36 1.691-10.74 0L64 205.42 37.37 218.73c-3.72 1.861-8.138 1.664-11.677-.522C22.155 216.022 20 212.159 20 208v-152C20 44.954 28.954 36 40 36h176c11.046 0 20 8.954 20 20ZM212 60h-168v128.58l14.63-7.31c3.38-1.691 7.36-1.691 10.74 0L96 194.58l26.63-13.31c3.38-1.691 7.36-1.691 10.74 0L160 194.58l26.63-13.31c3.38-1.691 7.36-1.691 10.74 0L212 188.58Z"),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
