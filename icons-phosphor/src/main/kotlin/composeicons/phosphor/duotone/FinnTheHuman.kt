package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) return _finnTheHuman!!
        _finnTheHuman = phosphorDuotoneIcon(
            name = "FinnTheHuman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 48c-13.255 0-24 10.745-24 24h-112C72 58.745 61.255 48 48 48 34.745 48 24 58.745 24 72v80c0 35.346 28.654 64 64 64h80c35.346 0 64-28.654 64-64v-80C232 58.745 221.255 48 208 48ZM200 152c0 17.673-14.327 32-32 32h-80C70.327 184 56 169.673 56 152v-8c0-17.673 14.327-32 32-32h80c17.673 0 32 14.327 32 32Z"),
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
                pathData = parseSvgPathData("M168 104h-80c-22.091 0-40 17.909-40 40v8c0 22.091 17.909 40 40 40h80c22.091 0 40-17.909 40-40v-8c0-22.091-17.909-40-40-40ZM192 152c0 13.255-10.745 24-24 24h-80C74.745 176 64 165.255 64 152v-8c0-13.255 10.745-24 24-24h80c13.255 0 24 10.745 24 24ZM208 40c-14.591 .014-27.332 9.878-31 24h-98C74.997 48.366 59.979 38.159 43.969 40.192 27.959 42.225 15.968 55.861 16 72v80c.044 39.746 32.254 71.956 72 72h80c39.746-.044 71.956-32.254 72-72v-80C240 54.327 225.673 40 208 40ZM224 152c-.033 30.914-25.086 55.967-56 56h-80C57.086 207.967 32.033 182.914 32 152v-80C32 63.163 39.163 56 48 56c8.837 0 16 7.163 16 16 0 4.418 3.582 8 8 8h112c4.418 0 8-3.582 8-8 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM104 148c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM176 148c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
