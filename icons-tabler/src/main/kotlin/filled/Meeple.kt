package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Meeple: ImageVector
    get() {
        if (_meeple != null) return _meeple!!
        _meeple = tablerFilledIcon(
            name = "Meeple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 14.486 2.000 15.713 3.766 15.955 6.100 L 15.965 6.224 L 16.094 6.260 C 19.264 7.188 21.848 8.747 21.994 10.816 L 22.000 11.000 C 22.000 12.427 20.703 13.322 19.129 13.733 L 18.928 13.782 L 18.954 13.812 C 19.198 14.088 19.486 14.415 19.654 14.609 L 19.711 14.675 C 20.201 15.248 20.595 15.748 20.927 16.235 C 21.617 17.245 22.000 18.139 22.000 19.000 C 22.000 20.105 21.105 21.000 20.000 21.000 L 15.000 21.000 C 13.957 21.000 13.656 20.547 12.606 18.447 C 12.316 17.867 12.158 17.565 12.013 17.329 L 12.000 17.307 L 11.987 17.329 C 11.858 17.539 11.719 17.801 11.487 18.264 L 11.394 18.447 C 10.344 20.547 10.043 21.000 9.000 21.000 L 4.000 21.000 C 2.895 21.000 2.000 20.105 2.000 19.000 C 2.000 18.140 2.384 17.245 3.073 16.235 C 3.449 15.693 3.855 15.172 4.289 14.675 C 4.441 14.497 4.771 14.122 5.046 13.812 L 5.071 13.782 L 4.871 13.733 C 3.365 13.340 2.113 12.503 2.007 11.183 L 2.000 11.000 C 2.000 8.840 4.643 7.215 7.906 6.260 L 8.034 6.224 L 8.045 6.100 C 8.280 3.840 9.439 2.110 11.771 2.005 Z"),
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
        return _meeple!!
    }

private var _meeple: ImageVector? = null
