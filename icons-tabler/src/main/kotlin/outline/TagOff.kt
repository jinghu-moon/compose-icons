package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TagOff: ImageVector
    get() {
        if (_tagOff != null) return _tagOff!!
        _tagOff = tablerOutlineIcon(
            name = "TagOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.149 7.144 C 7.002 7.286 6.957 7.502 7.034 7.691 C 7.112 7.880 7.296 8.002 7.500 8.000 C 7.627 8.000 7.749 7.952 7.841 7.865"),
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
                pathData = parseSvgPathData("M 3.883 3.875 C 3.317 4.437 2.999 5.202 3.000 6.000 L 3.000 11.172 C 3.000 11.702 3.211 12.211 3.586 12.586 L 11.296 20.296 C 12.237 21.237 13.763 21.237 14.704 20.296 L 17.500 17.500M 19.505 15.495 L 20.295 14.705 C 20.747 14.253 21.002 13.640 21.002 13.000 C 21.002 12.360 20.747 11.747 20.295 11.295 L 12.585 3.585 C 12.210 3.211 11.703 3.000 11.173 3.000 L 7.000 3.000"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _tagOff!!
    }

private var _tagOff: ImageVector? = null
