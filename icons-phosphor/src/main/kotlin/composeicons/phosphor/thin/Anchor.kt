package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorThinIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 140c-2.209 0-4 1.791-4 4 0 28.94-19 34.13-41.05 40.14-14.29 3.9-29.82 8.14-38.95 20.24v-80.38h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-36v-32.29c14.535-2.098 24.98-15.07 23.928-29.718C154.876 39.344 142.686 27.997 128 27.997c-14.686 0-26.876 11.347-27.928 25.995C99.02 68.64 109.465 81.612 124 83.71v32.29h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36v80.38C114.87 192.28 99.34 188.04 85.05 184.14 63.05 178.14 44.05 172.94 44.05 144c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 0 35.06 24.94 41.86 47 47.86 22.06 6 40.95 11.2 40.95 40.14 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-28.94 19-34.13 41.05-40.14C195.1 185.85 220 179.06 220 144c0-2.209-1.791-4-4-4ZM108 56c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C116.954 76 108 67.046 108 56Z"),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
