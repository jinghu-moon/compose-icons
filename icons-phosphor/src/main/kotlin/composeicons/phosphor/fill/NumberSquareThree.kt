package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) return _numberSquareThree!!
        _numberSquareThree = phosphorFillIcon(
            name = "NumberSquareThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM124 184c-9.681 .031-18.96-3.871-25.71-10.81-2.129-2.014-2.986-5.031-2.235-7.863 .751-2.832 2.992-5.027 5.839-5.721 2.847-.694 5.846 .225 7.816 2.394 6.353 6.482 16.274 7.873 24.165 3.388 7.891-4.485 11.772-13.72 9.455-22.495C141.012 134.118 133.076 128.003 124 128c-2.983-.001-5.718-1.661-7.095-4.308-1.377-2.646-1.167-5.839 .545-8.282L136.63 88h-32.63c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c2.983 .001 5.718 1.661 7.095 4.308 1.377 2.646 1.167 5.839-.545 8.282l-21 30c16.034 6.434 25.236 23.351 21.926 40.308C156.166 171.854 141.276 184.069 124 184Z"),
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
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
