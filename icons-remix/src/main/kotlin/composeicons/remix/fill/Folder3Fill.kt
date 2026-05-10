package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Folder3Fill: ImageVector
    get() {
        if (_folder3Fill != null) return _folder3Fill!!
        _folder3Fill = remixIcon(
            name = "Folder3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 8v12c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-13h19c.552 0 1 .448 1 1ZM12.414 5h-10.414v-1C2 3.448 2.448 3 3 3h7.414l2 2Z"),
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
        return _folder3Fill!!
    }

private var _folder3Fill: ImageVector? = null
