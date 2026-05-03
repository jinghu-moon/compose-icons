package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = radixIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.711 0.797 C 7.577 0.734 7.423 0.734 7.289 0.797 L 1.289 3.597 C 1.113 3.679 1.000 3.856 1.000 4.050 L 1.000 10.950 C 1.000 11.144 1.113 11.321 1.289 11.403 L 7.289 14.203 C 7.423 14.266 7.577 14.266 7.711 14.203 L 13.711 11.403 C 13.887 11.321 14.000 11.144 14.000 10.950 L 14.000 4.050 C 14.000 3.856 13.887 3.679 13.711 3.597 L 7.711 0.797 ZM 7.500 3.157 L 5.980 2.511 L 7.500 1.802 L 9.020 2.511 L 7.500 3.157 ZM 7.696 4.160 L 10.238 3.080 L 12.272 4.029 L 7.500 6.057 L 2.728 4.029 L 4.762 3.080 L 7.304 4.160 C 7.429 4.213 7.571 4.213 7.696 4.160 ZM 8.000 6.931 L 13.000 4.806 L 13.000 7.930 L 11.082 8.812 C 10.727 8.975 10.500 9.330 10.500 9.720 L 10.500 11.798 L 8.000 12.965 L 8.000 6.931 ZM 11.500 11.332 L 13.000 10.632 L 13.000 9.030 L 11.500 9.720 L 11.500 11.332 ZM 7.000 6.931 L 7.000 12.965 L 4.502 11.799 L 4.502 9.720 C 4.502 9.330 4.275 8.975 3.920 8.812 L 2.000 7.929 L 2.000 4.806 L 7.000 6.931 ZM 2.000 10.632 L 3.502 11.333 L 3.502 9.720 L 2.000 9.029 L 2.000 10.632 Z"),
        pathFillType = PathFillType.EvenOdd,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
