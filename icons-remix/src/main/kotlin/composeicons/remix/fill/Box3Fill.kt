package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Box3Fill: ImageVector
    get() {
        if (_box3Fill != null) return _box3Fill!!
        _box3Fill = remixIcon(
            name = "Box3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.502 5.922 12 1 3.498 5.922 12 10.844 20.502 5.922ZM2.5 7.655v9.845L11 22.421v-9.845L2.5 7.655ZM13 22.421l8.5-4.921v-9.845L13 12.576v9.845Z"),
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
        return _box3Fill!!
    }

private var _box3Fill: ImageVector? = null
