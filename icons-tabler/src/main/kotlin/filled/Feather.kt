package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = tablerFilledIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 9.585 L 8.000 16.000 L 14.414 16.000 L 11.707 18.707 C 11.672 18.742 11.635 18.774 11.595 18.804 L 11.485 18.875 L 11.371 18.929 L 11.266 18.964 L 11.117 18.994 L 11.000 19.000 L 6.414 19.000 L 4.707 20.707 C 4.456 20.967 4.084 21.071 3.734 20.980 C 3.385 20.888 3.112 20.615 3.020 20.266 C 2.929 19.916 3.033 19.544 3.293 19.293 L 5.000 17.584 L 5.000 13.000 L 5.003 12.925 L 5.020 12.799 L 5.050 12.688 L 5.094 12.577 L 5.146 12.479 L 5.213 12.383 L 5.293 12.293 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 19.414 11.000 L 16.414 14.000 L 11.500 14.000 L 14.414 11.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 13.000 4.586 L 13.000 9.584 L 10.000 12.584 L 10.000 7.585 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 16.482 3.000 C 17.680 2.999 18.829 3.474 19.676 4.321 C 20.524 5.168 21.000 6.316 21.000 7.514 C 21.001 8.019 20.920 8.521 20.761 9.001 L 15.000 9.000 L 15.000 3.240 C 15.469 3.082 15.968 3.000 16.482 3.000"),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
