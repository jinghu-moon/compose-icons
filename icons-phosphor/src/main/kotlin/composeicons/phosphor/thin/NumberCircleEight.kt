package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) return _numberCircleEight!!
        _numberCircleEight = phosphorThinIcon(
            name = "NumberCircleEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM142.9 123.69c10.565-6.64 15.46-19.469 12.005-31.459C151.45 80.24 140.478 71.984 128 71.984c-12.478 0-23.45 8.257-26.905 20.247-3.455 11.99 1.441 24.819 12.005 31.459-13.025 6.853-19.696 21.706-16.166 35.993 3.529 14.288 16.349 24.326 31.066 24.326 14.717 0 27.537-10.038 31.066-24.326 3.529-14.288-3.142-29.141-16.166-35.993ZM108 100c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20ZM128 176c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
