package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PantoneLine: ImageVector
    get() {
        if (_pantoneLine != null) return _pantoneLine!!
        _pantoneLine = remixIcon(
            name = "PantoneLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.765 8 5.469 7.269C5.263 6.757 5.51 6.174 6.022 5.968L15.294 2.222c.512-.207 1.095 .041 1.302 .553l5.619 13.908c.207 .512-.041 1.095-.552 1.302l-9.272 3.746c-.512 .207-1.095-.041-1.302-.553l-.088-.219v.041h-4c-.552 0-1-.448-1-1v-.27L2.651 18.377c-.512-.207-.759-.79-.553-1.302L5.765 8ZM8 19h2.209L8 13.533v5.467ZM6 12.756 4.327 16.897l1.673 .711v-4.853ZM7.698 7.447l4.87 12.053 7.417-2.997L15.116 4.45 7.698 7.447ZM10.677 9.48C10.165 9.687 9.582 9.439 9.375 8.927 9.168 8.415 9.415 7.832 9.927 7.625c.512-.207 1.095 .041 1.302 .553 .207 .512-.041 1.095-.553 1.302Z"),
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
        return _pantoneLine!!
    }

private var _pantoneLine: ImageVector? = null
