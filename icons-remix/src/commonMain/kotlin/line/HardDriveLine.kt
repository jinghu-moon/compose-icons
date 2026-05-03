package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HardDriveLine: ImageVector
    get() {
        if (_hardDriveLine != null) return _hardDriveLine!!
        _hardDriveLine = remixIcon(
            name = "HardDriveLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 10.938 C 8.619 10.487 11.487 7.619 11.938 4.000 L 5.000 4.000 L 5.000 10.938 ZM 5.000 12.951 L 5.000 20.000 L 19.000 20.000 L 19.000 4.000 L 13.951 4.000 C 13.482 8.724 9.724 12.482 5.000 12.951 ZM 4.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 ZM 15.000 16.000 L 17.000 16.000 L 17.000 18.000 L 15.000 18.000 L 15.000 16.000 Z"),
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
        return _hardDriveLine!!
    }

private var _hardDriveLine: ImageVector? = null
