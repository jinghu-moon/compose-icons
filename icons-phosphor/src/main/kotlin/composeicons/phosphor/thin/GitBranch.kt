package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) return _gitBranch!!
        _gitBranch = phosphorThinIcon(
            name = "GitBranch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 64C228.001 49.056 216.267 36.744 201.339 36.029c-14.927-.715-27.785 10.419-29.211 25.295-1.426 14.876 9.081 28.251 23.872 30.385v20.29c0 6.627-5.373 12-12 12h-88c-4.328-.007-8.541 1.398-12 4v-36.29C98.535 89.612 108.98 76.64 107.928 61.992 106.876 47.344 94.686 35.997 80 35.997c-14.686 0-26.876 11.347-27.928 25.995C51.02 76.64 61.465 89.612 76 91.71v72.58c-14.535 2.098-24.98 15.07-23.928 29.718 1.052 14.648 13.242 25.995 27.928 25.995 14.686 0 26.876-11.347 27.928-25.995C108.98 179.36 98.535 166.388 84 164.29v-20.29c0-6.627 5.373-12 12-12h88c11.046 0 20-8.954 20-20v-20.29C217.775 89.722 227.999 77.918 228 64ZM60 64C60 52.954 68.954 44 80 44c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C68.954 84 60 75.046 60 64ZM100 192c0 11.046-8.954 20-20 20C68.954 212 60 203.046 60 192c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM200 84C188.954 84 180 75.046 180 64c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
