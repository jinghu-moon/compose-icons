package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = tablerFilledIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.013 12.000 L 11.013 21.754 C 6.558 20.313 3.222 16.587 2.280 12.000 L 11.014 12.000 ZM 20.297 15.794 C 18.697 18.617 16.099 20.740 13.014 21.745 L 13.013 12.000 L 21.721 12.000 C 21.448 13.332 20.968 14.612 20.297 15.794 ZM 11.014 2.526 L 11.013 10.000 L 2.027 10.000 C 1.959 8.568 2.128 7.120 2.541 5.718 C 2.671 5.276 3.086 4.980 3.546 5.001 C 6.134 5.119 8.681 4.321 10.738 2.745 L 11.014 2.526 ZM 13.013 10.000 L 13.013 2.547 L 12.923 2.474 C 14.940 4.150 17.490 5.049 20.112 5.011 L 20.454 5.001 C 20.914 4.980 21.329 5.276 21.459 5.718 C 21.872 7.121 22.041 8.568 21.973 10.000 L 13.013 10.000 Z"),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
