package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DropboxLine: ImageVector
    get() {
        if (_dropboxLine != null) return _dropboxLine!!
        _dropboxLine = remixIcon(
            name = "DropboxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.650 17.261 L 12.042 19.422 L 15.434 17.261 L 17.294 18.446 L 12.042 21.792 L 6.790 18.446 L 8.650 17.261 ZM 7.774 8.980 L 10.167 7.427 L 7.741 5.854 L 5.286 7.370 L 7.774 8.980 ZM 9.613 10.171 L 12.005 11.718 L 14.395 10.171 L 12.004 8.619 L 9.613 10.171 ZM 13.845 12.910 L 16.269 14.478 L 18.719 12.976 L 16.233 11.364 L 13.845 12.910 ZM 12.004 6.235 L 16.241 3.487 L 22.466 7.330 L 18.073 10.173 L 22.467 13.024 L 16.240 16.842 L 12.005 14.101 L 7.769 16.842 L 1.540 13.024 L 5.935 10.173 L 1.543 7.330 L 7.768 3.487 L 12.004 6.235 ZM 13.842 7.427 L 16.235 8.980 L 18.723 7.370 L 16.268 5.853 L 13.842 7.427 ZM 10.164 12.910 L 7.775 11.363 L 5.289 12.976 L 7.740 14.478 L 10.164 12.910 Z"),
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
        return _dropboxLine!!
    }

private var _dropboxLine: ImageVector? = null
