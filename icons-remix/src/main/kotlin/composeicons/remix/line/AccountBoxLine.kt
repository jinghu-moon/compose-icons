package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AccountBoxLine: ImageVector
    get() {
        if (_accountBoxLine != null) return _accountBoxLine!!
        _accountBoxLine = remixIcon(
            name = "AccountBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 4.995C3 3.893 3.893 3 4.995 3h14.01C20.107 3 21 3.893 21 4.995v14.01C21 20.107 20.107 21 19.005 21h-14.01C3.893 21 3 20.107 3 19.005v-14.01ZM5 5v14h14v-14h-14ZM7.972 18.181c-.619-.268-1.205-.597-1.751-.978C7.468 15.275 9.636 14 12.102 14c2.399 0 4.517 1.207 5.778 3.047-.536 .396-1.114 .741-1.725 1.025C15.247 16.817 13.77 16 12.102 16c-1.716 0-3.229 .864-4.13 2.181ZM12 13C10.067 13 8.5 11.433 8.5 9.5 8.5 7.567 10.067 6 12 6c1.933 0 3.5 1.567 3.5 3.5C15.5 11.433 13.933 13 12 13ZM12 11c.828 0 1.5-.672 1.5-1.5C13.5 8.672 12.828 8 12 8c-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5Z"),
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
        return _accountBoxLine!!
    }

private var _accountBoxLine: ImageVector? = null
