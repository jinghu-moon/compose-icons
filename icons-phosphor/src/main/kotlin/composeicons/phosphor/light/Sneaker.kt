package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorLightIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 131 167.27 110.76c-6.9-2.293-12.525-7.37-15.51-14L128.51 42.31c-2.987-6.717-10.66-9.979-17.57-7.47L35.22 62.37C29.694 64.393 26.014 69.645 26 75.53v116.47c0 7.732 6.268 14 14 14h200c7.732 0 14-6.268 14-14v-24.94C254.002 150.696 243.527 136.168 228 131ZM39.32 73.65 115 46.12c.217-.083 .448-.124 .68-.12 .759 0 1.452 .43 1.79 1.11l8 18.68L102 74.36c-2.73 .991-4.359 3.794-3.867 6.656 .492 2.862 2.963 4.961 5.867 4.984 .683-.007 1.36-.132 2-.37l24.18-8.79 6.31 14.76L118 98.36c-2.73 .991-4.359 3.794-3.867 6.656 .492 2.862 2.963 4.961 5.867 4.984 .682-.008 1.358-.13 2-.36l19.26-7c2.486 5.142 6.099 9.657 10.57 13.21L134 122.36c-2.73 .991-4.359 3.794-3.867 6.656 .492 2.862 2.963 4.961 5.867 4.984 .699-.003 1.392-.124 2.05-.36l28.64-10.42 57.53 19.18c8.866 2.946 15.463 10.433 17.27 19.6h-203.49v-86.47c0-.842 .528-1.594 1.32-1.88ZM240 194h-200c-1.105 0-2-.895-2-2v-18h204v18c0 1.105-.895 2-2 2Z"),
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
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
