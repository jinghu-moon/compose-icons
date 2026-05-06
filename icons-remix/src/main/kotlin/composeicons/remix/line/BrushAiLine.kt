package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BrushAiLine: ImageVector
    get() {
        if (_brushAiLine != null) return _brushAiLine!!
        _brushAiLine = remixIcon(
            name = "BrushAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.713 7.128l-.247 .566c-.18 .414-.753 .414-.934 0L3.287 7.128C2.847 6.119 2.055 5.316 1.068 4.877L.308 4.539c-.411-.183-.411-.78 0-.963l.717-.319C2.038 2.807 2.844 1.974 3.276 .931L3.529 .32c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338C5.945 5.316 5.153 6.119 4.713 7.128ZM15.314 9.533l.142 .142c1.295 1.343 1.874 3.312 1.356 5.245-.648 2.419-2.842 4.078-5.311 4.078-2.036 0-4.713-.626-6.973-1.514C5.734 16.07 6.174 14.675 6.328 12.805c.037-.451 .061-.631 .103-.791C7.225 9.053 10.017 7.405 12.924 8.184c.931 .25 1.743 .724 2.391 1.349ZM18.228 2.371 13.289 6.213C9.342 5.239 5.558 7.546 4.5 11.497c-.102 .38-.134 .765-.167 1.169C4.218 14.06 4.086 15.671 1 17.997c2.5 1.5 7 3.002 10.502 3.002 3.313 0 6.345-2.209 7.243-5.561 .339-1.266 .333-2.543 .04-3.731L22.625 6.769c.31-.398 .274-.964-.082-1.321L19.549 2.454c-.357-.357-.923-.392-1.321-.082ZM16.895 8.285c-.063-.066-.128-.13-.194-.194L15.577 6.967 18.759 4.492l1.746 1.746L18.03 9.42 16.895 8.285Z"),
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
        return _brushAiLine!!
    }

private var _brushAiLine: ImageVector? = null
