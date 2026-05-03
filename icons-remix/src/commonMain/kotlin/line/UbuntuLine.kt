package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UbuntuLine: ImageVector
    get() {
        if (_ubuntuLine != null) return _ubuntuLine!!
        _ubuntuLine = remixIcon(
            name = "UbuntuLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.668 19.273 L 9.674 17.531 C 12.421 18.691 15.667 17.650 17.197 15.000 C 17.610 14.285 17.859 13.521 17.955 12.750 L 19.968 12.750 C 19.864 13.862 19.524 14.969 18.929 16.000 C 18.527 16.697 18.035 17.311 17.477 17.835 C 16.838 17.641 16.124 17.702 15.501 18.062 C 14.878 18.422 14.469 19.009 14.317 19.657 C 12.500 20.207 10.492 20.112 8.668 19.273 ZM 7.369 18.523 C 5.730 17.362 4.644 15.671 4.211 13.823 C 4.697 13.367 5.001 12.719 5.001 12.000 C 5.001 11.280 4.697 10.631 4.210 10.175 C 4.385 9.430 4.670 8.697 5.073 8.000 C 5.668 6.970 6.457 6.122 7.368 5.476 L 8.374 7.218 C 7.755 7.687 7.218 8.285 6.805 9.000 C 5.275 11.650 5.996 14.981 8.375 16.781 L 7.369 18.523 ZM 8.668 4.727 C 10.412 3.929 12.422 3.766 14.316 4.340 C 14.468 4.990 14.878 5.578 15.501 5.938 C 16.124 6.298 16.838 6.359 17.477 6.165 C 18.921 7.518 19.785 9.340 19.966 11.250 L 17.954 11.250 C 17.726 9.453 16.691 7.779 15.001 6.804 C 13.311 5.828 11.344 5.768 9.674 6.469 L 8.668 4.727 ZM 16.001 5.072 C 15.283 4.658 15.038 3.740 15.452 3.023 C 15.866 2.305 16.784 2.059 17.501 2.474 C 18.218 2.888 18.464 3.805 18.050 4.523 C 17.636 5.240 16.718 5.486 16.001 5.072 ZM 4.001 12.000 C 4.001 12.828 3.329 13.500 2.501 13.500 C 1.673 13.500 1.001 12.828 1.001 12.000 C 1.001 11.172 1.673 10.500 2.501 10.500 C 3.329 10.500 4.001 11.172 4.001 12.000 ZM 16.001 18.928 C 16.718 18.514 17.636 18.760 18.050 19.477 C 18.464 20.195 18.218 21.112 17.501 21.526 C 16.784 21.940 15.866 21.695 15.452 20.977 C 15.038 20.260 15.283 19.342 16.001 18.928 Z"),
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
        return _ubuntuLine!!
    }

private var _ubuntuLine: ImageVector? = null
