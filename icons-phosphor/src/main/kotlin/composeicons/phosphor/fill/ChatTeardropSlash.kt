package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorFillIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L188.51 206.46C171.891 217.908 152.18 224.025 132 224h-84c-8.837 0-16-7.163-16-16v-84C31.978 100.564 40.225 77.872 55.29 59.92L42.08 45.38C40.625 43.779 39.88 41.657 40.016 39.498c.136-2.159 1.14-4.171 2.784-5.578 3.424-2.774 8.426-2.355 11.34 .95ZM208.35 180.71c.818 .901 2.002 1.38 3.216 1.302 1.214-.078 2.327-.704 3.024-1.702C240.581 142.082 236.983 91.022 205.887 56.817 174.792 22.612 124.304 14.179 83.78 36.42c-1.063 .597-1.796 1.646-1.99 2.849-.195 1.203 .17 2.43 .99 3.331Z"),
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
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
