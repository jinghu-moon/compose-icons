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
                pathData = parseSvgPathData("M2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12ZM16.906 18.32C15.551 19.373 13.849 20 12 20 7.582 20 4 16.418 4 12 4 10.151 4.627 8.449 5.68 7.094L10 11.414v1.086h1v2.5h-1v2h4v-1.586l2.906 2.906ZM18.32 16.906 13 11.586v-1.086h-1.086L7.094 5.68C8.449 4.627 10.151 4 12 4c4.418 0 8 3.582 8 8 0 1.849-.627 3.551-1.68 4.906ZM13 14.414v.586h.586L13 14.414ZM12 9.5c.828 0 1.5-.672 1.5-1.5C13.5 7.172 12.828 6.5 12 6.5c-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5Z"),
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
