package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Macro: ImageVector
    get() {
        if (_macro != null) return _macro!!
        _macro = tablerFilledIcon(
            name = "Macro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.994 2.888 L 18.000 3.000 L 18.000 6.000 C 18.000 8.928 15.887 11.428 13.000 11.916 L 13.000 16.102 C 14.315 14.756 16.118 13.998 18.000 14.000 C 18.552 14.000 19.000 14.448 19.000 15.000 C 19.000 18.866 15.866 22.000 12.000 22.000 C 8.134 22.000 5.000 18.866 5.000 15.000 C 5.000 14.448 5.448 14.000 6.000 14.000 C 7.960 14.000 9.731 14.805 11.002 16.103 L 11.000 11.917 C 8.113 11.429 6.000 8.928 6.000 6.000 L 6.000 3.000 C 6.000 2.631 6.203 2.292 6.528 2.118 C 6.853 1.944 7.248 1.963 7.555 2.168 L 9.872 3.712 L 11.292 2.292 C 11.649 1.936 12.214 1.901 12.612 2.210 L 12.707 2.293 L 14.127 3.712 L 16.445 2.168 C 16.735 1.974 17.106 1.945 17.422 2.092 C 17.739 2.239 17.956 2.541 17.995 2.888M 7.130 16.128 L 7.160 16.262 C 7.631 18.060 9.059 19.450 10.870 19.872 C 10.440 18.012 8.989 16.560 7.130 16.128M 16.872 16.130 L 16.738 16.160 C 14.940 16.631 13.550 18.059 13.128 19.870 C 14.988 19.440 16.440 17.989 16.872 16.130"),
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
        return _macro!!
    }

private var _macro: ImageVector? = null
