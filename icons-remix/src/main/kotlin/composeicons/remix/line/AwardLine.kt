package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AwardLine: ImageVector
    get() {
        if (_awardLine != null) return _awardLine!!
        _awardLine = remixIcon(
            name = "AwardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 15.245v6.871c0 .276-.224 .5-.5 .5-.091 0-.18-.025-.257-.071L12 20 7.757 22.546c-.237 .142-.544 .065-.686-.171C7.025 22.296 7 22.208 7 22.117v-6.871C5.171 13.779 4 11.526 4 9 4 4.582 7.582 1 12 1c4.418 0 8 3.582 8 8 0 2.526-1.171 4.779-3 6.245ZM9 16.419v3.049l3-1.8 3 1.8v-3.049c-.926 .375-1.939 .581-3 .581-1.061 0-2.074-.206-3-.581ZM12 15c3.314 0 6-2.686 6-6C18 5.686 15.314 3 12 3 8.686 3 6 5.686 6 9c0 3.314 2.686 6 6 6Z"),
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
        return _awardLine!!
    }

private var _awardLine: ImageVector? = null
