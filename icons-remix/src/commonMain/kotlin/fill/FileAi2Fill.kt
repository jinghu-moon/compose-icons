package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileAi2Fill: ImageVector
    get() {
        if (_fileAi2Fill != null) return _fileAi2Fill!!
        _fileAi2Fill = remixIcon(
            name = "FileAi2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.529 15.319 C 18.706 14.894 19.294 14.894 19.471 15.319 L 19.724 15.931 C 20.156 16.973 20.962 17.806 21.975 18.257 L 22.692 18.576 C 23.103 18.759 23.103 19.356 22.692 19.539 L 21.933 19.877 C 20.945 20.316 20.153 21.119 19.714 22.128 L 19.467 22.693 C 19.286 23.108 18.714 23.108 18.533 22.693 L 18.287 22.128 C 17.848 21.119 17.055 20.316 16.067 19.877 L 15.308 19.539 C 14.897 19.356 14.897 18.759 15.308 18.576 L 16.025 18.257 C 17.038 17.806 17.844 16.973 18.276 15.931 L 18.529 15.319 ZM 20.002 2.000 C 20.553 2.000 21.000 2.456 21.000 2.992 L 21.000 13.342 C 20.374 13.121 19.701 13.000 19.000 13.000 C 15.686 13.000 13.000 15.686 13.000 19.000 C 13.000 20.093 13.294 21.117 13.805 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.551 3.000 20.992 L 3.000 9.000 L 9.000 9.000 C 9.552 9.000 10.000 8.552 10.000 8.000 L 10.000 2.000 L 20.002 2.000 ZM 8.000 7.000 L 3.000 7.000 L 8.000 2.003 L 8.000 7.000 Z"),
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
        return _fileAi2Fill!!
    }

private var _fileAi2Fill: ImageVector? = null
