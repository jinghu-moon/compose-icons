package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = tablerFilledIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM14.66 8.999C13.048 7.582 10.606 7.683 9.117 9.229c-1.491 1.547-1.491 3.995 0 5.542 1.489 1.546 3.931 1.647 5.543 .23 .402-.368 .436-.989 .076-1.398-.359-.409-.98-.455-1.396-.104-.81 .711-2.035 .66-2.783-.116-.744-.772-.744-1.994 0-2.766 .748-.776 1.973-.827 2.783-.116 .417 .342 1.029 .292 1.385-.113C15.081 9.984 15.053 9.37 14.66 9Z"),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
