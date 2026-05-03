package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZulip: ImageVector
    get() {
        if (_brandZulip != null) return _brandZulip!!
        _brandZulip = tablerOutlineIcon(
            name = "BrandZulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.500 3.000 L 17.500 3.000 C 18.825 3.000 20.000 4.000 20.000 5.500 C 20.000 7.500 18.295 8.764 18.000 9.000 L 13.500 13.000 L 15.500 8.000 L 6.500 8.000 C 5.119 8.000 4.000 6.881 4.000 5.500 C 4.000 4.119 5.119 3.000 6.500 3.000"),
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
                pathData = parseSvgPathData("M 17.500 21.000 L 6.500 21.000 C 5.175 21.000 4.000 20.000 4.000 18.500 C 4.000 16.500 5.705 15.236 6.000 15.000 L 10.500 11.000 L 8.500 16.000 L 17.500 16.000 C 18.881 16.000 20.000 17.119 20.000 18.500 C 20.000 19.881 18.881 21.000 17.500 21.000"),
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
        return _brandZulip!!
    }

private var _brandZulip: ImageVector? = null
