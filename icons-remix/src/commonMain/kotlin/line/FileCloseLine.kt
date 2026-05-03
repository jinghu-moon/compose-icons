package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileCloseLine: ImageVector
    get() {
        if (_fileCloseLine != null) return _fileCloseLine!!
        _fileCloseLine = remixIcon(
            name = "FileCloseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 L 12.000 20.000 L 5.000 20.000 L 5.000 4.000 L 15.000 4.000 L 15.000 8.000 L 19.000 8.000 L 19.000 13.000 L 21.000 13.000 L 21.000 7.000 L 16.000 2.000 L 3.999 2.000 C 3.447 2.000 3.000 2.444 3.000 2.992 L 3.000 21.008 C 3.000 21.545 3.445 22.000 3.993 22.000 L 12.000 22.000 ZM 21.536 21.121 L 19.414 19.000 L 21.536 16.879 L 20.121 15.464 L 18.000 17.586 L 15.879 15.464 L 14.465 16.879 L 16.586 19.000 L 14.465 21.121 L 15.879 22.535 L 18.000 20.414 L 20.121 22.535 L 21.536 21.121 Z"),
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
        return _fileCloseLine!!
    }

private var _fileCloseLine: ImageVector? = null
