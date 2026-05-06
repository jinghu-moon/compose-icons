package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareSix: ImageVector
    get() {
        if (_numberSquareSix != null) return _numberSquareSix!!
        _numberSquareSix = phosphorLightIcon(
            name = "NumberSquareSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM128 114c-1.876 .004-3.749 .161-5.6 .47L141.15 83.08c1.701-2.844 .774-6.529-2.07-8.23-2.844-1.701-6.529-.774-8.23 2.07l-32.24 54c-7.735 13.314-5.557 30.165 5.309 41.074 10.866 10.91 27.708 13.154 41.053 5.472 13.345-7.683 19.86-23.374 15.882-38.25C156.876 124.341 143.398 113.996 128 114ZM128 170c-12.15 0-22-9.85-22-22 0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22Z"),
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
        return _numberSquareSix!!
    }

private var _numberSquareSix: ImageVector? = null
