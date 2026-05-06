package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AppsAiFill: ImageVector
    get() {
        if (_appsAiFill != null) return _appsAiFill!!
        _appsAiFill = remixIcon(
            name = "AppsAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.75 2.5C9.097 2.5 11 4.403 11 6.75v4.25h-4.25C4.403 11 2.5 9.097 2.5 6.75 2.5 4.403 4.403 2.5 6.75 2.5ZM6.75 13h4.25v4.25c0 2.347-1.903 4.25-4.25 4.25-2.347 0-4.25-1.903-4.25-4.25C2.5 14.903 4.403 13 6.75 13ZM13 13h4.25c2.347 0 4.25 1.903 4.25 4.25 0 2.347-1.903 4.25-4.25 4.25C14.903 21.5 13 19.597 13 17.25v-4.25ZM18.008 10.069l-.262 .601c-.192 .44-.8 .44-.992 0l-.262-.601C16.025 8.998 15.184 8.146 14.134 7.679l-.807-.359c-.436-.194-.436-.829 0-1.023l.762-.339c1.076-.479 1.933-1.363 2.392-2.47l.269-.649c.188-.452 .813-.452 1 0l.269 .649c.459 1.107 1.315 1.992 2.392 2.47l.762 .339c.437 .194 .437 .829 0 1.023l-.807 .359c-1.05 .467-1.891 1.319-2.358 2.39Z"),
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
        return _appsAiFill!!
    }

private var _appsAiFill: ImageVector? = null
