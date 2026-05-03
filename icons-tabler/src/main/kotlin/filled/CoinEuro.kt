package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinEuro: ImageVector
    get() {
        if (_coinEuro != null) return _coinEuro!!
        _coinEuro = tablerFilledIcon(
            name = "CoinEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 12.000 6.000 C 9.948 6.000 8.232 7.449 7.451 9.500 L 7.000 9.500 C 6.471 9.501 6.034 9.913 6.003 10.441 C 5.972 10.970 6.358 11.431 6.883 11.493 L 7.017 11.500 C 6.994 11.833 6.994 12.167 7.017 12.500 L 7.000 12.500 C 6.448 12.500 6.000 12.948 6.000 13.500 C 6.000 14.052 6.448 14.500 7.000 14.500 L 7.452 14.500 C 8.232 16.553 9.948 18.000 12.000 18.000 C 13.141 18.000 14.217 17.543 15.084 16.730 C 15.487 16.352 15.508 15.719 15.130 15.316 C 14.752 14.913 14.119 14.892 13.716 15.270 C 13.207 15.748 12.614 16.000 12.000 16.000 C 11.078 16.000 10.224 15.422 9.665 14.501 L 11.000 14.500 C 11.552 14.500 12.000 14.052 12.000 13.500 C 12.000 12.948 11.552 12.500 11.000 12.500 L 9.023 12.500 C 8.992 12.167 8.992 11.833 9.023 11.500 L 11.000 11.500 C 11.552 11.500 12.000 11.052 12.000 10.500 C 12.000 9.948 11.552 9.500 11.000 9.500 L 9.664 9.500 C 10.224 8.579 11.078 8.000 12.000 8.000 C 12.615 8.000 13.208 8.252 13.717 8.730 C 14.120 9.108 14.753 9.087 15.131 8.684 C 15.509 8.281 15.488 7.648 15.085 7.270 C 14.218 6.458 13.142 6.000 12.000 6.000 Z"),
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
        return _coinEuro!!
    }

private var _coinEuro: ImageVector? = null
