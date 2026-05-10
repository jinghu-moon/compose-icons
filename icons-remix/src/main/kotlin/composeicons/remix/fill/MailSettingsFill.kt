package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailSettingsFill: ImageVector
    get() {
        if (_mailSettingsFill != null) return _mailSettingsFill!!
        _mailSettingsFill = remixIcon(
            name = "MailSettingsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 13.341C21.374 13.12 20.701 13 20 13c-3.314 0-6 2.686-6 6 0 .701 .12 1.374 .341 2h-11.341C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v9.341ZM12.061 11.683 5.647 6.238 4.353 7.762l7.72 6.555L19.654 7.756 18.346 6.244l-6.285 5.439ZM17.05 19.549C17.017 19.371 17 19.187 17 19c0-.187 .017-.371 .05-.549l-1.014-.586 1-1.732 1.015 .586c.277-.237 .598-.425 .949-.549v-1.171h2v1.171c.351 .124 .672 .312 .949 .549l1.015-.586 1 1.732-1.014 .586c.033 .178 .05 .361 .05 .549 0 .187-.017 .371-.05 .549l1.014 .586-1 1.732-1.015-.586c-.277 .237-.598 .425-.949 .549v1.171h-2v-1.171c-.351-.124-.672-.312-.949-.549l-1.015 .586-1-1.732 1.014-.586ZM20 20c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _mailSettingsFill!!
    }

private var _mailSettingsFill: ImageVector? = null
