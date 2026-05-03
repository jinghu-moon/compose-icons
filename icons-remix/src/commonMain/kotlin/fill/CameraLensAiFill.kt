package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CameraLensAiFill: ImageVector
    get() {
        if (_cameraLensAiFill != null) return _cameraLensAiFill!!
        _cameraLensAiFill = remixIcon(
            name = "CameraLensAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.467 8.694 L 20.713 8.128 C 21.153 7.119 21.944 6.316 22.932 5.877 L 23.692 5.539 C 24.103 5.357 24.103 4.759 23.692 4.576 L 22.975 4.257 C 21.962 3.807 21.156 2.974 20.724 1.931 L 20.471 1.320 C 20.294 0.893 19.706 0.893 19.529 1.320 L 19.276 1.931 C 18.844 2.974 18.038 3.807 17.025 4.257 L 16.308 4.576 C 15.897 4.759 15.897 5.357 16.308 5.539 L 17.068 5.877 C 18.056 6.316 18.847 7.119 19.287 8.128 L 19.533 8.694 C 19.714 9.108 20.286 9.108 20.467 8.694 ZM 14.309 14.000 L 9.827 21.763 C 10.527 21.918 11.254 22.000 12.000 22.000 C 14.181 22.000 16.198 21.302 17.841 20.118 L 14.309 14.000 ZM 2.458 15.000 C 3.315 17.730 5.312 19.955 7.890 21.119 L 11.423 15.000 L 2.458 15.000 ZM 2.000 12.000 C 2.000 12.337 2.017 12.671 2.049 13.000 L 9.113 13.000 L 4.632 5.239 C 2.998 7.019 2.000 9.393 2.000 12.000 ZM 12.000 2.000 C 9.819 2.000 7.802 2.698 6.159 3.883 L 9.691 10.000 L 14.173 2.237 C 13.473 2.082 12.746 2.000 12.000 2.000 ZM 22.000 12.000 C 22.000 11.663 21.983 11.329 21.951 11.000 L 14.887 11.000 L 19.368 18.761 C 21.002 16.981 22.000 14.607 22.000 12.000 Z"),
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
        return _cameraLensAiFill!!
    }

private var _cameraLensAiFill: ImageVector? = null
