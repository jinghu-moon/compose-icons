package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandsPraying: ImageVector
    get() {
        if (_handsPraying != null) return _handsPraying!!
        _handsPraying = phosphorBoldIcon(
            name = "HandsPraying",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.15 177.18 202.62 141.65 166.45 22.3C164.123 14.59 158.323 8.413 150.775 5.606 143.226 2.799 134.799 3.685 128 8 121.201 3.685 112.774 2.799 105.225 5.606 97.677 8.413 91.877 14.59 89.55 22.3L53.38 141.65 17.85 177.18c-7.808 7.81-7.808 20.47 0 28.28l32.69 32.69c7.81 7.808 20.47 7.808 28.28 0l48.29-48.28c.31-.31 .6-.62 .89-.94 .29 .32 .58 .63 .89 .94l48.29 48.28c7.81 7.808 20.47 7.808 28.28 0l32.69-32.69c7.808-7.81 7.808-20.47 0-28.28ZM64.68 218.35l-27-27 11-11 27 27ZM116 158.75c.015 5.307-2.095 10.4-5.86 14.14L92.68 190.35l-27-27 6.83-6.83c1.398-1.393 2.429-3.111 3-5l37-122.23c.26-.839 1.094-1.363 1.963-1.233 .869 .13 1.513 .874 1.517 1.753ZM163.5 190.53 145.86 172.89c-3.765-3.74-5.875-8.833-5.86-14.14v-129c.004-.879 .648-1.623 1.517-1.753 .869-.13 1.703 .394 1.963 1.233l37 122.23c.571 1.889 1.602 3.607 3 5l7.6 7.6ZM191.32 218.35 180.47 207.51l27.63-26.44 10.25 10.25Z"),
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
        return _handsPraying!!
    }

private var _handsPraying: ImageVector? = null
