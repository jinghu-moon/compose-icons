package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ComputerFill: ImageVector
    get() {
        if (_computerFill != null) return _computerFill!!
        _computerFill = remixIcon(
            name = "ComputerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 18v2h4v2h-10v-2h4v-2h-8.008C2.444 18 2 17.551 2 16.993v-12.985C2 3.451 2.455 3 2.992 3h18.016c.548 0 .992 .449 .992 1.007v12.985c0 .556-.455 1.007-.992 1.007h-8.008Z"),
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
        return _computerFill!!
    }

private var _computerFill: ImageVector? = null
