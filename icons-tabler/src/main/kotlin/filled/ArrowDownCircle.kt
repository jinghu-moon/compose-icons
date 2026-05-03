package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) return _arrowDownCircle!!
        _arrowDownCircle = tablerFilledIcon(
            name = "ArrowDownCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 13.462 1.999 14.711 3.052 14.958 4.493 C 15.206 5.933 14.378 7.343 13.000 7.829 L 13.000 18.584 L 14.293 17.293 C 14.649 16.937 15.215 16.901 15.613 17.210 L 15.707 17.293 C 16.097 17.684 16.097 18.316 15.707 18.707 L 12.707 21.707 C 12.672 21.742 12.635 21.774 12.595 21.804 L 12.485 21.875 L 12.371 21.929 L 12.266 21.964 L 12.117 21.994 L 12.000 22.000 L 11.925 21.997 L 11.799 21.980 L 11.688 21.950 L 11.577 21.906 L 11.479 21.854 L 11.383 21.787 L 11.293 21.707 L 8.293 18.707 C 7.914 18.315 7.919 17.691 8.305 17.305 C 8.691 16.919 9.315 16.914 9.707 17.293 L 11.000 18.586 L 11.000 7.829 C 9.624 7.340 8.800 5.933 9.046 4.494 C 9.293 3.055 10.540 2.002 12.000 2.000"),
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
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null
