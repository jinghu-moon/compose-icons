package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) return _finnTheHuman!!
        _finnTheHuman = phosphorThinIcon(
            name = "FinnTheHuman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 108h-80c-19.882 0-36 16.118-36 36v8c0 19.882 16.118 36 36 36h80c19.882 0 36-16.118 36-36v-8c0-19.882-16.118-36-36-36ZM196 152c0 15.464-12.536 28-28 28h-80C72.536 180 60 167.464 60 152v-8c0-15.464 12.536-28 28-28h80c15.464 0 28 12.536 28 28ZM208 44c-13.918 .001-25.722 10.225-27.71 24h-104.58C73.603 53.474 60.635 43.04 45.995 44.091 31.354 45.143 20.01 57.322 20 72v80c.039 37.539 30.461 67.961 68 68h80c37.539-.039 67.961-30.461 68-68v-80C236 56.536 223.464 44 208 44ZM228 152c-.039 33.121-26.879 59.961-60 60h-80C54.879 211.961 28.039 185.121 28 152v-80C28 60.954 36.954 52 48 52c11.046 0 20 8.954 20 20 0 2.209 1.791 4 4 4h112c2.209 0 4-1.791 4-4 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM100 148c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM172 148c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
