package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = phosphorThinIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M161.66 166.34c3.122 3.125 3.12 8.189-.004 11.312-3.124 3.123-8.188 3.123-11.312 0-3.124-3.123-3.126-8.186-.004-11.312 1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346ZM86.34 158.34c-3.122 3.125-3.12 8.189 .004 11.312 3.124 3.123 8.188 3.123 11.312 0 3.124-3.123 3.126-8.186 .004-11.312C96.159 156.838 94.123 155.994 92 155.994c-2.123 0-4.159 .844-5.66 2.346ZM89.66 102.34c-3.125-3.122-8.189-3.12-11.312 .004-3.123 3.124-3.123 8.188 0 11.312 3.123 3.124 8.187 3.126 11.312 .004 1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM126.34 118.34c-3.122 3.125-3.12 8.189 .004 11.312 3.124 3.123 8.188 3.123 11.312 0 3.124-3.123 3.126-8.187 .004-11.312-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346ZM228 128c0 55.228-44.772 100-100 100C72.772 228 28 183.228 28 128 28 72.772 72.772 28 128 28c2.209 0 4 1.791 4 4 .028 24.289 19.711 43.972 44 44 2.209 0 4 1.791 4 4 .028 24.289 19.711 43.972 44 44 2.209 0 4 1.791 4 4ZM219.92 131.84c-25.576-2.046-45.852-22.415-47.78-48-25.585-1.928-45.954-22.204-48-47.78C74.37 38.139 35.296 79.452 35.989 129.26c.693 49.808 40.903 90.017 90.711 90.711 49.808 .693 91.121-38.381 93.2-88.151Z"),
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
        return _cookie!!
    }

private var _cookie: ImageVector? = null
