package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) return _eyeSlash!!
        _eyeSlash = phosphorDuotoneIcon(
            name = "EyeSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 56C48 56 16 128 16 128c0 0 32 72 112 72 80 0 112-72 112-72 0 0-32-72-112-72ZM128 168C105.909 168 88 150.091 88 128c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L61.32 66.55C25 88.84 9.38 123.2 8.69 124.76c-.92 2.069-.92 4.431 0 6.5 .35 .79 8.82 19.57 27.65 38.4C61.43 194.74 93.12 208 128 208c17.926 .102 35.671-3.589 52.07-10.83l22 24.21c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM101.25 110.46l41.67 45.85c-12.907 6.79-28.771 3.994-38.58-6.798C94.532 138.72 93.261 122.661 101.25 110.46ZM128 192C97.22 192 70.33 180.81 48.07 158.75 38.933 149.67 31.162 139.312 25 128 29.69 119.21 44.66 94.61 72.35 78.62l18 19.75c-14.388 18.427-13.407 44.539 2.322 61.835 15.729 17.296 41.632 20.744 61.338 8.165l14.73 16.2C155.74 189.558 141.924 192.077 128 192ZM134 96.57c-4.341-.828-7.188-5.019-6.36-9.36 .828-4.341 5.019-7.188 9.36-6.36 20.94 4.06 36.715 21.409 38.77 42.64 .411 4.399-2.821 8.298-7.22 8.71-.25 .015-.5 .015-.75 0-4.145 .018-7.617-3.133-8-7.26C158.417 110.82 147.926 99.283 134 96.57ZM247.28 131.26c-.42 .94-10.55 23.37-33.36 43.8-2.121 1.96-5.135 2.625-7.884 1.739-2.749-.886-4.807-3.185-5.385-6.015-.577-2.83 .416-5.752 2.598-7.644C214.441 153.086 223.841 141.204 231.05 128 224.874 116.678 217.086 106.313 207.93 97.23 185.67 75.19 158.78 64 128 64c-6.485-.008-12.961 .517-19.36 1.57-2.832 .501-5.715-.557-7.551-2.77C99.253 60.586 98.747 57.558 99.762 54.867c1.016-2.691 3.397-4.629 6.238-5.077 7.272-1.201 14.63-1.799 22-1.79 34.88 0 66.57 13.26 91.66 38.35 18.83 18.83 27.3 37.62 27.65 38.41 .92 2.069 .92 4.431 0 6.5Z"),
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
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
