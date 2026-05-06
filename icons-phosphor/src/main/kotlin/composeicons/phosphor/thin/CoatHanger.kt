package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorThinIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.18 174.4 134.67 96 162.39 75.2c1.011-.753 1.608-1.939 1.61-3.2C164 52.118 147.882 36 128 36 108.118 36 92 52.118 92 72c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 .06-15.031 11.978-27.333 26.999-27.87 15.021-.537 27.787 10.882 28.921 25.87L125.66 92.7l-.14 .1L16.82 174.4c-4.129 3.097-5.816 8.487-4.187 13.385 1.628 4.898 6.206 8.206 11.367 8.215h208c5.165 0 9.751-3.305 11.384-8.205 1.633-4.9-.052-10.296-4.184-13.395ZM235.77 185.27c-.511 1.646-2.046 2.759-3.77 2.73h-208c-1.722 0-3.25-1.102-3.795-2.735-.544-1.633 .017-3.432 1.395-4.465L128 101l106.38 79.8c1.411 1.011 1.979 2.837 1.39 4.47Z"),
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
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
