package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = phosphorLightIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 128C205.992 102.888 193.882 79.318 173.47 64.69L167.1 29.5C165.891 22.839 160.09 17.998 153.32 18h-50.64C95.91 17.998 90.109 22.839 88.9 29.5L82.53 64.69C62.111 79.313 49.999 102.885 49.999 128c0 25.115 12.113 48.687 32.531 63.31l6.37 35.19c1.209 6.661 7.01 11.502 13.78 11.5h50.64c6.77 .002 12.571-4.839 13.78-11.5l6.37-35.19C193.882 176.682 205.992 153.112 206 128ZM100.71 31.64c.176-.962 1.022-1.656 2-1.64h50.64c.978-.016 1.824 .678 2 1.64l4.56 25.19c-20.257-9.106-43.443-9.106-63.7 0ZM155.29 224.36c-.176 .962-1.022 1.656-2 1.64h-50.61c-.978 .016-1.824-.678-2-1.64L96.12 199.17c20.257 9.106 43.443 9.106 63.7 0ZM128 194C91.549 194 62 164.451 62 128 62 91.549 91.549 62 128 62c36.451 0 66 29.549 66 66-.044 36.433-29.567 65.956-66 66ZM174 128c0 3.314-2.686 6-6 6h-40c-3.314 0-6-2.686-6-6v-40c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v34h34c3.314 0 6 2.686 6 6Z"),
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
        return _watch!!
    }

private var _watch: ImageVector? = null
