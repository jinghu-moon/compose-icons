package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorThinIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 28c-2.209 0-4 1.791-4 4v26.13C166.451 34.592 138.78 23.091 112.539 30.09 86.297 37.088 68.029 60.841 68 88v24c.029 27.159 18.297 50.912 44.539 57.91 26.242 6.999 53.912-4.503 67.461-28.04v26.13c-.033 28.705-23.295 51.967-52 52-17.72 0-35.28-8.75-44.72-22.29-1.265-1.812-3.759-2.255-5.57-.99-1.811 1.265-2.255 3.758-.99 5.57C87.61 217.91 107.74 228 128 228c33.121-.039 59.961-26.879 60-60v-136c0-2.209-1.791-4-4-4ZM128 164C99.295 163.967 76.033 140.705 76 112v-24C76 59.281 99.281 36 128 36c28.719 0 52 23.281 52 52v24c-.033 28.705-23.295 51.967-52 52Z"),
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
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
