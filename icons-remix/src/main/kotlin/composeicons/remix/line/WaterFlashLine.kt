package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WaterFlashLine: ImageVector
    get() {
        if (_waterFlashLine != null) return _waterFlashLine!!
        _waterFlashLine = remixIcon(
            name = "WaterFlashLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 3.103 7.055 8.053c-2.734 2.734-2.734 7.166 0 9.899 2.734 2.734 7.166 2.734 9.899 0 2.734-2.734 2.734-7.166 0-9.899L12.005 3.103ZM12.005 .275l6.364 6.364c3.515 3.515 3.515 9.213 0 12.728-3.515 3.515-9.213 3.515-12.728 0C2.126 15.852 2.126 10.153 5.641 6.639L12.005 .275ZM13.005 11.003h2.5l-4.5 6.5v-4.5h-2.5L13.005 6.503v4.5Z"),
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
        return _waterFlashLine!!
    }

private var _waterFlashLine: ImageVector? = null
