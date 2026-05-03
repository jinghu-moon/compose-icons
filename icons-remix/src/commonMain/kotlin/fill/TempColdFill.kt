package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TempColdFill: ImageVector
    get() {
        if (_tempColdFill != null) return _tempColdFill!!
        _tempColdFill = remixIcon(
            name = "TempColdFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 10.255 L 8.000 5.000 C 8.000 2.791 9.791 1.000 12.000 1.000 C 14.209 1.000 16.000 2.791 16.000 5.000 L 16.000 10.255 C 17.813 11.520 19.000 13.621 19.000 16.000 C 19.000 19.866 15.866 23.000 12.000 23.000 C 8.134 23.000 5.000 19.866 5.000 16.000 C 5.000 13.621 6.187 11.520 8.000 10.255 ZM 8.000 16.000 C 8.000 18.209 9.791 20.000 12.000 20.000 C 14.209 20.000 16.000 18.209 16.000 16.000 L 8.000 16.000 Z"),
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
        return _tempColdFill!!
    }

private var _tempColdFill: ImageVector? = null
