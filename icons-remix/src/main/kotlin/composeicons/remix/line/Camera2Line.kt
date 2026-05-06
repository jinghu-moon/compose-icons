package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Camera2Line: ImageVector
    get() {
        if (_camera2Line != null) return _camera2Line!!
        _camera2Line = remixIcon(
            name = "Camera2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 3.993C2 3.445 2.455 3 2.992 3h18.016c.548 0 .992 .445 .992 .993v16.013c0 .549-.455 .993-.992 .993h-18.016C2.444 21 2 20.555 2 20.007v-16.013ZM4 5v14h16v-14h-16ZM12 15c1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12c0 1.657 1.343 3 3 3ZM12 17C9.239 17 7 14.761 7 12 7 9.239 9.239 7 12 7c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5ZM17 6h2v2h-2v-2Z"),
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
        return _camera2Line!!
    }

private var _camera2Line: ImageVector? = null
