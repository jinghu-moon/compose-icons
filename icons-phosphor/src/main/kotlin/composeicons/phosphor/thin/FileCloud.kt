package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorThinIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.83 85.17l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v88c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-88c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v124c0 2.209-1.791 4-4 4h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c6.627 0 12-5.373 12-12v-128c.001-1.061-.42-2.079-1.17-2.83ZM156 41.65 198.34 84h-42.34ZM108 132c-20.385-.104-38.585 12.753-45.3 32h-2.7c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32h48c26.51 0 48-21.49 48-48 0-26.51-21.49-48-48-48ZM108 220h-48C46.745 220 36 209.255 36 196c0-13.255 10.745-24 24-24h.66c-.2 1.2-.35 2.41-.46 3.64-.199 2.209 1.431 4.161 3.64 4.36 2.209 .199 4.161-1.431 4.36-3.64 .212-2.337 .624-4.653 1.23-6.92 .09-.237 .16-.481 .21-.73 5.819-19.779 25.719-31.895 45.962-27.984 20.243 3.911 34.197 22.569 32.229 43.092C145.863 204.342 128.618 220.007 108 220Z"),
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
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
