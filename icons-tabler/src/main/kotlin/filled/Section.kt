package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Section: ImageVector
    get() {
        if (_section != null) return _section!!
        _section = tablerFilledIcon(
            name = "Section",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.010 19.000 C 20.539 19.001 20.976 19.413 21.007 19.941 C 21.038 20.470 20.652 20.931 20.127 20.993 L 20.000 21.000 C 19.471 20.999 19.034 20.587 19.003 20.059 C 18.972 19.530 19.358 19.069 19.883 19.007 ZM 4.010 19.000 C 4.562 19.000 5.010 19.448 5.010 20.000 C 5.010 20.552 4.562 21.000 4.010 21.000 C 3.479 21.005 3.037 20.594 3.003 20.064 C 2.969 19.534 3.356 19.070 3.883 19.007M 7.883 19.007 C 8.435 19.007 8.883 19.455 8.883 20.007 C 8.883 20.559 8.435 21.007 7.883 21.007 C 7.352 21.012 6.910 20.601 6.876 20.071 C 6.842 19.541 7.229 19.077 7.756 19.014M 11.756 19.014 C 12.285 19.015 12.722 19.427 12.753 19.955 C 12.784 20.484 12.398 20.945 11.873 21.007 L 11.746 21.014 C 11.217 21.013 10.780 20.601 10.749 20.073 C 10.718 19.544 11.104 19.083 11.629 19.021 ZM 15.756 19.014 C 16.285 19.015 16.722 19.427 16.753 19.955 C 16.784 20.484 16.398 20.945 15.873 21.007 L 15.746 21.014 C 15.217 21.013 14.780 20.601 14.749 20.073 C 14.718 19.544 15.104 19.083 15.629 19.021 ZM 19.756 3.014 C 20.285 3.015 20.722 3.427 20.753 3.955 C 20.784 4.484 20.398 4.945 19.873 5.007 L 19.746 5.014 C 19.217 5.013 18.780 4.601 18.749 4.073 C 18.718 3.544 19.104 3.083 19.629 3.021 ZM 3.756 3.014 C 4.308 3.014 4.756 3.462 4.756 4.014 C 4.756 4.566 4.308 5.014 3.756 5.014 C 3.225 5.019 2.783 4.608 2.749 4.078 C 2.715 3.548 3.102 3.084 3.629 3.021M 7.629 3.021 C 8.181 3.021 8.629 3.469 8.629 4.021 C 8.629 4.573 8.181 5.021 7.629 5.021 C 7.098 5.026 6.656 4.615 6.622 4.085 C 6.588 3.555 6.975 3.091 7.502 3.028M 11.502 3.028 C 12.031 3.029 12.468 3.441 12.499 3.969 C 12.530 4.498 12.144 4.959 11.619 5.021 L 11.492 5.028 C 10.963 5.027 10.526 4.615 10.495 4.087 C 10.464 3.558 10.850 3.097 11.375 3.035 ZM 15.492 3.028 C 16.044 3.028 16.492 3.476 16.492 4.028 C 16.495 4.580 16.049 5.030 15.497 5.033 C 14.945 5.036 14.495 4.590 14.492 4.038 C 14.492 3.476 14.940 3.028 15.492 3.028M 18.492 7.028 C 19.597 7.028 20.492 7.923 20.492 9.028 L 20.492 15.028 C 20.492 16.133 19.597 17.028 18.492 17.028 L 4.492 17.028 C 3.387 17.028 2.492 16.133 2.492 15.028 L 2.492 9.028 C 2.492 7.923 3.387 7.028 4.492 7.028 Z"),
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
        return _section!!
    }

private var _section: ImageVector? = null
