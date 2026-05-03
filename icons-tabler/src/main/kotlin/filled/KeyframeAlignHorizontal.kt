package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.KeyframeAlignHorizontal: ImageVector
    get() {
        if (_keyframeAlignHorizontal != null) return _keyframeAlignHorizontal!!
        _keyframeAlignHorizontal = tablerFilledIcon(
            name = "KeyframeAlignHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 6.000 C 11.371 6.000 10.786 6.301 10.394 6.807 L 7.486 10.555 C 6.843 11.405 6.839 12.577 7.475 13.431 L 10.394 17.193 C 10.784 17.698 11.371 18.000 12.000 18.000 C 12.629 18.000 13.214 17.699 13.606 17.193 L 16.514 13.445 C 17.157 12.595 17.161 11.423 16.525 10.569 L 13.606 6.807 C 13.225 6.303 12.632 6.005 12.000 6.000 Z"),
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
                pathData = parseSvgPathData("M 5.000 11.000 C 5.529 11.001 5.966 11.413 5.997 11.941 C 6.028 12.470 5.642 12.931 5.117 12.993 L 5.000 13.000 L 3.000 13.000 C 2.471 12.999 2.034 12.587 2.003 12.059 C 1.972 11.530 2.358 11.069 2.883 11.007 L 3.000 11.000 L 5.000 11.000 Z"),
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
                pathData = parseSvgPathData("M 21.000 11.000 C 21.529 11.001 21.966 11.413 21.997 11.941 C 22.028 12.470 21.642 12.931 21.117 12.993 L 21.000 13.000 L 19.000 13.000 C 18.471 12.999 18.034 12.587 18.003 12.059 C 17.972 11.530 18.358 11.069 18.883 11.007 L 19.000 11.000 L 21.000 11.000 Z"),
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
        return _keyframeAlignHorizontal!!
    }

private var _keyframeAlignHorizontal: ImageVector? = null
