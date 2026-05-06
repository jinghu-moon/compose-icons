package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailSettingsLine: ImageVector
    get() {
        if (_mailSettingsLine != null) return _mailSettingsLine!!
        _mailSettingsLine = remixIcon(
            name = "MailSettingsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 7.238l-7.928 7.1L4 7.216v11.784h10v2h-11C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v9h-2v-5.762ZM19.501 5h-14.99l7.55 6.662L19.501 5ZM17.05 19.549C17.017 19.371 17 19.187 17 19c0-.187 .017-.371 .05-.549l-1.014-.586 1-1.732 1.015 .586c.277-.237 .598-.425 .949-.549v-1.171h2v1.171c.351 .124 .672 .312 .949 .549l1.015-.586 1 1.732-1.014 .586c.033 .178 .05 .361 .05 .549 0 .187-.017 .371-.05 .549l1.014 .586-1 1.732-1.015-.586c-.277 .237-.598 .425-.949 .549v1.171h-2v-1.171c-.351-.124-.672-.312-.949-.549l-1.015 .586-1-1.732 1.014-.586ZM20 20c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _mailSettingsLine!!
    }

private var _mailSettingsLine: ImageVector? = null
