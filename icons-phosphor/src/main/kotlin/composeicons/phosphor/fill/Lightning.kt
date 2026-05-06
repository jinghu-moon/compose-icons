package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorFillIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.85 125.46 101.85 245.46c-2.438 2.602-6.305 3.276-9.48 1.653-3.175-1.623-4.892-5.153-4.21-8.653l14.66-73.33L45.19 143.49c-2.514-.94-4.389-3.079-4.992-5.694-.604-2.615 .145-5.359 1.992-7.306L154.19 10.49c2.438-2.602 6.305-3.276 9.48-1.653 3.175 1.623 4.892 5.153 4.21 8.653L153.18 90.9l57.63 21.61c2.495 .947 4.354 3.075 4.956 5.674 .602 2.6-.131 5.328-1.956 7.276Z"),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null
