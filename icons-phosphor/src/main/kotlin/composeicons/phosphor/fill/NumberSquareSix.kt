package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSquareSix: ImageVector
    get() {
        if (_numberSquareSix != null) return _numberSquareSix!!
        _numberSquareSix = phosphorFillIcon(
            name = "NumberSquareSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 148c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM164 148c0-19.882-16.118-36-36-36-.61 0-1.22 0-1.82 0L142.87 84.1c2.264-3.794 1.024-8.706-2.77-10.97-3.794-2.264-8.706-1.024-10.97 2.77 0 0-32.4 54.28-32.47 54.42-7.429 13.144-5.868 29.527 3.911 41.031 9.779 11.504 25.697 15.683 39.866 10.467C154.606 176.602 164.014 163.098 164 148Z"),
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
