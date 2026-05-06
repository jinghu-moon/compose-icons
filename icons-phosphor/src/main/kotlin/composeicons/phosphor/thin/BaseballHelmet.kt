package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorThinIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 132c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24ZM88 172c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM248 124h-28.08C217.742 69.594 172.438 26.93 118 28.019 63.561 29.108 20 73.551 20 128v24c.039 37.539 30.461 67.961 68 68h40c37.539-.039 67.961-30.461 68-68v-20h52c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM188 152c-.039 33.121-26.879 59.961-60 60h-8c22.148-11.83 35.985-34.891 36-60v-20h32ZM152 124c-2.209 0-4 1.791-4 4v24c0 33.137-26.863 60-60 60C54.863 212 28 185.137 28 152v-24C28.037 77.996 68.007 37.177 117.999 36.09c49.992-1.087 91.7 37.955 93.911 87.91Z"),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
