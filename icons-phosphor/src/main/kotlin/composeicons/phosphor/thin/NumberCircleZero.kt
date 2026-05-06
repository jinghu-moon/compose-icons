package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleZero: ImageVector
    get() {
        if (_numberCircleZero != null) return _numberCircleZero!!
        _numberCircleZero = phosphorThinIcon(
            name = "NumberCircleZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM128 76c-12.82 0-23.41 5.81-30.62 16.8C91.33 102 88 114.52 88 128c0 13.48 3.33 26 9.38 35.2 7.21 11 17.8 16.8 30.62 16.8 12.82 0 23.41-5.81 30.62-16.8 6-9.22 9.38-21.72 9.38-35.2 0-13.48-3.33-26-9.38-35.19C151.41 81.81 140.82 76 128 76ZM128 172C105.89 172 96 149.9 96 128c0-21.9 9.89-44 32-44 22.11 0 32 22.1 32 44 0 21.9-9.89 44-32 44Z"),
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
        return _numberCircleZero!!
    }

private var _numberCircleZero: ImageVector? = null
