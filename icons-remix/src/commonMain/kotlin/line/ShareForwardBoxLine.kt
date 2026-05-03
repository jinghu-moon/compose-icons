package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShareForwardBoxLine: ImageVector
    get() {
        if (_shareForwardBoxLine != null) return _shareForwardBoxLine!!
        _shareForwardBoxLine = remixIcon(
            name = "ShareForwardBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 3.000 L 9.000 5.000 L 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 10.000 L 22.000 10.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.447 2.448 3.000 3.000 3.000 L 9.000 3.000 ZM 18.950 5.000 L 16.000 2.050 L 17.414 0.636 L 22.754 5.975 C 22.988 6.210 22.988 6.590 22.754 6.824 C 22.641 6.936 22.489 7.000 22.330 7.000 L 14.000 7.000 C 12.895 7.000 12.000 7.895 12.000 9.000 L 12.000 15.000 L 10.000 15.000 L 10.000 9.000 C 10.000 6.791 11.791 5.000 14.000 5.000 L 18.950 5.000 Z"),
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
        return _shareForwardBoxLine!!
    }

private var _shareForwardBoxLine: ImageVector? = null
