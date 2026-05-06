package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowLeftDownFill: ImageVector
    get() {
        if (_arrowLeftDownFill != null) return _arrowLeftDownFill!!
        _arrowLeftDownFill = remixIcon(
            name = "ArrowLeftDownFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.361 13.052l4.95 4.95h-11.314v-11.314l4.95 4.95L16.603 5.98l1.414 1.414-5.657 5.657Z"),
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
        return _arrowLeftDownFill!!
    }

private var _arrowLeftDownFill: ImageVector? = null
