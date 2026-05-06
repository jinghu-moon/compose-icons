package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorThinIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.38 132.91 166.66 112.67C159.233 110.176 153.191 104.685 150 97.53L126.69 43.12c-2.562-5.761-9.145-8.557-15.07-6.4L35.9 64.25C31.157 65.974 27.999 70.483 28 75.53v116.47c0 6.627 5.373 12 12 12h200c6.627 0 12-5.373 12-12v-24.94c-.002-15.496-9.919-29.252-24.62-34.15ZM38.63 71.77 114.35 44.24c.438-.163 .903-.244 1.37-.24 1.559 0 2.975 .905 3.63 2.32L128.17 67l-25.54 9.29c-1.757 .706-2.779 2.547-2.448 4.412 .331 1.865 1.925 3.241 3.818 3.298 .467-.002 .93-.083 1.37-.24l25.95-9.44 7.89 18.44-20.58 7.48c-1.826 .663-2.912 2.542-2.574 4.455 .338 1.913 2.002 3.307 3.944 3.305 .467-.002 .93-.083 1.37-.24l21-7.64 .25 .6c2.876 6.442 7.576 11.9 13.52 15.7l-21.5 7.82c-1.825 .662-2.91 2.539-2.575 4.451 .335 1.912 1.994 3.307 3.935 3.309 .467-.002 .93-.083 1.37-.24l29.3-10.66 58.18 19.4c10.38 3.45 17.8 12.628 19 23.5h-207.85v-88.47c-.001-1.682 1.05-3.184 2.63-3.76ZM240 196h-200c-2.209 0-4-1.791-4-4v-20h208v20c0 2.209-1.791 4-4 4Z"),
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
