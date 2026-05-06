package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BellZ: ImageVector
    get() {
        if (_bellZ != null) return _bellZ!!
        _bellZ = phosphorLightIcon(
            name = "BellZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M150 144c0 3.314-2.686 6-6 6h-32c-2.215 .003-4.251-1.214-5.297-3.166-1.046-1.952-.932-4.322 .297-6.164L132.79 102h-20.79c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c2.215-.003 4.251 1.214 5.297 3.166 1.046 1.952 .932 4.322-.297 6.164L123.21 138h20.79c3.314 0 6 2.686 6 6ZM220.11 191c-2.47 4.35-7.097 7.027-12.1 7h-42.49c-3.01 18.37-18.885 31.856-37.5 31.856C109.405 229.856 93.53 216.37 90.52 198h-42.52c-5.009-.011-9.63-2.696-12.12-7.043-2.489-4.347-2.466-9.692 .06-14.017C41.59 167.2 50 139.74 50 104 50 60.922 84.922 26 128 26c43.078 0 78 34.922 78 78 0 35.73 8.42 63.2 14.08 72.94 2.554 4.336 2.566 9.713 .03 14.06ZM153.29 198h-50.58c2.793 11.706 13.255 19.965 25.29 19.965 12.035 0 22.497-8.259 25.29-19.965ZM209.7 183C202.13 170 194 139.68 194 104 194 67.549 164.451 38 128 38 91.549 38 62 67.549 62 104c0 35.69-8.14 66-15.71 79-.357 .619-.357 1.381 0 2 .336 .624 .991 1.01 1.7 1h160.01c.709 .01 1.364-.376 1.7-1 .357-.619 .357-1.381 0-2Z"),
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
        return _bellZ!!
    }

private var _bellZ: ImageVector? = null
