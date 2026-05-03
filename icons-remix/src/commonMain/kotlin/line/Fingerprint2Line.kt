package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Fingerprint2Line: ImageVector
    get() {
        if (_fingerprint2Line != null) return _fingerprint2Line!!
        _fingerprint2Line = remixIcon(
            name = "Fingerprint2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 C 16.971 1.000 21.000 5.029 21.000 10.000 L 21.000 14.000 C 21.000 18.971 16.971 23.000 12.000 23.000 C 10.914 23.000 9.872 22.808 8.908 22.455 C 9.036 22.278 9.159 22.098 9.277 21.913 L 9.448 21.633 C 10.388 20.064 10.946 18.239 10.996 16.288 L 11.000 16.000 L 11.000 9.000 L 13.000 9.000 L 13.000 16.000 C 13.000 17.772 12.645 19.462 12.003 21.001 C 12.795 21.000 13.560 20.867 14.272 20.623 C 14.715 19.262 14.966 17.815 14.997 16.314 L 15.000 16.000 L 15.000 12.999 L 17.000 12.999 L 17.000 16.000 C 17.000 17.088 16.898 18.153 16.702 19.185 C 18.058 17.955 18.930 16.200 18.996 14.241 L 19.000 14.000 L 19.000 10.000 C 19.000 6.134 15.866 3.000 12.000 3.000 C 10.428 3.000 8.976 3.518 7.808 4.394 L 6.383 2.968 C 7.922 1.736 9.875 1.000 12.000 1.000 ZM 7.000 10.000 C 7.000 7.239 9.239 5.000 12.000 5.000 C 14.761 5.000 17.000 7.239 17.000 10.000 L 17.000 11.000 L 15.000 11.000 L 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000 C 10.402 7.000 9.096 8.249 9.005 9.824 L 9.000 10.000 L 9.000 16.000 C 9.000 17.567 8.600 19.040 7.896 20.323 L 7.872 20.363 C 7.643 20.777 7.381 21.171 7.090 21.542 C 6.649 21.254 6.235 20.930 5.853 20.572 L 5.544 20.271 C 3.970 18.650 3.000 16.438 3.000 14.000 L 3.000 10.000 C 3.000 7.875 3.736 5.922 4.968 4.383 L 6.394 5.808 C 5.563 6.917 5.054 8.280 5.004 9.759 L 5.000 10.000 L 5.000 14.000 C 5.000 15.675 5.588 17.212 6.569 18.417 C 6.822 17.735 6.970 17.003 6.996 16.241 L 7.000 16.000 L 7.000 10.000 Z"),
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
        return _fingerprint2Line!!
    }

private var _fingerprint2Line: ImageVector? = null
