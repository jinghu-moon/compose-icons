package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RemixiconLine: ImageVector
    get() {
        if (_remixiconLine != null) return _remixiconLine!!
        _remixiconLine = remixIcon(
            name = "RemixiconLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.365 6.000 L 15.149 15.663 L 15.870 15.380 C 17.554 14.719 18.733 13.224 18.961 11.484 C 18.808 11.495 18.655 11.500 18.501 11.500 C 15.251 11.500 12.558 9.115 12.077 6.000 L 6.365 6.000 ZM 14.001 5.000 C 14.001 7.485 16.016 9.500 18.501 9.500 C 19.306 9.500 20.062 9.289 20.715 8.918 C 20.901 9.536 21.001 10.189 21.001 10.865 C 21.001 13.756 19.179 16.229 16.601 17.242 L 20.001 21.000 L 3.001 21.000 L 3.001 4.000 L 14.001 4.000 C 14.038 4.000 14.075 4.000 14.112 4.001 C 14.039 4.322 14.001 4.657 14.001 5.000 ZM 18.501 7.500 C 17.120 7.500 16.001 6.381 16.001 5.000 C 16.001 3.619 17.120 2.500 18.501 2.500 C 19.882 2.500 21.001 3.619 21.001 5.000 C 21.001 6.381 19.882 7.500 18.501 7.500 ZM 5.001 7.470 L 5.001 19.000 L 15.481 19.000 L 5.001 7.470 Z"),
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
        return _remixiconLine!!
    }

private var _remixiconLine: ImageVector? = null
