package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bong: ImageVector
    get() {
        if (_bong != null) return _bong!!
        _bong = tablerFilledIcon(
            name = "Bong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 2.000 C 14.552 2.000 15.000 2.448 15.000 3.000 C 15.000 3.552 14.552 4.000 14.000 4.000 L 14.000 9.587 L 16.293 7.293 C 16.649 6.937 17.215 6.901 17.613 7.210 L 17.707 7.293 L 19.707 9.293 C 20.097 9.684 20.097 10.316 19.707 10.707 L 16.591 13.822 L 16.677 14.055 C 16.988 14.962 17.073 15.920 16.940 16.849 L 16.878 17.209 L 16.866 17.261 C 16.677 18.138 16.294 18.962 15.745 19.671 L 15.585 19.870 C 14.137 21.586 11.851 22.349 9.662 21.848 C 7.474 21.348 5.748 19.667 5.189 17.492 L 5.121 17.204 L 5.112 17.158 C 4.621 14.663 5.756 12.129 7.945 10.834 L 8.000 10.803 L 8.000 4.000 C 7.448 4.000 7.000 3.552 7.000 3.000 C 7.000 2.448 7.448 2.000 8.000 2.000 ZM 12.000 4.000 L 10.000 4.000 L 10.000 11.416 C 10.000 11.766 9.817 12.091 9.517 12.272 L 9.400 12.332 C 7.942 12.968 6.999 14.409 7.000 16.000 L 15.000 16.000 C 15.001 15.331 14.833 14.673 14.514 14.086 C 14.302 13.697 14.371 13.215 14.684 12.901 L 17.586 10.000 L 17.000 9.414 L 14.100 12.316 C 13.820 12.596 13.402 12.684 13.033 12.542 L 12.913 12.486 C 12.810 12.430 12.705 12.378 12.597 12.331 C 12.234 12.171 12.000 11.812 12.000 11.416 Z"),
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
        return _bong!!
    }

private var _bong: ImageVector? = null
