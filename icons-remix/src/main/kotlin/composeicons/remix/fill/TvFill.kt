package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TvFill: ImageVector
    get() {
        if (_tvFill != null) return _tvFill!!
        _tvFill = remixIcon(
            name = "TvFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.414 5h5.594c.548 0 .992 .445 .992 1.001v13.998c0 .553-.455 1.001-.992 1.001h-18.016C2.444 21 2 20.555 2 19.999v-13.998C2 5.448 2.455 5 2.992 5h5.594L6.05 2.464 7.464 1.05l3.95 3.95h1.172L16.535 1.05l1.414 1.414L15.414 5Z"),
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
        return _tvFill!!
    }

private var _tvFill: ImageVector? = null
