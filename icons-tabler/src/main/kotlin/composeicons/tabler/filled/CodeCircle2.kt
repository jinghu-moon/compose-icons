package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CodeCircle2: ImageVector
    get() {
        if (_codeCircle2 != null) return _codeCircle2!!
        _codeCircle2 = tablerFilledIcon(
            name = "CodeCircle2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M13.342 8.56c-.249-.091-.524-.079-.765 .033-.24 .112-.426 .315-.517 .565l-2 5.5c-.189 .519 .079 1.093 .598 1.282 .519 .189 1.093-.079 1.282-.598l2-5.5c.091-.249 .079-.524-.033-.765-.112-.24-.315-.426-.565-.517M9.207 9.793c-.391-.39-1.023-.39-1.414 0L6.293 11.293c-.39 .391-.39 1.023 0 1.414l1.5 1.5c.391 .39 1.023 .39 1.414 0l.083-.094c.309-.398 .273-.964-.083-1.32L8.415 12l.792-.793c.39-.391 .39-1.023 0-1.414M16.207 9.793c-.391-.39-1.024-.39-1.414 0l-.083 .094c-.309 .398-.273 .964 .083 1.32l.792 .793-.792 .793c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l1.5-1.5c.39-.391 .39-1.023 0-1.414Z"),
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
        return _codeCircle2!!
    }

private var _codeCircle2: ImageVector? = null
