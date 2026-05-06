package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Binary: ImageVector
    get() {
        if (_binary != null) return _binary!!
        _binary = phosphorThinIcon(
            name = "Binary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M94 28C83.08 28 74.07 33 67.92 42.31 62.81 50.09 60 60.64 60 72c0 11.36 2.81 21.91 7.92 29.7C74.07 111.05 83.08 116 94 116c10.92 0 19.93-5 26.08-14.3C125.19 93.91 128 83.37 128 72c0-11.37-2.81-21.91-7.92-29.69C113.93 33 104.92 28 94 28ZM94 108C76 108 68 89.92 68 72 68 54.08 76 36 94 36c18 0 26 18.08 26 36 0 17.92-8 36-26 36ZM192.08 154.31C185.93 145 176.92 140 166 140c-10.92 0-19.93 4.95-26.08 14.31C134.81 162.09 132 172.64 132 184c0 11.36 2.81 21.91 7.92 29.7C146.07 223.05 155.08 228 166 228c10.92 0 19.93-4.95 26.08-14.3C197.19 205.91 200 195.37 200 184c0-11.37-2.81-21.91-7.92-29.69ZM166 220c-18 0-26-18.08-26-36 0-17.92 8-36 26-36 18 0 26 18.08 26 36 0 17.92-8 36-26 36ZM148.5 47.28c-.515-.928-.64-2.023-.347-3.043 .293-1.02 .979-1.883 1.907-2.397l24-13.34c1.239-.687 2.75-.668 3.971 .052 1.221 .719 1.97 2.031 1.969 3.448v80c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-73.2l-18.06 10c-1.922 1.079-4.355 .399-5.44-1.52ZM100 144v80c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-73.2l-18.06 10c-1.933 1.071-4.369 .373-5.44-1.56-1.071-1.933-.373-4.369 1.56-5.44l24-13.34c1.246-.691 2.764-.667 3.988 .062 1.224 .729 1.967 2.054 1.952 3.478Z"),
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
        return _binary!!
    }

private var _binary: ImageVector? = null
