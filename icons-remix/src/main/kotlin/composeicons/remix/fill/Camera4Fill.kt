package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Camera4Fill: ImageVector
    get() {
        if (_camera4Fill != null) return _camera4Fill!!
        _camera4Fill = remixIcon(
            name = "Camera4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.434 3c.702 0 1.353 .369 1.715 .971l.773 1.286c.09 .151 .253 .243 .429 .243h1.65c1.657 0 3 1.343 3 3v9.5c0 1.657-1.343 3-3 3h-14C3.343 21 2 19.657 2 18v-9.5c0-1.657 1.343-3 3-3h1.65c.176 0 .338-.093 .429-.243L7.852 3.971C8.213 3.369 8.864 3 9.566 3h4.867ZM12 8.5C9.515 8.5 7.5 10.515 7.5 13c0 2.485 2.015 4.5 4.5 4.5 2.485 0 4.5-2.015 4.5-4.5C16.5 10.515 14.485 8.5 12 8.5ZM12 10.5c1.381 0 2.5 1.119 2.5 2.5 0 1.381-1.119 2.5-2.5 2.5C10.619 15.5 9.5 14.381 9.5 13c0-1.381 1.119-2.5 2.5-2.5Z"),
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
        return _camera4Fill!!
    }

private var _camera4Fill: ImageVector? = null
