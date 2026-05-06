package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Apps2AddLine: ImageVector
    get() {
        if (_apps2AddLine != null) return _apps2AddLine!!
        _apps2AddLine = remixIcon(
            name = "Apps2AddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.5 7c0 2.485 2.015 4.5 4.5 4.5 2.485 0 4.5-2.015 4.5-4.5C11.5 4.515 9.485 2.5 7 2.5 4.515 2.5 2.5 4.515 2.5 7ZM2.5 17c0 2.485 2.015 4.5 4.5 4.5 2.485 0 4.5-2.015 4.5-4.5C11.5 14.515 9.485 12.5 7 12.5 4.515 12.5 2.5 14.515 2.5 17ZM12.5 17c0 2.485 2.015 4.5 4.5 4.5 2.485 0 4.5-2.015 4.5-4.5 0-2.485-2.015-4.5-4.5-4.5-2.485 0-4.5 2.015-4.5 4.5ZM9.5 7C9.5 8.381 8.381 9.5 7 9.5 5.619 9.5 4.5 8.381 4.5 7 4.5 5.619 5.619 4.5 7 4.5 8.381 4.5 9.5 5.619 9.5 7ZM9.5 17c0 1.381-1.119 2.5-2.5 2.5C5.619 19.5 4.5 18.381 4.5 17 4.5 15.619 5.619 14.5 7 14.5c1.381 0 2.5 1.119 2.5 2.5ZM19.5 17c0 1.381-1.119 2.5-2.5 2.5-1.381 0-2.5-1.119-2.5-2.5 0-1.381 1.119-2.5 2.5-2.5 1.381 0 2.5 1.119 2.5 2.5ZM16 11v-3h-3v-2h3v-3h2v3h3v2h-3v3h-2Z"),
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
        return _apps2AddLine!!
    }

private var _apps2AddLine: ImageVector? = null
