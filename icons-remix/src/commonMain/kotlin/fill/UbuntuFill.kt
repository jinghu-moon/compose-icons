package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UbuntuFill: ImageVector
    get() {
        if (_ubuntuFill != null) return _ubuntuFill!!
        _ubuntuFill = remixIcon(
            name = "UbuntuFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.001 12.000 C 22.001 17.522 17.524 22.000 12.001 22.000 C 6.478 22.000 2.001 17.522 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 ZM 5.201 10.664 C 4.464 10.664 3.866 11.262 3.866 12.000 C 3.866 12.737 4.464 13.335 5.201 13.335 C 5.938 13.335 6.536 12.737 6.536 12.000 C 6.536 11.262 5.938 10.664 5.201 10.664 ZM 14.734 16.733 C 14.095 17.101 13.876 17.917 14.245 18.556 C 14.614 19.194 15.430 19.414 16.068 19.045 C 16.707 18.676 16.926 17.860 16.557 17.221 C 16.188 16.583 15.372 16.364 14.734 16.733 L 14.734 16.733 ZM 8.101 12.000 C 8.101 10.681 8.757 9.515 9.760 8.809 L 8.783 7.174 C 7.615 7.955 6.746 9.149 6.385 10.545 C 6.806 10.889 7.076 11.413 7.076 12.000 C 7.076 12.586 6.806 13.110 6.385 13.454 C 6.746 14.852 7.615 16.045 8.783 16.826 L 9.760 15.190 C 8.757 14.485 8.101 13.320 8.101 12.000 L 8.101 12.000 ZM 12.001 8.100 C 14.038 8.100 15.710 9.662 15.885 11.654 L 17.788 11.626 C 17.694 10.155 17.052 8.835 16.065 7.864 C 15.557 8.056 14.970 8.027 14.464 7.734 C 13.956 7.441 13.638 6.947 13.551 6.410 C 13.057 6.275 12.538 6.201 12.001 6.201 C 11.078 6.201 10.205 6.417 9.431 6.800 L 10.358 8.463 C 10.858 8.230 11.414 8.100 12.001 8.100 ZM 12.001 15.899 C 11.414 15.899 10.858 15.769 10.358 15.537 L 9.431 17.199 C 10.205 17.583 11.078 17.800 12.001 17.800 C 12.538 17.800 13.057 17.726 13.551 17.589 C 13.638 17.053 13.956 16.559 14.464 16.265 C 14.971 15.973 15.557 15.943 16.065 16.135 C 17.052 15.164 17.694 13.844 17.788 12.373 L 15.885 12.346 C 15.710 14.338 14.039 15.900 12.001 15.900 L 12.001 15.899 ZM 14.733 7.267 C 15.372 7.635 16.188 7.417 16.557 6.778 C 16.926 6.140 16.707 5.324 16.068 4.955 C 15.430 4.586 14.614 4.805 14.245 5.443 C 13.876 6.082 14.095 6.898 14.733 7.267 L 14.733 7.267 Z"),
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
        return _ubuntuFill!!
    }

private var _ubuntuFill: ImageVector? = null
