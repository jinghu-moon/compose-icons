package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CertificateLine: ImageVector
    get() {
        if (_certificateLine != null) return _certificateLine!!
        _certificateLine = remixIcon(
            name = "CertificateLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 ZM 5.000 20.000 L 19.000 20.000 L 19.000 4.000 L 5.000 4.000 L 5.000 20.000 ZM 13.470 11.977 L 16.755 12.455 L 14.378 14.773 L 14.939 18.045 L 12.000 16.500 L 9.061 18.045 L 9.622 14.773 L 7.245 12.455 L 10.530 11.977 L 12.000 9.000 L 13.470 11.977 ZM 16.000 8.000 L 8.000 8.000 L 8.000 6.000 L 16.000 6.000 L 16.000 8.000 Z"),
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
        return _certificateLine!!
    }

private var _certificateLine: ImageVector? = null
