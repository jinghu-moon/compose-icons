package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InfoTriangle: ImageVector
    get() {
        if (_infoTriangle != null) return _infoTriangle!!
        _infoTriangle = tablerFilledIcon(
            name = "InfoTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1.67c.955 0 1.845 .467 2.39 1.247l.105 .16 8.114 13.548c.501 .868 .521 1.933 .052 2.819-.469 .886-1.36 1.469-2.359 1.544l-.195 .008h-16.225C2.881 20.985 1.956 20.461 1.432 19.608 .908 18.756 .858 17.694 1.3 16.796l.099-.185L9.509 3.073C10.037 2.202 10.982 1.67 12 1.67ZM12 11h-1l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L11 13v3l.007 .117c.054 .459 .417 .822 .876 .876L12 17h1l.117-.007c.459-.054 .822-.417 .876-.876L14 16l-.007-.117c-.049-.418-.354-.761-.764-.857l-.112-.02L13 15v-3l-.007-.117c-.054-.459-.417-.822-.876-.876L12 11ZM12.01 8l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L12 10l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L12.01 8Z"),
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
        return _infoTriangle!!
    }

private var _infoTriangle: ImageVector? = null
