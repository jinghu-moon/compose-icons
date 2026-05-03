package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Microwave: ImageVector
    get() {
        if (_microwave != null) return _microwave!!
        _microwave = tablerFilledIcon(
            name = "Microwave",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 5.000 C 21.105 5.000 22.000 5.895 22.000 7.000 L 22.000 17.000 C 22.000 18.105 21.105 19.000 20.000 19.000 L 4.000 19.000 C 2.895 19.000 2.000 18.105 2.000 17.000 L 2.000 7.000 C 2.000 5.895 2.895 5.000 4.000 5.000 ZM 14.000 7.000 L 4.000 7.000 L 4.000 17.000 L 14.000 17.000 ZM 18.010 14.000 L 18.000 14.000 C 17.471 14.001 17.034 14.413 17.003 14.941 C 16.972 15.470 17.358 15.931 17.883 15.993 L 18.010 16.000 C 18.562 16.000 19.010 15.552 19.010 15.000 C 19.010 14.448 18.562 14.000 18.010 14.000M 18.010 11.000 L 18.000 11.000 C 17.471 11.001 17.034 11.413 17.003 11.941 C 16.972 12.470 17.358 12.931 17.883 12.993 L 18.010 13.000 C 18.562 13.000 19.010 12.552 19.010 12.000 C 19.010 11.448 18.562 11.000 18.010 11.000M 18.010 8.000 L 18.000 8.000 C 17.471 8.001 17.034 8.413 17.003 8.941 C 16.972 9.470 17.358 9.931 17.883 9.993 L 18.010 10.000 C 18.562 10.000 19.010 9.552 19.010 9.000 C 19.010 8.448 18.562 8.000 18.010 8.000"),
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
                pathData = parseSvgPathData("M 5.945 9.668 C 7.281 8.777 8.219 8.777 9.555 9.668 L 9.466 9.612 L 9.506 9.629 L 9.652 9.693 L 9.747 9.737 C 10.125 9.908 10.280 9.967 10.421 9.992 C 10.554 10.015 10.607 9.997 10.757 9.832 C 10.992 9.553 11.361 9.424 11.719 9.496 C 12.077 9.568 12.367 9.829 12.476 10.177 C 12.585 10.526 12.496 10.906 12.243 11.169 C 11.630 11.850 10.885 12.103 10.079 11.963 C 9.711 11.899 9.458 11.802 8.921 11.558 C 8.820 11.511 8.718 11.466 8.615 11.423 L 8.445 11.332 C 7.781 10.889 7.719 10.889 7.055 11.332 C 6.595 11.639 5.975 11.515 5.668 11.055 C 5.361 10.595 5.485 9.975 5.945 9.668"),
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
                pathData = parseSvgPathData("M 5.945 12.668 C 7.281 11.777 8.219 11.777 9.555 12.668 L 9.466 12.612 L 9.506 12.629 L 9.652 12.693 L 9.747 12.737 C 10.125 12.908 10.280 12.967 10.421 12.992 C 10.554 13.015 10.607 12.997 10.757 12.832 C 11.131 12.443 11.746 12.420 12.147 12.781 C 12.548 13.142 12.591 13.756 12.243 14.169 C 11.630 14.850 10.885 15.103 10.079 14.963 C 9.711 14.899 9.458 14.802 8.921 14.558 C 8.820 14.511 8.718 14.466 8.615 14.423 L 8.445 14.332 C 7.781 13.889 7.719 13.889 7.055 14.332 C 6.595 14.639 5.975 14.515 5.668 14.055 C 5.361 13.595 5.485 12.975 5.945 12.668"),
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
        return _microwave!!
    }

private var _microwave: ImageVector? = null
