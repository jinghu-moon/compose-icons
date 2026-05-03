package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PencilRuler2Fill: ImageVector
    get() {
        if (_pencilRuler2Fill != null) return _pencilRuler2Fill!!
        _pencilRuler2Fill = remixIcon(
            name = "PencilRuler2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.636 12.707 L 7.465 14.535 L 8.879 13.121 L 7.050 11.293 L 8.465 9.879 L 10.293 11.707 L 11.707 10.293 L 9.879 8.464 L 11.293 7.050 L 13.121 8.879 L 14.536 7.464 L 12.707 5.636 L 15.536 2.808 C 15.926 2.417 16.559 2.417 16.950 2.808 L 21.192 7.050 C 21.583 7.441 21.583 8.074 21.192 8.464 L 8.465 21.192 C 8.074 21.583 7.441 21.583 7.050 21.192 L 2.808 16.950 C 2.417 16.559 2.417 15.926 2.808 15.535 L 5.636 12.707 ZM 14.121 18.364 L 18.364 14.121 L 21.000 16.757 L 21.000 21.000 L 16.758 21.000 L 14.121 18.364 ZM 5.636 9.878 L 2.808 7.050 C 2.417 6.659 2.417 6.026 2.808 5.635 L 5.636 2.807 C 6.026 2.416 6.660 2.416 7.050 2.807 L 9.879 5.635 L 5.636 9.878 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _pencilRuler2Fill!!
    }

private var _pencilRuler2Fill: ImageVector? = null
