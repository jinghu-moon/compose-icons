package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) return _pencilSlash!!
        _pencilSlash = phosphorDuotoneIcon(
            name = "PencilSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.66 90.34 192 120 136 64 165.66 34.34c3.124-3.122 8.186-3.122 11.31 0L221.66 79c1.508 1.501 2.356 3.542 2.356 5.67 0 2.128-.848 4.169-2.356 5.67Z"),
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
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L90.28 98.38 36.68 152c-3.008 2.994-4.693 7.066-4.68 11.31v44.69c0 8.837 7.163 16 16 16h44.69c4.246 .014 8.32-1.676 11.31-4.69l50.4-50.39 47.69 52.46c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM116.92 127.74 68 176.69 51.31 160l49.75-49.74ZM48 179.31 76.69 208h-28.69ZM96 204.69 79.32 188l48.41-48.41 15.89 17.48ZM227.32 73.37 182.63 28.69c-3.001-3.001-7.071-4.688-11.315-4.688-4.244 0-8.314 1.686-11.315 4.688L118.33 70.36c-3.123 3.126-3.121 8.192 .005 11.315 3.126 3.123 8.192 3.121 11.315-.005L136 75.31 152.69 92 145 99.69c-2.107 2.002-2.963 4.99-2.235 7.804 .728 2.814 2.926 5.012 5.74 5.74 2.814 .728 5.802-.127 7.804-2.235L164 103.31 180.69 120l-9 9c-3.131 3.123-3.138 8.194-.015 11.325 3.123 3.131 8.194 3.138 11.325 .015L227.32 96c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM192 108.69 147.32 64l24-24L216 84.69Z"),
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
        return _pencilSlash!!
    }

private var _pencilSlash: ImageVector? = null
