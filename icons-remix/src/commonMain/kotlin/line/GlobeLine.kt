package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GlobeLine: ImageVector
    get() {
        if (_globeLine != null) return _globeLine!!
        _globeLine = remixIcon(
            name = "GlobeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 21.000 L 18.000 21.000 L 18.000 23.000 L 6.000 23.000 L 6.000 21.000 L 11.000 21.000 L 11.000 19.951 C 7.707 19.624 4.884 17.699 3.316 14.962 L 5.053 13.970 C 6.432 16.378 9.027 18.000 12.000 18.000 C 16.419 18.000 20.000 14.418 20.000 10.000 C 20.000 7.026 18.378 4.432 15.970 3.053 L 16.963 1.316 C 19.972 3.040 22.000 6.283 22.000 10.000 C 22.000 15.185 18.054 19.449 13.000 19.951 L 13.000 21.000 ZM 12.000 17.000 C 8.134 17.000 5.000 13.866 5.000 10.000 C 5.000 6.134 8.134 3.000 12.000 3.000 C 15.866 3.000 19.000 6.134 19.000 10.000 C 19.000 13.866 15.866 17.000 12.000 17.000 ZM 12.000 15.000 C 14.762 15.000 17.000 12.761 17.000 10.000 C 17.000 7.239 14.762 5.000 12.000 5.000 C 9.239 5.000 7.000 7.239 7.000 10.000 C 7.000 12.761 9.239 15.000 12.000 15.000 Z"),
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
        return _globeLine!!
    }

private var _globeLine: ImageVector? = null
