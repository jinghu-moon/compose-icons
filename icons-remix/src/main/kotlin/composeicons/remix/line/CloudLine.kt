package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CloudLine: ImageVector
    get() {
        if (_cloudLine != null) return _cloudLine!!
        _cloudLine = remixIcon(
            name = "CloudLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c3.866 0 7 3.134 7 7 0 .114-.003 .226-.008 .339C21.326 10.16 23 12.385 23 15c0 3.314-2.686 6-6 6h-10C3.686 21 1 18.314 1 15 1 12.385 2.673 10.16 5.008 9.339 5.003 9.226 5 9.114 5 9 5 5.134 8.134 2 12 2ZM12 4C9.239 4 7 6.239 7 9c0 .081 .002 .163 .006 .243l.071 1.487-1.405 .494C4.084 11.784 3 13.289 3 15c0 2.209 1.791 4 4 4h10c2.209 0 4-1.791 4-4 0-2.21-1.79-4-4-4-1.767 0-3.266 1.146-3.796 2.735l-1.898-.633C12.101 10.719 14.35 9 17 9 17 6.239 14.761 4 12 4Z"),
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
        return _cloudLine!!
    }

private var _cloudLine: ImageVector? = null
