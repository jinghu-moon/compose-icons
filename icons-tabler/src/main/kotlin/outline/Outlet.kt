package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Outlet: ImageVector
    get() {
        if (_outlet != null) return _outlet!!
        _outlet = tablerOutlineIcon(
            name = "Outlet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 6.000 C 4.000 4.895 4.895 4.000 6.000 4.000 L 18.000 4.000 C 19.105 4.000 20.000 4.895 20.000 6.000 L 20.000 18.000 C 20.000 19.105 19.105 20.000 18.000 20.000 L 6.000 20.000 C 4.895 20.000 4.000 19.105 4.000 18.000 L 4.000 6.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 8.500 12.000 C 8.500 12.276 8.724 12.500 9.000 12.500 C 9.276 12.500 9.500 12.276 9.500 12.000 C 9.500 11.724 9.276 11.500 9.000 11.500 C 8.724 11.500 8.500 11.724 8.500 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 14.500 12.000 C 14.500 12.276 14.724 12.500 15.000 12.500 C 15.276 12.500 15.500 12.276 15.500 12.000 C 15.500 11.724 15.276 11.500 15.000 11.500 C 14.724 11.500 14.500 11.724 14.500 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _outlet!!
    }

private var _outlet: ImageVector? = null
