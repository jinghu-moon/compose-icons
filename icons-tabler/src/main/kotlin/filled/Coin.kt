package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = tablerFilledIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 12.000 6.000 C 11.448 6.000 11.000 6.448 11.000 7.000 C 9.343 7.000 8.000 8.343 8.000 10.000 C 8.000 11.657 9.343 13.000 11.000 13.000 L 11.000 15.000 C 10.663 15.018 10.340 14.869 10.134 14.602 L 10.066 14.501 C 9.782 14.042 9.184 13.892 8.717 14.162 C 8.249 14.431 8.080 15.023 8.334 15.499 C 8.853 16.399 9.801 16.966 10.839 16.999 L 11.000 16.999 C 11.000 17.506 11.379 17.934 11.883 17.993 L 12.000 18.000 C 12.552 18.000 13.000 17.552 13.000 17.000 L 13.176 16.995 C 14.797 16.901 16.049 15.535 16.002 13.912 C 15.954 12.289 14.624 10.998 13.000 11.000 L 13.000 9.000 C 13.358 8.988 13.671 9.140 13.866 9.398 L 13.934 9.499 C 14.218 9.958 14.816 10.108 15.283 9.838 C 15.751 9.569 15.920 8.977 15.666 8.501 C 15.147 7.601 14.200 7.033 13.161 7.000 L 13.000 7.000 C 13.000 6.448 12.552 6.000 12.000 6.000 ZM 13.000 13.000 C 13.552 13.000 14.000 13.448 14.000 14.000 C 14.000 14.552 13.552 15.000 13.000 15.000 L 13.000 13.000 ZM 11.000 9.000 L 11.000 11.000 C 10.448 11.000 10.000 10.552 10.000 10.000 C 10.000 9.448 10.448 9.000 11.000 9.000 Z"),
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
        return _coin!!
    }

private var _coin: ImageVector? = null
