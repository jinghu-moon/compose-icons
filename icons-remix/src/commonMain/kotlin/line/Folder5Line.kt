package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Folder5Line: ImageVector
    get() {
        if (_folder5Line != null) return _folder5Line!!
        _folder5Line = remixIcon(
            name = "Folder5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.087 9.000 L 20.913 9.000 C 21.466 9.000 21.913 9.448 21.913 10.000 C 21.913 10.028 21.912 10.055 21.910 10.083 L 21.077 20.083 C 21.033 20.601 20.600 21.000 20.080 21.000 L 3.920 21.000 C 3.400 21.000 2.967 20.601 2.924 20.083 L 2.090 10.083 C 2.045 9.533 2.454 9.049 3.004 9.003 C 3.032 9.001 3.059 9.000 3.087 9.000 ZM 4.840 19.000 L 19.160 19.000 L 19.827 11.000 L 4.174 11.000 L 4.840 19.000 ZM 13.414 5.000 L 20.000 5.000 C 20.552 5.000 21.000 5.448 21.000 6.000 L 21.000 7.000 L 3.000 7.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 11.414 3.000 L 13.414 5.000 Z"),
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
        return _folder5Line!!
    }

private var _folder5Line: ImageVector? = null
