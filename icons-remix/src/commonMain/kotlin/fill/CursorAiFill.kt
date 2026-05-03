package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CursorAiFill: ImageVector
    get() {
        if (_cursorAiFill != null) return _cursorAiFill!!
        _cursorAiFill = remixIcon(
            name = "CursorAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.121 6.330 L 12.450 1.353 C 12.172 1.193 11.828 1.193 11.550 1.353 L 2.879 6.330 C 2.644 6.464 2.500 6.713 2.500 6.982 L 2.500 17.018 C 2.500 17.287 2.644 17.536 2.879 17.670 L 11.550 22.647 C 11.828 22.807 12.172 22.807 12.450 22.647 L 21.122 17.670 C 21.356 17.536 21.500 17.287 21.500 17.018 L 21.500 6.982 C 21.500 6.713 21.355 6.464 21.121 6.330 ZM 20.577 7.384 L 12.206 21.798 C 12.149 21.895 12.000 21.855 12.000 21.743 L 12.000 12.305 C 12.000 12.116 11.898 11.942 11.734 11.847 L 3.512 7.128 C 3.415 7.072 3.455 6.924 3.568 6.924 L 20.310 6.924 C 20.547 6.924 20.696 7.180 20.577 7.384 Z"),
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
        return _cursorAiFill!!
    }

private var _cursorAiFill: ImageVector? = null
