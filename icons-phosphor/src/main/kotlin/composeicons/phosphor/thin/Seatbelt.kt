package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorThinIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 108c22.091 0 40-17.909 40-40C168 45.909 150.091 28 128 28 105.909 28 88 45.909 88 68c0 22.091 17.909 40 40 40ZM128 36c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C110.327 100 96 85.673 96 68 96 50.327 110.327 36 128 36ZM204 224c0 2.209-1.791 4-4 4h-144c-1.664 .002-3.156-1.027-3.745-2.584-.589-1.557-.153-3.315 1.095-4.416L156.35 130.16c-19.305-8.839-41.63-8.153-60.356 1.854C77.268 142.02 64.291 160.199 60.91 181.16c-.309 1.938-1.978 3.365-3.94 3.37-.214-.001-.428-.018-.64-.05-1.051-.165-1.994-.742-2.619-1.603-.625-.861-.881-1.936-.711-2.987 3.881-24.029 19.037-44.745 40.763-55.719 21.726-10.974 47.394-10.878 69.037 .259L189.35 101c1.657-1.464 4.186-1.307 5.65 .35 1.464 1.657 1.307 4.186-.35 5.65L66.58 220h133.42c2.209 0 4 1.791 4 4ZM190.44 148.67c8.857 12.711 13.591 27.838 13.56 43.33 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 .03-13.862-4.204-27.397-12.13-38.77-.859-1.172-1.014-2.718-.406-4.038 .608-1.32 1.885-2.206 3.334-2.314 1.449-.108 2.843 .578 3.641 1.793Z"),
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
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
