package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TestTubeLine: ImageVector
    get() {
        if (_testTubeLine != null) return _testTubeLine!!
        _testTubeLine = remixIcon(
            name = "TestTubeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 L 17.000 4.000 L 16.000 4.000 L 16.000 18.000 C 16.000 20.209 14.209 22.000 12.000 22.000 C 9.791 22.000 8.000 20.209 8.000 18.000 L 8.000 4.000 L 7.000 4.000 L 7.000 2.000 L 17.000 2.000 ZM 14.000 10.000 L 10.000 10.000 L 10.000 18.000 C 10.000 19.105 10.895 20.000 12.000 20.000 C 13.105 20.000 14.000 19.105 14.000 18.000 L 14.000 10.000 ZM 13.000 15.000 C 13.552 15.000 14.000 15.448 14.000 16.000 C 14.000 16.552 13.552 17.000 13.000 17.000 C 12.448 17.000 12.000 16.552 12.000 16.000 C 12.000 15.448 12.448 15.000 13.000 15.000 ZM 11.000 12.000 C 11.552 12.000 12.000 12.448 12.000 13.000 C 12.000 13.552 11.552 14.000 11.000 14.000 C 10.448 14.000 10.000 13.552 10.000 13.000 C 10.000 12.448 10.448 12.000 11.000 12.000 ZM 14.000 4.000 L 10.000 4.000 L 10.000 8.000 L 14.000 8.000 L 14.000 4.000 Z"),
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
        return _testTubeLine!!
    }

private var _testTubeLine: ImageVector? = null
