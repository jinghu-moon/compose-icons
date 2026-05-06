package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) return _numberSquareZero!!
        _numberSquareZero = phosphorLightIcon(
            name = "NumberSquareZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 74c-13.52 0-24.69 6.12-32.29 17.71C89.45 101.24 86 114.13 86 128c0 13.87 3.45 26.76 9.7 36.29C103.31 175.88 114.47 182 128 182c13.53 0 24.69-6.12 32.29-17.71C166.55 154.76 170 141.87 170 128c0-13.87-3.45-26.76-9.7-36.29C152.69 80.12 141.52 74 128 74ZM128 170C107.28 170 98 148.91 98 128c0-20.91 9.28-42 30-42 20.72 0 30 21.09 30 42 0 20.91-9.28 42-30 42ZM208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2Z"),
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
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
