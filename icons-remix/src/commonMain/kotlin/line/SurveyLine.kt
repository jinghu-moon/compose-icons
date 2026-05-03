package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SurveyLine: ImageVector
    get() {
        if (_surveyLine != null) return _surveyLine!!
        _surveyLine = remixIcon(
            name = "SurveyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 L 17.000 4.000 L 20.007 4.000 C 20.555 4.000 21.000 4.445 21.000 4.993 L 21.000 21.007 C 21.000 21.555 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.555 3.000 21.007 L 3.000 4.993 C 3.000 4.445 3.445 4.000 3.993 4.000 L 7.000 4.000 L 7.000 2.000 L 17.000 2.000 ZM 7.000 6.000 L 5.000 6.000 L 5.000 20.000 L 19.000 20.000 L 19.000 6.000 L 17.000 6.000 L 17.000 8.000 L 7.000 8.000 L 7.000 6.000 ZM 9.000 16.000 L 9.000 18.000 L 7.000 18.000 L 7.000 16.000 L 9.000 16.000 ZM 9.000 13.000 L 9.000 15.000 L 7.000 15.000 L 7.000 13.000 L 9.000 13.000 ZM 9.000 10.000 L 9.000 12.000 L 7.000 12.000 L 7.000 10.000 L 9.000 10.000 ZM 15.000 4.000 L 9.000 4.000 L 9.000 6.000 L 15.000 6.000 L 15.000 4.000 Z"),
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
        return _surveyLine!!
    }

private var _surveyLine: ImageVector? = null
