package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileAiFill: ImageVector
    get() {
        if (_fileAiFill != null) return _fileAiFill!!
        _fileAiFill = remixIcon(
            name = "FileAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.343 2.000 C 13.122 2.626 13.000 3.299 13.000 4.000 C 13.000 7.314 15.686 10.000 19.000 10.000 C 19.701 10.000 20.374 9.878 21.000 9.657 L 21.000 21.008 C 21.000 21.556 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.550 3.000 20.993 L 3.000 8.000 L 9.003 2.000 L 13.343 2.000 ZM 4.500 9.000 L 10.000 9.000 L 10.000 3.500 L 4.500 9.000 ZM 18.529 0.329 C 18.706 -0.096 19.294 -0.097 19.471 0.329 L 19.724 0.941 C 20.156 1.983 20.962 2.816 21.975 3.267 L 22.692 3.586 C 23.103 3.769 23.103 4.366 22.692 4.549 L 21.933 4.887 C 20.945 5.326 20.153 6.129 19.714 7.138 L 19.467 7.703 C 19.286 8.117 18.714 8.117 18.533 7.703 L 18.287 7.138 C 17.848 6.129 17.055 5.326 16.067 4.887 L 15.308 4.549 C 14.897 4.366 14.897 3.769 15.308 3.586 L 16.025 3.267 C 17.038 2.816 17.844 1.983 18.276 0.941 L 18.529 0.329 Z"),
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
        return _fileAiFill!!
    }

private var _fileAiFill: ImageVector? = null
