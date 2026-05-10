package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorFillIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM187.43 153.07c3.138 1.81 4.668 5.502 3.731 9-.937 3.499-4.108 5.931-7.731 5.93-1.405 .004-2.785-.365-4-1.07L136 141.86v50.14c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-50.14L76.57 166.93c-3.825 2.203-8.712 .892-10.92-2.93-2.212-3.825-.904-8.718 2.92-10.93L112 128 68.57 102.93C64.743 100.721 63.431 95.827 65.64 92c2.209-3.827 7.103-5.139 10.93-2.93L120 114.14v-50.14c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v50.14L179.43 89.07c3.827-2.209 8.721-.897 10.93 2.93 2.209 3.827 .897 8.721-2.93 10.93L144 128Z"),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
