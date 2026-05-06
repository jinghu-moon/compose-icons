package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Unite: ImageVector
    get() {
        if (_unite != null) return _unite!!
        _unite = phosphorFillIcon(
            name = "Unite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 164c.001 41.215-32.848 74.92-74.049 75.978C124.749 241.035 90.214 209.061 88.1 167.9 47.193 165.798 15.31 131.655 16.011 90.7 16.712 49.744 49.744 16.712 90.7 16.011c40.955-.701 75.098 31.181 77.2 72.089C208.282 90.225 239.95 123.562 240 164Z"),
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
        return _unite!!
    }

private var _unite: ImageVector? = null
