package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = tablerOutlineIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.555 3.843 L 20.157 7.445 C 20.697 7.985 21.000 8.716 21.000 9.479 C 21.000 10.243 20.697 10.974 20.157 11.514 L 17.514 14.157 C 16.974 14.697 16.243 15.000 15.479 15.000 C 14.716 15.000 13.985 14.697 13.445 14.157 L 13.144 13.856 L 6.586 20.414 C 6.254 20.746 5.815 20.951 5.347 20.992 L 5.172 21.000 L 4.000 21.000 C 3.493 21.000 3.066 20.620 3.007 20.117 L 3.000 20.000 L 3.000 18.828 C 3.000 18.358 3.165 17.904 3.467 17.544 L 3.586 17.414 L 4.000 17.000 L 6.000 17.000 L 6.000 15.000 L 8.000 15.000 L 8.000 13.000 L 10.144 10.856 L 9.843 10.555 C 9.303 10.015 9.000 9.284 9.000 8.521 C 9.000 7.757 9.303 7.026 9.843 6.486 L 12.486 3.843 C 13.026 3.303 13.757 3.000 14.521 3.000 C 15.284 3.000 16.015 3.303 16.555 3.843"),
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
                pathData = parseSvgPathData("M 15.000 9.000 L 15.010 9.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _key!!
    }

private var _key: ImageVector? = null
