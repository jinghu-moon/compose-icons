package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PhonePause: ImageVector
    get() {
        if (_phonePause != null) return _phonePause!!
        _phonePause = phosphorRegularIcon(
            name = "PhonePause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.36 166.46 167.26 145.35l-.12-.06c-4.971-2.129-10.682-1.602-15.18 1.4-.261 .172-.511 .359-.75 .56L126.87 168C111.45 160.51 95.53 144.71 88.04 129.49l20.78-24.71c.2-.25 .39-.5 .57-.77 2.933-4.482 3.429-10.136 1.32-15.06v-.12L89.54 41.64C86.721 35.135 79.957 31.261 72.92 32.12 44.889 35.809 23.949 59.727 24 88c0 79.4 64.6 144 144 144 28.273 .051 52.191-20.889 55.88-48.92 .859-7.037-3.015-13.801-9.52-16.62ZM168 216C97.34 215.923 40.077 158.66 40 88 39.922 67.799 54.847 50.678 74.87 48c-.004 .04-.004 .08 0 .12l21 47L75.2 119.86c-.21 .241-.4 .499-.57 .77-3.061 4.697-3.44 10.653-1 15.7 9.06 18.53 27.73 37.06 46.46 46.11 5.085 2.418 11.066 1.985 15.75-1.14 .259-.173 .506-.364 .74-.57L160.89 160l47 21.06h0c0 0 .08 0 .11 0-2.65 20.048-19.778 35.009-40 34.94ZM192 104v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM152 104v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
