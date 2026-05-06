package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorRegularIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 104c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8ZM104 144h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM232 192c0 17.673-14.327 32-32 32h-112C70.327 224 56 209.673 56 192v-128C56 55.163 48.837 48 40 48 31.163 48 24 55.163 24 64c0 5.74 4.83 9.62 4.88 9.66h0c2.715 2.089 3.798 5.675 2.694 8.917C30.471 85.82 27.425 88 24 88c-1.73 .003-3.413-.563-4.79-1.61h0C18.05 85.54 8 77.61 8 64 8 46.327 22.327 32 40 32h136c17.673 0 32 14.327 32 32v104h8c1.731 0 3.415 .561 4.8 1.6C222 170.46 232 178.39 232 192ZM96.26 173.48c1.121-3.31 4.246-5.522 7.74-5.48h88v-104c0-8.837-7.163-16-16-16h-108.31c2.829 4.857 4.317 10.379 4.31 16v128c0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-5.74-4.83-9.62-4.88-9.66-2.799-2.002-3.96-5.599-2.86-8.86ZM216 192c-.1-2.964-1.244-5.797-3.23-8h-94c.804 2.59 1.212 5.288 1.21 8 .008 5.619-1.472 11.139-4.29 16h84.31c8.837 0 16-7.163 16-16Z"),
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
        return _scroll!!
    }

private var _scroll: ImageVector? = null
