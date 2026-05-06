package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) return _bellSlash!!
        _bellSlash = phosphorFillIcon(
            name = "BellSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.84 192h0c-.3 .517-.832 .857-1.428 .913-.596 .056-1.181-.18-1.572-.633L83.27 43.19c-.771-.869-1.126-2.031-.973-3.183 .154-1.152 .801-2.18 1.773-2.817C97.432 28.352 113.151 23.755 129.17 24 173 24.66 207.8 61.1 208 104.92c.14 34.88 8.31 61.54 13.82 71 2.918 4.961 2.926 11.112 .02 16.08ZM213.92 210.62c2.971 3.272 2.727 8.334-.545 11.305-3.272 2.971-8.334 2.727-11.305-.545L182.62 200h-15.46c-3.776 18.654-20.173 32.065-39.205 32.065C108.922 232.065 92.526 218.654 88.75 200h-40.84c-5.549 .036-10.71-2.846-13.59-7.59-3.062-5.13-3.097-11.518-.09-16.68C39.78 166 47.93 139.09 47.93 104 47.919 89.89 51.668 76.031 58.79 63.85L42 45.38C40.037 43.271 39.359 40.27 40.226 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515ZM150.59 200h-45.27c3.384 9.6 12.456 16.021 22.635 16.021 10.179 0 19.251-6.421 22.635-16.021Z"),
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
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
