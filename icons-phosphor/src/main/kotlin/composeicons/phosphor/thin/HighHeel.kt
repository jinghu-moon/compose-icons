package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorThinIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.09 160.09 178 148.35 66.83 37.17C66.057 36.398 65.002 35.975 63.91 36c-1.091 .025-2.124 .495-2.86 1.3C39.74 60.6 28 90 28 120v72c0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12v-55.64c25.201 12.697 44.949 34.094 55.59 60.23 1.847 4.512 6.254 7.446 11.13 7.41h89.28c6.627 0 12-5.373 12-12v-4.73c.028-13.096-9.106-24.428-21.91-27.18ZM76 192c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4v-67.92c13.742 .457 27.29 3.377 40 8.62ZM244 192c0 2.209-1.791 4-4 4h-89.28c-1.611 .014-3.074-.94-3.71-2.42-9.169-22.582-24.772-41.972-44.87-55.76C82.666 124.369 59.726 116.818 36.07 116.07 37 90.74 46.87 66.07 64.18 45.84L173.18 154.84c.549 .542 1.244 .914 2 1.07l53.22 12c9.125 1.977 15.628 10.063 15.6 19.4Z"),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
