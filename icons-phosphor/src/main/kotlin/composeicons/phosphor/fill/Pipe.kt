package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pipe: ImageVector
    get() {
        if (_pipe != null) return _pipe!!
        _pipe = phosphorFillIcon(
            name = "Pipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 104h-24v-48h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-26.17C202.977 35.058 197.707 32.009 192 32h-16c-5.707 .009-10.977 3.058-13.83 8h-18.17C86.588 40.061 40.061 86.588 40 144v18.16c-4.945 2.855-7.994 8.13-8 13.84v16c.006 5.71 3.055 10.985 8 13.84v26.16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h48v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-26.16c4.945-2.855 7.994-8.13 8-13.84v-16c-.006-5.71-3.055-10.985-8-13.84v-18.16c0-13.255 10.745-24 24-24h18.17c2.853 4.942 8.123 7.991 13.83 8h16c5.707-.009 10.977-3.058 13.83-8h26.17c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM112 192h-64v-16h64ZM176 112v-64h16v63.8c0 .07 0 .13 0 .2Z"),
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
        return _pipe!!
    }

private var _pipe: ImageVector? = null
