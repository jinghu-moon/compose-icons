package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Camera3Line: ImageVector
    get() {
        if (_camera3Line != null) return _camera3Line!!
        _camera3Line = remixIcon(
            name = "Camera3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 6.001C2 5.448 2.455 5 2.992 5h18.016c.548 0 .992 .445 .992 1.001v13.998c0 .553-.455 1.001-.992 1.001h-18.016C2.444 21 2 20.555 2 19.999v-13.998ZM4 7v12h16v-12h-16ZM14 16c1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3ZM14 18C11.239 18 9 15.761 9 13 9 10.239 11.239 8 14 8c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5ZM4 2h6v2h-6v-2Z"),
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
        return _camera3Line!!
    }

private var _camera3Line: ImageVector? = null
