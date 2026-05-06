package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CarProfile: ImageVector
    get() {
        if (_carProfile != null) return _carProfile!!
        _carProfile = phosphorBoldIcon(
            name = "CarProfile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 108h-23L170.83 65.86C167.089 62.096 161.997 59.986 156.69 60h-108.41c-6.687 .001-12.932 3.345-16.64 8.91L2 113.34C.691 115.314-.005 117.631 0 120v48c0 11.046 8.954 20 20 20h13.5c4.386 14.272 17.569 24.013 32.5 24.013 14.931 0 28.114-9.741 32.5-24.013h59c4.386 14.272 17.569 24.013 32.5 24.013 14.931 0 28.114-9.741 32.5-24.013h13.5c11.046 0 20-8.954 20-20v-40c0-11.046-8.954-20-20-20ZM50.42 84h104.58l24 24h-144.58ZM66 188c-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM190 188c-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM232 164h-11c-5.493-12.195-17.625-20.036-31-20.036-13.375 0-25.507 7.841-31 20.036h-62C91.507 151.805 79.375 143.964 66 143.964c-13.375 0-25.507 7.841-31 20.036h-11v-32h208Z"),
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
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
