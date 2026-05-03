package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HardDrive2Fill: ImageVector
    get() {
        if (_hardDrive2Fill != null) return _hardDrive2Fill!!
        _hardDrive2Fill = remixIcon(
            name = "HardDrive2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 ZM 5.000 16.000 L 5.000 20.000 L 19.000 20.000 L 19.000 16.000 L 5.000 16.000 ZM 15.000 17.000 L 17.000 17.000 L 17.000 19.000 L 15.000 19.000 L 15.000 17.000 Z"),
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
        return _hardDrive2Fill!!
    }

private var _hardDrive2Fill: ImageVector? = null
