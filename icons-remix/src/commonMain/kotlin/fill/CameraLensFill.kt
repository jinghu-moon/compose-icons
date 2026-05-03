package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CameraLensFill: ImageVector
    get() {
        if (_cameraLensFill != null) return _cameraLensFill!!
        _cameraLensFill = remixIcon(
            name = "CameraLensFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.827 21.763 L 14.309 14.000 L 17.841 20.118 C 16.198 21.302 14.181 22.000 12.000 22.000 C 11.254 22.000 10.527 21.918 9.827 21.763 ZM 7.890 21.119 C 5.312 19.955 3.315 17.730 2.458 15.000 L 11.423 15.000 L 7.890 21.119 ZM 2.049 13.000 C 2.017 12.671 2.000 12.337 2.000 12.000 C 2.000 9.393 2.998 7.019 4.632 5.239 L 9.113 13.000 L 2.049 13.000 ZM 6.159 3.883 C 7.802 2.698 9.819 2.000 12.000 2.000 C 12.746 2.000 13.473 2.082 14.173 2.237 L 9.691 10.000 L 6.159 3.883 ZM 16.110 2.881 C 18.688 4.045 20.685 6.270 21.542 9.000 L 12.577 9.000 L 16.110 2.881 ZM 21.951 11.000 C 21.983 11.329 22.000 11.663 22.000 12.000 C 22.000 14.607 21.002 16.981 19.368 18.761 L 14.887 11.000 L 21.951 11.000 Z"),
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
        return _cameraLensFill!!
    }

private var _cameraLensFill: ImageVector? = null
