package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Scale: ImageVector
    get() {
        if (_scale != null) return _scale!!
        _scale = tablerFilledIcon(
            name = "Scale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 12.552 2.000 13.000 2.448 13.000 3.000 L 13.000 4.152 L 18.159 5.012 C 18.413 5.051 18.641 5.187 18.795 5.392 L 18.836 5.451 L 18.894 5.553 L 21.918 11.603 L 21.953 11.697 L 21.978 11.793 L 21.994 11.893 L 21.999 12.013 L 21.996 12.074 C 21.958 14.254 20.180 16.000 18.000 16.000 C 15.791 16.000 14.000 14.209 14.000 12.000 C 14.000 11.845 14.036 11.692 14.106 11.553 L 16.499 6.763 L 13.000 6.180 L 13.000 19.000 L 17.000 19.000 C 17.552 19.000 18.000 19.448 18.000 20.000 C 18.000 20.552 17.552 21.000 17.000 21.000 L 7.000 21.000 C 6.448 21.000 6.000 20.552 6.000 20.000 C 6.000 19.448 6.448 19.000 7.000 19.000 L 11.000 19.000 L 11.000 6.180 L 7.500 6.763 L 9.918 11.603 L 9.953 11.697 L 9.978 11.793 L 9.994 11.893 L 9.999 12.013 L 9.996 12.074 C 9.958 14.254 8.180 16.000 6.000 16.000 C 3.791 16.000 2.000 14.209 2.000 12.000 C 2.000 11.845 2.036 11.692 2.106 11.553 L 5.140 5.488 L 5.179 5.427 L 5.204 5.393 C 5.358 5.188 5.586 5.052 5.840 5.013 L 11.000 4.151 L 11.000 3.000 C 11.000 2.448 11.448 2.000 12.000 2.000"),
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
        return _scale!!
    }

private var _scale: ImageVector? = null
