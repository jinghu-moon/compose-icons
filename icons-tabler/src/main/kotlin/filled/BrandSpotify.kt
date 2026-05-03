package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandSpotify: ImageVector
    get() {
        if (_brandSpotify != null) return _brandSpotify!!
        _brandSpotify = tablerFilledIcon(
            name = "BrandSpotify",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 14.832 14.945 C 13.547 13.018 10.478 12.813 8.445 14.168 C 7.985 14.475 7.861 15.095 8.168 15.555 C 8.475 16.015 9.095 16.139 9.555 15.832 C 10.750 15.035 12.569 15.157 13.168 16.055 C 13.475 16.515 14.095 16.639 14.555 16.332 C 15.015 16.025 15.139 15.405 14.832 14.945M 16.100 11.700 C 13.631 9.848 10.205 9.513 7.492 11.111 C 7.016 11.392 6.857 12.005 7.138 12.481 C 7.419 12.957 8.032 13.116 8.508 12.835 C 10.494 11.664 13.052 11.915 14.900 13.300 C 15.342 13.631 15.969 13.542 16.300 13.100 C 16.631 12.658 16.542 12.031 16.100 11.700M 17.530 8.652 C 13.853 6.354 9.764 6.500 6.553 8.106 C 6.077 8.362 5.892 8.950 6.133 9.433 C 6.375 9.917 6.957 10.121 7.447 9.894 C 10.082 8.577 13.444 8.457 16.470 10.348 C 16.938 10.641 17.555 10.498 17.848 10.030 C 18.141 9.562 17.998 8.945 17.530 8.652"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _brandSpotify!!
    }

private var _brandSpotify: ImageVector? = null
