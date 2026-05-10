package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DualSim2Fill: ImageVector
    get() {
        if (_dualSim2Fill != null) return _dualSim2Fill!!
        _dualSim2Fill = remixIcon(
            name = "DualSim2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 2l4.707 4.707c.188 .188 .293 .442 .293 .707v13.586c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-18C4 2.448 4.448 2 5 2h10ZM12 7.5c-1.598 0-2.904 1.249-2.995 2.824L9 10.5h2c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .253-.094 .484-.249 .66l-.082 .083L8.999 14.547 9 16h6v-2h-2.405l1.412-1.271-.006-.009 .008 .008c.609-.549 .991-1.344 .991-2.228 0-1.657-1.343-3-3-3Z"),
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
        return _dualSim2Fill!!
    }

private var _dualSim2Fill: ImageVector? = null
