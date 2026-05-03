package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.QrScanAiLine: ImageVector
    get() {
        if (_qrScanAiLine != null) return _qrScanAiLine!!
        _qrScanAiLine = remixIcon(
            name = "QrScanAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 19.000 L 9.000 19.000 L 9.000 21.000 L 3.000 21.000 L 3.000 16.000 L 5.000 16.000 L 5.000 19.000 ZM 21.000 21.000 L 15.000 21.000 L 15.000 19.000 L 19.000 19.000 L 19.000 16.000 L 21.000 16.000 L 21.000 21.000 ZM 21.000 13.000 L 3.000 13.000 L 3.000 11.000 L 21.000 11.000 L 21.000 13.000 ZM 18.529 1.319 C 18.706 0.894 19.294 0.894 19.471 1.319 L 19.724 1.931 C 20.156 2.973 20.962 3.806 21.975 4.257 L 22.691 4.576 C 23.102 4.759 23.102 5.356 22.691 5.539 L 21.933 5.877 C 20.945 6.316 20.153 7.119 19.714 8.128 L 19.467 8.693 C 19.286 9.108 18.714 9.108 18.533 8.693 L 18.286 8.128 C 17.847 7.119 17.055 6.316 16.067 5.877 L 15.308 5.539 C 14.897 5.356 14.897 4.759 15.308 4.576 L 16.025 4.257 C 17.038 3.806 17.844 2.973 18.276 1.931 L 18.529 1.319 ZM 9.000 5.000 L 5.000 5.000 L 5.000 8.000 L 3.000 8.000 L 3.000 3.000 L 9.000 3.000 L 9.000 5.000 Z"),
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
        return _qrScanAiLine!!
    }

private var _qrScanAiLine: ImageVector? = null
