package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) return _linkBreak!!
        _linkBreak = phosphorFillIcon(
            name = "LinkBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM96 64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM64 96h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM128.08 181.66l-7.21 7.21c-9.593 9.633-23.601 13.407-36.735 9.898C71.001 195.258 60.742 184.999 57.232 171.865c-3.51-13.134 .265-27.142 9.898-36.735l7.21-7.21c3.123-3.126 8.189-3.128 11.315-.005 3.126 3.123 3.128 8.189 .005 11.315l-7.22 7.21c-8.594 8.594-8.594 22.526 0 31.12 8.594 8.594 22.526 8.594 31.12 0l7.21-7.22c3.126-3.123 8.192-3.121 11.315 .005 3.123 3.126 3.121 8.192-.005 11.315ZM160 192c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM192 160h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM188.87 120.87l-7.21 7.21c-3.123 3.126-8.189 3.128-11.315 .005-3.126-3.123-3.128-8.189-.005-11.315l7.22-7.21c8.594-8.594 8.594-22.526 0-31.12-8.594-8.594-22.526-8.594-31.12 0l-7.21 7.22c-3.126 3.123-8.192 3.121-11.315-.005-3.123-3.126-3.121-8.192 .005-11.315l7.21-7.21c9.593-9.633 23.601-13.407 36.735-9.898 13.134 3.51 23.393 13.768 26.902 26.902 3.51 13.134-.265 27.142-9.898 36.735Z"),
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
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
