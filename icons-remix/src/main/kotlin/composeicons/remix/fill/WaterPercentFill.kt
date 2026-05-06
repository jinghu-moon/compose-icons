package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WaterPercentFill: ImageVector
    get() {
        if (_waterPercentFill != null) return _waterPercentFill!!
        _waterPercentFill = remixIcon(
            name = "WaterPercentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 .269 5.636 6.633c-3.515 3.515-3.515 9.213 0 12.728 3.515 3.515 9.213 3.515 12.728 0 3.515-3.515 3.515-9.213 0-12.728L12 .269ZM16.243 10.171 9.172 17.243 7.757 15.828 14.828 8.757l1.414 1.414ZM8.111 9.111c.586-.586 1.536-.586 2.121 0 .586 .586 .586 1.536 0 2.121-.586 .586-1.536 .586-2.121 0-.586-.586-.586-1.535 0-2.121ZM15.889 16.889c-.586 .586-1.536 .586-2.121 0-.586-.586-.586-1.536 0-2.121 .586-.586 1.535-.586 2.121 0 .586 .586 .586 1.536 0 2.121Z"),
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
        return _waterPercentFill!!
    }

private var _waterPercentFill: ImageVector? = null
