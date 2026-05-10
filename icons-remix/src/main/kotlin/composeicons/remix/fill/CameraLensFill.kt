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
                pathData = parseSvgPathData("M9.827 21.763 14.309 14l3.532 6.118C16.198 21.302 14.181 22 12 22c-.746 0-1.473-.082-2.173-.237ZM7.89 21.119C5.312 19.955 3.315 17.73 2.458 15h8.965L7.89 21.119ZM2.049 13C2.017 12.671 2 12.337 2 12 2 9.393 2.998 7.019 4.632 5.239L9.113 13h-7.064ZM6.159 3.883C7.802 2.698 9.819 2 12 2c.746 0 1.473 .082 2.173 .237L9.691 10 6.159 3.883ZM16.11 2.881C18.688 4.045 20.685 6.27 21.542 9h-8.965L16.11 2.881ZM21.951 11c.033 .329 .049 .663 .049 1 0 2.607-.998 4.981-2.632 6.761L14.887 11h7.064Z"),
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
