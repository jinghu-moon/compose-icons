package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellSimpleSlash: ImageVector
    get() {
        if (_bellSimpleSlash != null) return _bellSimpleSlash!!
        _bellSimpleSlash = phosphorFillIcon(
            name = "BellSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.84 192h0c-.3 .517-.832 .857-1.428 .913-.596 .056-1.181-.18-1.572-.633L83.27 43.19c-.771-.869-1.126-2.031-.973-3.183 .154-1.152 .801-2.18 1.773-2.817C97.432 28.352 113.151 23.755 129.17 24 173 24.66 207.8 61.1 208 104.92c.14 34.88 8.31 61.54 13.82 71 2.918 4.961 2.926 11.112 .02 16.08ZM160 216h-63.78c-4.268-.032-7.845 3.219-8.22 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h63.74c4.283 .053 7.884-3.203 8.26-7.47 .147-2.212-.631-4.386-2.147-6.003C164.336 216.91 162.217 215.995 160 216ZM53.84 34.62C51.928 32.465 49.005 31.504 46.187 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L58.79 63.85C51.668 76.031 47.919 89.89 47.93 104c0 35.09-8.15 62-13.7 71.73-3.007 5.162-2.972 11.55 .09 16.68 2.88 4.744 8.041 7.626 13.59 7.59h134.71l19.45 21.38c2.971 3.272 8.033 3.516 11.305 .545 3.272-2.971 3.516-8.033 .545-11.305Z"),
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
        return _bellSimpleSlash!!
    }

private var _bellSimpleSlash: ImageVector? = null
