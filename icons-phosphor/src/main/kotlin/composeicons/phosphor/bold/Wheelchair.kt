package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorBoldIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M255.14 187.54c-2.463-6.152-9.448-9.143-15.6-6.68l-9.75 3.9L202.73 130.63C200.697 126.567 196.543 124.001 192 124h-76v-16h52c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-52v-6.19c15.368-5.797 24.395-21.752 21.449-37.911C134.502 23.74 120.425 11.998 104 11.998c-16.425 0-30.502 11.742-33.449 27.901C67.605 56.058 76.632 72.013 92 77.81v8.88C58.214 95.911 35.103 127.026 36.037 162.036c.934 35.009 25.671 64.848 59.901 72.254 34.23 7.406 69.089-9.538 84.412-41.03 1.934-3.86 1.644-8.462-.757-12.05-2.402-3.588-6.546-5.609-10.852-5.292-4.306 .316-8.11 2.922-9.961 6.822-10.12 20.802-32.765 32.417-55.564 28.501C80.417 207.325 62.947 188.818 60.349 165.832 57.751 142.845 70.65 120.906 92 112v24c0 6.627 5.373 12 12 12h80.58l28.68 57.37c2.793 5.58 9.397 8.089 15.19 5.77l20-8c2.956-1.181 5.322-3.488 6.577-6.414 1.255-2.926 1.295-6.23 .113-9.186ZM104 36c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C98.477 56 94 51.523 94 46c0-5.523 4.477-10 10-10Z"),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
