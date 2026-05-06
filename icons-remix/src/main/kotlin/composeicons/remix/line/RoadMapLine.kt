package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RoadMapLine: ImageVector
    get() {
        if (_roadMapLine != null) return _roadMapLine!!
        _roadMapLine = remixIcon(
            name = "RoadMapLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 6.143v12.824L9.065 16.796l6 3L20 17.681v-12.824l1.303-.558c.254-.109 .548 .009 .657 .263 .027 .062 .04 .129 .04 .197v14.242l-7 3L9 19 2.697 21.701c-.254 .109-.548-.009-.657-.263C2.014 21.376 2 21.309 2 21.242v-14.242L4 6.143ZM16.243 11.243 12 15.485 7.757 11.243C5.414 8.899 5.414 5.101 7.757 2.757c2.343-2.343 6.142-2.343 8.485 0 2.343 2.343 2.343 6.142 0 8.485ZM12 12.657 14.828 9.828c1.562-1.562 1.562-4.095 0-5.657C13.266 2.609 10.734 2.609 9.172 4.172c-1.562 1.562-1.562 4.095 0 5.657L12 12.657Z"),
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
        return _roadMapLine!!
    }

private var _roadMapLine: ImageVector? = null
