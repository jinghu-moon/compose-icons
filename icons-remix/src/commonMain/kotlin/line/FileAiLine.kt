package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileAiLine: ImageVector
    get() {
        if (_fileAiLine != null) return _fileAiLine!!
        _fileAiLine = remixIcon(
            name = "FileAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 4.000 L 11.000 4.000 L 11.000 9.000 C 11.000 9.552 10.552 10.000 10.000 10.000 L 5.000 10.000 L 5.000 20.000 L 19.000 20.000 L 19.000 10.000 L 21.000 10.000 L 21.000 21.008 C 21.000 21.555 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.550 3.000 20.993 L 3.000 8.000 L 9.000 2.003 L 9.000 2.000 L 13.000 2.000 L 13.000 4.000 ZM 5.829 8.000 L 9.000 8.000 L 9.000 4.831 L 5.829 8.000 ZM 19.471 0.329 C 19.294 -0.096 18.706 -0.096 18.529 0.329 L 18.276 0.941 C 17.844 1.983 17.038 2.816 16.025 3.267 L 15.308 3.586 C 14.897 3.769 14.898 4.366 15.308 4.549 L 16.067 4.887 C 17.055 5.326 17.848 6.129 18.287 7.138 L 18.533 7.703 C 18.714 8.118 19.286 8.118 19.467 7.703 L 19.714 7.138 C 20.153 6.129 20.945 5.326 21.933 4.887 L 22.692 4.549 C 23.103 4.366 23.103 3.769 22.692 3.586 L 21.975 3.267 C 20.962 2.816 20.156 1.983 19.724 0.941 L 19.471 0.329 Z"),
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
        return _fileAiLine!!
    }

private var _fileAiLine: ImageVector? = null
