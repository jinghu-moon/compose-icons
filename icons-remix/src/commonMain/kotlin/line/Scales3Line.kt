package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Scales3Line: ImageVector
    get() {
        if (_scales3Line != null) return _scales3Line!!
        _scales3Line = remixIcon(
            name = "Scales3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.998 2.000 L 12.998 3.278 L 17.999 4.946 L 21.631 3.735 L 22.263 5.632 L 19.232 6.643 L 22.327 15.155 C 21.235 16.292 19.700 17.000 17.999 17.000 C 16.298 17.000 14.762 16.292 13.670 15.155 L 16.764 6.643 L 12.998 5.387 L 12.998 19.000 L 16.999 19.000 L 16.999 21.000 L 6.999 21.000 L 6.999 19.000 L 10.998 19.000 L 10.998 5.387 L 7.232 6.643 L 10.327 15.155 C 9.235 16.292 7.700 17.000 5.999 17.000 C 4.298 17.000 2.762 16.292 1.670 15.155 L 4.764 6.643 L 1.734 5.632 L 2.366 3.735 L 5.999 4.946 L 10.998 3.278 L 10.998 2.000 L 12.998 2.000 ZM 17.999 9.103 L 16.040 14.489 C 16.628 14.820 17.298 15.000 17.999 15.000 C 18.699 15.000 19.369 14.820 19.957 14.489 L 17.999 9.103 ZM 5.999 9.103 L 4.040 14.489 C 4.628 14.820 5.298 15.000 5.999 15.000 C 6.699 15.000 7.369 14.820 7.957 14.489 L 5.999 9.103 Z"),
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
        return _scales3Line!!
    }

private var _scales3Line: ImageVector? = null
