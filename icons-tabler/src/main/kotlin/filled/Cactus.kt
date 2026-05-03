package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = tablerFilledIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 22.000 C 6.471 21.999 6.034 21.587 6.003 21.059 C 5.972 20.530 6.358 20.069 6.883 20.007 L 7.000 20.000 L 9.000 20.000 L 9.000 14.000 C 6.869 14.000 5.112 12.329 5.005 10.200 L 5.000 10.000 L 5.000 9.000 C 5.001 8.471 5.413 8.034 5.941 8.003 C 6.470 7.972 6.931 8.358 6.993 8.883 L 7.000 9.000 L 7.000 10.000 C 7.000 11.047 7.806 11.917 8.850 11.995 L 9.000 12.000 L 9.000 5.000 C 8.998 3.376 10.289 2.046 11.912 1.998 C 13.535 1.951 14.901 3.203 14.995 4.824 L 15.000 5.000 L 15.000 15.000 C 16.047 15.000 16.917 14.194 16.995 13.150 L 17.000 13.000 L 17.000 8.000 C 17.001 7.471 17.413 7.034 17.941 7.003 C 18.470 6.972 18.931 7.358 18.993 7.883 L 19.000 8.000 L 19.000 13.000 C 19.000 15.131 17.329 16.888 15.200 16.995 L 15.000 17.000 L 15.000 20.000 L 17.000 20.000 C 17.529 20.001 17.966 20.413 17.997 20.941 C 18.028 21.470 17.642 21.931 17.117 21.993 L 17.000 22.000 L 7.000 22.000 Z"),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null
