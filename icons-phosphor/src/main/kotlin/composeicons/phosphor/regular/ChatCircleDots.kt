package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCircleDots: ImageVector
    get() {
        if (_chatCircleDots != null) return _chatCircleDots!!
        _chatCircleDots = phosphorRegularIcon(
            name = "ChatCircleDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 128c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM84 116c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM172 116c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM232 128c.008 36.523-19.143 70.373-50.453 89.178-31.31 18.805-70.189 19.808-102.427 2.642L45.07 231.17c-5.75 1.918-12.09 .421-16.375-3.865-4.286-4.286-5.782-10.626-3.865-16.375L36.18 176.88C15.859 138.673 21.32 91.875 49.893 59.375 78.466 26.874 124.179 15.463 164.674 30.723 205.169 45.984 231.982 84.725 232 128ZM216 128C215.99 91.003 192.84 57.964 158.069 45.322 123.299 32.68 84.335 43.136 60.565 71.487 36.796 99.838 33.297 140.028 51.81 172.06c1.147 1.985 1.387 4.366 .66 6.54L40 216 77.4 203.53c.815-.278 1.669-.42 2.53-.42 1.405 .002 2.785 .375 4 1.08 27.228 15.754 60.795 15.775 88.044 .056C199.222 188.526 216.007 159.457 216 128Z"),
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
        return _chatCircleDots!!
    }

private var _chatCircleDots: ImageVector? = null
