package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InformationOffLine: ImageVector
    get() {
        if (_informationOffLine != null) return _informationOffLine!!
        _informationOffLine = remixIcon(
            name = "InformationOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 ZM 16.906 18.320 C 15.551 19.373 13.849 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 C 4.000 10.151 4.627 8.449 5.680 7.094 L 10.000 11.414 L 10.000 12.500 L 11.000 12.500 L 11.000 15.000 L 10.000 15.000 L 10.000 17.000 L 14.000 17.000 L 14.000 15.414 L 16.906 18.320 ZM 18.320 16.906 L 13.000 11.586 L 13.000 10.500 L 11.914 10.500 L 7.094 5.680 C 8.449 4.627 10.151 4.000 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 C 20.000 13.849 19.373 15.551 18.320 16.906 ZM 13.000 14.414 L 13.000 15.000 L 13.586 15.000 L 13.000 14.414 ZM 12.000 9.500 C 12.828 9.500 13.500 8.828 13.500 8.000 C 13.500 7.172 12.828 6.500 12.000 6.500 C 11.172 6.500 10.500 7.172 10.500 8.000 C 10.500 8.828 11.172 9.500 12.000 9.500 Z"),
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
        return _informationOffLine!!
    }

private var _informationOffLine: ImageVector? = null
