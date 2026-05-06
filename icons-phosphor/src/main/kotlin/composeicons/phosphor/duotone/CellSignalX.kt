package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorDuotoneIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 40v120l-45.66 45.66c-1.499 1.497-3.531 2.339-5.65 2.34h-116.69c-3.238 .003-6.158-1.947-7.397-4.938-1.239-2.991-.554-6.434 1.737-8.722L186.34 34.34c2.288-2.291 5.731-2.976 8.722-1.737 2.991 1.239 4.94 4.159 4.938 7.397Z"),
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
                pathData = parseSvgPathData("M213.66 194.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L184 187.31l-18.35 18.35c-3.126 3.123-8.192 3.121-11.315-.005-3.123-3.126-3.121-8.192 .005-11.315L172.68 176 154.34 157.65c-2.988-3.145-2.925-8.099 .143-11.167 3.068-3.068 8.022-3.131 11.167-.143L184 164.68l18.34-18.34c3.123-3.126 8.189-3.128 11.315-.005 3.126 3.123 3.128 8.189 .005 11.315L195.31 176ZM120 200h-88L192 40v72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-72c.001-6.471-3.896-12.305-9.873-14.783-5.978-2.478-12.859-1.111-17.437 3.463L20.69 188.68c-4.58 4.575-5.952 11.459-3.476 17.44 2.476 5.981 8.312 9.881 14.786 9.88h88c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
