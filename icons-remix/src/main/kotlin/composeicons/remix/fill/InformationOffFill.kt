package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InformationOffFill: ImageVector
    get() {
        if (_informationOffFill != null) return _informationOffFill!!
        _informationOffFill = remixIcon(
            name = "InformationOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.743 18.329C21.154 16.605 22 14.401 22 12 22 6.477 17.523 2 12 2 9.599 2 7.395 2.846 5.671 4.257l6.243 6.243h1.086v1.086l6.743 6.743ZM10 11.414 4.257 5.671C2.846 7.395 2 9.599 2 12c0 5.523 4.477 10 10 10 2.401 0 4.605-.846 6.329-2.257L14 15.414v1.586h-4v-2h1v-2.5h-1v-1.086ZM13.586 15h-.586v-.586l.586 .586ZM13.5 8c0 .828-.672 1.5-1.5 1.5C11.172 9.5 10.5 8.828 10.5 8c0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5Z"),
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
        return _informationOffFill!!
    }

private var _informationOffFill: ImageVector? = null
