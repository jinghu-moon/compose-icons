package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinRupee: ImageVector
    get() {
        if (_coinRupee != null) return _coinRupee!!
        _coinRupee = tablerFilledIcon(
            name = "CoinRupee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 15.000 7.000 L 9.000 7.000 C 7.713 7.000 7.668 8.864 8.867 8.993 L 9.000 9.000 L 10.000 9.000 C 10.715 9.000 11.375 9.381 11.732 10.000 L 9.000 10.000 C 8.448 10.000 8.000 10.448 8.000 11.000 C 8.000 11.552 8.448 12.000 9.000 12.000 L 11.732 12.001 C 11.374 12.619 10.714 13.000 10.000 13.000 L 9.000 13.000 C 8.110 13.000 7.663 14.077 8.293 14.707 L 11.293 17.707 C 11.684 18.097 12.316 18.097 12.707 17.707 L 12.790 17.613 C 13.099 17.215 13.063 16.649 12.707 16.293 L 11.223 14.808 L 11.336 14.771 C 12.589 14.326 13.540 13.288 13.874 12.001 L 15.000 12.000 C 15.552 12.000 16.000 11.552 16.000 11.000 C 16.000 10.448 15.552 10.000 15.000 10.000 L 13.874 10.000 C 13.797 9.703 13.687 9.416 13.544 9.145 L 13.465 9.000 L 15.000 9.000 C 15.552 9.000 16.000 8.552 16.000 8.000 L 15.993 7.883 C 15.934 7.380 15.507 7.000 15.000 7.000 Z"),
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
        return _coinRupee!!
    }

private var _coinRupee: ImageVector? = null
