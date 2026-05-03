package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitDown: ImageVector
    get() {
        if (_arrowAutofitDown != null) return _arrowAutofitDown!!
        _arrowAutofitDown = tablerFilledIcon(
            name = "ArrowAutofitDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 3.000 C 14.552 3.000 15.000 3.448 15.000 4.000 L 15.000 15.001 L 14.908 15.001 C 13.712 15.037 12.652 15.781 12.210 16.894 C 11.769 18.006 12.032 19.275 12.878 20.121 C 13.025 20.268 13.069 20.489 12.990 20.682 C 12.910 20.874 12.723 20.999 12.515 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 18.000 3.000 C 18.552 3.000 19.000 3.448 19.000 4.000 L 19.000 18.584 L 20.293 17.293 C 20.649 16.937 21.215 16.901 21.613 17.210 L 21.707 17.293 C 22.097 17.684 22.097 18.316 21.707 18.707 L 18.707 21.707 C 18.672 21.742 18.635 21.774 18.595 21.804 L 18.485 21.875 L 18.371 21.929 L 18.266 21.964 L 18.117 21.994 L 18.000 22.000 L 17.925 21.997 L 17.799 21.980 L 17.688 21.950 L 17.577 21.906 L 17.479 21.854 L 17.383 21.787 L 17.293 21.707 L 14.293 18.707 C 13.914 18.315 13.919 17.691 14.305 17.305 C 14.691 16.919 15.315 16.914 15.707 17.293 L 17.000 18.586 L 17.000 4.000 C 17.000 3.448 17.448 3.000 18.000 3.000"),
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
        return _arrowAutofitDown!!
    }

private var _arrowAutofitDown: ImageVector? = null
