package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Guitar: ImageVector
    get() {
        if (_guitar != null) return _guitar!!
        _guitar = phosphorBoldIcon(
            name = "Guitar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92.49 187.5c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0l-24-24c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0ZM112 120c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24ZM252.49 60.48c-3.729 3.735-9.459 4.595-14.12 2.12L182 119c2.61 5.96 4.412 12.243 5.36 18.68 2.51 17.58-2.2 33.35-13.27 44.42-4.481 4.474-9.836 7.976-15.73 10.29-1.509 .753-2.442 2.314-2.39 4-.53 15.61-6.16 29.22-16.28 39.34C129 246.37 114.5 252 98.13 252c-3.604-.007-7.203-.267-10.77-.78C67.89 248.44 48.63 238.37 33.13 222.87 17.63 207.37 7.56 188.11 4.78 168.64 1.78 147.89 7.34 129.3 20.33 116.31 30.45 106.19 44.06 100.56 59.67 100c1.686 .052 3.247-.881 4-2.39C65.978 91.729 69.471 86.385 73.93 81.91 85 70.84 100.77 66.13 118.35 68.64c6.427 .95 12.699 2.753 18.65 5.36L193.4 17.63C190.594 12.38 192.061 5.866 196.847 2.326c4.786-3.54 11.444-3.036 15.643 1.184l40 40c4.686 4.686 4.686 12.284 0 16.97ZM221 46 210 35 191 54l11 11ZM146.69 109.28C135.53 98.09 121.39 92 109.34 92c-7.29 0-13.81 2.21-18.44 6.85-2.141 2.175-3.809 4.77-4.9 7.62C81.742 116.873 71.718 123.759 60.48 124h0c-6.57 .22-15.93 2-23.18 9.26-7.52 7.52-10.63 18.87-8.76 32 2.05 14.37 9.71 28.81 21.56 40.66 11.85 11.85 26.29 19.51 40.66 21.56 13.09 1.87 24.44-1.24 32-8.76 7.25-7.25 9-16.61 9.26-23.18 .23-11.241 7.108-21.273 17.51-25.54 2.843-1.107 5.427-2.788 7.59-4.94 12.31-12.27 7.55-37.83-10.4-55.78ZM169 98.07 185 82 174 71 157.93 87c2 1.67 3.9 3.42 5.76 5.27 1.86 1.85 3.6 3.82 5.31 5.8Z"),
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
        return _guitar!!
    }

private var _guitar: ImageVector? = null
