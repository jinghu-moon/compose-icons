package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) return _numberSquareEight!!
        _numberSquareEight = phosphorLightIcon(
            name = "NumberSquareEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM146.57 123.54c10.038-7.911 13.961-21.313 9.775-33.389C152.158 78.076 140.781 69.978 128 69.978c-12.781 0-24.158 8.097-28.345 20.173-4.187 12.076-.263 25.478 9.775 33.389-12.604 8.218-18.308 23.744-14.021 38.167 4.287 14.423 17.544 24.314 32.591 24.314 15.047 0 28.304-9.89 32.591-24.314 4.287-14.423-1.417-29.949-14.021-38.167ZM110 100c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18ZM128 174c-12.15 0-22-9.85-22-22 0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22Z"),
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
        return _numberSquareEight!!
    }

private var _numberSquareEight: ImageVector? = null
