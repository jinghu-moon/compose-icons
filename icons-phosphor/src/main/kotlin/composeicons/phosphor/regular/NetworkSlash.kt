package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NetworkSlash: ImageVector
    get() {
        if (_networkSlash != null) return _networkSlash!!
        _networkSlash = phosphorRegularIcon(
            name = "NetworkSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 54v-14c0-8.837 7.163-16 16-16h32c8.837 0 16 7.163 16 16v32c0 8.837-7.163 16-16 16h-16.39c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16.39v-32h-32v14c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L117.19 128h-45.19v32h8c8.837 0 16 7.163 16 16v32c0 8.837-7.163 16-16 16h-32c-8.837 0-16-7.163-16-16v-32c0-8.837 7.163-16 16-16h8v-32h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h78.64L42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515ZM80 176h-32v32h32ZM232 112h-68c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h20v22.83c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-22.83h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _networkSlash!!
    }

private var _networkSlash: ImageVector? = null
