package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.KeyframeAlignVertical: ImageVector
    get() {
        if (_keyframeAlignVertical != null) return _keyframeAlignVertical!!
        _keyframeAlignVertical = tablerFilledIcon(
            name = "KeyframeAlignVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 C 12.507 1.000 12.934 1.380 12.993 1.883 L 13.000 2.000 L 13.000 4.000 C 12.999 4.529 12.587 4.966 12.059 4.997 C 11.530 5.028 11.069 4.642 11.007 4.117 L 11.000 4.000 L 11.000 2.000 C 11.000 1.448 11.448 1.000 12.000 1.000 Z"),
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
        pathData = parseSvgPathData("M 12.000 6.000 C 11.371 6.000 10.786 6.301 10.394 6.807 L 7.486 10.555 C 6.843 11.405 6.839 12.577 7.475 13.431 L 10.394 17.193 C 10.784 17.698 11.371 18.000 12.000 18.000 C 12.629 18.000 13.214 17.699 13.606 17.193 L 16.514 13.445 C 17.157 12.595 17.161 11.423 16.525 10.569 L 13.606 6.807 C 13.225 6.303 12.632 6.005 12.000 6.000 Z"),
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
        pathData = parseSvgPathData("M 12.000 19.000 C 12.507 19.000 12.934 19.380 12.993 19.883 L 13.000 20.000 L 13.000 22.000 C 12.999 22.529 12.587 22.966 12.059 22.997 C 11.530 23.028 11.069 22.642 11.007 22.117 L 11.000 22.000 L 11.000 20.000 C 11.000 19.448 11.448 19.000 12.000 19.000 Z"),
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
        return _keyframeAlignVertical!!
    }

private var _keyframeAlignVertical: ImageVector? = null
