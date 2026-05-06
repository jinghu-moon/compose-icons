package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = tablerFilledIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 2c0-.88 1.056-1.331 1.692-.722 1.958 1.876 3.096 5.995 1.75 9.12l-.08 .174 .012 .003c.625 .133 1.203-.43 2.303-2.173l.14-.224c.164-.265 .443-.438 .753-.468 .31-.03 .617 .086 .829 .315C18.733 9.46 20 12.402 20 14.295 20 18.56 16.409 22 12 22 7.591 22 4 18.56 4 14.294 4 12.042 5.022 9.578 6.632 7.993l.605-.589c.241-.236 .434-.43 .618-.624C9.285 5.268 10 3.856 10 2"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
