package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SnowyFill: ImageVector
    get() {
        if (_snowyFill != null) return _snowyFill!!
        _snowyFill = remixIcon(
            name = "SnowyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.027 17.429 C 3.081 16.249 1.000 13.368 1.000 10.000 C 1.000 5.582 4.582 2.000 9.000 2.000 C 12.395 2.000 15.296 4.115 16.458 7.099 C 16.795 7.034 17.144 7.000 17.500 7.000 C 20.538 7.000 23.000 9.462 23.000 12.500 C 23.000 15.369 20.803 17.725 18.000 17.978 C 17.988 14.674 15.306 12.000 12.000 12.000 C 8.879 12.000 6.314 14.383 6.027 17.429 ZM 13.000 16.268 L 14.964 15.134 L 15.964 16.866 L 14.000 18.000 L 15.964 19.134 L 14.964 20.866 L 13.000 19.732 L 13.000 22.000 L 11.000 22.000 L 11.000 19.732 L 9.036 20.866 L 8.036 19.134 L 10.000 18.000 L 8.036 16.866 L 9.036 15.134 L 11.000 16.268 L 11.000 14.000 L 13.000 14.000 L 13.000 16.268 Z"),
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
        return _snowyFill!!
    }

private var _snowyFill: ImageVector? = null
