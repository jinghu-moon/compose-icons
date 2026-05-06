package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TreeFill: ImageVector
    get() {
        if (_treeFill != null) return _treeFill!!
        _treeFill = remixIcon(
            name = "TreeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 7c0 .262-.017 .521-.049 .774C19.771 8.805 21 10.759 21 13c0 3.314-2.686 6-6 6-.701 0-1.374-.12-2-.341v3.341h-2v-3.6C10.25 18.784 9.4 19 8.5 19 5.462 19 3 16.538 3 13.5 3 12.047 3.563 10.726 4.483 9.743c.394 1.08 1.014 2.051 1.803 2.856L7.714 11.199C6.991 10.461 6.457 9.538 6.191 8.507 6.066 8.025 6 7.52 6 7 6 3.686 8.686 1 12 1c3.314 0 6 2.686 6 6Z"),
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
        return _treeFill!!
    }

private var _treeFill: ImageVector? = null
