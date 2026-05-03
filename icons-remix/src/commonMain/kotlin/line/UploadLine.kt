package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UploadLine: ImageVector
    get() {
        if (_uploadLine != null) return _uploadLine!!
        _uploadLine = remixIcon(
            name = "UploadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 19.000 L 21.000 19.000 L 21.000 21.000 L 3.000 21.000 L 3.000 19.000 ZM 13.000 5.828 L 13.000 17.000 L 11.000 17.000 L 11.000 5.828 L 4.929 11.899 L 3.515 10.485 L 12.000 2.000 L 20.485 10.485 L 19.071 11.899 L 13.000 5.828 Z"),
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
        return _uploadLine!!
    }

private var _uploadLine: ImageVector? = null
