package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AerialLift: ImageVector
    get() {
        if (_aerialLift != null) return _aerialLift!!
        _aerialLift = tablerFilledIcon(
            name = "AerialLift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.876 2.008 C 20.235 1.954 20.595 2.100 20.816 2.387 C 21.037 2.675 21.085 3.060 20.942 3.393 C 20.798 3.726 20.485 3.956 20.124 3.992 L 13.000 4.883 L 13.000 7.000 L 17.200 7.000 C 17.456 7.000 17.702 7.098 17.888 7.274 L 17.975 7.367 C 20.765 10.784 20.692 17.330 17.749 20.662 C 17.559 20.877 17.287 21.000 17.000 21.000 L 6.894 21.000 C 6.600 21.000 6.321 20.871 6.131 20.647 C 3.271 17.274 3.271 10.727 6.131 7.353 C 6.321 7.129 6.600 7.000 6.894 7.000 L 11.000 7.000 L 11.000 5.133 L 4.124 5.993 C 3.621 6.056 3.150 5.732 3.029 5.239 L 3.008 5.124 C 2.940 4.576 3.328 4.077 3.876 4.008 L 11.872 3.008 L 11.883 3.007 L 11.891 3.006 ZM 11.000 9.000 L 7.383 9.000 L 7.332 9.072 C 6.614 10.114 6.183 11.482 6.040 12.916 L 6.032 13.000 L 11.000 13.000 ZM 16.698 9.000 L 13.000 9.000 L 13.000 13.000 L 17.979 13.000 L 17.974 12.928 C 17.851 11.492 17.441 10.117 16.742 9.064 Z"),
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
        return _aerialLift!!
    }

private var _aerialLift: ImageVector? = null
