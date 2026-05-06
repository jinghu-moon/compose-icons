package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorRegularIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.88 214l-22-176C200.872 29.998 194.065 23.997 186 24h-116C61.935 23.997 55.128 29.998 54.12 38l-22 176c-.574 4.557 .838 9.141 3.876 12.585 3.039 3.444 7.411 5.417 12.004 5.415h40.69c7.32 .001 13.707-4.965 15.51-12.06l23.8-92 23.79 91.94c1.78 7.122 8.179 12.119 15.52 12.12h40.69c4.593 .002 8.965-1.971 12.004-5.415 3.039-3.444 4.45-8.028 3.876-12.585ZM192.9 95.2C181.234 92.522 172.023 83.581 169 72h21ZM186 40l2 16h-120L70 40ZM66 72h21C83.977 83.581 74.766 92.522 63.1 95.2ZM88.69 216h-40.69L61 111.73C82.411 109.457 99.701 93.225 103.32 72h16.68v23ZM167.29 215.94 136 95v-23h16.68c3.619 21.225 20.909 37.457 42.32 39.73L208 216Z"),
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
        return _pants!!
    }

private var _pants: ImageVector? = null
