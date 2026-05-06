package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorDuotoneIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 40v160c0 4.418-3.582 8-8 8h-160c-3.238 .003-6.158-1.947-7.397-4.938-1.239-2.991-.554-6.434 1.737-8.722L186.34 34.34c2.288-2.291 5.731-2.976 8.722-1.737 2.991 1.239 4.94 4.159 4.938 7.397Z"),
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
                pathData = parseSvgPathData("M213.92 210.62 53.92 34.62C50.949 31.348 45.887 31.104 42.615 34.075c-3.272 2.971-3.516 8.033-.545 11.305l58.07 63.86L20.69 188.68c-4.58 4.575-5.952 11.459-3.476 17.44 2.476 5.981 8.312 9.881 14.786 9.88h160c1.545-.007 3.08-.236 4.56-.68l5.52 6.06c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM32 200l78.9-78.89L182.64 200ZM128.18 92.51c-3.122-3.124-3.122-8.186 0-11.31L180.69 28.7c4.575-4.572 11.451-5.94 17.427-3.467 5.976 2.473 9.876 8.3 9.883 14.767v119.63c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-119.63L139.5 92.51c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346Z"),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
