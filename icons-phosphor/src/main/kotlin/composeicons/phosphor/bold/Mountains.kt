package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorBoldIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 80c17.673 0 32-14.327 32-32C192 30.327 177.673 16 160 16c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM160 40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM254.32 193.88 199.76 101.8C196.179 95.7 189.623 91.967 182.55 92h0c-7.07-.033-13.624 3.701-17.2 9.8l-18.7 31.55L109.23 69.85C105.634 63.75 99.081 60.005 92 60.005c-7.081 0-13.634 3.744-17.23 9.845L1.66 193.91c-2.185 3.71-2.215 8.307-.078 12.045C3.718 209.693 7.694 212 12 212h232c4.312-.001 8.291-2.315 10.425-6.061 2.134-3.747 2.094-8.35-.105-12.059ZM92 87.87 108.57 116h-33.14ZM33 188 61.28 140h61.44L151 188ZM178.86 188 160.56 157l22-37.1L222.94 188Z"),
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
        return _mountains!!
    }

private var _mountains: ImageVector? = null
