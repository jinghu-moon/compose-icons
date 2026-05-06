package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorBoldIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 84c19.882 0 36-16.118 36-36C212 28.118 195.882 12 176 12c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36ZM176 36c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM205.28 132.39c2.292 2.789 3.206 6.462 2.49 10l-16 80c-1.137 5.596-6.06 9.615-11.77 9.61-.792 .002-1.583-.075-2.36-.23-3.122-.623-5.868-2.46-7.635-5.109-1.767-2.648-2.409-5.89-1.785-9.011L181.36 152h-57.36c-4.289 .003-8.253-2.283-10.398-5.997-2.145-3.713-2.146-8.289-.002-12.003l17.92-31.2C105.063 90.776 74.068 94.87 51.64 113.35c-5.123 3.954-12.459 3.133-16.581-1.856C30.936 106.506 31.512 99.147 36.36 94.86 70.066 67.049 117.925 64.344 154.55 88.18c5.314 3.475 7.002 10.488 3.85 16L144.74 128h51.26c3.595-0 7 1.611 9.28 4.39ZM163.81 176.91c-2.57 33.337-30.368 59.077-63.804 59.081C66.57 235.994 38.767 210.259 36.19 176.923 33.613 143.587 57.131 113.885 90.17 108.75c6.55-1.011 12.679 3.48 13.69 10.03 1.011 6.55-3.48 12.679-10.03 13.69-20.641 3.222-35.325 21.786-33.71 42.614 1.615 20.828 18.987 36.906 39.877 36.907 20.891 .002 38.264-16.073 39.883-36.901 .29-4.302 2.866-8.118 6.747-9.995 3.882-1.878 8.472-1.529 12.025 .915 3.553 2.443 5.522 6.604 5.158 10.901Z"),
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
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
