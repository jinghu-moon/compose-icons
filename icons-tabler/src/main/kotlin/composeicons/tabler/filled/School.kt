package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.School: ImageVector
    get() {
        if (_school != null) return _school!!
        _school = tablerFilledIcon(
            name = "School",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 13.431v2.569c0 2.398-3.205 4-7 4C8.205 20 5 18.398 5 16v-2.569l5.886 2.354c.641 .257 1.352 .284 2.011 .078l.217-.078ZM21 10.476l-8.629 3.452c-.238 .095-.504 .095-.742 0l-10-4C.79 9.593 .79 8.407 1.629 8.072L11.629 4.072c.079-.032 .161-.053 .245-.064L12 4l.126 .008c.084 .011 .166 .032 .245 .064L22.403 8.085l.108 .055 .099 .068 .088 .076 .075 .082 .035 .044 .073 .115 .052 .115 .034 .102 .025 .135 .006 .058L23 15c0 .552-.448 1-1 1-.552 0-1-.448-1-1Z"),
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
        return _school!!
    }

private var _school: ImageVector? = null
