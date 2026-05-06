package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorRegularIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M83.25 40c0-4.418 3.582-8 8-8h100.75c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-6.46l18.75 106.3c.763 4.345-2.136 8.488-6.48 9.26-.462 .087-.93 .13-1.4 .13-3.879-.004-7.196-2.79-7.87-6.61L169.29 48h-78c-2.129 .011-4.174-.828-5.683-2.329C84.098 44.17 83.25 42.129 83.25 40ZM213.38 221.92c-3.27 2.971-8.329 2.729-11.3-.54L168.1 184h-32.1v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-56h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h9.29L66.24 72 42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515l160 176c2.971 3.27 2.729 8.329-.54 11.3ZM153.55 168 79.84 86.92 65.54 168Z"),
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
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
