package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UserSharedLine: ImageVector
    get() {
        if (_userSharedLine != null) return _userSharedLine!!
        _userSharedLine = remixIcon(
            name = "UserSharedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 14.252 L 14.000 16.341 C 13.374 16.120 12.701 16.000 12.000 16.000 C 8.686 16.000 6.000 18.686 6.000 22.000 L 4.000 22.000 C 4.000 17.582 7.582 14.000 12.000 14.000 C 12.691 14.000 13.361 14.087 14.000 14.252 ZM 12.000 13.000 C 8.685 13.000 6.000 10.315 6.000 7.000 C 6.000 3.685 8.685 1.000 12.000 1.000 C 15.315 1.000 18.000 3.685 18.000 7.000 C 18.000 10.315 15.315 13.000 12.000 13.000 ZM 12.000 11.000 C 14.210 11.000 16.000 9.210 16.000 7.000 C 16.000 4.790 14.210 3.000 12.000 3.000 C 9.790 3.000 8.000 4.790 8.000 7.000 C 8.000 9.210 9.790 11.000 12.000 11.000 ZM 18.586 17.000 L 16.757 15.172 L 18.172 13.757 L 22.414 18.000 L 18.172 22.243 L 16.757 20.828 L 18.586 19.000 L 15.000 19.000 L 15.000 17.000 L 18.586 17.000 Z"),
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
        return _userSharedLine!!
    }

private var _userSharedLine: ImageVector? = null
