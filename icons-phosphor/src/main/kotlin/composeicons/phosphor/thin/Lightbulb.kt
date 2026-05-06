package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = phosphorThinIcon(
            name = "Lightbulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 232c0 2.209-1.791 4-4 4h-80c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h80c2.209 0 4 1.791 4 4ZM212 104c.063 25.795-11.787 50.174-32.11 66.06-4.954 3.807-7.867 9.692-7.89 15.94v6c0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12v-6c-.002-6.187-2.867-12.024-7.76-15.81C55.961 154.405 44.072 130.168 44 104.47 43.75 59 80.52 21.09 126 20c22.623-.539 44.506 8.073 60.694 23.885C202.882 59.696 212.006 81.371 212 104ZM204 104c.006-20.478-8.252-40.091-22.903-54.398C166.446 35.296 146.642 27.507 126.17 28 85 29 51.77 63.27 52 104.43c.075 23.24 10.831 45.155 29.17 59.43C88.009 169.169 92.007 177.343 92 186v6c0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4v-6c.022-8.693 4.06-16.887 10.94-22.2C193.34 149.423 204.066 127.351 204 104ZM136.66 52.06c-2.116-.245-4.054 1.211-4.406 3.313-.352 2.101 1.005 4.11 3.086 4.567C153.53 63 169 78.45 172.06 96.67c.327 1.922 1.991 3.328 3.94 3.33 .225-.001 .449-.021 .67-.06 2.175-.372 3.638-2.434 3.27-4.61C175.999 73.266 158.725 55.996 136.66 52.06Z"),
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
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
