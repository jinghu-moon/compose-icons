package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Box1Line: ImageVector
    get() {
        if (_box1Line != null) return _box1Line!!
        _box1Line = remixIcon(
            name = "Box1Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1l9.5 5.5v11L12 23 2.5 17.5v-11L12 1ZM5.494 7.078l7.506 4.346v8.687l6.5-3.763v-8.694L12 3.311 5.494 7.078ZM4.5 8.813v7.534l6.5 3.763v-7.534L4.5 8.813Z"),
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
        return _box1Line!!
    }

private var _box1Line: ImageVector? = null
