package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = phosphorThinIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 64C220.001 49.056 208.267 36.744 193.339 36.029c-14.927-.715-27.785 10.419-29.211 25.295-1.426 14.876 9.081 28.251 23.872 30.385v20.29c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12v-20.29C82.535 89.612 92.98 76.64 91.928 61.992 90.876 47.344 78.686 35.997 64 35.997c-14.686 0-26.876 11.347-27.928 25.995C35.02 76.64 45.465 89.612 60 91.71v20.29c0 11.046 8.954 20 20 20h44v32.29c-14.535 2.098-24.98 15.07-23.928 29.718 1.052 14.648 13.242 25.995 27.928 25.995 14.686 0 26.876-11.347 27.928-25.995C156.98 179.36 146.535 166.388 132 164.29v-32.29h44c11.046 0 20-8.954 20-20v-20.29C209.775 89.722 219.999 77.918 220 64ZM44 64C44 52.954 52.954 44 64 44c11.046 0 20 8.954 20 20C84 75.046 75.046 84 64 84 52.954 84 44 75.046 44 64ZM148 192c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM192 84C180.954 84 172 75.046 172 64c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
