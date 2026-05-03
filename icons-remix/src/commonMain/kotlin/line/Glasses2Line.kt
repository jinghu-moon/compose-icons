package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Glasses2Line: ImageVector
    get() {
        if (_glasses2Line != null) return _glasses2Line!!
        _glasses2Line = remixIcon(
            name = "Glasses2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.015 10.988 C 3.044 9.453 3.126 8.467 3.355 7.321 C 3.686 5.663 4.309 4.662 5.554 3.832 L 4.445 2.168 C 2.690 3.338 1.812 4.837 1.394 6.929 C 0.874 9.528 0.996 14.864 0.999 14.998 C 0.999 14.998 0.999 14.999 0.999 15.000 C 0.999 17.761 3.238 20.000 5.999 20.000 C 8.760 20.000 10.999 17.761 10.999 15.000 C 10.999 14.726 10.977 14.457 10.934 14.194 C 11.265 14.069 11.623 14.000 11.999 14.000 C 12.375 14.000 12.733 14.069 13.064 14.194 C 13.021 14.457 12.999 14.726 12.999 15.000 C 12.999 17.761 15.238 20.000 17.999 20.000 C 20.760 20.000 22.999 17.761 22.999 15.000 C 22.999 15.000 22.999 15.000 22.999 15.000 L 22.999 15.000 C 22.999 15.000 23.131 9.561 22.605 6.929 C 22.187 4.837 21.309 3.338 19.554 2.168 L 18.445 3.832 C 19.690 4.662 20.312 5.663 20.644 7.321 C 20.873 8.467 20.954 9.453 20.983 10.988 C 20.150 10.367 19.118 10.000 17.999 10.000 C 16.221 10.000 14.661 10.928 13.774 12.325 C 13.222 12.115 12.623 12.000 11.999 12.000 C 11.375 12.000 10.776 12.115 10.224 12.325 C 9.337 10.928 7.777 10.000 5.999 10.000 C 4.881 10.000 3.848 10.367 3.015 10.988 ZM 2.999 15.000 C 2.999 13.343 4.342 12.000 5.999 12.000 C 7.306 12.000 8.420 12.836 8.831 14.006 C 8.939 14.316 8.999 14.650 8.999 15.000 C 8.999 16.657 7.656 18.000 5.999 18.000 C 4.342 18.000 2.999 16.657 2.999 15.000 ZM 15.167 14.006 C 15.578 12.836 16.692 12.000 17.999 12.000 C 19.656 12.000 20.999 13.343 20.999 15.000 C 20.999 16.657 19.656 18.000 17.999 18.000 C 16.342 18.000 14.999 16.657 14.999 15.000 C 14.999 14.650 15.059 14.316 15.167 14.006 Z"),
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
        return _glasses2Line!!
    }

private var _glasses2Line: ImageVector? = null
