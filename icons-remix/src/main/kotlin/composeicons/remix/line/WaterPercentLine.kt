package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WaterPercentLine: ImageVector
    get() {
        if (_waterPercentLine != null) return _waterPercentLine!!
        _waterPercentLine = remixIcon(
            name = "WaterPercentLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.05 8.047 12 3.097l4.95 4.95c2.734 2.734 2.734 7.166 0 9.899-2.734 2.734-7.166 2.734-9.899 0C4.317 15.213 4.317 10.78 7.05 8.047ZM18.364 6.633 12 .269 5.636 6.633c-3.515 3.515-3.515 9.213 0 12.728 3.515 3.515 9.213 3.515 12.728 0 3.515-3.515 3.515-9.213 0-12.728ZM16.243 10.171 14.828 8.757 7.757 15.828l1.414 1.414 7.071-7.071ZM8.111 11.232c.586 .586 1.536 .586 2.121 0 .586-.586 .586-1.535 0-2.121-.586-.586-1.536-.586-2.121 0-.586 .586-.586 1.536 0 2.121ZM15.889 16.889c-.586 .586-1.536 .586-2.121 0-.586-.586-.586-1.536 0-2.121 .586-.586 1.535-.586 2.121 0 .586 .586 .586 1.536 0 2.121Z"),
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
        return _waterPercentLine!!
    }

private var _waterPercentLine: ImageVector? = null
