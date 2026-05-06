package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertTriangle: ImageVector
    get() {
        if (_alertTriangle != null) return _alertTriangle!!
        _alertTriangle = tablerFilledIcon(
            name = "AlertTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1.67c.955 0 1.845 .467 2.39 1.247l.105 .16 8.114 13.548c.501 .868 .521 1.933 .052 2.819-.469 .886-1.36 1.469-2.359 1.544l-.195 .008h-16.225C2.881 20.985 1.956 20.461 1.432 19.608 .908 18.756 .858 17.694 1.3 16.796l.099-.185L9.509 3.073C10.037 2.202 10.982 1.67 12 1.67ZM12.01 15l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L12 17l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L12.01 15ZM12 8c-.507 0-.934 .38-.993 .883L11 9v4l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 13v-4l-.007-.117C12.934 8.38 12.507 8 12 8Z"),
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
        return _alertTriangle!!
    }

private var _alertTriangle: ImageVector? = null
