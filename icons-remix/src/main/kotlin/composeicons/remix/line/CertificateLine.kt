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
                pathData = parseSvgPathData("M20 2c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-18C3 2.448 3.448 2 4 2h16ZM5 20h14v-16h-14v16ZM13.47 11.977l3.285 .478-2.377 2.317 .561 3.272L12 16.5 9.061 18.045l.562-3.272L7.245 12.455l3.285-.478L12 9l1.47 2.977ZM16 8h-8v-2h8v2Z"),
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
