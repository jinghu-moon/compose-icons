package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CameraLensAiLine: ImageVector
    get() {
        if (_cameraLensAiLine != null) return _cameraLensAiLine!!
        _cameraLensAiLine = remixIcon(
            name = "CameraLensAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.467 8.694 L 20.713 8.128 C 21.153 7.119 21.944 6.316 22.932 5.877 L 23.692 5.539 C 24.103 5.357 24.103 4.759 23.692 4.576 L 22.975 4.257 C 21.962 3.807 21.156 2.974 20.724 1.931 L 20.471 1.320 C 20.294 0.893 19.706 0.893 19.529 1.320 L 19.276 1.931 C 18.844 2.974 18.038 3.807 17.025 4.257 L 16.308 4.576 C 15.897 4.759 15.897 5.357 16.308 5.539 L 17.068 5.877 C 18.056 6.316 18.847 7.119 19.287 8.128 L 19.533 8.694 C 19.714 9.108 20.286 9.108 20.467 8.694 ZM 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 11.597 21.976 11.200 21.930 10.810 L 19.944 11.045 C 19.981 11.358 20.000 11.677 20.000 12.000 C 20.000 13.458 19.610 14.824 18.929 16.001 L 15.464 10.000 L 17.930 10.000 L 16.775 8.000 L 12.000 8.000 L 15.169 2.512 C 14.173 2.180 13.107 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 ZM 12.000 4.000 L 8.536 10.000 L 6.395 6.292 C 7.838 4.874 9.817 4.000 12.000 4.000 ZM 9.691 12.000 L 10.846 10.000 L 13.155 10.000 L 14.309 12.000 L 13.155 14.000 L 10.845 14.000 L 9.691 12.000 ZM 12.000 16.000 L 9.858 19.710 C 7.819 19.145 6.107 17.792 5.070 16.000 L 12.000 16.000 ZM 12.000 20.000 L 15.464 14.000 L 17.605 17.708 C 16.162 19.126 14.183 20.000 12.000 20.000 ZM 5.071 7.999 L 8.536 14.000 L 4.252 14.000 C 4.088 13.361 4.000 12.691 4.000 12.000 C 4.000 10.542 4.390 9.176 5.071 7.999 Z"),
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
        return _cameraLensAiLine!!
    }

private var _cameraLensAiLine: ImageVector? = null
