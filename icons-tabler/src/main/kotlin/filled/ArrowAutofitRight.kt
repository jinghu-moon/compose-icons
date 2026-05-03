package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitRight: ImageVector
    get() {
        if (_arrowAutofitRight != null) return _arrowAutofitRight!!
        _arrowAutofitRight = tablerFilledIcon(
            name = "ArrowAutofitRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 14.000 C 3.000 14.552 3.448 15.000 4.000 15.000 L 15.001 15.000 L 15.001 14.908 C 15.037 13.712 15.781 12.652 16.894 12.210 C 18.006 11.769 19.275 12.032 20.121 12.878 C 20.268 13.025 20.489 13.069 20.682 12.990 C 20.874 12.910 20.999 12.723 21.000 12.515 L 21.000 6.000 C 21.000 4.343 19.657 3.000 18.000 3.000 L 6.000 3.000 C 4.343 3.000 3.000 4.343 3.000 6.000 Z"),
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
                pathData = parseSvgPathData("M 3.000 18.000 C 3.000 18.552 3.448 19.000 4.000 19.000 L 18.584 19.000 L 17.293 20.293 C 16.937 20.649 16.901 21.215 17.210 21.613 L 17.293 21.707 C 17.684 22.097 18.316 22.097 18.707 21.707 L 21.707 18.707 Q 21.761 18.654 21.804 18.595 L 21.875 18.485 L 21.929 18.371 L 21.964 18.266 L 21.994 18.117 L 22.000 18.000 L 21.997 17.925 L 21.980 17.799 L 21.950 17.688 L 21.906 17.577 L 21.854 17.479 L 21.787 17.383 L 21.707 17.293 L 18.707 14.293 C 18.315 13.914 17.691 13.919 17.305 14.305 C 16.919 14.691 16.914 15.315 17.293 15.707 L 18.586 17.000 L 4.000 17.000 C 3.448 17.000 3.000 17.448 3.000 18.000"),
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
        return _arrowAutofitRight!!
    }

private var _arrowAutofitRight: ImageVector? = null
