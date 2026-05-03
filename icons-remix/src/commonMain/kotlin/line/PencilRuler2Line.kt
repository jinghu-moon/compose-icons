package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PencilRuler2Line: ImageVector
    get() {
        if (_pencilRuler2Line != null) return _pencilRuler2Line!!
        _pencilRuler2Line = remixIcon(
            name = "PencilRuler2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.050 14.121 L 4.929 16.243 L 7.757 19.071 L 19.071 7.757 L 16.243 4.929 L 14.121 7.050 L 15.536 8.464 L 14.121 9.879 L 12.707 8.464 L 11.293 9.879 L 12.707 11.293 L 11.293 12.707 L 9.879 11.293 L 8.465 12.707 L 9.879 14.121 L 8.465 15.535 L 7.050 14.121 ZM 16.950 2.808 L 21.192 7.050 C 21.583 7.441 21.583 8.074 21.192 8.464 L 8.465 21.192 C 8.074 21.583 7.441 21.583 7.050 21.192 L 2.808 16.950 C 2.417 16.559 2.417 15.926 2.808 15.535 L 15.536 2.808 C 15.926 2.417 16.559 2.417 16.950 2.808 ZM 14.121 18.364 L 15.536 16.949 L 17.778 19.192 L 19.192 19.192 L 19.192 17.778 L 16.950 15.535 L 18.364 14.121 L 21.000 16.757 L 21.000 21.000 L 16.758 21.000 L 14.121 18.364 ZM 5.636 9.878 L 2.808 7.050 C 2.417 6.659 2.417 6.026 2.808 5.635 L 5.636 2.807 C 6.026 2.416 6.660 2.416 7.050 2.807 L 9.879 5.635 L 8.464 7.050 L 6.343 4.928 L 4.929 6.343 L 7.050 8.464 L 5.636 9.878 Z"),
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
        return _pencilRuler2Line!!
    }

private var _pencilRuler2Line: ImageVector? = null
