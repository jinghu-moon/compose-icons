package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorBoldIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.38 210C220.67 185.937 199.261 167.188 173.6 156.77c26.17-19.628 36.845-53.799 26.5-84.833C189.755 40.903 160.713 19.97 128 19.97c-32.713 0-61.755 20.933-72.1 51.967-10.345 31.034 .33 65.206 26.5 84.833C56.739 167.188 35.33 185.937 21.62 210c-2.313 3.719-2.416 8.404-.268 12.221 2.148 3.817 6.205 6.161 10.585 6.115 4.38-.046 8.387-2.475 10.454-6.337C60.51 190.68 92.51 172 128 172c35.49 0 67.49 18.69 85.61 50 3.42 5.499 10.586 7.293 16.193 4.053 5.607-3.24 7.633-10.344 4.577-16.053ZM76 96C76 67.281 99.281 44 128 44c28.719 0 52 23.281 52 52 0 28.719-23.281 52-52 52C99.295 147.967 76.033 124.705 76 96Z"),
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
        return _user!!
    }

private var _user: ImageVector? = null
