package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareEight: ImageVector
    get() {
        if (_numberSquareEight != null) return _numberSquareEight!!
        _numberSquareEight = phosphorThinIcon(
            name = "NumberSquareEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM142.9 123.69c10.565-6.64 15.46-19.469 12.005-31.459C151.45 80.24 140.478 71.984 128 71.984c-12.478 0-23.45 8.257-26.905 20.247-3.455 11.99 1.441 24.819 12.005 31.459-13.025 6.853-19.696 21.706-16.166 35.993 3.529 14.288 16.349 24.326 31.066 24.326 14.717 0 27.537-10.038 31.066-24.326 3.529-14.288-3.142-29.141-16.166-35.993ZM108 100c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20ZM128 176c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
