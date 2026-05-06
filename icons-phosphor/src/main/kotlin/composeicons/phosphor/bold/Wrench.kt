package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorBoldIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.47 67.5c-1.478-3.652-4.654-6.346-8.498-7.208-3.844-.862-7.867 .217-10.762 2.888L172.43 99 159.75 96.28 157 83.57 192.79 44.79c2.671-2.896 3.751-6.918 2.888-10.762-.862-3.844-3.556-7.02-7.208-8.498C160.701 14.351 128.957 20.499 107.368 41.235 85.778 61.972 78.358 93.443 88.41 121.64L30.92 174.18c-.137 .119-.267 .246-.39 .38-13.864 14.091-13.772 36.726 .206 50.704 13.978 13.978 36.612 14.07 50.704 .206l.38-.39 52.54-57.49c28.206 10.08 59.701 2.664 80.447-18.941 20.746-21.605 26.878-53.375 15.663-81.149ZM160 148c-8.109 .024-16.11-1.867-23.35-5.52-4.803-2.421-10.631-1.351-14.26 2.62L64.31 208.66c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l63.55-58.07c3.971-3.629 5.041-9.457 2.62-14.26C109.844 112.092 107.967 104.099 108 96c.033-28.705 23.295-51.967 52-52h.89L135.17 71.87c-2.642 2.867-3.728 6.838-2.91 10.65l5.66 26.35c.992 4.614 4.596 8.218 9.21 9.21l26.35 5.66c3.812 .818 7.783-.268 10.65-2.91L212 95.12c0 .3 0 .59 0 .89-.039 28.701-23.299 51.957-52 51.99Z"),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
