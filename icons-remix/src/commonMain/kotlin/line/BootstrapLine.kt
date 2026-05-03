package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BootstrapLine: ImageVector
    get() {
        if (_bootstrapLine != null) return _bootstrapLine!!
        _bootstrapLine = remixIcon(
            name = "BootstrapLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 1.000 11.000 L 1.000 13.000 C 1.000 13.000 3.000 13.000 3.000 17.000 L 3.000 18.000 C 3.000 19.657 4.343 21.000 6.000 21.000 L 18.000 21.000 C 19.657 21.000 21.000 19.657 21.000 18.000 L 21.000 17.000 C 21.000 13.000 23.000 13.000 23.000 13.000 L 23.000 11.000 C 23.000 11.000 21.000 11.000 21.000 7.000 L 21.000 6.000 C 21.000 4.343 19.657 3.000 18.000 3.000 L 6.000 3.000 C 4.343 3.000 3.000 4.343 3.000 6.000 L 3.000 7.000 C 3.000 11.000 1.000 11.000 1.000 11.000 ZM 20.674 12.000 C 20.645 12.028 20.615 12.056 20.586 12.086 C 19.578 13.093 19.000 14.692 19.000 17.000 L 19.000 18.000 C 19.000 18.552 18.552 19.000 18.000 19.000 L 6.000 19.000 C 5.448 19.000 5.000 18.552 5.000 18.000 L 5.000 17.000 C 5.000 14.692 4.422 13.093 3.414 12.086 C 3.385 12.056 3.355 12.028 3.326 12.000 C 3.355 11.972 3.385 11.944 3.414 11.914 C 4.422 10.907 5.000 9.308 5.000 7.000 L 5.000 6.000 C 5.000 5.448 5.448 5.000 6.000 5.000 L 18.000 5.000 C 18.552 5.000 19.000 5.448 19.000 6.000 L 19.000 7.000 C 19.000 9.308 19.578 10.907 20.586 11.914 C 20.615 11.944 20.645 11.972 20.674 12.000 ZM 8.500 7.000 L 8.500 17.000 L 13.500 17.000 C 15.157 17.000 16.500 15.657 16.500 14.000 C 16.500 12.938 15.948 12.004 15.115 11.471 C 15.360 11.037 15.500 10.535 15.500 10.000 C 15.500 8.343 14.157 7.000 12.500 7.000 L 8.500 7.000 ZM 10.500 11.000 L 10.500 9.000 L 12.500 9.000 C 13.052 9.000 13.500 9.448 13.500 10.000 C 13.500 10.552 13.052 11.000 12.500 11.000 L 10.500 11.000 ZM 10.500 13.000 L 13.500 13.000 C 14.052 13.000 14.500 13.448 14.500 14.000 C 14.500 14.552 14.052 15.000 13.500 15.000 L 10.500 15.000 L 10.500 13.000 Z"),
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
        return _bootstrapLine!!
    }

private var _bootstrapLine: ImageVector? = null
