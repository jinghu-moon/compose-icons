package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileDamageLine: ImageVector
    get() {
        if (_fileDamageLine != null) return _fileDamageLine!!
        _fileDamageLine = remixIcon(
            name = "FileDamageLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 9h-5v-5h-9v7.857l1.5 1.393L10 9.5l3 5L15 12l3 3-3-.5L13 17 10 13 7 16.5 5 15.25v4.75h14v-11ZM21 8v12.993c0 .557-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.556 3 21.008v-18.016C3 2.455 3.449 2 4.002 2h10.995L21 8Z"),
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
        return _fileDamageLine!!
    }

private var _fileDamageLine: ImageVector? = null
