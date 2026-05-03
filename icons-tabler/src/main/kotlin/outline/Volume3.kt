package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Volume3: ImageVector
    get() {
        if (_volume3 != null) return _volume3!!
        _volume3 = tablerOutlineIcon(
            name = "Volume3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 15.000 L 4.000 15.000 C 3.448 15.000 3.000 14.552 3.000 14.000 L 3.000 10.000 C 3.000 9.448 3.448 9.000 4.000 9.000 L 6.000 9.000 L 9.500 4.500 C 9.681 4.149 10.090 3.982 10.464 4.107 C 10.839 4.232 11.066 4.611 11.000 5.000 L 11.000 19.000 C 11.066 19.389 10.839 19.768 10.464 19.893 C 10.090 20.018 9.681 19.851 9.500 19.500 L 6.000 15.000"),
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
                pathData = parseSvgPathData("M 16.000 10.000 L 20.000 14.000M 20.000 10.000 L 16.000 14.000"),
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
        return _volume3!!
    }

private var _volume3: ImageVector? = null
