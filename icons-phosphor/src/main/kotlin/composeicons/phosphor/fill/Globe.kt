package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorFillIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24h0C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.934 70.59 185.41 24.066 128 24ZM206.36 88h-35.65C166.221 71.529 158.654 56.057 148.41 42.4c25.047 6.017 46.217 22.673 57.96 45.6ZM216 128c.007 8.116-1.114 16.193-3.33 24h-38.51c2.453-15.906 2.453-32.094 0-48h38.51c2.216 7.807 3.337 15.884 3.33 24ZM128 43c11.979 12.825 20.872 28.216 26 45h-52c5.123-16.786 14.016-32.178 26-45ZM102 168h52c-5.123 16.786-14.016 32.178-26 45C116.021 200.175 107.128 184.784 102 168ZM98.1 152c-2.747-15.882-2.747-32.118 0-48h59.88c2.747 15.882 2.747 32.118 0 48ZM148.45 213.6C158.694 199.943 166.261 184.471 170.75 168h35.66c-11.751 22.937-32.938 39.594-58 45.6Z"),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
