package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileList2Line: ImageVector
    get() {
        if (_fileList2Line != null) return _fileList2Line!!
        _fileList2Line = remixIcon(
            name = "FileList2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 ZM 19.000 20.000 L 19.000 4.000 L 5.000 4.000 L 5.000 20.000 L 19.000 20.000 ZM 8.000 7.000 L 16.000 7.000 L 16.000 9.000 L 8.000 9.000 L 8.000 7.000 ZM 8.000 11.000 L 16.000 11.000 L 16.000 13.000 L 8.000 13.000 L 8.000 11.000 ZM 8.000 15.000 L 13.000 15.000 L 13.000 17.000 L 8.000 17.000 L 8.000 15.000 Z"),
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
        return _fileList2Line!!
    }

private var _fileList2Line: ImageVector? = null
