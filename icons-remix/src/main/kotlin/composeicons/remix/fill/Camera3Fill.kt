package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Camera3Fill: ImageVector
    get() {
        if (_camera3Fill != null) return _camera3Fill!!
        _camera3Fill = remixIcon(
            name = "Camera3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 6.001C2 5.448 2.455 5 2.992 5h18.016c.548 0 .992 .445 .992 1.001v13.998c0 .553-.455 1.001-.992 1.001h-18.016C2.444 21 2 20.555 2 19.999v-13.998ZM14 18c2.761 0 5-2.239 5-5C19 10.239 16.761 8 14 8 11.239 8 9 10.239 9 13c0 2.761 2.239 5 5 5ZM4 7v2h3v-2h-3ZM4 2h6v2h-6v-2Z"),
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
        return _camera3Fill!!
    }

private var _camera3Fill: ImageVector? = null
