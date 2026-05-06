package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorDuotoneIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 127.82c.09 33.94-28.41 63.3-62.34 64.16-15.108 .422-29.873-4.54-41.66-14-11.784 9.458-26.546 14.42-41.65 14C52.42 191.12 23.91 161.76 24 127.82 24.074 101.756 39.947 78.341 64.13 68.62 73.93 41.798 99.444 23.957 128 23.957c28.556 0 54.07 17.841 63.87 44.663 24.183 9.721 40.056 33.136 40.13 59.2Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M198.1 62.59C186.267 34.337 158.63 15.95 128 15.95c-30.63 0-58.267 18.388-70.1 46.64C32.377 74.256 16.004 99.737 16 127.8 15.9 166 48 199 86.14 200c11.731 .278 23.353-2.307 33.86-7.53v39.53c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-39.53c9.945 4.938 20.896 7.515 32 7.53h1.82C208 199 240.11 166 240 127.8 239.996 99.737 223.623 74.256 198.1 62.59ZM169.45 184c-11.93 .311-23.648-3.192-33.45-10v-41l43.58-21.78c3.954-1.977 5.557-6.786 3.58-10.74-1.977-3.954-6.786-5.557-10.74-3.58L136 115.06v-27.06c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v51.06L83.58 120.84c-3.954-1.977-8.763-.374-10.74 3.58-1.977 3.954-.374 8.763 3.58 10.74L120 156.94v17c-9.799 6.813-21.519 10.316-33.45 10C56.9 183.23 31.92 157.52 32 127.84 31.99 105.003 45.9 84.465 67.11 76c2.103-.845 3.75-2.542 4.53-4.67C80.284 47.658 102.799 31.91 128 31.91c25.201 0 47.716 15.748 56.36 39.42 .78 2.128 2.427 3.825 4.53 4.67 21.21 8.465 35.12 29.003 35.11 51.84 .08 29.68-24.9 55.39-54.55 56.16Z"),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
